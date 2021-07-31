package typings.reactDndMultiBackend

import typings.dndCore.interfacesMod.Backend
import typings.dndCore.interfacesMod.BackendFactory
import typings.dndCore.interfacesMod.DragDropManager
import typings.react.mod.CSSProperties
import typings.react.mod.FC
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.reactDndMultiBackend.anon.Context
import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-dnd-multi-backend", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-dnd-multi-backend", JSImport.Default)
  @js.native
  val default: BackendFactory = js.native
  
  @JSImport("react-dnd-multi-backend", "DndProvider")
  @js.native
  val DndProvider: FC[Context] = js.native
  
  @JSImport("react-dnd-multi-backend", "HTML5DragTransition")
  @js.native
  val HTML5DragTransition: Transition = js.native
  
  @JSImport("react-dnd-multi-backend", "MouseTransition")
  @js.native
  val MouseTransition: Transition = js.native
  
  @JSImport("react-dnd-multi-backend", "MultiBackend")
  @js.native
  val MultiBackend: BackendFactory = js.native
  
  @JSImport("react-dnd-multi-backend", "Preview")
  @js.native
  class Preview protected ()
    extends PureComponent[PreviewProps[js.Any], js.Object, js.Any] {
    def this(props: PreviewProps[js.Any]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PreviewProps[js.Any], context: js.Any) = this()
  }
  
  @JSImport("react-dnd-multi-backend", "TouchTransition")
  @js.native
  val TouchTransition: Transition = js.native
  
  @scala.inline
  def createTransition(eventType: String, check: CheckFunction[js.Any]): Transition = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransition")(eventType.asInstanceOf[js.Any], check.asInstanceOf[js.Any])).asInstanceOf[Transition]
  
  trait BackendDeclaration extends StObject {
    
    /**
      * Backend - e.g. the one provided by react-dnd-html5-backend.
      */
    var backend: BackendFactory
    
    /**
      * Parameters to the backend
      */
    var options: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Flag to indicate that this backend needs to have a custom preview generated. This is mainly
      * used for backends such as the react-dnd-touch-backend, where there is no default preview
      * available.
      */
    var preview: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The transition that this backend should be used for.
      */
    var transition: js.UndefOr[Transition] = js.undefined
  }
  object BackendDeclaration {
    
    @scala.inline
    def apply(
      backend: (/* manager */ DragDropManager, /* globalContext */ js.UndefOr[js.Any], /* configuration */ js.UndefOr[js.Any]) => Backend
    ): BackendDeclaration = {
      val __obj = js.Dynamic.literal(backend = js.Any.fromFunction3(backend))
      __obj.asInstanceOf[BackendDeclaration]
    }
    
    @scala.inline
    implicit class BackendDeclarationMutableBuilder[Self <: BackendDeclaration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackend(
        value: (/* manager */ DragDropManager, /* globalContext */ js.UndefOr[js.Any], /* configuration */ js.UndefOr[js.Any]) => Backend
      ): Self = StObject.set(x, "backend", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setPreview(value: Boolean): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
      
      @scala.inline
      def setTransition(value: Transition): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    }
  }
  
  trait Backends extends StObject {
    
    /**
      * The array of backends to use. The first backend in the list is used as the default backend.
      * This means that you can start with the html5 backend, and fall-back to a touch backend if
      * the event is not one that is compatible with the html5 backend.
      */
    var backends: js.Array[BackendDeclaration]
  }
  object Backends {
    
    @scala.inline
    def apply(backends: js.Array[BackendDeclaration]): Backends = {
      val __obj = js.Dynamic.literal(backends = backends.asInstanceOf[js.Any])
      __obj.asInstanceOf[Backends]
    }
    
    @scala.inline
    implicit class BackendsMutableBuilder[Self <: Backends] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackends(value: js.Array[BackendDeclaration]): Self = StObject.set(x, "backends", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackendsVarargs(value: BackendDeclaration*): Self = StObject.set(x, "backends", js.Array(value :_*))
    }
  }
  
  type CheckFunction[E /* <: UIEvent */] = js.Function1[/* event */ E, Boolean]
  
  type PreviewGenerator[T] = js.Function1[/* arg */ PreviewGeneratorArg[T], ReactNode]
  
  trait PreviewGeneratorArg[T] extends StObject {
    
    /**
      * The item being dragged (monitor.getItem())
      */
    var item: T
    
    /**
      * The type of the item (monitor.getItemType())
      */
    var itemType: String
    
    /**
      * An object representing the style to use for the item, it should be passed to
      * your component's style property and is used for positioning
      */
    var style: CSSProperties
  }
  object PreviewGeneratorArg {
    
    @scala.inline
    def apply[T](item: T, itemType: String, style: CSSProperties): PreviewGeneratorArg[T] = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], itemType = itemType.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreviewGeneratorArg[T]]
    }
    
    @scala.inline
    implicit class PreviewGeneratorArgMutableBuilder[Self <: PreviewGeneratorArg[?], T] (val x: Self & PreviewGeneratorArg[T]) extends AnyVal {
      
      @scala.inline
      def setItem(value: T): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  trait PreviewProps[T] extends StObject {
    
    /**
      * Callback function to generate a preview object when dragging. This preview will only be used
      * with backends that have the 'preview' flag set to true.
      * @param arg.itemType: the type of the item (monitor.getItemType())
      * @param arg.item: the item being dragged (monitor.getItem())
      * @param arg.style: an object representing the style to use for the item, it should be passed to
      *               your component's style property and is used for positioning.
      * @returns The JSX element to display for the drag preview.
      */
    var generator: PreviewGenerator[T]
  }
  object PreviewProps {
    
    @scala.inline
    def apply[T](generator: /* arg */ PreviewGeneratorArg[T] => ReactNode): PreviewProps[T] = {
      val __obj = js.Dynamic.literal(generator = js.Any.fromFunction1(generator))
      __obj.asInstanceOf[PreviewProps[T]]
    }
    
    @scala.inline
    implicit class PreviewPropsMutableBuilder[Self <: PreviewProps[?], T] (val x: Self & PreviewProps[T]) extends AnyVal {
      
      @scala.inline
      def setGenerator(value: /* arg */ PreviewGeneratorArg[T] => ReactNode): Self = StObject.set(x, "generator", js.Any.fromFunction1(value))
    }
  }
  
  trait Transition extends StObject {
    
    /**
      * ???
      */
    var _isMBTransition: Boolean
    
    /**
      * Check function to use for this transition.
      */
    var check: CheckFunction[js.Any]
    
    /**
      * Event type that this transition should check against. This will be an HTML event, such as
      * "dragstart", "touchstart", etc.
      */
    var event: String
  }
  object Transition {
    
    @scala.inline
    def apply(_isMBTransition: Boolean, check: js.Any => Boolean, event: String): Transition = {
      val __obj = js.Dynamic.literal(_isMBTransition = _isMBTransition.asInstanceOf[js.Any], check = js.Any.fromFunction1(check), event = event.asInstanceOf[js.Any])
      __obj.asInstanceOf[Transition]
    }
    
    @scala.inline
    implicit class TransitionMutableBuilder[Self <: Transition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheck(value: js.Any => Boolean): Self = StObject.set(x, "check", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_isMBTransition(value: Boolean): Self = StObject.set(x, "_isMBTransition", value.asInstanceOf[js.Any])
    }
  }
}
