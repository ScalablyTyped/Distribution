package typings
package prexLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dispose extends js.Object {
  def dispose(): js.Any
}

object Anon_Dispose {
  @scala.inline
  def apply(dispose: js.Function0[js.Any]): Anon_Dispose = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dispose")(dispose)
    __obj.asInstanceOf[Anon_Dispose]
  }
}

