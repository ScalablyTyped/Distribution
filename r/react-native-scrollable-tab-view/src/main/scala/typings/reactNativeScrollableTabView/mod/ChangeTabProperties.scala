package typings.reactNativeScrollableTabView.mod

import typings.react.mod._Global_.JSX.Element
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
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChangeTabProperties]
  }
}

