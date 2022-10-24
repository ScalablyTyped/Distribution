package typings.rcTable

import typings.rcTable.libInterfaceMod.CustomizeComponent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBodyExpandedRowMod {
  
  @JSImport("rc-table/lib/Body/ExpandedRow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: ExpandedRowProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ExpandedRowProps extends StObject {
    
    var cellComponent: CustomizeComponent
    
    var children: ReactNode
    
    var className: String
    
    var colSpan: Double
    
    var component: CustomizeComponent
    
    var expanded: Boolean
    
    var isEmpty: Boolean
    
    var prefixCls: String
  }
  object ExpandedRowProps {
    
    inline def apply(
      cellComponent: CustomizeComponent,
      className: String,
      colSpan: Double,
      component: CustomizeComponent,
      expanded: Boolean,
      isEmpty: Boolean,
      prefixCls: String
    ): ExpandedRowProps = {
      val __obj = js.Dynamic.literal(cellComponent = cellComponent.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], colSpan = colSpan.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], isEmpty = isEmpty.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpandedRowProps]
    }
    
    extension [Self <: ExpandedRowProps](x: Self) {
      
      inline def setCellComponent(value: CustomizeComponent): Self = StObject.set(x, "cellComponent", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
      
      inline def setComponent(value: CustomizeComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setIsEmpty(value: Boolean): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    }
  }
}
