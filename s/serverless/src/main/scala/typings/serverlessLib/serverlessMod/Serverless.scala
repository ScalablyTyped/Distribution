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
  def init(): stdLib.Promise[_]
  def run(): stdLib.Promise[_]
  def setProvider(name: java.lang.String, provider: serverlessLib.pluginsAwsProviderAwsProviderMod.namespaced): scala.Null
}

