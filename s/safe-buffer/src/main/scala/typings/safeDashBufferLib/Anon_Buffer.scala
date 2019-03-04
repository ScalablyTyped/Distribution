package typings
package safeDashBufferLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Buffer extends js.Object {
  var data: js.Array[_]
  var `type`: safeDashBufferLib.safeDashBufferLibStrings.Buffer
}

object Anon_Buffer {
  @scala.inline
  def apply(data: js.Array[_], `type`: safeDashBufferLib.safeDashBufferLibStrings.Buffer): Anon_Buffer = {
    val __obj = js.Dynamic.literal(data = data)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Buffer]
  }
}

