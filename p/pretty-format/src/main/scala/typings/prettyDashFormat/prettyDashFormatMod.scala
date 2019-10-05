package typings.prettyDashFormat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pretty-format", JSImport.Namespace)
@js.native
object prettyDashFormatMod extends js.Object {
  /**
    * Returns a presentation string of your `val` object
    * @param val any potential JavaScript object
    * @param options Custom settings
    */
  def apply(`val`: js.Any): String = js.native
  def apply(`val`: js.Any, options: typings.prettyDashFormat.buildTypesMod.OptionsReceived): String = js.native
  @js.native
  object plugins extends js.Object {
    var AsymmetricMatcher: typings.prettyDashFormat.buildTypesMod.NewPlugin = js.native
    var ConvertAnsi: typings.prettyDashFormat.buildTypesMod.NewPlugin = js.native
    var DOMCollection: typings.prettyDashFormat.buildTypesMod.NewPlugin = js.native
    var DOMElement: typings.prettyDashFormat.buildTypesMod.NewPlugin = js.native
    var Immutable: typings.prettyDashFormat.buildTypesMod.NewPlugin = js.native
    var ReactElement: typings.prettyDashFormat.buildTypesMod.NewPlugin = js.native
    var ReactTestComponent: typings.prettyDashFormat.buildTypesMod.NewPlugin = js.native
  }
  
  type Colors = typings.prettyDashFormat.buildTypesMod.Colors
  type Config = typings.prettyDashFormat.buildTypesMod.Config
  type NewPlugin = typings.prettyDashFormat.buildTypesMod.NewPlugin
  type Options = typings.prettyDashFormat.buildTypesMod.Options
  type OptionsReceived = typings.prettyDashFormat.buildTypesMod.OptionsReceived
  type Plugin = typings.prettyDashFormat.buildTypesMod.Plugin
  type Plugins = typings.prettyDashFormat.buildTypesMod.Plugins
  type Refs = typings.prettyDashFormat.buildTypesMod.Refs
  type Theme = typings.prettyDashFormat.buildTypesMod.Theme
}

