package typings.primereact

import typings.primereact.anon.Direction
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickListControlsMod {
  
  @JSImport("primereact/components/picklist/PickListControls", "PickListControls")
  @js.native
  class PickListControls protected ()
    extends Component[PickListControlsProps, js.Any, js.Any] {
    def this(props: PickListControlsProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PickListControlsProps, context: js.Any) = this()
  }
  
  trait PickListControlsProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var list: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var onReorder: js.UndefOr[js.Function1[/* e */ Direction, Unit]] = js.undefined
    
    var selection: js.UndefOr[js.Array[js.Any]] = js.undefined
  }
  object PickListControlsProps {
    
    @scala.inline
    def apply(): PickListControlsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickListControlsProps]
    }
    
    @scala.inline
    implicit class PickListControlsPropsMutableBuilder[Self <: PickListControlsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setList(value: js.Array[js.Any]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      @scala.inline
      def setListVarargs(value: js.Any*): Self = StObject.set(x, "list", js.Array(value :_*))
      
      @scala.inline
      def setOnReorder(value: /* e */ Direction => Unit): Self = StObject.set(x, "onReorder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnReorderUndefined: Self = StObject.set(x, "onReorder", js.undefined)
      
      @scala.inline
      def setSelection(value: js.Array[js.Any]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
      
      @scala.inline
      def setSelectionVarargs(value: js.Any*): Self = StObject.set(x, "selection", js.Array(value :_*))
    }
  }
}
