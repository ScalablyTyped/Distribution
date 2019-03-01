package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterData[CustomFilterValue /* <: js.Object */]
  extends /* dataField */ org.scalablytyped.runtime.StringDictionary[FilterValue | CustomFilterValue]

object FilterData {
  @scala.inline
  def apply[CustomFilterValue /* <: js.Object */](
    StringDictionary: /* dataField */ org.scalablytyped.runtime.StringDictionary[FilterValue | CustomFilterValue] = null
  ): FilterData[CustomFilterValue] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[FilterData[CustomFilterValue]]
  }
}

