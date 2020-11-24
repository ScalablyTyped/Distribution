package typings.sawtoothSdk.protobufMod.Policy

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EntryType extends js.Object
/** EntryType enum. */
@JSImport("sawtooth-sdk/protobuf", "Policy.EntryType")
@js.native
object EntryType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EntryType with Double] = js.native
  
  @js.native
  sealed trait DENY_KEY extends EntryType
  /* 2 */ @js.native
  object DENY_KEY extends TopLevel[DENY_KEY with Double]
  
  @js.native
  sealed trait ENTRY_TYPE_UNSET extends EntryType
  /* 0 */ @js.native
  object ENTRY_TYPE_UNSET extends TopLevel[ENTRY_TYPE_UNSET with Double]
  
  @js.native
  sealed trait PERMIT_KEY extends EntryType
  /* 1 */ @js.native
  object PERMIT_KEY extends TopLevel[PERMIT_KEY with Double]
}
