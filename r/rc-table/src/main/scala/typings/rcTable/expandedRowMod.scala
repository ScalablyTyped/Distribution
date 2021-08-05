package typings.rcTable

import typings.rcTable.interfaceMod.CustomizeComponent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expandedRowMod {
  
  @JSImport("rc-table/lib/Body/ExpandedRow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    hasPrefixClsChildrenComponentCellComponentFixHeaderFixColumnHorizonScrollClassNameExpandedComponentWidthColSpan: ExpandedRowProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasPrefixClsChildrenComponentCellComponentFixHeaderFixColumnHorizonScrollClassNameExpandedComponentWidthColSpan.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ExpandedRowProps extends StObject {
    
    var cellComponent: CustomizeComponent
    
    var children: ReactNode
    
    var className: String
    
    var colSpan: Double
    
    var component: CustomizeComponent
    
    var componentWidth: Double
    
    var expanded: Boolean
    
    var fixColumn: Boolean
    
    var fixHeader: Boolean
    
    var horizonScroll: Boolean
    
    var prefixCls: String
  }
  object ExpandedRowProps {
    
    inline def apply(
      cellComponent: CustomizeComponent,
      className: String,
      colSpan: Double,
      component: CustomizeComponent,
      componentWidth: Double,
      expanded: Boolean,
      fixColumn: Boolean,
      fixHeader: Boolean,
      horizonScroll: Boolean,
      prefixCls: String
    ): ExpandedRowProps = {
      val __obj = js.Dynamic.literal(cellComponent = cellComponent.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], colSpan = colSpan.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], componentWidth = componentWidth.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], fixColumn = fixColumn.asInstanceOf[js.Any], fixHeader = fixHeader.asInstanceOf[js.Any], horizonScroll = horizonScroll.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpandedRowProps]
    }
    
    extension [Self <: ExpandedRowProps](x: Self) {
      
      inline def setCellComponent(value: CustomizeComponent): Self = StObject.set(x, "cellComponent", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
      
      inline def setComponent(value: CustomizeComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentWidth(value: Double): Self = StObject.set(x, "componentWidth", value.asInstanceOf[js.Any])
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setFixColumn(value: Boolean): Self = StObject.set(x, "fixColumn", value.asInstanceOf[js.Any])
      
      inline def setFixHeader(value: Boolean): Self = StObject.set(x, "fixHeader", value.asInstanceOf[js.Any])
      
      inline def setHorizonScroll(value: Boolean): Self = StObject.set(x, "horizonScroll", value.asInstanceOf[js.Any])
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    }
  }
}
