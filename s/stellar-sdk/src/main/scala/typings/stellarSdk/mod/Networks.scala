package typings.stellarSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "Networks")
@js.native
object Networks extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.stellarBase.mod.Networks with String] = js.native
  
  /* "Public Global Stellar Network ; September 2015" */ val PUBLIC: typings.stellarBase.mod.Networks.PUBLIC with String = js.native
  
  /* "Test SDF Network ; September 2015" */ val TESTNET: typings.stellarBase.mod.Networks.TESTNET with String = js.native
}
