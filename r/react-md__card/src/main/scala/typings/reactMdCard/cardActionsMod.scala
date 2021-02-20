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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardActionsMod {
  
  @JSImport("@react-md/card/types/CardActions", "CardActions")
  @js.native
  val CardActions: ForwardRefExoticComponent[CardActionsProps with RefAttributes[HTMLDivElement]] = js.native
  
  @js.native
  trait CardActionsProps extends HTMLAttributes[HTMLDivElement] {
    
    /**
      * The alignment to use for the card actions. This is really just a simple
      * pass through to the `justify-content` flex property.
      */
    var align: js.UndefOr[start | end | center] = js.native
  }
  object CardActionsProps {
    
    @scala.inline
    def apply(): CardActionsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardActionsProps]
    }
    
    @scala.inline
    implicit class CardActionsPropsMutableBuilder[Self <: CardActionsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: start | end | center): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    }
  }
}
