package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EChatRoomGroupType extends StObject
@JSImport("steam-user", "EChatRoomGroupType")
@js.native
object EChatRoomGroupType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatRoomGroupType & Double] = js.native
  
  @js.native
  sealed trait Default
    extends StObject
       with EChatRoomGroupType
  /* 0 */ val Default: typings.steamUser.mod.EChatRoomGroupType.Default & Double = js.native
  
  @js.native
  sealed trait Unmoderated
    extends StObject
       with EChatRoomGroupType
  /* 1 */ val Unmoderated: typings.steamUser.mod.EChatRoomGroupType.Unmoderated & Double = js.native
}
