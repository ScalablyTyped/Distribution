package typings.reactMdDialog

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.reactMdDialog.reactMdDialogStrings.`stacked-end`
import typings.reactMdDialog.reactMdDialogStrings.`stacked-start`
import typings.reactMdDialog.reactMdDialogStrings.between
import typings.reactMdDialog.reactMdDialogStrings.end
import typings.reactMdDialog.reactMdDialogStrings.none
import typings.reactMdDialog.reactMdDialogStrings.start
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogFooterMod {
  
  @JSImport("@react-md/dialog/types/DialogFooter", "DialogFooter")
  @js.native
  val DialogFooter: ForwardRefExoticComponent[DialogFooterProps & RefAttributes[HTMLDivElement]] = js.native
  
  trait DialogFooterProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    /**
      * An optional alignment for the content within the footer. Since the majority
      * of dialog footers are used to contain action buttons, the default alignment
      * is near the end.
      */
    var align: js.UndefOr[none | start | end | between | `stacked-start` | `stacked-end`] = js.undefined
  }
  object DialogFooterProps {
    
    inline def apply(): DialogFooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogFooterProps]
    }
    
    extension [Self <: DialogFooterProps](x: Self) {
      
      inline def setAlign(value: none | start | end | between | `stacked-start` | `stacked-end`): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    }
  }
}
