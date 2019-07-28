package typings.rollup.rollupMod

import typings.rollup.Anon_Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmittedChunk extends js.Object {
  var id: String
  var options: js.UndefOr[Anon_Name] = js.undefined
}

object EmittedChunk {
  @scala.inline
  def apply(id: String, options: Anon_Name = null): EmittedChunk = {
    val __obj = js.Dynamic.literal(id = id)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[EmittedChunk]
  }
}

