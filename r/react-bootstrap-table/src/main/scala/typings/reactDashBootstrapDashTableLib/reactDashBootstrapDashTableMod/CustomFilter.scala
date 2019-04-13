package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

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
  var `type`: reactDashBootstrapDashTableLib.reactDashBootstrapDashTableLibStrings.CustomFilter
  /**
  	 * Function to generate the filter component
  	 */
  @JSName("getElement")
  def getElement_CustomFilter(
    filterHandler: js.Function2[
      /* value */ js.UndefOr[CustomFilterParameters[FParams]], 
      /* type */ js.UndefOr[
        reactDashBootstrapDashTableLib.reactDashBootstrapDashTableLibStrings.CustomFilter
      ], 
      scala.Unit
    ],
    customFilterParameters: CustomFilterParameters[FParams]
  ): reactLib.reactMod.ReactElement[FElement]
}

object CustomFilter {
  @scala.inline
  def apply[FParams /* <: js.Object */, FElement /* <: CustomFilterElement */](
    customFilterParameters: CustomFilterParameters[FParams],
    getElement_CustomFilter: (js.Function2[
      /* value */ js.UndefOr[CustomFilterParameters[FParams]], 
      /* type */ js.UndefOr[
        reactDashBootstrapDashTableLib.reactDashBootstrapDashTableLibStrings.CustomFilter
      ], 
      scala.Unit
    ], CustomFilterParameters[FParams]) => reactLib.reactMod.ReactElement[FElement],
    `type`: reactDashBootstrapDashTableLib.reactDashBootstrapDashTableLibStrings.CustomFilter
  ): CustomFilter[FParams, FElement] = {
    val __obj = js.Dynamic.literal(customFilterParameters = customFilterParameters)
    __obj.updateDynamic("getElement")(js.Any.fromFunction2(getElement_CustomFilter))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CustomFilter[FParams, FElement]]
  }
}

