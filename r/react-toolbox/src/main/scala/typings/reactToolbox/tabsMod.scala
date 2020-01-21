package typings.reactToolbox

import typings.react.mod.Component
import typings.reactToolbox.tabMod.TabProps
import typings.reactToolbox.tabsTabsMod.TabsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-toolbox/components/tabs", JSImport.Namespace)
@js.native
object tabsMod extends js.Object {
  @js.native
  class Tab ()
    extends Component[TabProps, js.Object, js.Any]
  
  @js.native
  class Tabs ()
    extends Component[TabsProps, js.Object, js.Any]
  
}

