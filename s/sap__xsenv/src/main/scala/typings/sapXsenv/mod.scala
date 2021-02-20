package typings.sapXsenv

import typings.sapXsenv.anon.Label
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@sap/xsenv", "cfServiceCredentials")
  @js.native
  def cfServiceCredentials(filter: ServiceFilter): js.Any = js.native
  
  @JSImport("@sap/xsenv", "filterCFServices")
  @js.native
  def filterCFServices(filter: ServiceFilter): js.Any = js.native
  
  @JSImport("@sap/xsenv", "getServices")
  @js.native
  def getServices(query: js.Any): js.Any = js.native
  @JSImport("@sap/xsenv", "getServices")
  @js.native
  def getServices(query: js.Any, servicesFile: String): js.Any = js.native
  
  @JSImport("@sap/xsenv", "loadCertificates")
  @js.native
  def loadCertificates(): js.Any = js.native
  @JSImport("@sap/xsenv", "loadCertificates")
  @js.native
  def loadCertificates(certPath: String): js.Any = js.native
  
  @JSImport("@sap/xsenv", "loadEnv")
  @js.native
  def loadEnv(): Unit = js.native
  @JSImport("@sap/xsenv", "loadEnv")
  @js.native
  def loadEnv(jsonFile: String): Unit = js.native
  
  @JSImport("@sap/xsenv", "readCFServices")
  @js.native
  def readCFServices(): js.Any = js.native
  
  type ServiceFilter = String | Label | (js.Function1[/* service */ js.Any, Boolean])
}
