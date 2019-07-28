package typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod

import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomFilter[FParams /* <: js.Object */, FElement /* <: CustomFilterElement */] extends js.Object {
  /**
  	 * Custom filter parameters to be passed to the generator function
  	 */
  var customFilterParameters: CustomFilterParameters[FParams]
  /**
  	 * Type must be 'CustomFilter'
  	 */
  var `type`: typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableStrings.CustomFilter
  /**
  	 * Function to generate the filter component
  	 */
  @JSName("getElement")
  def getElement_CustomFilter(
    filterHandler: js.Function2[
      /* value */ js.UndefOr[CustomFilterParameters[FParams]], 
      /* type */ js.UndefOr[
        typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableStrings.CustomFilter
      ], 
      Unit
    ],
    customFilterParameters: CustomFilterParameters[FParams]
  ): ReactElement
}

object CustomFilter {
  @scala.inline
  def apply[FParams /* <: js.Object */, FElement /* <: CustomFilterElement */](
    customFilterParameters: CustomFilterParameters[FParams],
    getElement_CustomFilter: (js.Function2[
      /* value */ js.UndefOr[CustomFilterParameters[FParams]], 
      /* type */ js.UndefOr[
        typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableStrings.CustomFilter
      ], 
      Unit
    ], CustomFilterParameters[FParams]) => ReactElement,
    `type`: typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableStrings.CustomFilter
  ): CustomFilter[FParams, FElement] = {
    val __obj = js.Dynamic.literal(customFilterParameters = customFilterParameters)
    __obj.updateDynamic("getElement")(js.Any.fromFunction2(getElement_CustomFilter))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CustomFilter[FParams, FElement]]
  }
}

