package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EChatRoomNotificationLevel extends StObject
@JSImport("steam-user", "EChatRoomNotificationLevel")
@js.native
object EChatRoomNotificationLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatRoomNotificationLevel & Double] = js.native
  
  @js.native
  sealed trait AllMessages
    extends StObject
       with EChatRoomNotificationLevel
  /* 4 */ val AllMessages: typings.steamUser.mod.EChatRoomNotificationLevel.AllMessages & Double = js.native
  
  @js.native
  sealed trait Invalid
    extends StObject
       with EChatRoomNotificationLevel
  /* 0 */ val Invalid: typings.steamUser.mod.EChatRoomNotificationLevel.Invalid & Double = js.native
  
  @js.native
  sealed trait MentionAll
    extends StObject
       with EChatRoomNotificationLevel
  /* 3 */ val MentionAll: typings.steamUser.mod.EChatRoomNotificationLevel.MentionAll & Double = js.native
  
  @js.native
  sealed trait MentionMe
    extends StObject
       with EChatRoomNotificationLevel
  /* 2 */ val MentionMe: typings.steamUser.mod.EChatRoomNotificationLevel.MentionMe & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with EChatRoomNotificationLevel
  /* 1 */ val None: typings.steamUser.mod.EChatRoomNotificationLevel.None & Double = js.native
}
