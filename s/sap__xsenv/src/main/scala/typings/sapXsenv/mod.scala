package typings.sapXsenv

import typings.sapXsenv.anon.Label
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@sap/xsenv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cfServiceCredentials(filter: ServiceFilter): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("cfServiceCredentials")(filter.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def filterCFServices(filter: ServiceFilter): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("filterCFServices")(filter.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def getServices(query: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getServices")(query.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def getServices(query: js.Any, servicesFile: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getServices")(query.asInstanceOf[js.Any], servicesFile.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def loadCertificates(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("loadCertificates")().asInstanceOf[js.Any]
  inline def loadCertificates(certPath: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("loadCertificates")(certPath.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def loadEnv(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadEnv")().asInstanceOf[Unit]
  inline def loadEnv(jsonFile: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadEnv")(jsonFile.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def readCFServices(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readCFServices")().asInstanceOf[js.Any]
  
  type ServiceFilter = String | Label | (js.Function1[/* service */ js.Any, Boolean])
}
