package typings.realm.Realm

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UpdateMode extends js.Object

@JSGlobal("Realm.UpdateMode")
@js.native
object UpdateMode extends js.Object {
  @js.native
  sealed trait All extends UpdateMode
  
  @js.native
  sealed trait Modified extends UpdateMode
  
  @js.native
  sealed trait Never extends UpdateMode
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[UpdateMode with String] = js.native
  /* "all" */ @js.native
  object All extends TopLevel[All with String]
  
  /* "modified" */ @js.native
  object Modified extends TopLevel[Modified with String]
  
  /* "never" */ @js.native
  object Never extends TopLevel[Never with String]
  
}

