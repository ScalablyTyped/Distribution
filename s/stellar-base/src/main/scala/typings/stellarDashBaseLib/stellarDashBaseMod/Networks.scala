package typings
package stellarDashBaseLib.stellarDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Networks extends js.Object

@JSImport("stellar-base", "Networks")
@js.native
object Networks extends js.Object {
  @js.native
  sealed trait PUBLIC
    extends stellarDashBaseLib.stellarDashBaseMod.Networks
  
  @js.native
  sealed trait TESTNET
    extends stellarDashBaseLib.stellarDashBaseMod.Networks
  
  /* "Public Global Stellar Network ; September 2015" */ val PUBLIC: PUBLIC with java.lang.String = js.native
  /* "Test SDF Network ; September 2015" */ val TESTNET: TESTNET with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[stellarDashBaseLib.stellarDashBaseMod.Networks with java.lang.String] = js.native
}

