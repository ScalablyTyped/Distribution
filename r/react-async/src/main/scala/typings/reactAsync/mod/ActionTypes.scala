package typings.reactAsync.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ActionTypes extends js.Object

@JSImport("react-async", "ActionTypes")
@js.native
object ActionTypes extends js.Object {
  @js.native
  sealed trait cancel extends ActionTypes
  
  @js.native
  sealed trait fulfill extends ActionTypes
  
  @js.native
  sealed trait reject extends ActionTypes
  
  @js.native
  sealed trait start extends ActionTypes
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ActionTypes with String] = js.native
  /* "cancel" */ @js.native
  object cancel extends TopLevel[cancel with String]
  
  /* "fulfill" */ @js.native
  object fulfill extends TopLevel[fulfill with String]
  
  /* "reject" */ @js.native
  object reject extends TopLevel[reject with String]
  
  /* "start" */ @js.native
  object start extends TopLevel[start with String]
  
}

