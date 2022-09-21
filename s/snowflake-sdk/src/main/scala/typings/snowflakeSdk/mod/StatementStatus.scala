package typings.snowflakeSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StatementStatus extends StObject
@JSImport("snowflake-sdk", "StatementStatus")
@js.native
object StatementStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StatementStatus & String] = js.native
  
  @js.native
  sealed trait Complete
    extends StObject
       with StatementStatus
  /* "complete" */ val Complete: typings.snowflakeSdk.mod.StatementStatus.Complete & String = js.native
  
  @js.native
  sealed trait Fetching
    extends StObject
       with StatementStatus
  /* "fetching" */ val Fetching: typings.snowflakeSdk.mod.StatementStatus.Fetching & String = js.native
}
