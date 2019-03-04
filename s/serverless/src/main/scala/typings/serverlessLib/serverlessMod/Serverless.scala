package typings
package serverlessLib.serverlessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Serverless extends js.Object {
  var cli: serverlessLib.Anon_Log
  var config: serverlessLib.serverlessMod.ServerlessNs.Config
  var pluginManager: serverlessLib.classesPluginManagerMod.namespaced
  var serverlessDirPath: java.lang.String
  var service: serverlessLib.classesServiceMod.namespaced
  var utils: serverlessLib.classesUtilsMod.namespaced
  var version: java.lang.String
  var yamlParser: serverlessLib.classesYamlParserMod.namespaced
  def getProvider(name: java.lang.String): serverlessLib.pluginsAwsProviderAwsProviderMod.namespaced
  def getVersion(): java.lang.String
  def init(): js.Promise[_]
  def run(): js.Promise[_]
  def setProvider(name: java.lang.String, provider: serverlessLib.pluginsAwsProviderAwsProviderMod.namespaced): scala.Null
}

object Serverless {
  @scala.inline
  def apply(
    cli: serverlessLib.Anon_Log,
    config: serverlessLib.serverlessMod.ServerlessNs.Config,
    getProvider: js.Function1[java.lang.String, serverlessLib.pluginsAwsProviderAwsProviderMod.namespaced],
    getVersion: js.Function0[java.lang.String],
    init: js.Function0[js.Promise[_]],
    pluginManager: serverlessLib.classesPluginManagerMod.namespaced,
    run: js.Function0[js.Promise[_]],
    serverlessDirPath: java.lang.String,
    service: serverlessLib.classesServiceMod.namespaced,
    setProvider: js.Function2[
      java.lang.String, 
      serverlessLib.pluginsAwsProviderAwsProviderMod.namespaced, 
      scala.Null
    ],
    utils: serverlessLib.classesUtilsMod.namespaced,
    version: java.lang.String,
    yamlParser: serverlessLib.classesYamlParserMod.namespaced
  ): Serverless = {
    val __obj = js.Dynamic.literal(cli = cli, config = config, getProvider = getProvider, getVersion = getVersion, init = init, pluginManager = pluginManager, run = run, serverlessDirPath = serverlessDirPath, service = service, setProvider = setProvider, utils = utils, version = version, yamlParser = yamlParser)
  
    __obj.asInstanceOf[Serverless]
  }
}

