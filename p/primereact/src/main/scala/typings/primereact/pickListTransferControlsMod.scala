package typings.primereact

import typings.primereact.anon.DirectionOriginalEvent
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickListTransferControlsMod {
  
  @JSImport("primereact/components/picklist/PickListTransferControls", "PickListTransferControls")
  @js.native
  class PickListTransferControls protected ()
    extends Component[PickListTransferControlsProps, js.Any, js.Any] {
    def this(props: PickListTransferControlsProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PickListTransferControlsProps, context: js.Any) = this()
  }
  
  @js.native
  trait PickListTransferControlsProps extends StObject {
    
    var onTransfer: js.UndefOr[js.Function1[/* e */ DirectionOriginalEvent, Unit]] = js.native
    
    var source: js.UndefOr[js.Array[_]] = js.native
    
    var sourceSelection: js.UndefOr[js.Array[_]] = js.native
    
    var target: js.UndefOr[js.Array[_]] = js.native
    
    var targetSelection: js.UndefOr[js.Array[_]] = js.native
  }
  object PickListTransferControlsProps {
    
    @scala.inline
    def apply(): PickListTransferControlsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickListTransferControlsProps]
    }
    
    @scala.inline
    implicit class PickListTransferControlsPropsMutableBuilder[Self <: PickListTransferControlsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnTransfer(value: /* e */ DirectionOriginalEvent => Unit): Self = StObject.set(x, "onTransfer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTransferUndefined: Self = StObject.set(x, "onTransfer", js.undefined)
      
      @scala.inline
      def setSource(value: js.Array[_]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceSelection(value: js.Array[_]): Self = StObject.set(x, "sourceSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceSelectionUndefined: Self = StObject.set(x, "sourceSelection", js.undefined)
      
      @scala.inline
      def setSourceSelectionVarargs(value: js.Any*): Self = StObject.set(x, "sourceSelection", js.Array(value :_*))
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setSourceVarargs(value: js.Any*): Self = StObject.set(x, "source", js.Array(value :_*))
      
      @scala.inline
      def setTarget(value: js.Array[_]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetSelection(value: js.Array[_]): Self = StObject.set(x, "targetSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetSelectionUndefined: Self = StObject.set(x, "targetSelection", js.undefined)
      
      @scala.inline
      def setTargetSelectionVarargs(value: js.Any*): Self = StObject.set(x, "targetSelection", js.Array(value :_*))
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTargetVarargs(value: js.Any*): Self = StObject.set(x, "target", js.Array(value :_*))
    }
  }
}
