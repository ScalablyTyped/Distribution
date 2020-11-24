package typings.storybookUi

import typings.react.mod.Component
import typings.react.mod.Consumer
import typings.react.mod.NamedExoticComponent
import typings.storybookAddons.distMod.Addon
import typings.storybookUi.anon.Reset
import typings.storybookUi.anon.Set
import typings.storybookUi.anon.ShouldScale
import typings.storybookUi.anon.Value
import typings.storybookUi.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/ui/dist/components/preview/tools/zoom", JSImport.Namespace)
@js.native
object zoomMod extends js.Object {
  
  val Zoom: NamedExoticComponent[Reset] = js.native
  
  val ZoomConsumer: Consumer[Set] = js.native
  
  val zoomTool: Addon = js.native
  
  @js.native
  class ZoomProvider ()
    extends Component[ShouldScale, Value, js.Any] {
    
    def set(value: Double): Unit = js.native
    
    @JSName("state")
    var state_ZoomProvider: `0` = js.native
  }
}
