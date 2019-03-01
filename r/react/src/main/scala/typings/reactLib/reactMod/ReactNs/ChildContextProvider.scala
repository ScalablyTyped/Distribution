package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildContextProvider[CC] extends js.Object {
  def getChildContext(): CC
}

object ChildContextProvider {
  @scala.inline
  def apply[CC](getChildContext: js.Function0[CC]): ChildContextProvider[CC] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getChildContext")(getChildContext)
    __obj.asInstanceOf[ChildContextProvider[CC]]
  }
}

