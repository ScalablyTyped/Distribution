package typings.sigstore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilAppdataMod {
  
  @JSImport("sigstore/dist/util/appdata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def appDataPath(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("appDataPath")(name.asInstanceOf[js.Any]).asInstanceOf[String]
}
