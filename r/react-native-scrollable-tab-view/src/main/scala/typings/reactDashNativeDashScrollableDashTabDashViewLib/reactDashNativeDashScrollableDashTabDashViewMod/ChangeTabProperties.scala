package typings
package reactDashNativeDashScrollableDashTabDashViewLib.reactDashNativeDashScrollableDashTabDashViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeTabProperties extends js.Object {
  // previousPage
  var from: scala.Double
  // currentPage
  var i: scala.Double
  // currentPage object
  var ref: reactLib.reactMod.Global.JSXNs.Element
}

object ChangeTabProperties {
  @scala.inline
  def apply(from: scala.Double, i: scala.Double, ref: reactLib.reactMod.Global.JSXNs.Element): ChangeTabProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("i")(i)
    __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[ChangeTabProperties]
  }
}

