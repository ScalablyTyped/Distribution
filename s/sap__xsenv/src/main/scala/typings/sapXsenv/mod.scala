package typings.sapXsenv

import typings.sapXsenv.anon.Label
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sap/xsenv", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def cfServiceCredentials(filter: ServiceFilter): js.Any = js.native
  
  def filterCFServices(filter: ServiceFilter): js.Any = js.native
  
  def getServices(query: js.Any): js.Any = js.native
  def getServices(query: js.Any, servicesFile: String): js.Any = js.native
  
  def loadCertificates(): js.Any = js.native
  def loadCertificates(certPath: String): js.Any = js.native
  
  def loadEnv(): Unit = js.native
  def loadEnv(jsonFile: String): Unit = js.native
  
  def readCFServices(): js.Any = js.native
  
  type ServiceFilter = String | Label | (js.Function1[/* service */ js.Any, Boolean])
}
