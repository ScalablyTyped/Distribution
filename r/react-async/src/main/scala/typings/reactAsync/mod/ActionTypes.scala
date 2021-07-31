package typings.reactAsync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ActionTypes extends StObject
@JSImport("react-async", "ActionTypes")
@js.native
object ActionTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ActionTypes & String] = js.native
  
  @js.native
  sealed trait cancel
    extends StObject
       with ActionTypes
  /* "cancel" */ val cancel: typings.reactAsync.mod.ActionTypes.cancel & String = js.native
  
  @js.native
  sealed trait fulfill
    extends StObject
       with ActionTypes
  /* "fulfill" */ val fulfill: typings.reactAsync.mod.ActionTypes.fulfill & String = js.native
  
  @js.native
  sealed trait reject
    extends StObject
       with ActionTypes
  /* "reject" */ val reject: typings.reactAsync.mod.ActionTypes.reject & String = js.native
  
  @js.native
  sealed trait start
    extends StObject
       with ActionTypes
  /* "start" */ val start: typings.reactAsync.mod.ActionTypes.start & String = js.native
}
