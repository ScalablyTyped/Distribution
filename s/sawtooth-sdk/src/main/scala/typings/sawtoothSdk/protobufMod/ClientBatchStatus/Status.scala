package typings.sawtoothSdk.protobufMod.ClientBatchStatus

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Status extends js.Object
/** Status enum. */
@JSImport("sawtooth-sdk/protobuf", "ClientBatchStatus.Status")
@js.native
object Status extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Status with Double] = js.native
  
  @js.native
  sealed trait COMMITTED extends Status
  /* 1 */ @js.native
  object COMMITTED extends TopLevel[COMMITTED with Double]
  
  @js.native
  sealed trait INVALID extends Status
  /* 2 */ @js.native
  object INVALID extends TopLevel[INVALID with Double]
  
  @js.native
  sealed trait PENDING extends Status
  /* 3 */ @js.native
  object PENDING extends TopLevel[PENDING with Double]
  
  @js.native
  sealed trait STATUS_UNSET extends Status
  /* 0 */ @js.native
  object STATUS_UNSET extends TopLevel[STATUS_UNSET with Double]
  
  @js.native
  sealed trait UNKNOWN extends Status
  /* 4 */ @js.native
  object UNKNOWN extends TopLevel[UNKNOWN with Double]
}
