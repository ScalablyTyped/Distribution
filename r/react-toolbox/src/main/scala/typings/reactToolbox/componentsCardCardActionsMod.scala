package typings.reactToolbox

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactToolbox.mod.ReactToolbox.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsCardCardActionsMod {
  
  @JSImport("react-toolbox/components/card/CardActions", JSImport.Default)
  @js.native
  open class default protected () extends CardActions {
    def this(props: CardActionsProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: CardActionsProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/card/CardActions", "CardActions")
  @js.native
  open class CardActions protected ()
    extends Component[CardActionsProps, js.Object, Any] {
    def this(props: CardActionsProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: CardActionsProps, context: Any) = this()
  }
  
  trait CardActionsProps
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
    var theme: js.UndefOr[CardActionsTheme] = js.undefined
  }
  object CardActionsProps {
    
    inline def apply(): CardActionsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardActionsProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CardActionsProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setTheme(value: CardActionsTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait CardActionsTheme extends StObject {
    
    /**
      * Used for a wrapper around actions as the root element.
      */
    var cardActions: js.UndefOr[String] = js.undefined
  }
  object CardActionsTheme {
    
    inline def apply(): CardActionsTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardActionsTheme]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CardActionsTheme] (val x: Self) extends AnyVal {
      
      inline def setCardActions(value: String): Self = StObject.set(x, "cardActions", value.asInstanceOf[js.Any])
      
      inline def setCardActionsUndefined: Self = StObject.set(x, "cardActions", js.undefined)
    }
  }
}
