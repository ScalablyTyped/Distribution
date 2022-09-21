package typings.reactTable.mod

import typings.reactTable.anon.PartialTableCommonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseSortByHooks[D /* <: js.Object */] extends StObject {
  
  var getSortByToggleProps: js.Array[PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps]]
}
object UseSortByHooks {
  
  inline def apply[D /* <: js.Object */](
    getSortByToggleProps: js.Array[PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps]]
  ): UseSortByHooks[D] = {
    val __obj = js.Dynamic.literal(getSortByToggleProps = getSortByToggleProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseSortByHooks[D]]
  }
  
  extension [Self <: UseSortByHooks[?], D /* <: js.Object */](x: Self & UseSortByHooks[D]) {
    
    inline def setGetSortByToggleProps(value: js.Array[PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps]]): Self = StObject.set(x, "getSortByToggleProps", value.asInstanceOf[js.Any])
    
    inline def setGetSortByTogglePropsVarargs(value: (PropGetter[D, TableCommonProps, scala.Nothing, PartialTableCommonProps])*): Self = StObject.set(x, "getSortByToggleProps", js.Array(value*))
  }
}
