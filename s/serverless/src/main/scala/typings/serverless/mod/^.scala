package typings.serverless.mod

import typings.serverless.anon.Log
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serverless", JSImport.Namespace)
@js.native
class ^ () extends Serverless {
  def this(config: js.Object) = this()
  /* CompleteClass */
  override var cli: Log = js.native
  /* CompleteClass */
  override var config: Config = js.native
  /* CompleteClass */
  override var pluginManager: typings.serverless.pluginManagerMod.^ = js.native
  /* CompleteClass */
  override var serverlessDirPath: String = js.native
  /* CompleteClass */
  override var service: typings.serverless.serviceMod.^ = js.native
  /* CompleteClass */
  override var utils: typings.serverless.utilsMod.^ = js.native
  /* CompleteClass */
  override var version: String = js.native
  /* CompleteClass */
  override var yamlParser: typings.serverless.yamlParserMod.^ = js.native
  /* CompleteClass */
  override def getProvider(name: String): typings.serverless.awsProviderMod.^ = js.native
  /* CompleteClass */
  override def getVersion(): String = js.native
  /* CompleteClass */
  override def init(): js.Promise[_] = js.native
  /* CompleteClass */
  override def run(): js.Promise[_] = js.native
  /* CompleteClass */
  override def setProvider(name: String, provider: typings.serverless.awsProviderMod.^): Null = js.native
}

