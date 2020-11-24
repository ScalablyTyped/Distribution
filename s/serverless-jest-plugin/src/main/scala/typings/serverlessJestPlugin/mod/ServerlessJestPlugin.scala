package typings.serverlessJestPlugin.mod

import typings.serverless.pluginMod.Commands
import typings.serverless.pluginMod.Hooks
import typings.serverless.pluginMod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerlessJestPlugin extends Plugin {
  
  @JSName("commands")
  var commands_ServerlessJestPlugin: Commands = js.native
}
object ServerlessJestPlugin {
  
  @scala.inline
  def apply(commands: Commands, hooks: Hooks): ServerlessJestPlugin = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], hooks = hooks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerlessJestPlugin]
  }
  
  @scala.inline
  implicit class ServerlessJestPluginOps[Self <: ServerlessJestPlugin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCommands(value: Commands): Self = this.set("commands", value.asInstanceOf[js.Any])
  }
}
