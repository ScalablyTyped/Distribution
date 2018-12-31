package typings
package serverlessLib.classesPluginManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serverless/classes/PluginManager", JSImport.Namespace)
@js.native
class namespaced protected () extends PluginManager {
  def this(serverless: serverlessLib.serverlessMod.namespaced) = this()
  /* CompleteClass */
  override var plugins: js.Array[serverlessLib.classesPluginMod.namespaced] = js.native
  /* CompleteClass */
  override var serverless: serverlessLib.serverlessMod.namespaced = js.native
  /* CompleteClass */
  override def addPlugin(
    plugin: org.scalablytyped.runtime.Instantiable2[
      /* serverless */ serverlessLib.serverlessMod.namespaced, 
      /* options */ serverlessLib.serverlessMod.ServerlessNs.Options, 
      serverlessLib.classesPluginMod.namespaced
    ]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def loadAllPlugins(servicePlugins: js.Object): scala.Unit = js.native
  /* CompleteClass */
  override def loadCommand(pluginName: java.lang.String, details: js.Object, key: java.lang.String): js.Object = js.native
  /* CompleteClass */
  override def loadCommands(pluginInstance: serverlessLib.classesPluginMod.namespaced): scala.Unit = js.native
  /* CompleteClass */
  override def loadCorePlugins(): scala.Unit = js.native
  /* CompleteClass */
  override def loadPlugins(plugins: js.Object): scala.Unit = js.native
  /* CompleteClass */
  override def loadServicePlugins(servicePlugins: js.Object): scala.Unit = js.native
  /* CompleteClass */
  override def setCliCommands(commands: js.Object): scala.Unit = js.native
  /* CompleteClass */
  override def setCliOptions(options: serverlessLib.serverlessMod.ServerlessNs.Options): scala.Unit = js.native
}

