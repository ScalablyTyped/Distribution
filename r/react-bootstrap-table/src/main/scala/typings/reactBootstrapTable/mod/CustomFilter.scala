package typings.reactBootstrapTable.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomFilter[FParams /* <: js.Object */, FElement /* <: CustomFilterElement */] extends js.Object {
  
  /**
    * Custom filter parameters to be passed to the generator function
    */
  var customFilterParameters: CustomFilterParameters[FParams] = js.native
  
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
  ): ReactElement = js.native
  
  /**
    * Type must be 'CustomFilter'
    */
  var `type`: typings.reactBootstrapTable.reactBootstrapTableStrings.CustomFilter = js.native
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
  
  @scala.inline
  implicit class CustomFilterOps[Self <: CustomFilter[_, _], FParams /* <: js.Object */, FElement /* <: CustomFilterElement */] (val x: Self with (CustomFilter[FParams, FElement])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCustomFilterParameters(value: CustomFilterParameters[FParams]): Self = this.set("customFilterParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetElement(
      value: (js.Function2[
          /* value */ js.UndefOr[CustomFilterParameters[FParams]], 
          /* type */ js.UndefOr[typings.reactBootstrapTable.reactBootstrapTableStrings.CustomFilter], 
          Unit
        ], CustomFilterParameters[FParams]) => ReactElement
    ): Self = this.set("getElement", js.Any.fromFunction2(value))
    
    @scala.inline
    def setType(value: typings.reactBootstrapTable.reactBootstrapTableStrings.CustomFilter): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
