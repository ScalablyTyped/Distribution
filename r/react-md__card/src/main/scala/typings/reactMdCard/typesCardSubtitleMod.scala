package typings.reactMdCard

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.std.HTMLHeadingElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCardSubtitleMod {
  
  @JSImport("@react-md/card/types/CardSubtitle", "CardSubtitle")
  @js.native
  val CardSubtitle: ForwardRefExoticComponent[CardSubtitleProps & RefAttributes[HTMLHeadingElement]] = js.native
  
  trait CardSubtitleProps
    extends StObject
       with HTMLAttributes[HTMLHeadingElement] {
    
    /**
      * Boolean if the subtitle should no longer use the secondary text color
      * within cards.
      */
    var disableSecondaryColor: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the title should not be able to line-wrap and will ellipsis long
      * text.
      */
    var noWrap: js.UndefOr[Boolean] = js.undefined
  }
  object CardSubtitleProps {
    
    inline def apply(): CardSubtitleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardSubtitleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CardSubtitleProps] (val x: Self) extends AnyVal {
      
      inline def setDisableSecondaryColor(value: Boolean): Self = StObject.set(x, "disableSecondaryColor", value.asInstanceOf[js.Any])
      
      inline def setDisableSecondaryColorUndefined: Self = StObject.set(x, "disableSecondaryColor", js.undefined)
      
      inline def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
      
      inline def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
    }
  }
}
