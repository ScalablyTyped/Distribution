package typings.reactToolbox

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactToolbox.mod.ReactToolbox.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardTitleMod {
  
  @JSImport("react-toolbox/components/card/CardTitle", JSImport.Default)
  @js.native
  open class default protected () extends CardTitle {
    def this(props: CardTitleProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CardTitleProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/card/CardTitle", "CardTitle")
  @js.native
  open class CardTitle protected ()
    extends Component[CardTitleProps, js.Object, Any] {
    def this(props: CardTitleProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CardTitleProps, context: Any) = this()
  }
  
  trait CardTitleProps
    extends StObject
       with Props {
    
    /**
      * A string URL or Element to specify an avatar in the left side of the title.
      */
    var avatar: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Children to pass through the component.
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Text used for the sub header of the card.
      */
    var subtitle: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Classnames object defining the component style.
      */
    var theme: js.UndefOr[CardTitleTheme] = js.undefined
    
    /**
      * Text used for the title of the card.
      */
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object CardTitleProps {
    
    inline def apply(): CardTitleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardTitleProps]
    }
    
    extension [Self <: CardTitleProps](x: Self) {
      
      inline def setAvatar(value: ReactNode): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setSubtitle(value: ReactNode): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setTheme(value: CardTitleTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait CardTitleTheme extends StObject {
    
    /**
      * Class used for the root element.
      */
    var cardTitle: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the root element when the card has no avatar.
      */
    var large: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the root element when the card has avatar.
      */
    var small: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the subtitle element.
      */
    var subtitle: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the title element.
      */
    var title: js.UndefOr[String] = js.undefined
  }
  object CardTitleTheme {
    
    inline def apply(): CardTitleTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardTitleTheme]
    }
    
    extension [Self <: CardTitleTheme](x: Self) {
      
      inline def setCardTitle(value: String): Self = StObject.set(x, "cardTitle", value.asInstanceOf[js.Any])
      
      inline def setCardTitleUndefined: Self = StObject.set(x, "cardTitle", js.undefined)
      
      inline def setLarge(value: String): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      inline def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
      
      inline def setSmall(value: String): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
      
      inline def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
      
      inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
