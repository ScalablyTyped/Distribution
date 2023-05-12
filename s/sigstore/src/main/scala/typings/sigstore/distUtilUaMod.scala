package typings.sigstore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilUaMod {
  
  @JSImport("sigstore/dist/util/ua", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getUserAgent(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserAgent")().asInstanceOf[String]
}
