package typings
package serverlessLib.serverlessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serverless", JSImport.Namespace)
@js.native
class namespaced () extends Serverless {
  def this(config: js.Object) = this()
  /* CompleteClass */
  override var cli: serverlessLib.Anon_Log = js.native
  /* CompleteClass */
  override var config: serverlessLib.serverlessMod.ServerlessNs.Config = js.native
  /* CompleteClass */
  override var pluginManager: serverlessLib.classesPluginManagerMod.namespaced = js.native
  /* CompleteClass */
  override var serverlessDirPath: java.lang.String = js.native
  /* CompleteClass */
  override var service: serverlessLib.classesServiceMod.namespaced = js.native
  /* CompleteClass */
  override var utils: serverlessLib.classesUtilsMod.namespaced = js.native
  /* CompleteClass */
  override var version: java.lang.String = js.native
  /* CompleteClass */
  override var yamlParser: serverlessLib.classesYamlParserMod.namespaced = js.native
  /* CompleteClass */
  override def getProvider(name: java.lang.String): serverlessLib.pluginsAwsProviderAwsProviderMod.namespaced = js.native
  /* CompleteClass */
  override def getVersion(): java.lang.String = js.native
  /* CompleteClass */
  override def init(): stdLib.Promise[_] = js.native
  /* CompleteClass */
  override def run(): stdLib.Promise[_] = js.native
  /* CompleteClass */
  override def setProvider(name: java.lang.String, provider: serverlessLib.pluginsAwsProviderAwsProviderMod.namespaced): scala.Null = js.native
}

