package typings
package atSapXsenvLib.atSapXsenvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@sap/xsenv", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def cfServiceCredentials(filter: ServiceFilter): js.Any = js.native
  def filterCFServices(filter: ServiceFilter): js.Any = js.native
  def getServices(query: js.Any): js.Any = js.native
  def getServices(query: js.Any, servicesFile: java.lang.String): js.Any = js.native
  def loadCertificates(): js.Any = js.native
  def loadCertificates(certPath: java.lang.String): js.Any = js.native
  def loadEnv(): scala.Unit = js.native
  def loadEnv(jsonFile: java.lang.String): scala.Unit = js.native
  def readCFServices(): js.Any = js.native
}

