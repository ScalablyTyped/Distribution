package typings.primereact

import typings.primereact.anon.EventValue
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickListSubListMod {
  
  @JSImport("primereact/components/picklist/PickListSubList", "PickListSubList")
  @js.native
  class PickListSubList protected ()
    extends Component[PickListSubListProps, js.Any, js.Any] {
    def this(props: PickListSubListProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PickListSubListProps, context: js.Any) = this()
  }
  
  trait PickListSubListProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var header: js.UndefOr[String] = js.undefined
    
    var itemTemplate: js.UndefOr[js.Function1[/* item */ js.Any, js.UndefOr[Element]]] = js.undefined
    
    var list: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var listClassName: js.UndefOr[String] = js.undefined
    
    var metaKeySelection: js.UndefOr[Boolean] = js.undefined
    
    var onItemClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSelectionChange: js.UndefOr[js.Function1[/* e */ EventValue, Unit]] = js.undefined
    
    var selection: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var showControls: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
  }
  object PickListSubListProps {
    
    inline def apply(): PickListSubListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickListSubListProps]
    }
    
    extension [Self <: PickListSubListProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setItemTemplate(value: /* item */ js.Any => js.UndefOr[Element]): Self = StObject.set(x, "itemTemplate", js.Any.fromFunction1(value))
      
      inline def setItemTemplateUndefined: Self = StObject.set(x, "itemTemplate", js.undefined)
      
      inline def setList(value: js.Array[js.Any]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListClassName(value: String): Self = StObject.set(x, "listClassName", value.asInstanceOf[js.Any])
      
      inline def setListClassNameUndefined: Self = StObject.set(x, "listClassName", js.undefined)
      
      inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      inline def setListVarargs(value: js.Any*): Self = StObject.set(x, "list", js.Array(value :_*))
      
      inline def setMetaKeySelection(value: Boolean): Self = StObject.set(x, "metaKeySelection", value.asInstanceOf[js.Any])
      
      inline def setMetaKeySelectionUndefined: Self = StObject.set(x, "metaKeySelection", js.undefined)
      
      inline def setOnItemClick(value: () => Unit): Self = StObject.set(x, "onItemClick", js.Any.fromFunction0(value))
      
      inline def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
      
      inline def setOnSelectionChange(value: /* e */ EventValue => Unit): Self = StObject.set(x, "onSelectionChange", js.Any.fromFunction1(value))
      
      inline def setOnSelectionChangeUndefined: Self = StObject.set(x, "onSelectionChange", js.undefined)
      
      inline def setSelection(value: js.Array[js.Any]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
      
      inline def setSelectionVarargs(value: js.Any*): Self = StObject.set(x, "selection", js.Array(value :_*))
      
      inline def setShowControls(value: Boolean): Self = StObject.set(x, "showControls", value.asInstanceOf[js.Any])
      
      inline def setShowControlsUndefined: Self = StObject.set(x, "showControls", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
