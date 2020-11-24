package typings.schemaRegistry.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("schema-registry", "RegistryClient")
@js.native
class RegistryClient protected () extends js.Object {
  def this(config: RegistryClientConfig) = this()
  
  def checkSubjectRegistration(subject: String, schema: js.Object): RegistryRequest = js.native
  
  def getConfig(): RegistryRequest = js.native
  
  def getLatestSubjectSchema(subject: String): RegistryRequest = js.native
  
  def getSchemaById(id: Double): RegistryRequest = js.native
  
  def getSubjectConfig(subject: String): RegistryRequest = js.native
  
  def getSubjectSchemaForVersion(subject: String, version: Double): RegistryRequest = js.native
  
  def getSubjects(): RegistryRequest = js.native
  
  def getVersionsForSubject(subject: String): RegistryRequest = js.native
  
  var host: String = js.native
  
  def isAlive(): RegistryRequest = js.native
  
  var logger: js.Object = js.native
  
  var port: Double = js.native
  
  var protocol: String = js.native
  
  def registerSubjectVersion(subject: String, schema: js.Object): RegistryRequest = js.native
  
  def request(options: js.Object, expectedStatusCode: Double): RegistryRequest = js.native
  
  def setConfig(config: js.Object): RegistryRequest = js.native
  
  def setSubjectConfig(subject: String, config: js.Object): RegistryRequest = js.native
  
  var `type`: String = js.native
}
