package typings
package serverlessLib.classesPluginManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PluginManager extends js.Object {
  var plugins: js.Array[serverlessLib.classesPluginMod.namespaced]
  var serverless: serverlessLib.serverlessMod.namespaced
  def addPlugin(plugin: js.Any): scala.Unit
  def loadAllPlugins(servicePlugins: js.Object): scala.Unit
  def loadCommand(pluginName: java.lang.String, details: js.Object, key: java.lang.String): js.Object
  def loadCommands(pluginInstance: serverlessLib.classesPluginMod.namespaced): scala.Unit
  def loadCorePlugins(): scala.Unit
  def loadPlugins(plugins: js.Object): scala.Unit
  def loadServicePlugins(servicePlugins: js.Object): scala.Unit
  def setCliCommands(commands: js.Object): scala.Unit
  def setCliOptions(options: serverlessLib.serverlessMod.ServerlessNs.Options): scala.Unit
}

