package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EChatInfoType extends StObject
@JSImport("steam-client", "EChatInfoType")
@js.native
object EChatInfoType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatInfoType & Double] = js.native
  
  @js.native
  sealed trait InfoUpdate
    extends StObject
       with EChatInfoType
  /* 2 */ val InfoUpdate: typings.steamClient.mod.EChatInfoType.InfoUpdate & Double = js.native
  
  @js.native
  sealed trait MemberLimitChange
    extends StObject
       with EChatInfoType
  /* 3 */ val MemberLimitChange: typings.steamClient.mod.EChatInfoType.MemberLimitChange & Double = js.native
  
  @js.native
  sealed trait StateChange
    extends StObject
       with EChatInfoType
  /* 1 */ val StateChange: typings.steamClient.mod.EChatInfoType.StateChange & Double = js.native
}
