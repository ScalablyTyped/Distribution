package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EChatInfoType extends StObject
@JSImport("steam-client", "EChatInfoType")
@js.native
object EChatInfoType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatInfoType with Double] = js.native
  
  @js.native
  sealed trait InfoUpdate extends EChatInfoType
  /* 2 */ val InfoUpdate: typings.steamClient.mod.EChatInfoType.InfoUpdate with Double = js.native
  
  @js.native
  sealed trait MemberLimitChange extends EChatInfoType
  /* 3 */ val MemberLimitChange: typings.steamClient.mod.EChatInfoType.MemberLimitChange with Double = js.native
  
  @js.native
  sealed trait StateChange extends EChatInfoType
  /* 1 */ val StateChange: typings.steamClient.mod.EChatInfoType.StateChange with Double = js.native
}
