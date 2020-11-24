package typings.storybookCore.anon

import typings.node.NodeModule
import typings.storybookClientApi.mod.ConfigApi
import typings.storybookCore.typesMod.Loadable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Channel extends js.Object {
  
  var channel: typings.storybookAddons.mod.Channel = js.native
  
  var clientApi: typings.storybookClientApi.mod.ClientApi = js.native
  
  var configApi: ConfigApi = js.native
  
  def configure(framework: String, loadable: Loadable, m: NodeModule): Unit = js.native
  def configure(framework: String, loadable: Loadable, m: NodeModule, showDeprecationWarning: Boolean): Unit = js.native
  
  def forceReRender(): Unit = js.native
}
