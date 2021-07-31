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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zoomMod {
  
  @JSImport("@storybook/ui/dist/components/preview/tools/zoom", "Zoom")
  @js.native
  val Zoom: NamedExoticComponent[Reset] = js.native
  
  @JSImport("@storybook/ui/dist/components/preview/tools/zoom", "ZoomConsumer")
  @js.native
  val ZoomConsumer: Consumer[Set] = js.native
  
  @JSImport("@storybook/ui/dist/components/preview/tools/zoom", "ZoomProvider")
  @js.native
  class ZoomProvider protected ()
    extends Component[ShouldScale, Value, js.Any] {
    def this(props: ShouldScale) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ShouldScale, context: js.Any) = this()
    
    def set(value: Double): Unit = js.native
    
    @JSName("state")
    var state_ZoomProvider: `0` = js.native
  }
  
  @JSImport("@storybook/ui/dist/components/preview/tools/zoom", "zoomTool")
  @js.native
  val zoomTool: Addon = js.native
}
