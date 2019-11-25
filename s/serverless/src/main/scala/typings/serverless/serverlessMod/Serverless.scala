package typings.serverless.serverlessMod

import typings.serverless.Anon_Log
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Serverless extends js.Object {
  var cli: Anon_Log
  var config: Config
  var pluginManager: typings.serverless.classesPluginManagerMod.^
  var serverlessDirPath: String
  var service: typings.serverless.classesServiceMod.^
  var utils: typings.serverless.classesUtilsMod.^
  var version: String
  var yamlParser: typings.serverless.classesYamlParserMod.^
  def getProvider(name: String): typings.serverless.pluginsAwsProviderAwsProviderMod.^
  def getVersion(): String
  def init(): js.Promise[_]
  def run(): js.Promise[_]
  def setProvider(name: String, provider: typings.serverless.pluginsAwsProviderAwsProviderMod.^): Null
}

object Serverless {
  @scala.inline
  def apply(
    cli: Anon_Log,
    config: Config,
    getProvider: String => typings.serverless.pluginsAwsProviderAwsProviderMod.^,
    getVersion: () => String,
    init: () => js.Promise[_],
    pluginManager: typings.serverless.classesPluginManagerMod.^,
    run: () => js.Promise[_],
    serverlessDirPath: String,
    service: typings.serverless.classesServiceMod.^,
    setProvider: (String, typings.serverless.pluginsAwsProviderAwsProviderMod.^) => Null,
    utils: typings.serverless.classesUtilsMod.^,
    version: String,
    yamlParser: typings.serverless.classesYamlParserMod.^
  ): Serverless = {
    val __obj = js.Dynamic.literal(cli = cli.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], getProvider = js.Any.fromFunction1(getProvider), getVersion = js.Any.fromFunction0(getVersion), init = js.Any.fromFunction0(init), pluginManager = pluginManager.asInstanceOf[js.Any], run = js.Any.fromFunction0(run), serverlessDirPath = serverlessDirPath.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], setProvider = js.Any.fromFunction2(setProvider), utils = utils.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], yamlParser = yamlParser.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Serverless]
  }
}

