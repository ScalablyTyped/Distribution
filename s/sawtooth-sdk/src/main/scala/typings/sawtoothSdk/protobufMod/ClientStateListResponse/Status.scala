package typings.sawtoothSdk.protobufMod.ClientStateListResponse

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Status extends js.Object

/** Status enum. */
@JSImport("sawtooth-sdk/protobuf", "ClientStateListResponse.Status")
@js.native
object Status extends js.Object {
  @js.native
  sealed trait INTERNAL_ERROR extends Status
  
  @js.native
  sealed trait INVALID_ADDRESS extends Status
  
  @js.native
  sealed trait INVALID_PAGING extends Status
  
  @js.native
  sealed trait INVALID_ROOT extends Status
  
  @js.native
  sealed trait INVALID_SORT extends Status
  
  @js.native
  sealed trait NOT_READY extends Status
  
  @js.native
  sealed trait NO_RESOURCE extends Status
  
  @js.native
  sealed trait NO_ROOT extends Status
  
  @js.native
  sealed trait OK extends Status
  
  @js.native
  sealed trait STATUS_UNSET extends Status
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Status with Double] = js.native
  /* 2 */ @js.native
  object INTERNAL_ERROR extends TopLevel[INTERNAL_ERROR with Double]
  
  /* 8 */ @js.native
  object INVALID_ADDRESS extends TopLevel[INVALID_ADDRESS with Double]
  
  /* 6 */ @js.native
  object INVALID_PAGING extends TopLevel[INVALID_PAGING with Double]
  
  /* 9 */ @js.native
  object INVALID_ROOT extends TopLevel[INVALID_ROOT with Double]
  
  /* 7 */ @js.native
  object INVALID_SORT extends TopLevel[INVALID_SORT with Double]
  
  /* 3 */ @js.native
  object NOT_READY extends TopLevel[NOT_READY with Double]
  
  /* 5 */ @js.native
  object NO_RESOURCE extends TopLevel[NO_RESOURCE with Double]
  
  /* 4 */ @js.native
  object NO_ROOT extends TopLevel[NO_ROOT with Double]
  
  /* 1 */ @js.native
  object OK extends TopLevel[OK with Double]
  
  /* 0 */ @js.native
  object STATUS_UNSET extends TopLevel[STATUS_UNSET with Double]
  
}

