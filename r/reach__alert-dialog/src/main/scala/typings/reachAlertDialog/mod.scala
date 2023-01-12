package typings.reachAlertDialog

import typings.reachAlertDialog.reachAlertDialogStrings.div
import typings.reachDialog.mod.DialogContentProps
import typings.reachDialog.mod.DialogProps
import typings.reachPolymorphic.mod.ForwardRefComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.std.HTMLElement
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
  val AlertDialog: ForwardRefComponent[div, AlertDialogProps] = js.native
  
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
  val AlertDialogContent: ForwardRefComponent[div, AlertDialogContentProps] = js.native
  
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
  val AlertDialogDescription: ForwardRefComponent[div, AlertDialogDescriptionProps] = js.native
  
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
  val AlertDialogLabel: ForwardRefComponent[div, AlertDialogLabelProps] = js.native
  
  /**
    * Welcome to @reach/alert-dialog!
    *
    * A modal dialog that interrupts the user's workflow to get a response, usually
    * some sort of confirmation. This is different than a typical Dialog in that it
    * requires some user response, like "Save", or "Cancel", etc.
    *
    * Most of the time you'll use `AlertDialog`, `AlertDialogLabel`, and
    * `AlertDialogDescription` together. If you need more control over the styling
    * of the modal you can drop down a level and use `AlertDialogOverlay` and
    * `AlertDialogContent` instead of `AlertDialog`.
    *
    * When a Dialog opens, the _least destructive_ action should be focused so that
    * if a user accidentally hits enter when the dialog opens no damage is done.
    * This is accomplished with the `leastDestructiveRef` prop.
    *
    * Every dialog must render an `AlertDialogLabel` so the screen reader knows
    * what to say about the dialog. If an `AlertDialogDescription` is also
    * rendered, the screen reader will also announce that. If you render more than
    * these two elements and some buttons, the screen reader might not announce it
    * so it's important to keep the content inside of `AlertDialogLabel` and
    * `AlertDialogDescription`.
    *
    * This is built on top of [Dialog](/dialog), so `AlertDialog` spreads its props
    * and renders a `Dialog`, same for `AlertDialogOverlay` to `DialogOverlay`, and
    * `AlertDialogContent` to `DialogContent`.
    *
    * @see Docs     https://reach.tech/alert-dialog
    * @see Source https://github.com/reach/reach-ui/tree/main/packages/alert-dialog
    * @see WAI-ARIA https://www.w3.org/TR/wai-aria-practices-1.2/#alertdialog
    */
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
  val AlertDialogOverlay: ForwardRefComponent[div, AlertDialogProps] = js.native
  
  /**
    * @see Docs https://reach.tech/alert-dialog#alertdialogcontent-props
    */
  trait AlertDialogContentProps
    extends StObject
       with DialogContentProps {
    
    /**
      * Accepts any renderable content but should generally be restricted to
      * `AlertDialogLabel`, `AlertDialogDescription` and action buttons, other
      * content might not be announced to the user by the screen reader.
      *
      * @see Docs https://reach.tech/alert-dialog#alertdialogcontent-children
      */
    @JSName("children")
    var children_AlertDialogContentProps: ReactNode
  }
  object AlertDialogContentProps {
    
    inline def apply(): AlertDialogContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlertDialogContentProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AlertDialogContentProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait AlertDialogDescriptionProps extends StObject
  
  trait AlertDialogLabelProps extends StObject
  
  /**
    * @see Docs https://reach.tech/alert-dialog#alertdialog-props
    */
  trait AlertDialogProps
    extends StObject
       with DialogProps {
    
    /**
      * Accepts any renderable content but should generally be restricted to
      * `AlertDialogLabel`, `AlertDialogDescription` and action buttons, other
      * content might not be announced to the user by the screen reader.
      *
      * @see Docs: https://reach.tech/alert-dialog#alertdialog-children
      */
    @JSName("children")
    var children_AlertDialogProps: ReactNode
    
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * To prevent accidental data loss, an alert dialog should focus the least
      * destructive action button when it opens.
      *
      * @see Docs: https://reach.tech/alert-dialog#alertdialog-leastdestructiveref
      */
    var leastDestructiveRef: js.UndefOr[RefObject[HTMLElement]] = js.undefined
  }
  object AlertDialogProps {
    
    inline def apply(): AlertDialogProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlertDialogProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AlertDialogProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLeastDestructiveRef(value: RefObject[HTMLElement]): Self = StObject.set(x, "leastDestructiveRef", value.asInstanceOf[js.Any])
      
      inline def setLeastDestructiveRefUndefined: Self = StObject.set(x, "leastDestructiveRef", js.undefined)
    }
  }
}
