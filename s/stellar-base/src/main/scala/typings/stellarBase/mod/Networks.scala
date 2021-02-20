package typings.stellarBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Networks extends StObject
@JSImport("stellar-base", "Networks")
@js.native
object Networks extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Networks with String] = js.native
  
  @js.native
  sealed trait PUBLIC extends Networks
  /* "Public Global Stellar Network ; September 2015" */ val PUBLIC: typings.stellarBase.mod.Networks.PUBLIC with String = js.native
  
  @js.native
  sealed trait TESTNET extends Networks
  /* "Test SDF Network ; September 2015" */ val TESTNET: typings.stellarBase.mod.Networks.TESTNET with String = js.native
}
