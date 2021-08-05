package typings.primereact

import typings.primereact.anon.Node
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object organizationChartMod {
  
  @JSImport("primereact/components/organizationchart/OrganizationChart", "OrganizationChart")
  @js.native
  class OrganizationChart protected ()
    extends Component[OrganizationChartProps, js.Any, js.Any] {
    def this(props: OrganizationChartProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: OrganizationChartProps, context: js.Any) = this()
  }
  
  trait OrganizationChartNodeData extends StObject {
    
    var children: js.UndefOr[js.Array[OrganizationChartNodeData]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var expanded: js.UndefOr[Boolean] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var selectable: js.UndefOr[Boolean] = js.undefined
  }
  object OrganizationChartNodeData {
    
    inline def apply(): OrganizationChartNodeData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OrganizationChartNodeData]
    }
    
    extension [Self <: OrganizationChartNodeData](x: Self) {
      
      inline def setChildren(value: js.Array[OrganizationChartNodeData]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: OrganizationChartNodeData*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    }
  }
  
  trait OrganizationChartProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var nodeTemplate: js.UndefOr[js.Function1[/* node */ OrganizationChartNodeData, ReactNode]] = js.undefined
    
    var onNodeSelect: js.UndefOr[js.Function1[/* e */ Node, Unit]] = js.undefined
    
    var onNodeUnselect: js.UndefOr[js.Function1[/* e */ Node, Unit]] = js.undefined
    
    var selection: js.UndefOr[js.Any] = js.undefined
    
    var selectionChange: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.undefined
    
    var selectionMode: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var value: js.UndefOr[js.Array[OrganizationChartNodeData]] = js.undefined
  }
  object OrganizationChartProps {
    
    inline def apply(): OrganizationChartProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OrganizationChartProps]
    }
    
    extension [Self <: OrganizationChartProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setNodeTemplate(value: /* node */ OrganizationChartNodeData => ReactNode): Self = StObject.set(x, "nodeTemplate", js.Any.fromFunction1(value))
      
      inline def setNodeTemplateUndefined: Self = StObject.set(x, "nodeTemplate", js.undefined)
      
      inline def setOnNodeSelect(value: /* e */ Node => Unit): Self = StObject.set(x, "onNodeSelect", js.Any.fromFunction1(value))
      
      inline def setOnNodeSelectUndefined: Self = StObject.set(x, "onNodeSelect", js.undefined)
      
      inline def setOnNodeUnselect(value: /* e */ Node => Unit): Self = StObject.set(x, "onNodeUnselect", js.Any.fromFunction1(value))
      
      inline def setOnNodeUnselectUndefined: Self = StObject.set(x, "onNodeUnselect", js.undefined)
      
      inline def setSelection(value: js.Any): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      inline def setSelectionChange(value: /* data */ js.Any => Unit): Self = StObject.set(x, "selectionChange", js.Any.fromFunction1(value))
      
      inline def setSelectionChangeUndefined: Self = StObject.set(x, "selectionChange", js.undefined)
      
      inline def setSelectionMode(value: String): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
      
      inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setValue(value: js.Array[OrganizationChartNodeData]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: OrganizationChartNodeData*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
}
