package typings.reactMdCard

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.std.HTMLHeadingElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardTitleMod {
  
  @JSImport("@react-md/card/types/CardTitle", "CardTitle")
  @js.native
  val CardTitle: ForwardRefExoticComponent[CardTitleProps & RefAttributes[HTMLHeadingElement]] = js.native
  
  trait CardTitleProps
    extends StObject
       with HTMLAttributes[HTMLHeadingElement] {
    
    /**
      * Boolean if the title should not be able to line-wrap and will ellipsis long
      * text.
      */
    var noWrap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the title should be smaller than normal. You should usually
      * enable this prop when using the `CardSubtitle` with this component in the
      * `CardHeader`.
      */
    var small: js.UndefOr[Boolean] = js.undefined
  }
  object CardTitleProps {
    
    @scala.inline
    def apply(): CardTitleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardTitleProps]
    }
    
    @scala.inline
    implicit class CardTitlePropsMutableBuilder[Self <: CardTitleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
      
      @scala.inline
      def setSmall(value: Boolean): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
    }
  }
}
