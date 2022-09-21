package typings.reachDialog

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * Dialog
    *
    * High-level component to render a modal dialog window over the top of the page
    * (or another dialog).
    *
    * @see Docs https://reach.tech/dialog#dialog
    */
  @JSImport("@reach/dialog", JSImport.Default)
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
  @JSImport("@reach/dialog", "Dialog")
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
  @JSImport("@reach/dialog", "DialogContent")
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
  @JSImport("@reach/dialog", "DialogOverlay")
  @js.native
  val DialogOverlay: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', DialogOverlayProps> */ Any = js.native
  
  type _To = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', DialogProps> */ Any
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', DialogProps> */ Any = default
}
