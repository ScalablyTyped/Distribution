package typings.snykCliInterface

import typings.snykCliInterface.pluginMod.InspectOptions
import typings.snykCliInterface.pluginMod.InspectResult
import typings.snykCliInterface.pluginMod.Plugin
import typings.snykCliInterface.pluginMod.SingleSubprojectPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@snyk/cli-interface", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  object legacyPlugin extends js.Object {
    def adaptSingleProjectPlugin(plugin: SingleSubprojectPlugin): Plugin = js.native
    def isMultiResult(res: InspectResult): /* is @snyk/cli-interface.@snyk/cli-interface/legacy/plugin.MultiProjectResult */ Boolean = js.native
    def isMultiSubProject(options: InspectOptions): /* is @snyk/cli-interface.@snyk/cli-interface/legacy/plugin.MultiSubprojectInspectOptions */ Boolean = js.native
  }
  
}

