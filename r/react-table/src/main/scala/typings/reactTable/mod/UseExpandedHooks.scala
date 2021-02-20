package typings.reactTable.mod

import typings.reactTable.anon.PartialTableCommonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseExpandedHooks[D /* <: js.Object */] extends StObject {
  
  var getToggleAllRowsExpandedProps: js.Array[PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps]] = js.native
  
  var getToggleRowsExpandedProps: js.Array[PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps]] = js.native
}
object UseExpandedHooks {
  
  @scala.inline
  def apply[D /* <: js.Object */](
    getToggleAllRowsExpandedProps: js.Array[PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps]],
    getToggleRowsExpandedProps: js.Array[PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps]]
  ): UseExpandedHooks[D] = {
    val __obj = js.Dynamic.literal(getToggleAllRowsExpandedProps = getToggleAllRowsExpandedProps.asInstanceOf[js.Any], getToggleRowsExpandedProps = getToggleRowsExpandedProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseExpandedHooks[D]]
  }
  
  @scala.inline
  implicit class UseExpandedHooksMutableBuilder[Self <: UseExpandedHooks[_], D /* <: js.Object */] (val x: Self with UseExpandedHooks[D]) extends AnyVal {
    
    @scala.inline
    def setGetToggleAllRowsExpandedProps(value: js.Array[PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps]]): Self = StObject.set(x, "getToggleAllRowsExpandedProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetToggleAllRowsExpandedPropsVarargs(value: (PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps])*): Self = StObject.set(x, "getToggleAllRowsExpandedProps", js.Array(value :_*))
    
    @scala.inline
    def setGetToggleRowsExpandedProps(value: js.Array[PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps]]): Self = StObject.set(x, "getToggleRowsExpandedProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetToggleRowsExpandedPropsVarargs(value: (PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps])*): Self = StObject.set(x, "getToggleRowsExpandedProps", js.Array(value :_*))
  }
}
