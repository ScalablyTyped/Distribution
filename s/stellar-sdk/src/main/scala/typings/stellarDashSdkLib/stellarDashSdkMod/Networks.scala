package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Networks extends js.Object

@JSImport("stellar-sdk", "Networks")
@js.native
object Networks extends js.Object {
  @js.native
  sealed trait PUBLIC
    extends stellarDashSdkLib.stellarDashSdkMod.Networks
  
  @js.native
  sealed trait TESTNET
    extends stellarDashSdkLib.stellarDashSdkMod.Networks
  
  /* "Public Global Stellar Network ; September 2015" */ val PUBLIC: PUBLIC with java.lang.String = js.native
  /* "Test SDF Network ; September 2015" */ val TESTNET: TESTNET with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[stellarDashSdkLib.stellarDashSdkMod.Networks with java.lang.String] = js.native
}

