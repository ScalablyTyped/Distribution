package typings.reachAlertDialog

import typings.reachDialog.mod.DialogContentProps
import typings.reachDialog.mod.DialogProps
import typings.react.mod.FC
import typings.react.mod.FunctionComponent
import typings.react.mod.HTMLProps
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@reach/alert-dialog", "AlertDialog")
  @js.native
  val AlertDialog: FunctionComponent[AlertDialogProps] = js.native
  
  @JSImport("@reach/alert-dialog", "AlertDialogContent")
  @js.native
  val AlertDialogContent: FC[AlertDialogContentProps] = js.native
  
  @JSImport("@reach/alert-dialog", "AlertDialogDescription")
  @js.native
  val AlertDialogDescription: FC[HTMLProps[HTMLDivElement]] = js.native
  
  @JSImport("@reach/alert-dialog", "AlertDialogLabel")
  @js.native
  val AlertDialogLabel: FC[HTMLProps[HTMLDivElement]] = js.native
  
  @JSImport("@reach/alert-dialog", "AlertDialogOverlay")
  @js.native
  val AlertDialogOverlay: FC[AlertDialogProps] = js.native
  
  trait AlertDialogContentProps
    extends StObject
       with DialogContentProps {
    
    @JSName("children")
    var children_AlertDialogContentProps: ReactNode
  }
  object AlertDialogContentProps {
    
    @scala.inline
    def apply(): AlertDialogContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlertDialogContentProps]
    }
    
    @scala.inline
    implicit class AlertDialogContentPropsMutableBuilder[Self <: AlertDialogContentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait AlertDialogProps
    extends StObject
       with DialogProps {
    
    @JSName("children")
    var children_AlertDialogProps: ReactNode
    
    var leastDestructiveRef: RefObject[HTMLElement]
  }
  object AlertDialogProps {
    
    @scala.inline
    def apply(leastDestructiveRef: RefObject[HTMLElement]): AlertDialogProps = {
      val __obj = js.Dynamic.literal(leastDestructiveRef = leastDestructiveRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlertDialogProps]
    }
    
    @scala.inline
    implicit class AlertDialogPropsMutableBuilder[Self <: AlertDialogProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setLeastDestructiveRef(value: RefObject[HTMLElement]): Self = StObject.set(x, "leastDestructiveRef", value.asInstanceOf[js.Any])
    }
  }
}
