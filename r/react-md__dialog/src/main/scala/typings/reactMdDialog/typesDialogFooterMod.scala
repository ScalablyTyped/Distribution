package typings.reactMdDialog

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDialogFooterMod {
  
  @JSImport("@react-md/dialog/types/DialogFooter", "DialogFooter")
  @js.native
  val DialogFooter: ForwardRefExoticComponent[DialogFooterProps & RefAttributes[HTMLDivElement]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdDialog.reactMdDialogStrings.none
    - typings.reactMdDialog.reactMdDialogStrings.start
    - typings.reactMdDialog.reactMdDialogStrings.end
    - typings.reactMdDialog.reactMdDialogStrings.between
    - typings.reactMdDialog.reactMdDialogStrings.`stacked-start`
    - typings.reactMdDialog.reactMdDialogStrings.`stacked-end`
  */
  trait DialogFooterAlignment extends StObject
  object DialogFooterAlignment {
    
    inline def between: typings.reactMdDialog.reactMdDialogStrings.between = "between".asInstanceOf[typings.reactMdDialog.reactMdDialogStrings.between]
    
    inline def end: typings.reactMdDialog.reactMdDialogStrings.end = "end".asInstanceOf[typings.reactMdDialog.reactMdDialogStrings.end]
    
    inline def none: typings.reactMdDialog.reactMdDialogStrings.none = "none".asInstanceOf[typings.reactMdDialog.reactMdDialogStrings.none]
    
    inline def `stacked-end`: typings.reactMdDialog.reactMdDialogStrings.`stacked-end` = "stacked-end".asInstanceOf[typings.reactMdDialog.reactMdDialogStrings.`stacked-end`]
    
    inline def `stacked-start`: typings.reactMdDialog.reactMdDialogStrings.`stacked-start` = "stacked-start".asInstanceOf[typings.reactMdDialog.reactMdDialogStrings.`stacked-start`]
    
    inline def start: typings.reactMdDialog.reactMdDialogStrings.start = "start".asInstanceOf[typings.reactMdDialog.reactMdDialogStrings.start]
  }
  
  trait DialogFooterProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    /** {@inheritDoc DialogFooterAlignment} */
    var align: js.UndefOr[DialogFooterAlignment] = js.undefined
  }
  object DialogFooterProps {
    
    inline def apply(): DialogFooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogFooterProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DialogFooterProps] (val x: Self) extends AnyVal {
      
      inline def setAlign(value: DialogFooterAlignment): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    }
  }
}
