package typings.serverlessJestPlugin.mod

import typings.serverless.mod.Options
import typings.serverless.pluginMod.Commands
import typings.serverless.pluginMod.Hooks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serverless-jest-plugin", JSImport.Namespace)
@js.native
class ^ protected () extends ServerlessJestPlugin {
  def this(serverless: typings.serverless.mod.^, options: Options) = this()
  /* CompleteClass */
  @JSName("commands")
  override var commands_ServerlessJestPlugin: Commands = js.native
  /* CompleteClass */
  override var hooks: Hooks = js.native
}

