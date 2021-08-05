package typings.reactOverlays

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmManageAriaHiddenMod {
  
  @JSImport("react-overlays/esm/manageAriaHidden", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ariaHidden(hide: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ariaHidden")(hide.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def ariaHidden(hide: Boolean, node: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ariaHidden")(hide.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def hideSiblings(container: Element, hasDialogBackdrop: SiblingExclusions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hideSiblings")(container.asInstanceOf[js.Any], hasDialogBackdrop.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def showSiblings(container: Element, hasDialogBackdrop: SiblingExclusions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showSiblings")(container.asInstanceOf[js.Any], hasDialogBackdrop.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait SiblingExclusions extends StObject {
    
    var backdrop: Element
    
    var dialog: Element
  }
  object SiblingExclusions {
    
    inline def apply(backdrop: Element, dialog: Element): SiblingExclusions = {
      val __obj = js.Dynamic.literal(backdrop = backdrop.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any])
      __obj.asInstanceOf[SiblingExclusions]
    }
    
    extension [Self <: SiblingExclusions](x: Self) {
      
      inline def setBackdrop(value: Element): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
      
      inline def setDialog(value: Element): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
    }
  }
}
