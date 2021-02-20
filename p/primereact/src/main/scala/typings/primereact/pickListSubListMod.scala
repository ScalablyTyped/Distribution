package typings.primereact

import typings.primereact.anon.EventValue
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @js.native
  trait PickListSubListProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var header: js.UndefOr[String] = js.native
    
    var itemTemplate: js.UndefOr[js.Function1[/* item */ js.Any, js.UndefOr[Element]]] = js.native
    
    var list: js.UndefOr[js.Array[_]] = js.native
    
    var listClassName: js.UndefOr[String] = js.native
    
    var metaKeySelection: js.UndefOr[Boolean] = js.native
    
    var onItemClick: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onSelectionChange: js.UndefOr[js.Function1[/* e */ EventValue, Unit]] = js.native
    
    var selection: js.UndefOr[js.Array[_]] = js.native
    
    var showControls: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[js.Object] = js.native
  }
  object PickListSubListProps {
    
    @scala.inline
    def apply(): PickListSubListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickListSubListProps]
    }
    
    @scala.inline
    implicit class PickListSubListPropsMutableBuilder[Self <: PickListSubListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setItemTemplate(value: /* item */ js.Any => js.UndefOr[Element]): Self = StObject.set(x, "itemTemplate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setItemTemplateUndefined: Self = StObject.set(x, "itemTemplate", js.undefined)
      
      @scala.inline
      def setList(value: js.Array[_]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListClassName(value: String): Self = StObject.set(x, "listClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListClassNameUndefined: Self = StObject.set(x, "listClassName", js.undefined)
      
      @scala.inline
      def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      @scala.inline
      def setListVarargs(value: js.Any*): Self = StObject.set(x, "list", js.Array(value :_*))
      
      @scala.inline
      def setMetaKeySelection(value: Boolean): Self = StObject.set(x, "metaKeySelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaKeySelectionUndefined: Self = StObject.set(x, "metaKeySelection", js.undefined)
      
      @scala.inline
      def setOnItemClick(value: () => Unit): Self = StObject.set(x, "onItemClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
      
      @scala.inline
      def setOnSelectionChange(value: /* e */ EventValue => Unit): Self = StObject.set(x, "onSelectionChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectionChangeUndefined: Self = StObject.set(x, "onSelectionChange", js.undefined)
      
      @scala.inline
      def setSelection(value: js.Array[_]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
      
      @scala.inline
      def setSelectionVarargs(value: js.Any*): Self = StObject.set(x, "selection", js.Array(value :_*))
      
      @scala.inline
      def setShowControls(value: Boolean): Self = StObject.set(x, "showControls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowControlsUndefined: Self = StObject.set(x, "showControls", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
