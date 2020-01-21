package typings.reactToolbox

import typings.react.mod.Component
import typings.reactToolbox.libTabsTabsMod.TabsProps
import typings.reactToolbox.tabsTabMod.TabProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-toolbox/lib/tabs", JSImport.Namespace)
@js.native
object libTabsMod extends js.Object {
  @js.native
  class Tab ()
    extends Component[TabProps, js.Object, js.Any]
  
  @js.native
  class Tabs ()
    extends Component[TabsProps, js.Object, js.Any]
  
}

