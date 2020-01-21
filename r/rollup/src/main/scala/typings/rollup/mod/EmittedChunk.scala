package typings.rollup.mod

import typings.rollup.rollupStrings.chunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmittedChunk extends EmittedFile {
  var fileName: js.UndefOr[String] = js.undefined
  var id: String
  var name: js.UndefOr[String] = js.undefined
  var `type`: chunk
}

object EmittedChunk {
  @scala.inline
  def apply(id: String, `type`: chunk, fileName: String = null, name: String = null): EmittedChunk = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmittedChunk]
  }
}

