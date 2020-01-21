package typings.reactBootstrapTable.mod

import typings.react.mod.ReactElement
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
  var `type`: typings.reactBootstrapTable.reactBootstrapTableStrings.CustomFilter
  /**
  	 * Function to generate the filter component
  	 */
  @JSName("getElement")
  def getElement_CustomFilter(
    filterHandler: js.Function2[
      /* value */ js.UndefOr[CustomFilterParameters[FParams]], 
      /* type */ js.UndefOr[typings.reactBootstrapTable.reactBootstrapTableStrings.CustomFilter], 
      Unit
    ],
    customFilterParameters: CustomFilterParameters[FParams]
  ): ReactElement
}

object CustomFilter {
  @scala.inline
  def apply[FParams /* <: js.Object */, FElement /* <: CustomFilterElement */](
    customFilterParameters: CustomFilterParameters[FParams],
    getElement: (js.Function2[
      /* value */ js.UndefOr[CustomFilterParameters[FParams]], 
      /* type */ js.UndefOr[typings.reactBootstrapTable.reactBootstrapTableStrings.CustomFilter], 
      Unit
    ], CustomFilterParameters[FParams]) => ReactElement,
    `type`: typings.reactBootstrapTable.reactBootstrapTableStrings.CustomFilter
  ): CustomFilter[FParams, FElement] = {
    val __obj = js.Dynamic.literal(customFilterParameters = customFilterParameters.asInstanceOf[js.Any], getElement = js.Any.fromFunction2(getElement))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomFilter[FParams, FElement]]
  }
}

