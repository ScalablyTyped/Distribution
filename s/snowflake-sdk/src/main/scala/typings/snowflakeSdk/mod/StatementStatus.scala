package typings.snowflakeSdk.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StatementStatus extends js.Object
@JSImport("snowflake-sdk", "StatementStatus")
@js.native
object StatementStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StatementStatus with String] = js.native
  
  @js.native
  sealed trait Complete extends StatementStatus
  /* "complete" */ @js.native
  object Complete extends TopLevel[Complete with String]
  
  @js.native
  sealed trait Fetching extends StatementStatus
  /* "fetching" */ @js.native
  object Fetching extends TopLevel[Fetching with String]
}
