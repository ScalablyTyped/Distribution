package typings.reactToolbox

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactToolbox.mod.ReactToolbox.Props
import typings.reactToolbox.reactToolboxStrings.square
import typings.reactToolbox.reactToolboxStrings.wide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardMediaMod {
  
  @JSImport("react-toolbox/components/card/CardMedia", JSImport.Default)
  @js.native
  open class default protected () extends CardMedia {
    def this(props: CardMediaProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CardMediaProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/card/CardMedia", "CardMedia")
  @js.native
  open class CardMedia protected ()
    extends Component[CardMediaProps, js.Object, Any] {
    def this(props: CardMediaProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CardMediaProps, context: Any) = this()
  }
  
  trait CardMediaProps
    extends StObject
       with Props
       with /**
    * Additional properties passed to inner input element.
    */
  /* key */ StringDictionary[Any] {
    
    /**
      * Forces a 16:9 or 1:1 aspect ratio respectively. Unset, the media area will have a flexible height.
      */
    var aspectRatio: js.UndefOr[wide | square] = js.undefined
    
    /**
      * Children to pass through the component.
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Sets the background color.
      */
    var color: js.UndefOr[String] = js.undefined
    
    /**
      * Creates a dark overlay underneath the child components.
      */
    var contentOverlay: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Can be used instead of children. Accepts an element or a URL string.
      */
    var image: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Classnames object defining the component style.
      */
    var theme: js.UndefOr[CardMediaTheme] = js.undefined
  }
  object CardMediaProps {
    
    inline def apply(): CardMediaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardMediaProps]
    }
    
    extension [Self <: CardMediaProps](x: Self) {
      
      inline def setAspectRatio(value: wide | square): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setContentOverlay(value: Boolean): Self = StObject.set(x, "contentOverlay", value.asInstanceOf[js.Any])
      
      inline def setContentOverlayUndefined: Self = StObject.set(x, "contentOverlay", js.undefined)
      
      inline def setImage(value: ReactNode): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setTheme(value: CardMediaTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait CardMediaTheme extends StObject {
    
    /**
      * Added to the element root.
      */
    var cardMedia: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the content element.
      */
    var content: js.UndefOr[String] = js.undefined
    
    /**
      * Added to content element if its overlayed.
      */
    var contentOverlay: js.UndefOr[String] = js.undefined
    
    /**
      * Added to content element if its squared.
      */
    var square: js.UndefOr[String] = js.undefined
    
    /**
      * Added to content element if its wide.
      */
    var wide: js.UndefOr[String] = js.undefined
  }
  object CardMediaTheme {
    
    inline def apply(): CardMediaTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardMediaTheme]
    }
    
    extension [Self <: CardMediaTheme](x: Self) {
      
      inline def setCardMedia(value: String): Self = StObject.set(x, "cardMedia", value.asInstanceOf[js.Any])
      
      inline def setCardMediaUndefined: Self = StObject.set(x, "cardMedia", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentOverlay(value: String): Self = StObject.set(x, "contentOverlay", value.asInstanceOf[js.Any])
      
      inline def setContentOverlayUndefined: Self = StObject.set(x, "contentOverlay", js.undefined)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setSquare(value: String): Self = StObject.set(x, "square", value.asInstanceOf[js.Any])
      
      inline def setSquareUndefined: Self = StObject.set(x, "square", js.undefined)
      
      inline def setWide(value: String): Self = StObject.set(x, "wide", value.asInstanceOf[js.Any])
      
      inline def setWideUndefined: Self = StObject.set(x, "wide", js.undefined)
    }
  }
}
