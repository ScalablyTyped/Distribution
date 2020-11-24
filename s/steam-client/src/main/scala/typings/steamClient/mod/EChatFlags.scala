package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EChatFlags extends js.Object
@JSImport("steam-client", "EChatFlags")
@js.native
object EChatFlags extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatFlags with Double] = js.native
  
  @js.native
  sealed trait InvisibleToFriends extends EChatFlags
  /* 2 */ @js.native
  object InvisibleToFriends extends TopLevel[InvisibleToFriends with Double]
  
  @js.native
  sealed trait Locked extends EChatFlags
  /* 1 */ @js.native
  object Locked extends TopLevel[Locked with Double]
  
  @js.native
  sealed trait Moderated extends EChatFlags
  /* 4 */ @js.native
  object Moderated extends TopLevel[Moderated with Double]
  
  @js.native
  sealed trait Unjoinable extends EChatFlags
  /* 8 */ @js.native
  object Unjoinable extends TopLevel[Unjoinable with Double]
}
