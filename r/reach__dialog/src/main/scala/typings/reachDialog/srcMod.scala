package typings.reachDialog

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMod extends Shortcut {
  
  /**
    * Dialog
    *
    * High-level component to render a modal dialog window over the top of the page
    * (or another dialog).
    *
    * @see Docs https://reach.tech/dialog#dialog
    */
  @JSImport("@reach/dialog/dist/declarations/src", JSImport.Default)
  @js.native
  val default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', DialogProps> */ Any = js.native
  
  /**
    * Dialog
    *
    * High-level component to render a modal dialog window over the top of the page
    * (or another dialog).
    *
    * @see Docs https://reach.tech/dialog#dialog
    */
  @JSImport("@reach/dialog/dist/declarations/src", "Dialog")
  @js.native
  val Dialog: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', DialogProps> */ Any = js.native
  
  /**
    * DialogContent
    *
    * Low-level component if you need more control over the styles or rendering of
    * the dialog content.
    *
    * Note: Must be a child of `DialogOverlay`.
    *
    * Note: You only need to use this when you are also styling `DialogOverlay`,
    * otherwise you can use the high-level `Dialog` component and pass the props
    * to it. Any props passed to `Dialog` component (besides `isOpen` and
    * `onDismiss`) will be spread onto `DialogContent`.
    *
    * @see Docs https://reach.tech/dialog#dialogcontent
    */
  @JSImport("@reach/dialog/dist/declarations/src", "DialogContent")
  @js.native
  val DialogContent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', DialogContentProps> */ Any = js.native
  
  /**
    * DialogOverlay
    *
    * Low-level component if you need more control over the styles or rendering of
    * the dialog overlay.
    *
    * Note: You must render a `DialogContent` inside.
    *
    * @see Docs https://reach.tech/dialog#dialogoverlay
    */
  @JSImport("@reach/dialog/dist/declarations/src", "DialogOverlay")
  @js.native
  val DialogOverlay: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', DialogOverlayProps> */ Any = js.native
  
  /**
    * @see Docs https://reach.tech/dialog#dialogcontent-props
    */
  trait DialogContentProps extends StObject {
    
    /**
      * Accepts any renderable content.
      *
      * @see Docs https://reach.tech/dialog#dialogcontent-children
      */
    var children: js.UndefOr[ReactNode] = js.undefined
  }
  object DialogContentProps {
    
    inline def apply(): DialogContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogContentProps]
    }
    
    extension [Self <: DialogContentProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait DialogOverlayProps
    extends StObject
       with DialogProps {
    
    /**
      * By default the dialog locks the focus inside it. Normally this is what you
      * want. This prop is provided so that this feature can be disabled. This,
      * however, is strongly discouraged.
      *
      * The reason it is provided is not to disable the focus lock entirely.
      * Rather, there are certain situations where you may need more control on how
      * the focus lock works. This should be complemented by setting up a focus
      * lock yourself that would allow more flexibility for your specific use case.
      *
      * If you do set this prop to `true`, make sure you set up your own
      * `FocusLock` component. You can likely use
      * `react-focus-lock`, which is what Reach uses internally by default. It has
      * various settings to allow more customization, but it takes care of a lot of
      * hard work that you probably don't want or need to do.
      *
      * @see Docs https://reach.tech/dialog#dialogoverlay-dangerouslybypassfocuslock
      * @see https://github.com/theKashey/react-focus-lock
      * @see https://github.com/reach/reach-ui/issues/615
      */
    var dangerouslyBypassFocusLock: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default the dialog locks scrolling with `react-remove-scroll`, which
      * also injects some styles on the body element to remove the scrollbar while
      * maintaining its gap to prevent jank when the dialog's open state is
      * toggled. This is almost always what you want in a dialog, but in some cases
      * you may have the need to customize this behavior further.
      *
      * This prop will disable `react-remove-scroll` and allow you to compose your
      * own scroll lock component to meet your needs. Like the
      * `dangerouslyBypassFocusLock` prop, this is generally discouraged and should
      * only be used if a proper fallback for managing scroll behavior is provided.
      *
      * @see Docs https://reach.tech/dialog#dialogoverlay-dangerouslybypassscrolllock
      * @see https://github.com/theKashey/react-remove-scroll
      */
    var dangerouslyBypassScrollLock: js.UndefOr[Boolean] = js.undefined
  }
  object DialogOverlayProps {
    
    inline def apply(): DialogOverlayProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogOverlayProps]
    }
    
    extension [Self <: DialogOverlayProps](x: Self) {
      
      inline def setDangerouslyBypassFocusLock(value: Boolean): Self = StObject.set(x, "dangerouslyBypassFocusLock", value.asInstanceOf[js.Any])
      
      inline def setDangerouslyBypassFocusLockUndefined: Self = StObject.set(x, "dangerouslyBypassFocusLock", js.undefined)
      
      inline def setDangerouslyBypassScrollLock(value: Boolean): Self = StObject.set(x, "dangerouslyBypassScrollLock", value.asInstanceOf[js.Any])
      
      inline def setDangerouslyBypassScrollLockUndefined: Self = StObject.set(x, "dangerouslyBypassScrollLock", js.undefined)
    }
  }
  
  /**
    * @see Docs https://reach.tech/dialog#dialog-props
    */
  trait DialogProps extends StObject {
    
    /**
      * Handle zoom/pinch gestures on iOS devices when scroll locking is enabled.
      * Defaults to `false`.
      *
      * @see Docs https://reach.tech/dialog#dialog-allowpinchzoom
      */
    var allowPinchZoom: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Accepts any renderable content.
      *
      * @see Docs https://reach.tech/dialog#dialog-children
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * By default the first focusable element will receive focus when the dialog
      * opens but you can provide a ref to focus instead.
      *
      * @see Docs https://reach.tech/dialog#dialog-initialfocusref
      */
    var initialFocusRef: js.UndefOr[RefObject[Any]] = js.undefined
    
    /**
      * Controls whether or not the dialog is open.
      *
      * @see Docs https://reach.tech/dialog#dialog-isopen
      */
    var isOpen: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This function is called whenever the user hits "Escape" or clicks outside
      * the dialog. _It's important to close the dialog `onDismiss`_.
      *
      * The only time you shouldn't close the dialog on dismiss is when the dialog
      * requires a choice and none of them are "cancel". For example, perhaps two
      * records need to be merged and the user needs to pick the surviving record.
      * Neither choice is less destructive than the other, so in these cases you
      * may want to alert the user they need to a make a choice on dismiss instead
      * of closing the dialog.
      *
      * @see Docs https://reach.tech/dialog#dialog-ondismiss
      */
    var onDismiss: js.UndefOr[
        js.Function1[/* event */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element], Unit]
      ] = js.undefined
    
    /**
      * By default, React Focus Lock prevents focus from being moved outside of the
      * locked element even if the thing trying to take focus is in another frame.
      * Normally this is what you want, as an iframe is typically going to be a
      * part of your page content. But in some situations, like when using Code
      * Sandbox, you can't use any of the controls or the editor in the sandbox
      * while dialog is open because of the focus lock.
      *
      * This prop may have some negative side effects and unintended consequences,
      * and it opens questions about how we might distinguish frames that *should*
      * steal focus from those that shouldn't. Perhaps it's best for app devs to
      * decide, and if they use this prop we should advise them to imperatively
      * assign a -1 tabIndex to other iframes that are a part of the page content
      * when the dialog is open.
      *
      * https://github.com/reach/reach-ui/issues/536
      *
      * @deprecated
      */
    var unstable_lockFocusAcrossFrames: js.UndefOr[Boolean] = js.undefined
  }
  object DialogProps {
    
    inline def apply(): DialogProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogProps]
    }
    
    extension [Self <: DialogProps](x: Self) {
      
      inline def setAllowPinchZoom(value: Boolean): Self = StObject.set(x, "allowPinchZoom", value.asInstanceOf[js.Any])
      
      inline def setAllowPinchZoomUndefined: Self = StObject.set(x, "allowPinchZoom", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setInitialFocusRef(value: RefObject[Any]): Self = StObject.set(x, "initialFocusRef", value.asInstanceOf[js.Any])
      
      inline def setInitialFocusRefUndefined: Self = StObject.set(x, "initialFocusRef", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      inline def setOnDismiss(value: /* event */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element] => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction1(value))
      
      inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      inline def setUnstable_lockFocusAcrossFrames(value: Boolean): Self = StObject.set(x, "unstable_lockFocusAcrossFrames", value.asInstanceOf[js.Any])
      
      inline def setUnstable_lockFocusAcrossFramesUndefined: Self = StObject.set(x, "unstable_lockFocusAcrossFrames", js.undefined)
    }
  }
  
  type _To = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', DialogProps> */ Any
  
  /* This means you don't have to write `default`, but can instead just say `srcMod.foo` */
  override def _to: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', DialogProps> */ Any = default
}
