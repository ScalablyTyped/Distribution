package typings.reactAsync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ActionTypes extends StObject
@JSImport("react-async", "ActionTypes")
@js.native
object ActionTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ActionTypes with String] = js.native
  
  @js.native
  sealed trait cancel extends ActionTypes
  /* "cancel" */ val cancel: typings.reactAsync.mod.ActionTypes.cancel with String = js.native
  
  @js.native
  sealed trait fulfill extends ActionTypes
  /* "fulfill" */ val fulfill: typings.reactAsync.mod.ActionTypes.fulfill with String = js.native
  
  @js.native
  sealed trait reject extends ActionTypes
  /* "reject" */ val reject: typings.reactAsync.mod.ActionTypes.reject with String = js.native
  
  @js.native
  sealed trait start extends ActionTypes
  /* "start" */ val start: typings.reactAsync.mod.ActionTypes.start with String = js.native
}
