package typings.stellarDashSdk.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Networks")
@js.native
object Networks extends js.Object {
  /* "Public Global Stellar Network ; September 2015" */ val PUBLIC: typings.stellarDashBase.stellarDashBaseMod.Networks.PUBLIC with String = js.native
  /* "Test SDF Network ; September 2015" */ val TESTNET: typings.stellarDashBase.stellarDashBaseMod.Networks.TESTNET with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.stellarDashBase.stellarDashBaseMod.Networks with String] = js.native
}

