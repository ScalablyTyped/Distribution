package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ASSET_TYPE extends js.Object

@JSImport("stellar-sdk", "ASSET_TYPE")
@js.native
object ASSET_TYPE extends js.Object {
  @js.native
  sealed trait credit12
    extends stellarDashSdkLib.stellarDashSdkMod.ASSET_TYPE
  
  @js.native
  sealed trait credit4
    extends stellarDashSdkLib.stellarDashSdkMod.ASSET_TYPE
  
  @js.native
  sealed trait native
    extends stellarDashSdkLib.stellarDashSdkMod.ASSET_TYPE
  
  /* "credit_alphanum12" */ val credit12: credit12 with java.lang.String = js.native
  /* "credit_alphanum4" */ val credit4: credit4 with java.lang.String = js.native
  /* "native" */ val native: native with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[stellarDashSdkLib.stellarDashSdkMod.ASSET_TYPE with java.lang.String] = js.native
}

