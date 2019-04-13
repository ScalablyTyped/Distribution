package typings
package serverlessLib.serverlessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Serverless extends js.Object {
  var cli: serverlessLib.Anon_Log
  var config: Config
  var pluginManager: serverlessLib.classesPluginManagerMod.^
  var serverlessDirPath: java.lang.String
  var service: serverlessLib.classesServiceMod.^
  var utils: serverlessLib.classesUtilsMod.^
  var version: java.lang.String
  var yamlParser: serverlessLib.classesYamlParserMod.^
  def getProvider(name: java.lang.String): serverlessLib.pluginsAwsProviderAwsProviderMod.^
  def getVersion(): java.lang.String
  def init(): js.Promise[_]
  def run(): js.Promise[_]
  def setProvider(name: java.lang.String, provider: serverlessLib.pluginsAwsProviderAwsProviderMod.^): scala.Null
}

object Serverless {
  @scala.inline
  def apply(
    cli: serverlessLib.Anon_Log,
    config: Config,
    getProvider: java.lang.String => serverlessLib.pluginsAwsProviderAwsProviderMod.^,
    getVersion: () => java.lang.String,
    init: () => js.Promise[_],
    pluginManager: serverlessLib.classesPluginManagerMod.^,
    run: () => js.Promise[_],
    serverlessDirPath: java.lang.String,
    service: serverlessLib.classesServiceMod.^,
    setProvider: (java.lang.String, serverlessLib.pluginsAwsProviderAwsProviderMod.^) => scala.Null,
    utils: serverlessLib.classesUtilsMod.^,
    version: java.lang.String,
    yamlParser: serverlessLib.classesYamlParserMod.^
  ): Serverless = {
    val __obj = js.Dynamic.literal(cli = cli, config = config, getProvider = js.Any.fromFunction1(getProvider), getVersion = js.Any.fromFunction0(getVersion), init = js.Any.fromFunction0(init), pluginManager = pluginManager, run = js.Any.fromFunction0(run), serverlessDirPath = serverlessDirPath, service = service, setProvider = js.Any.fromFunction2(setProvider), utils = utils, version = version, yamlParser = yamlParser)
  
    __obj.asInstanceOf[Serverless]
  }
}

