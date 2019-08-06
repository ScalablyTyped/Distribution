package typings.rollup.rollupMod

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
    val __obj = js.Dynamic.literal(id = id)
    __obj.updateDynamic("type")(`type`)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[EmittedChunk]
  }
}

