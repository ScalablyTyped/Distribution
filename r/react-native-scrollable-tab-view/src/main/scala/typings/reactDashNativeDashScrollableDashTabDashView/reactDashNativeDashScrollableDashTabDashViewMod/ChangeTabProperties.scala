package typings.reactDashNativeDashScrollableDashTabDashView.reactDashNativeDashScrollableDashTabDashViewMod

import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeTabProperties extends js.Object {
  // previousPage
  var from: Double
  // currentPage
  var i: Double
  // currentPage object
  var ref: Element
}

object ChangeTabProperties {
  @scala.inline
  def apply(from: Double, i: Double, ref: Element): ChangeTabProperties = {
    val __obj = js.Dynamic.literal(from = from, i = i, ref = ref)
  
    __obj.asInstanceOf[ChangeTabProperties]
  }
}

