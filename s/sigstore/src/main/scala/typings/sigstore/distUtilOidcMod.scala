package typings.sigstore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilOidcMod {
  
  @JSImport("sigstore/dist/util/oidc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extractJWTSubject(jwt: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractJWTSubject")(jwt.asInstanceOf[js.Any]).asInstanceOf[String]
}
