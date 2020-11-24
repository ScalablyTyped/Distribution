package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EChatInfoType extends js.Object
@JSImport("steam-client", "EChatInfoType")
@js.native
object EChatInfoType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatInfoType with Double] = js.native
  
  @js.native
  sealed trait InfoUpdate extends EChatInfoType
  /* 2 */ @js.native
  object InfoUpdate extends TopLevel[InfoUpdate with Double]
  
  @js.native
  sealed trait MemberLimitChange extends EChatInfoType
  /* 3 */ @js.native
  object MemberLimitChange extends TopLevel[MemberLimitChange with Double]
  
  @js.native
  sealed trait StateChange extends EChatInfoType
  /* 1 */ @js.native
  object StateChange extends TopLevel[StateChange with Double]
}
