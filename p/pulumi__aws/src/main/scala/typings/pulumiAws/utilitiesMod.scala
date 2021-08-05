package typings.pulumiAws

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilitiesMod {
  
  @JSImport("@pulumi/aws/utilities", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEnv(vars: String*): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnv")(vars.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def getEnvBoolean(vars: String*): js.UndefOr[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnvBoolean")(vars.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Boolean]]
  
  inline def getEnvNumber(vars: String*): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnvNumber")(vars.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def getVersion(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getVersion")().asInstanceOf[String]
}
