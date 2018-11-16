package typings
package schemaDashRegistryLib.schemaDashRegistryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("schema-registry", "RegistryClient")
@js.native
class RegistryClient protected () extends js.Object {
  def this(config: RegistryClientConfig) = this()
  var host: java.lang.String = js.native
  var logger: js.Object = js.native
  var port: scala.Double = js.native
  var protocol: java.lang.String = js.native
  var `type`: java.lang.String = js.native
  def checkSubjectRegistration(subject: java.lang.String, schema: js.Object): RegistryRequest = js.native
  def getConfig(): RegistryRequest = js.native
  def getLatestSubjectSchema(subject: java.lang.String): RegistryRequest = js.native
  def getSchemaById(id: scala.Double): RegistryRequest = js.native
  def getSubjectConfig(subject: java.lang.String): RegistryRequest = js.native
  def getSubjectSchemaForVersion(subject: java.lang.String, version: scala.Double): RegistryRequest = js.native
  def getSubjects(): RegistryRequest = js.native
  def getVersionsForSubject(subject: java.lang.String): RegistryRequest = js.native
  def isAlive(): RegistryRequest = js.native
  def registerSubjectVersion(subject: java.lang.String, schema: js.Object): RegistryRequest = js.native
  def request(options: js.Object, expectedStatusCode: scala.Double): RegistryRequest = js.native
  def setConfig(config: js.Object): RegistryRequest = js.native
  def setSubjectConfig(subject: java.lang.String, config: js.Object): RegistryRequest = js.native
}

