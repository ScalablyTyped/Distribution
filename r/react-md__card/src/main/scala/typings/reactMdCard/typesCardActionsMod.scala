package typings.reactMdCard

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.reactMdCard.reactMdCardStrings.center
import typings.reactMdCard.reactMdCardStrings.end
import typings.reactMdCard.reactMdCardStrings.start
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCardActionsMod {
  
  @JSImport("@react-md/card/types/CardActions", "CardActions")
  @js.native
  val CardActions: ForwardRefExoticComponent[CardActionsProps & RefAttributes[HTMLDivElement]] = js.native
  
  trait CardActionsProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    /**
      * The alignment to use for the card actions. This is really just a simple
      * pass through to the `justify-content` flex property.
      */
    var align: js.UndefOr[start | end | center] = js.undefined
  }
  object CardActionsProps {
    
    inline def apply(): CardActionsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardActionsProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CardActionsProps] (val x: Self) extends AnyVal {
      
      inline def setAlign(value: start | end | center): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    }
  }
}
