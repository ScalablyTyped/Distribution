package typings.steam.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EChatMemberStateChange extends js.Object

@JSImport("steam", "EChatMemberStateChange")
@js.native
object EChatMemberStateChange extends js.Object {
  @js.native
  sealed trait Kicked extends EChatMemberStateChange
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatMemberStateChange with Double] = js.native
  /* 0 */ @js.native
  object Kicked extends TopLevel[Kicked with Double]
  
}

