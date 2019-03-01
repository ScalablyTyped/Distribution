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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cli")(cli)
    __obj.updateDynamic("config")(config)
    __obj.updateDynamic("getProvider")(getProvider)
    __obj.updateDynamic("getVersion")(getVersion)
    __obj.updateDynamic("init")(init)
    __obj.updateDynamic("pluginManager")(pluginManager)
    __obj.updateDynamic("run")(run)
    __obj.updateDynamic("serverlessDirPath")(serverlessDirPath)
    __obj.updateDynamic("service")(service)
    __obj.updateDynamic("setProvider")(setProvider)
    __obj.updateDynamic("utils")(utils)
    __obj.updateDynamic("version")(version)
    __obj.updateDynamic("yamlParser")(yamlParser)
    __obj.asInstanceOf[Serverless]
  }
}

