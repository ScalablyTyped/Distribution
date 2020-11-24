package typings.reactDataGrid.global.AdazzleReactDataGridPlugins

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AdazzleReactDataGridPlugins.Menu")
@js.native
object Menu extends js.Object {
  
  def ContextMenuLayer(identifier: js.Any): js.Function1[/* Component */ js.Any, _] = js.native
  def ContextMenuLayer(identifier: js.Any, configure: js.Function1[/* props */ js.Any, _]): js.Function1[/* Component */ js.Any, _] = js.native
  
  def connect(Menu: js.Any): js.Any = js.native
  
  @js.native
  class ContextMenu ()
    extends Component[js.Any, js.Object, js.Any]
  
  @js.native
  class MenuHeader ()
    extends Component[js.Any, js.Object, js.Any]
  
  @js.native
  class MenuItem ()
    extends Component[js.Any, js.Object, js.Any]
  
  @js.native
  class SubMenu ()
    extends Component[js.Any, js.Object, js.Any]
  
  @js.native
  object monitor extends js.Object {
    
    def getItem(): js.Any = js.native
    
    def getPosition(): js.Any = js.native
    
    def hideMenu(): Unit = js.native
  }
}
