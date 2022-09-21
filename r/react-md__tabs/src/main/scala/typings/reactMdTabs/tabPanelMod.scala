package typings.reactMdTabs

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.reactMdTransition.typesMod.CSSTransitionClassNames
import typings.reactMdTransition.typesMod.CSSTransitionComponentProps
import typings.reactMdTransition.typesMod.TransitionActions
import typings.reactMdTransition.typesMod.TransitionTimeout
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabPanelMod {
  
  @JSImport("@react-md/tabs/types/TabPanel", "DEFAULT_TABPANEL_CLASSNAMES")
  @js.native
  val DEFAULT_TABPANEL_CLASSNAMES: CSSTransitionClassNames = js.native
  
  @JSImport("@react-md/tabs/types/TabPanel", "DEFAULT_TABPANEL_TIMEOUT")
  @js.native
  val DEFAULT_TABPANEL_TIMEOUT: TransitionTimeout = js.native
  
  @JSImport("@react-md/tabs/types/TabPanel", "TabPanel")
  @js.native
  val TabPanel: ForwardRefExoticComponent[TabPanelProps & RefAttributes[HTMLDivElement]] = js.native
  
  trait TabPanelProps
    extends StObject
       with HTMLAttributes[HTMLDivElement]
       with CSSTransitionComponentProps
       with TransitionActions {
    
    /**
      * @see {@link TransitionOptions.transitionIn}
      */
    var transitionIn: js.UndefOr[Boolean] = js.undefined
  }
  object TabPanelProps {
    
    inline def apply(): TabPanelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabPanelProps]
    }
    
    extension [Self <: TabPanelProps](x: Self) {
      
      inline def setTransitionIn(value: Boolean): Self = StObject.set(x, "transitionIn", value.asInstanceOf[js.Any])
      
      inline def setTransitionInUndefined: Self = StObject.set(x, "transitionIn", js.undefined)
    }
  }
}
