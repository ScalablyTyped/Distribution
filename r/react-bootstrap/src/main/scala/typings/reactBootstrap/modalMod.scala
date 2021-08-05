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
  inline def Body_=(x: Instantiable0[typings.reactBootstrap.modalBodyMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Body")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Modal", "Dialog")
  @js.native
  class Dialog ()
    extends typings.reactBootstrap.modalDialogMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Modal", "Dialog")
  @js.native
  def Dialog: Instantiable0[typings.reactBootstrap.modalDialogMod.^] = js.native
  inline def Dialog_=(x: Instantiable0[typings.reactBootstrap.modalDialogMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Dialog")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Modal", "Footer")
  @js.native
  class Footer ()
    extends typings.reactBootstrap.modalFooterMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Modal", "Footer")
  @js.native
  def Footer: Instantiable0[typings.reactBootstrap.modalFooterMod.^] = js.native
  inline def Footer_=(x: Instantiable0[typings.reactBootstrap.modalFooterMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Footer")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Modal", "Header")
  @js.native
  class Header ()
    extends typings.reactBootstrap.modalHeaderMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Modal", "Header")
  @js.native
  def Header: Instantiable0[typings.reactBootstrap.modalHeaderMod.^] = js.native
  inline def Header_=(x: Instantiable0[typings.reactBootstrap.modalHeaderMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Modal", "Title")
  @js.native
  class Title ()
    extends typings.reactBootstrap.modalTitleMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Modal", "Title")
  @js.native
  def Title: Instantiable0[typings.reactBootstrap.modalTitleMod.^] = js.native
  inline def Title_=(x: Instantiable0[typings.reactBootstrap.modalTitleMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Title")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Modal
    extends Component[ModalProps, js.Object, js.Any]
  
  trait ModalProps
    extends StObject
       with TransitionCallbacks
       with HTMLProps[Modal] {
    
    // Optional
    var animation: js.UndefOr[Boolean] = js.undefined
    
    var backdrop: js.UndefOr[Boolean | String] = js.undefined
    
    var backdropClassName: js.UndefOr[String] = js.undefined
    
    var backdropStyle: js.UndefOr[js.Any] = js.undefined
    
    var backdropTransitionTimeout: js.UndefOr[Double] = js.undefined
    
    var bsClass: js.UndefOr[String] = js.undefined
    
    var bsSize: js.UndefOr[Sizes] = js.undefined
    
    var container: js.UndefOr[js.Any] = js.undefined
    
    // TODO: Add more specific type
    var containerClassName: js.UndefOr[String] = js.undefined
    
    var dialogClassName: js.UndefOr[String] = js.undefined
    
    var dialogComponent: js.UndefOr[js.Any] = js.undefined
    
    // TODO: Add more specific type
    var dialogTransitionTimeout: js.UndefOr[Double] = js.undefined
    
    var enforceFocus: js.UndefOr[Boolean] = js.undefined
    
    var keyboard: js.UndefOr[Boolean] = js.undefined
    
    var onBackdropClick: js.UndefOr[js.Function1[/* node */ HTMLElement, js.Any]] = js.undefined
    
    var onEscapeKeyDown: js.UndefOr[js.Function1[/* node */ HTMLElement, js.Any]] = js.undefined
    
    /**
      * @deprecated since Sept 25, 2017, use onEscapeKeyDown instead
      **/
    var onEscapeKeyUp: js.UndefOr[js.Function1[/* node */ HTMLElement, js.Any]] = js.undefined
    
    // Required
    var onHide: js.Function
    
    var onShow: js.UndefOr[js.Function1[/* node */ HTMLElement, js.Any]] = js.undefined
    
    var restoreFocus: js.UndefOr[Boolean] = js.undefined
    
    var show: js.UndefOr[Boolean] = js.undefined
    
    var transition: js.UndefOr[ReactElement] = js.undefined
  }
  object ModalProps {
    
    inline def apply(onHide: js.Function): ModalProps = {
      val __obj = js.Dynamic.literal(onHide = onHide.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalProps]
    }
    
    extension [Self <: ModalProps](x: Self) {
      
      inline def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setBackdrop(value: Boolean | String): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
      
      inline def setBackdropClassName(value: String): Self = StObject.set(x, "backdropClassName", value.asInstanceOf[js.Any])
      
      inline def setBackdropClassNameUndefined: Self = StObject.set(x, "backdropClassName", js.undefined)
      
      inline def setBackdropStyle(value: js.Any): Self = StObject.set(x, "backdropStyle", value.asInstanceOf[js.Any])
      
      inline def setBackdropStyleUndefined: Self = StObject.set(x, "backdropStyle", js.undefined)
      
      inline def setBackdropTransitionTimeout(value: Double): Self = StObject.set(x, "backdropTransitionTimeout", value.asInstanceOf[js.Any])
      
      inline def setBackdropTransitionTimeoutUndefined: Self = StObject.set(x, "backdropTransitionTimeout", js.undefined)
      
      inline def setBackdropUndefined: Self = StObject.set(x, "backdrop", js.undefined)
      
      inline def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      inline def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      inline def setBsSize(value: Sizes): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
      
      inline def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
      
      inline def setContainer(value: js.Any): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
      
      inline def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setDialogClassName(value: String): Self = StObject.set(x, "dialogClassName", value.asInstanceOf[js.Any])
      
      inline def setDialogClassNameUndefined: Self = StObject.set(x, "dialogClassName", js.undefined)
      
      inline def setDialogComponent(value: js.Any): Self = StObject.set(x, "dialogComponent", value.asInstanceOf[js.Any])
      
      inline def setDialogComponentUndefined: Self = StObject.set(x, "dialogComponent", js.undefined)
      
      inline def setDialogTransitionTimeout(value: Double): Self = StObject.set(x, "dialogTransitionTimeout", value.asInstanceOf[js.Any])
      
      inline def setDialogTransitionTimeoutUndefined: Self = StObject.set(x, "dialogTransitionTimeout", js.undefined)
      
      inline def setEnforceFocus(value: Boolean): Self = StObject.set(x, "enforceFocus", value.asInstanceOf[js.Any])
      
      inline def setEnforceFocusUndefined: Self = StObject.set(x, "enforceFocus", js.undefined)
      
      inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      inline def setOnBackdropClick(value: /* node */ HTMLElement => js.Any): Self = StObject.set(x, "onBackdropClick", js.Any.fromFunction1(value))
      
      inline def setOnBackdropClickUndefined: Self = StObject.set(x, "onBackdropClick", js.undefined)
      
      inline def setOnEscapeKeyDown(value: /* node */ HTMLElement => js.Any): Self = StObject.set(x, "onEscapeKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnEscapeKeyDownUndefined: Self = StObject.set(x, "onEscapeKeyDown", js.undefined)
      
      inline def setOnEscapeKeyUp(value: /* node */ HTMLElement => js.Any): Self = StObject.set(x, "onEscapeKeyUp", js.Any.fromFunction1(value))
      
      inline def setOnEscapeKeyUpUndefined: Self = StObject.set(x, "onEscapeKeyUp", js.undefined)
      
      inline def setOnHide(value: js.Function): Self = StObject.set(x, "onHide", value.asInstanceOf[js.Any])
      
      inline def setOnShow(value: /* node */ HTMLElement => js.Any): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setRestoreFocus(value: Boolean): Self = StObject.set(x, "restoreFocus", value.asInstanceOf[js.Any])
      
      inline def setRestoreFocusUndefined: Self = StObject.set(x, "restoreFocus", js.undefined)
      
      inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setTransition(value: ReactElement): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    }
  }
}
