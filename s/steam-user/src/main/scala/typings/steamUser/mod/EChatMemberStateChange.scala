package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EChatMemberStateChange extends StObject
@JSImport("steam-user", "EChatMemberStateChange")
@js.native
object EChatMemberStateChange extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatMemberStateChange & Double] = js.native
  
  @js.native
  sealed trait Banned
    extends StObject
       with EChatMemberStateChange
  /* 16 */ val Banned: typings.steamUser.mod.EChatMemberStateChange.Banned & Double = js.native
  
  @js.native
  sealed trait Disconnected
    extends StObject
       with EChatMemberStateChange
  /* 4 */ val Disconnected: typings.steamUser.mod.EChatMemberStateChange.Disconnected & Double = js.native
  
  @js.native
  sealed trait Entered
    extends StObject
       with EChatMemberStateChange
  /* 1 */ val Entered: typings.steamUser.mod.EChatMemberStateChange.Entered & Double = js.native
  
  @js.native
  sealed trait Kicked
    extends StObject
       with EChatMemberStateChange
  /* 8 */ val Kicked: typings.steamUser.mod.EChatMemberStateChange.Kicked & Double = js.native
  
  @js.native
  sealed trait Left
    extends StObject
       with EChatMemberStateChange
  /* 2 */ val Left: typings.steamUser.mod.EChatMemberStateChange.Left & Double = js.native
  
  @js.native
  sealed trait VoiceDoneSpeaking
    extends StObject
       with EChatMemberStateChange
  /* 8192 */ val VoiceDoneSpeaking: typings.steamUser.mod.EChatMemberStateChange.VoiceDoneSpeaking & Double = js.native
  
  @js.native
  sealed trait VoiceSpeaking
    extends StObject
       with EChatMemberStateChange
  /* 4096 */ val VoiceSpeaking: typings.steamUser.mod.EChatMemberStateChange.VoiceSpeaking & Double = js.native
}
