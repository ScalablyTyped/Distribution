package typings.serverless.pluginManagerMod

import typings.serverless.mod.Options
import typings.serverless.pluginMod.Plugin
import typings.serverless.pluginMod.PluginStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginManager extends js.Object {
  var plugins: js.Array[Plugin] = js.native
  var serverless: typings.serverless.mod.^ = js.native
  def addPlugin(plugin: PluginStatic): Unit = js.native
  def loadAllPlugins(servicePlugins: js.Object): Unit = js.native
  def loadCommand(pluginName: String, details: js.Object, key: String): js.Object = js.native
  def loadCommands(pluginInstance: Plugin): Unit = js.native
  def loadCorePlugins(): Unit = js.native
  def loadPlugins(plugins: js.Object): Unit = js.native
  def loadServicePlugins(servicePlugins: js.Object): Unit = js.native
  def setCliCommands(commands: js.Object): Unit = js.native
  def setCliOptions(options: Options): Unit = js.native
  def spawn(commandsArray: String): js.Promise[Unit] = js.native
  def spawn(commandsArray: String, options: js.Any): js.Promise[Unit] = js.native
  def spawn(commandsArray: js.Array[String]): js.Promise[Unit] = js.native
  def spawn(commandsArray: js.Array[String], options: js.Any): js.Promise[Unit] = js.native
}

