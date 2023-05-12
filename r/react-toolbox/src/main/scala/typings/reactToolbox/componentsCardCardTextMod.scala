package typings.reactToolbox

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactToolbox.mod.ReactToolbox.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsCardCardTextMod {
  
  @JSImport("react-toolbox/components/card/CardText", JSImport.Default)
  @js.native
  open class default protected () extends CardText {
    def this(props: CardTextProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: CardTextProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/card/CardText", "CardText")
  @js.native
  open class CardText protected ()
    extends Component[CardTextProps, js.Object, Any] {
    def this(props: CardTextProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: CardTextProps, context: Any) = this()
  }
  
  trait CardTextProps
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
      * Classnames object defining the component style.
      */
    var theme: js.UndefOr[CardTextTheme] = js.undefined
  }
  object CardTextProps {
    
    inline def apply(): CardTextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardTextProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CardTextProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setTheme(value: CardTextTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait CardTextTheme extends StObject {
    
    /**
      * Used for the main root element.
      */
    var cardText: js.UndefOr[String] = js.undefined
  }
  object CardTextTheme {
    
    inline def apply(): CardTextTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardTextTheme]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CardTextTheme] (val x: Self) extends AnyVal {
      
      inline def setCardText(value: String): Self = StObject.set(x, "cardText", value.asInstanceOf[js.Any])
      
      inline def setCardTextUndefined: Self = StObject.set(x, "cardText", js.undefined)
    }
  }
}
