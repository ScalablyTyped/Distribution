package typings.reactToolbox

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactToolbox.mod.ReactToolbox.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsCardCardMod {
  
  @JSImport("react-toolbox/components/card/Card", JSImport.Default)
  @js.native
  open class default protected () extends Card {
    def this(props: CardProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CardProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/card/Card", "Card")
  @js.native
  open class Card protected ()
    extends Component[CardProps, js.Object, Any] {
    def this(props: CardProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CardProps, context: Any) = this()
  }
  
  trait CardProps
    extends StObject
       with Props
       with /**
    * Additional properties passed to inner input element.
    */
  /* key */ StringDictionary[Any] {
    
    /**
      * Children to pass through the component.
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Increases the shadow depth to appear elevated.
      * @default false
      */
    var raised: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Classnames object defining the component style.
      */
    var theme: js.UndefOr[CardTheme] = js.undefined
  }
  object CardProps {
    
    inline def apply(): CardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardProps]
    }
    
    extension [Self <: CardProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setRaised(value: Boolean): Self = StObject.set(x, "raised", value.asInstanceOf[js.Any])
      
      inline def setRaisedUndefined: Self = StObject.set(x, "raised", js.undefined)
      
      inline def setTheme(value: CardTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait CardTheme extends StObject {
    
    /**
      * Class used for the root element.
      */
    var card: js.UndefOr[String] = js.undefined
    
    /**
      *Added to the root element in case the card is raised.
      */
    var raised: js.UndefOr[String] = js.undefined
  }
  object CardTheme {
    
    inline def apply(): CardTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardTheme]
    }
    
    extension [Self <: CardTheme](x: Self) {
      
      inline def setCard(value: String): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
      
      inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
      
      inline def setRaised(value: String): Self = StObject.set(x, "raised", value.asInstanceOf[js.Any])
      
      inline def setRaisedUndefined: Self = StObject.set(x, "raised", js.undefined)
    }
  }
}
