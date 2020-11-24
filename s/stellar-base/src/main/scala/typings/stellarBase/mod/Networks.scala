package typings.stellarBase.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Networks extends js.Object
@JSImport("stellar-base", "Networks")
@js.native
object Networks extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Networks with String] = js.native
  
  @js.native
  sealed trait PUBLIC extends Networks
  /* "Public Global Stellar Network ; September 2015" */ @js.native
  object PUBLIC extends TopLevel[PUBLIC with String]
  
  @js.native
  sealed trait TESTNET extends Networks
  /* "Test SDF Network ; September 2015" */ @js.native
  object TESTNET extends TopLevel[TESTNET with String]
}
