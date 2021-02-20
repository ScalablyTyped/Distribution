package typings.reactBootstrap

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.react.mod.ReactElement
import typings.reactBootstrap.mod.Sizes
import typings.reactBootstrap.mod.TransitionCallbacks
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalMod {
  
  @JSImport("react-bootstrap/lib/Modal", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[ModalProps, js.Object, js.Any]
  @JSImport("react-bootstrap/lib/Modal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Modal", "Body")
  @js.native
  class Body ()
    extends typings.reactBootstrap.modalBodyMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Modal", "Body")
  @js.native
  def Body: Instantiable0[typings.reactBootstrap.modalBodyMod.^] = js.native
  @scala.inline
  def Body_=(x: Instantiable0[typings.reactBootstrap.modalBodyMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Body")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Modal", "Dialog")
  @js.native
  class Dialog ()
    extends typings.reactBootstrap.modalDialogMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Modal", "Dialog")
  @js.native
  def Dialog: Instantiable0[typings.reactBootstrap.modalDialogMod.^] = js.native
  @scala.inline
  def Dialog_=(x: Instantiable0[typings.reactBootstrap.modalDialogMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Dialog")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Modal", "Footer")
  @js.native
  class Footer ()
    extends typings.reactBootstrap.modalFooterMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Modal", "Footer")
  @js.native
  def Footer: Instantiable0[typings.reactBootstrap.modalFooterMod.^] = js.native
  @scala.inline
  def Footer_=(x: Instantiable0[typings.reactBootstrap.modalFooterMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Footer")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Modal", "Header")
  @js.native
  class Header ()
    extends typings.reactBootstrap.modalHeaderMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Modal", "Header")
  @js.native
  def Header: Instantiable0[typings.reactBootstrap.modalHeaderMod.^] = js.native
  @scala.inline
  def Header_=(x: Instantiable0[typings.reactBootstrap.modalHeaderMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Modal", "Title")
  @js.native
  class Title ()
    extends typings.reactBootstrap.modalTitleMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Modal", "Title")
  @js.native
  def Title: Instantiable0[typings.reactBootstrap.modalTitleMod.^] = js.native
  @scala.inline
  def Title_=(x: Instantiable0[typings.reactBootstrap.modalTitleMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Title")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Modal
    extends Component[ModalProps, js.Object, js.Any]
  
  @js.native
  trait ModalProps
    extends HTMLProps[Modal]
       with TransitionCallbacks {
    
    // Optional
    var animation: js.UndefOr[Boolean] = js.native
    
    var backdrop: js.UndefOr[Boolean | String] = js.native
    
    var backdropClassName: js.UndefOr[String] = js.native
    
    var backdropStyle: js.UndefOr[js.Any] = js.native
    
    var backdropTransitionTimeout: js.UndefOr[Double] = js.native
    
    var bsClass: js.UndefOr[String] = js.native
    
    var bsSize: js.UndefOr[Sizes] = js.native
    
    var container: js.UndefOr[js.Any] = js.native
    
    // TODO: Add more specific type
    var containerClassName: js.UndefOr[String] = js.native
    
    var dialogClassName: js.UndefOr[String] = js.native
    
    var dialogComponent: js.UndefOr[js.Any] = js.native
    
    // TODO: Add more specific type
    var dialogTransitionTimeout: js.UndefOr[Double] = js.native
    
    var enforceFocus: js.UndefOr[Boolean] = js.native
    
    var keyboard: js.UndefOr[Boolean] = js.native
    
    var onBackdropClick: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.native
    
    var onEscapeKeyDown: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.native
    
    /**
      * @deprecated since Sept 25, 2017, use onEscapeKeyDown instead
      **/
    var onEscapeKeyUp: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.native
    
    // Required
    var onHide: js.Function = js.native
    
    var onShow: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.native
    
    var restoreFocus: js.UndefOr[Boolean] = js.native
    
    var show: js.UndefOr[Boolean] = js.native
    
    var transition: js.UndefOr[ReactElement] = js.native
  }
  object ModalProps {
    
    @scala.inline
    def apply(onHide: js.Function): ModalProps = {
      val __obj = js.Dynamic.literal(onHide = onHide.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalProps]
    }
    
    @scala.inline
    implicit class ModalPropsMutableBuilder[Self <: ModalProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setBackdrop(value: Boolean | String): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropClassName(value: String): Self = StObject.set(x, "backdropClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropClassNameUndefined: Self = StObject.set(x, "backdropClassName", js.undefined)
      
      @scala.inline
      def setBackdropStyle(value: js.Any): Self = StObject.set(x, "backdropStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropStyleUndefined: Self = StObject.set(x, "backdropStyle", js.undefined)
      
      @scala.inline
      def setBackdropTransitionTimeout(value: Double): Self = StObject.set(x, "backdropTransitionTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropTransitionTimeoutUndefined: Self = StObject.set(x, "backdropTransitionTimeout", js.undefined)
      
      @scala.inline
      def setBackdropUndefined: Self = StObject.set(x, "backdrop", js.undefined)
      
      @scala.inline
      def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      @scala.inline
      def setBsSize(value: Sizes): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
      
      @scala.inline
      def setContainer(value: js.Any): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setDialogClassName(value: String): Self = StObject.set(x, "dialogClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDialogClassNameUndefined: Self = StObject.set(x, "dialogClassName", js.undefined)
      
      @scala.inline
      def setDialogComponent(value: js.Any): Self = StObject.set(x, "dialogComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDialogComponentUndefined: Self = StObject.set(x, "dialogComponent", js.undefined)
      
      @scala.inline
      def setDialogTransitionTimeout(value: Double): Self = StObject.set(x, "dialogTransitionTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDialogTransitionTimeoutUndefined: Self = StObject.set(x, "dialogTransitionTimeout", js.undefined)
      
      @scala.inline
      def setEnforceFocus(value: Boolean): Self = StObject.set(x, "enforceFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnforceFocusUndefined: Self = StObject.set(x, "enforceFocus", js.undefined)
      
      @scala.inline
      def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      @scala.inline
      def setOnBackdropClick(value: /* node */ HTMLElement => _): Self = StObject.set(x, "onBackdropClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBackdropClickUndefined: Self = StObject.set(x, "onBackdropClick", js.undefined)
      
      @scala.inline
      def setOnEscapeKeyDown(value: /* node */ HTMLElement => _): Self = StObject.set(x, "onEscapeKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEscapeKeyDownUndefined: Self = StObject.set(x, "onEscapeKeyDown", js.undefined)
      
      @scala.inline
      def setOnEscapeKeyUp(value: /* node */ HTMLElement => _): Self = StObject.set(x, "onEscapeKeyUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEscapeKeyUpUndefined: Self = StObject.set(x, "onEscapeKeyUp", js.undefined)
      
      @scala.inline
      def setOnHide(value: js.Function): Self = StObject.set(x, "onHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnShow(value: /* node */ HTMLElement => _): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      @scala.inline
      def setRestoreFocus(value: Boolean): Self = StObject.set(x, "restoreFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestoreFocusUndefined: Self = StObject.set(x, "restoreFocus", js.undefined)
      
      @scala.inline
      def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      @scala.inline
      def setTransition(value: ReactElement): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    }
  }
}
