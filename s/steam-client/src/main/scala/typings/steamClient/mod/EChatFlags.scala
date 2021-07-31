package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EChatFlags extends StObject
@JSImport("steam-client", "EChatFlags")
@js.native
object EChatFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatFlags & Double] = js.native
  
  @js.native
  sealed trait InvisibleToFriends
    extends StObject
       with EChatFlags
  /* 2 */ val InvisibleToFriends: typings.steamClient.mod.EChatFlags.InvisibleToFriends & Double = js.native
  
  @js.native
  sealed trait Locked
    extends StObject
       with EChatFlags
  /* 1 */ val Locked: typings.steamClient.mod.EChatFlags.Locked & Double = js.native
  
  @js.native
  sealed trait Moderated
    extends StObject
       with EChatFlags
  /* 4 */ val Moderated: typings.steamClient.mod.EChatFlags.Moderated & Double = js.native
  
  @js.native
  sealed trait Unjoinable
    extends StObject
       with EChatFlags
  /* 8 */ val Unjoinable: typings.steamClient.mod.EChatFlags.Unjoinable & Double = js.native
}
