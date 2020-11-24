package typings.reactAsync.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ActionTypes extends js.Object
@JSImport("react-async", "ActionTypes")
@js.native
object ActionTypes extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ActionTypes with String] = js.native
  
  @js.native
  sealed trait cancel extends ActionTypes
  /* "cancel" */ @js.native
  object cancel extends TopLevel[cancel with String]
  
  @js.native
  sealed trait fulfill extends ActionTypes
  /* "fulfill" */ @js.native
  object fulfill extends TopLevel[fulfill with String]
  
  @js.native
  sealed trait reject extends ActionTypes
  /* "reject" */ @js.native
  object reject extends TopLevel[reject with String]
  
  @js.native
  sealed trait start extends ActionTypes
  /* "start" */ @js.native
  object start extends TopLevel[start with String]
}
