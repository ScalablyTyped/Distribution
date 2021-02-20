package typings.reactOverlays

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object manageAriaHiddenMod {
  
  @JSImport("react-overlays/cjs/manageAriaHidden", "ariaHidden")
  @js.native
  def ariaHidden(hide: Boolean): Unit = js.native
  @JSImport("react-overlays/cjs/manageAriaHidden", "ariaHidden")
  @js.native
  def ariaHidden(hide: Boolean, node: Element): Unit = js.native
  
  @JSImport("react-overlays/cjs/manageAriaHidden", "hideSiblings")
  @js.native
  def hideSiblings(container: Element, hasDialogBackdrop: SiblingExclusions): Unit = js.native
  
  @JSImport("react-overlays/cjs/manageAriaHidden", "showSiblings")
  @js.native
  def showSiblings(container: Element, hasDialogBackdrop: SiblingExclusions): Unit = js.native
  
  @js.native
  trait SiblingExclusions extends StObject {
    
    var backdrop: Element = js.native
    
    var dialog: Element = js.native
  }
  object SiblingExclusions {
    
    @scala.inline
    def apply(backdrop: Element, dialog: Element): SiblingExclusions = {
      val __obj = js.Dynamic.literal(backdrop = backdrop.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any])
      __obj.asInstanceOf[SiblingExclusions]
    }
    
    @scala.inline
    implicit class SiblingExclusionsMutableBuilder[Self <: SiblingExclusions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackdrop(value: Element): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDialog(value: Element): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
    }
  }
}
