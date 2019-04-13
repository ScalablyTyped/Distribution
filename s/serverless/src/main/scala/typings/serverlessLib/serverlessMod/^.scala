package typings
package serverlessLib.serverlessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serverless", JSImport.Namespace)
@js.native
class ^ () extends Serverless {
  def this(config: js.Object) = this()
  /* CompleteClass */
  override var cli: serverlessLib.Anon_Log = js.native
  /* CompleteClass */
  override var config: Config = js.native
  /* CompleteClass */
  override var pluginManager: serverlessLib.classesPluginManagerMod.^ = js.native
  /* CompleteClass */
  override var serverlessDirPath: java.lang.String = js.native
  /* CompleteClass */
  override var service: serverlessLib.classesServiceMod.^ = js.native
  /* CompleteClass */
  override var utils: serverlessLib.classesUtilsMod.^ = js.native
  /* CompleteClass */
  override var version: java.lang.String = js.native
  /* CompleteClass */
  override var yamlParser: serverlessLib.classesYamlParserMod.^ = js.native
  /* CompleteClass */
  override def getProvider(name: java.lang.String): serverlessLib.pluginsAwsProviderAwsProviderMod.^ = js.native
  /* CompleteClass */
  override def getVersion(): java.lang.String = js.native
  /* CompleteClass */
  override def init(): js.Promise[_] = js.native
  /* CompleteClass */
  override def run(): js.Promise[_] = js.native
  /* CompleteClass */
  override def setProvider(name: java.lang.String, provider: serverlessLib.pluginsAwsProviderAwsProviderMod.^): scala.Null = js.native
}

