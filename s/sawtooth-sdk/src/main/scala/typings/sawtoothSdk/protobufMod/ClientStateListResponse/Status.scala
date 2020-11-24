package typings.sawtoothSdk.protobufMod.ClientStateListResponse

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Status extends js.Object
/** Status enum. */
@JSImport("sawtooth-sdk/protobuf", "ClientStateListResponse.Status")
@js.native
object Status extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Status with Double] = js.native
  
  @js.native
  sealed trait INTERNAL_ERROR extends Status
  /* 2 */ @js.native
  object INTERNAL_ERROR extends TopLevel[INTERNAL_ERROR with Double]
  
  @js.native
  sealed trait INVALID_ADDRESS extends Status
  /* 8 */ @js.native
  object INVALID_ADDRESS extends TopLevel[INVALID_ADDRESS with Double]
  
  @js.native
  sealed trait INVALID_PAGING extends Status
  /* 6 */ @js.native
  object INVALID_PAGING extends TopLevel[INVALID_PAGING with Double]
  
  @js.native
  sealed trait INVALID_ROOT extends Status
  /* 9 */ @js.native
  object INVALID_ROOT extends TopLevel[INVALID_ROOT with Double]
  
  @js.native
  sealed trait INVALID_SORT extends Status
  /* 7 */ @js.native
  object INVALID_SORT extends TopLevel[INVALID_SORT with Double]
  
  @js.native
  sealed trait NOT_READY extends Status
  /* 3 */ @js.native
  object NOT_READY extends TopLevel[NOT_READY with Double]
  
  @js.native
  sealed trait NO_RESOURCE extends Status
  /* 5 */ @js.native
  object NO_RESOURCE extends TopLevel[NO_RESOURCE with Double]
  
  @js.native
  sealed trait NO_ROOT extends Status
  /* 4 */ @js.native
  object NO_ROOT extends TopLevel[NO_ROOT with Double]
  
  @js.native
  sealed trait OK extends Status
  /* 1 */ @js.native
  object OK extends TopLevel[OK with Double]
  
  @js.native
  sealed trait STATUS_UNSET extends Status
  /* 0 */ @js.native
  object STATUS_UNSET extends TopLevel[STATUS_UNSET with Double]
}
