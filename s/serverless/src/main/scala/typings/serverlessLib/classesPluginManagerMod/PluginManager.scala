package typings
package serverlessLib.classesPluginManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginManager extends js.Object {
  var plugins: js.Array[serverlessLib.classesPluginMod.namespaced] = js.native
  var serverless: serverlessLib.serverlessMod.namespaced = js.native
  def addPlugin(
    plugin: org.scalablytyped.runtime.Instantiable2[
      /* serverless */ serverlessLib.serverlessMod.namespaced, 
      /* options */ serverlessLib.serverlessMod.ServerlessNs.Options, 
      serverlessLib.classesPluginMod.namespaced
    ]
  ): scala.Unit = js.native
  def loadAllPlugins(servicePlugins: js.Object): scala.Unit = js.native
  def loadCommand(pluginName: java.lang.String, details: js.Object, key: java.lang.String): js.Object = js.native
  def loadCommands(pluginInstance: serverlessLib.classesPluginMod.namespaced): scala.Unit = js.native
  def loadCorePlugins(): scala.Unit = js.native
  def loadPlugins(plugins: js.Object): scala.Unit = js.native
  def loadServicePlugins(servicePlugins: js.Object): scala.Unit = js.native
  def setCliCommands(commands: js.Object): scala.Unit = js.native
  def setCliOptions(options: serverlessLib.serverlessMod.ServerlessNs.Options): scala.Unit = js.native
  def spawn(commandsArray: java.lang.String): js.Promise[scala.Unit] = js.native
  def spawn(commandsArray: java.lang.String, options: js.Any): js.Promise[scala.Unit] = js.native
  def spawn(commandsArray: js.Array[java.lang.String]): js.Promise[scala.Unit] = js.native
  def spawn(commandsArray: js.Array[java.lang.String], options: js.Any): js.Promise[scala.Unit] = js.native
}

