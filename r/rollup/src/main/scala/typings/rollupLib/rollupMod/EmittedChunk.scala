package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmittedChunk extends js.Object {
  var id: java.lang.String
  var options: js.UndefOr[rollupLib.Anon_Name] = js.undefined
}

object EmittedChunk {
  @scala.inline
  def apply(id: java.lang.String, options: rollupLib.Anon_Name = null): EmittedChunk = {
    val __obj = js.Dynamic.literal(id = id)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[EmittedChunk]
  }
}

