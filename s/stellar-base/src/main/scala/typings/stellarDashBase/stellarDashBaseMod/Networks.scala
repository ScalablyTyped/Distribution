package typings.stellarDashBase.stellarDashBaseMod

import org.scalablytyped.runtime.TopLevel
import typings.stellarDashBase.stellarDashBaseMod.Networks.PUBLIC
import typings.stellarDashBase.stellarDashBaseMod.Networks.TESTNET
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Networks with String] = js.native
  /* "Public Global Stellar Network ; September 2015" */ @js.native
  object PUBLIC extends TopLevel[PUBLIC with String]
  
  /* "Test SDF Network ; September 2015" */ @js.native
  object TESTNET extends TopLevel[TESTNET with String]
  
}

