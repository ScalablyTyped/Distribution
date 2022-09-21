package typings.reachAlertDialog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * AlertDialog
    *
    * High-level component to render an alert dialog.
    *
    * @see Docs https://reach.tech/alert-dialog#alertdialog
    * @param props
    */
  @JSImport("@reach/alert-dialog", "AlertDialog")
  @js.native
  val AlertDialog: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', AlertDialogProps> */ Any = js.native
  
  /**
    * AlertDialogContent
    *
    * Low-level component if you need more control over the styles or rendering of
    * the dialog content.
    *
    * Note: Must be a child of `AlertDialogOverlay`.
    *
    * Note: You only need to use this when you are also styling
    * `AlertDialogOverlay`, otherwise you can use the high-level `AlertDialog`
    * component and pass the props to it.
    *
    * @see Docs https://reach.tech/alert-dialog#alertdialogcontent
    */
  @JSImport("@reach/alert-dialog", "AlertDialogContent")
  @js.native
  val AlertDialogContent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', AlertDialogContentProps> */ Any = js.native
  
  /**
    * AlertDialogDescription
    *
    * Additional content read by screen readers, usually a longer description
    * about what you need from the user like "This action is permanent, are you
    * sure?" etc.
    *
    * @see Docs https://reach.tech/alert-dialog#alertdialogdescription
    * @param props
    */
  @JSImport("@reach/alert-dialog", "AlertDialogDescription")
  @js.native
  val AlertDialogDescription: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', AlertDialogDescriptionProps> */ Any = js.native
  
  /**
    * AlertDialogLabel
    *
    * The first thing ready by screen readers when the dialog opens, usually the
    * title of the dialog like "Warning!" or "Please confirm!".
    *
    * This is required. The `AlertDialog` will throw an error if no label is
    * rendered.
    *
    * @see Docs https://reach.tech/alert-dialog#alertdialoglabel
    */
  @JSImport("@reach/alert-dialog", "AlertDialogLabel")
  @js.native
  val AlertDialogLabel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', AlertDialogLabelProps> */ Any = js.native
  
  /**
    * AlertDialogOverlay
    *
    * Low-level component if you need more control over the styles or rendering of
    * the dialog overlay. In the following example we use the AlertDialogOverlay
    * and AlertDialogContent to have more control over the styles.
    *
    * Note: You must render an `AlertDialogContent` inside.
    *
    * @see Docs https://reach.tech/alert-dialog#alertdialogoverlay
    */
  @JSImport("@reach/alert-dialog", "AlertDialogOverlay")
  @js.native
  val AlertDialogOverlay: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', AlertDialogProps> */ Any = js.native
}
