package typings.reactToolbox

import typings.reactToolbox.tabMod.TabProps
import typings.reactToolbox.tabsTabsMod.TabsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsMod {
  
  @JSImport("react-toolbox/components/tabs", "Tab")
  @js.native
  open class Tab protected ()
    extends typings.reactToolbox.tabMod.Tab {
    def this(props: TabProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TabProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/tabs", "Tabs")
  @js.native
  open class Tabs protected ()
    extends typings.reactToolbox.tabsTabsMod.Tabs {
    def this(props: TabsProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TabsProps, context: Any) = this()
  }
}
