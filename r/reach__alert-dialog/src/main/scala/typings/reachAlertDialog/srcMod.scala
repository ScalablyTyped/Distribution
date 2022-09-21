package typings.reachAlertDialog

import typings.reachDialog.srcMod.DialogContentProps
import typings.reachDialog.srcMod.DialogProps
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMod {
  
  /**
    * AlertDialog
    *
    * High-level component to render an alert dialog.
    *
    * @see Docs https://reach.tech/alert-dialog#alertdialog
    * @param props
    */
  @JSImport("@reach/alert-dialog/dist/declarations/src", "AlertDialog")
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
  @JSImport("@reach/alert-dialog/dist/declarations/src", "AlertDialogContent")
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
  @JSImport("@reach/alert-dialog/dist/declarations/src", "AlertDialogDescription")
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
  @JSImport("@reach/alert-dialog/dist/declarations/src", "AlertDialogLabel")
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
  @JSImport("@reach/alert-dialog/dist/declarations/src", "AlertDialogOverlay")
  @js.native
  val AlertDialogOverlay: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', AlertDialogProps> */ Any = js.native
  
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
    
    extension [Self <: AlertDialogContentProps](x: Self) {
      
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
    
    extension [Self <: AlertDialogProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLeastDestructiveRef(value: RefObject[HTMLElement]): Self = StObject.set(x, "leastDestructiveRef", value.asInstanceOf[js.Any])
      
      inline def setLeastDestructiveRefUndefined: Self = StObject.set(x, "leastDestructiveRef", js.undefined)
    }
  }
}
