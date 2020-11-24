package typings.snowflakeSdk.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ocspModes extends js.Object
@JSImport("snowflake-sdk", "ocspModes")
@js.native
object ocspModes extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ocspModes with String] = js.native
  
  @js.native
  sealed trait FAIL_CLOSED extends ocspModes
  /* "FAIL_CLOSED" */ @js.native
  object FAIL_CLOSED extends TopLevel[FAIL_CLOSED with String]
  
  @js.native
  sealed trait FAIL_OPEN extends ocspModes
  /* "FAIL_OPEN" */ @js.native
  object FAIL_OPEN extends TopLevel[FAIL_OPEN with String]
  
  @js.native
  sealed trait INSECURE extends ocspModes
  /* "INSECURE" */ @js.native
  object INSECURE extends TopLevel[INSECURE with String]
}
