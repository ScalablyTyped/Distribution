package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibDisplayPolicyMod {
  
  @JSImport("snyk/dist/lib/display-policy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def display(policy: Any): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("display")(policy.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
}
