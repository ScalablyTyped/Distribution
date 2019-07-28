package typings.stellarDashBase.stellarDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Networks extends js.Object

@JSImport("stellar-base", "Networks")
@js.native
object Networks extends js.Object {
  @js.native
  sealed trait PUBLIC extends Networks
  
  @js.native
  sealed trait TESTNET extends Networks
  
  /* "Public Global Stellar Network ; September 2015" */ val PUBLIC: typings.stellarDashBase.stellarDashBaseMod.Networks.PUBLIC with String = js.native
  /* "Test SDF Network ; September 2015" */ val TESTNET: typings.stellarDashBase.stellarDashBaseMod.Networks.TESTNET with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Networks with String] = js.native
}

