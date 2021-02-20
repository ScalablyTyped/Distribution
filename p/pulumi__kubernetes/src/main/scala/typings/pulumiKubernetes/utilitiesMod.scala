package typings.pulumiKubernetes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilitiesMod {
  
  @JSImport("@pulumi/kubernetes/utilities", "getEnv")
  @js.native
  def getEnv(vars: String*): js.UndefOr[String] = js.native
  
  @JSImport("@pulumi/kubernetes/utilities", "getEnvBoolean")
  @js.native
  def getEnvBoolean(vars: String*): js.UndefOr[Boolean] = js.native
  
  @JSImport("@pulumi/kubernetes/utilities", "getEnvNumber")
  @js.native
  def getEnvNumber(vars: String*): js.UndefOr[Double] = js.native
  
  @JSImport("@pulumi/kubernetes/utilities", "getVersion")
  @js.native
  def getVersion(): String = js.native
}
