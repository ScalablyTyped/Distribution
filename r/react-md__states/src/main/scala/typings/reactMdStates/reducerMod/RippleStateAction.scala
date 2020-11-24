package typings.reactMdStates.reducerMod

import typings.reactMdStates.typesMod.RippleEvent
import typings.reactMdStates.typesMod.RippleState
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactMdStates.reducerMod.CreateAction[E]
  - typings.reactMdStates.reducerMod.ReleaseAction[E]
  - typings.reactMdStates.reducerMod.CancelAction
  - typings.reactMdStates.reducerMod.EnteredAction
  - typings.reactMdStates.reducerMod.RemoveAction
*/
trait RippleStateAction[E /* <: HTMLElement */] extends js.Object
object RippleStateAction {
  
  @scala.inline
  def CancelAction[E /* <: HTMLElement */](ease: Boolean, `type`: /* "CANCEL" */ String): RippleStateAction[E] = {
    val __obj = js.Dynamic.literal(ease = ease.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RippleStateAction[E]]
  }
  
  @scala.inline
  def CreateAction[E /* <: HTMLElement */](disableSpacebarClick: Boolean, event: RippleEvent[E], `type`: /* "CREATE" */ String): RippleStateAction[E] = {
    val __obj = js.Dynamic.literal(disableSpacebarClick = disableSpacebarClick.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RippleStateAction[E]]
  }
  
  @scala.inline
  def ReleaseAction[E /* <: HTMLElement */](event: RippleEvent[E], `type`: /* "RELEASE" */ String): RippleStateAction[E] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RippleStateAction[E]]
  }
  
  @scala.inline
  def EnteredAction[E /* <: HTMLElement */](ripple: RippleState, `type`: /* "ENTERED" */ String): RippleStateAction[E] = {
    val __obj = js.Dynamic.literal(ripple = ripple.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RippleStateAction[E]]
  }
  
  @scala.inline
  def RemoveAction[E /* <: HTMLElement */](ripple: RippleState, `type`: /* "REMOVE" */ String): RippleStateAction[E] = {
    val __obj = js.Dynamic.literal(ripple = ripple.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RippleStateAction[E]]
  }
}
