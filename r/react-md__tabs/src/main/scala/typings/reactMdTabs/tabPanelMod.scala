package typings.reactMdTabs

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.reactMdTransition.typesMod.OverridableCSSTransitionProps
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabPanelMod {
  
  @JSImport("@react-md/tabs/types/TabPanel", "TabPanel")
  @js.native
  val TabPanel: ForwardRefExoticComponent[TabPanelProps & RefAttributes[HTMLDivElement]] = js.native
  
  trait TabPanelProps
    extends StObject
       with HTMLAttributes[HTMLDivElement]
       with OverridableCSSTransitionProps
  object TabPanelProps {
    
    inline def apply(): TabPanelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabPanelProps]
    }
  }
}
