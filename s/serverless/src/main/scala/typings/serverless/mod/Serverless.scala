package typings.serverless.mod

import typings.serverless.AnonLog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Serverless extends js.Object {
  var cli: AnonLog
  var config: Config
  var pluginManager: typings.serverless.pluginManagerMod.^
  var serverlessDirPath: String
  var service: typings.serverless.serviceMod.^
  var utils: typings.serverless.utilsMod.^
  var version: String
  var yamlParser: typings.serverless.yamlParserMod.^
  def getProvider(name: String): typings.serverless.awsProviderMod.^
  def getVersion(): String
  def init(): js.Promise[_]
  def run(): js.Promise[_]
  def setProvider(name: String, provider: typings.serverless.awsProviderMod.^): Null
}

object Serverless {
  @scala.inline
  def apply(
    cli: AnonLog,
    config: Config,
    getProvider: String => typings.serverless.awsProviderMod.^,
    getVersion: () => String,
    init: () => js.Promise[_],
    pluginManager: typings.serverless.pluginManagerMod.^,
    run: () => js.Promise[_],
    serverlessDirPath: String,
    service: typings.serverless.serviceMod.^,
    setProvider: (String, typings.serverless.awsProviderMod.^) => Null,
    utils: typings.serverless.utilsMod.^,
    version: String,
    yamlParser: typings.serverless.yamlParserMod.^
  ): Serverless = {
    val __obj = js.Dynamic.literal(cli = cli.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], getProvider = js.Any.fromFunction1(getProvider), getVersion = js.Any.fromFunction0(getVersion), init = js.Any.fromFunction0(init), pluginManager = pluginManager.asInstanceOf[js.Any], run = js.Any.fromFunction0(run), serverlessDirPath = serverlessDirPath.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], setProvider = js.Any.fromFunction2(setProvider), utils = utils.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], yamlParser = yamlParser.asInstanceOf[js.Any])
    __obj.asInstanceOf[Serverless]
  }
}

