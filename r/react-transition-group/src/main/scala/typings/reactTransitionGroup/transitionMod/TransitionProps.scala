package typings.reactTransitionGroup.transitionMod

import typings.reactTransitionGroup.anon.Appear
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactTransitionGroup.transitionMod.TimeoutProps[RefElement]
  - typings.reactTransitionGroup.transitionMod.EndListenerProps[RefElement]
*/
trait TransitionProps[RefElement /* <: js.UndefOr[HTMLElement] */] extends js.Object
object TransitionProps {
  
  @scala.inline
  def TimeoutProps[RefElement /* <: js.UndefOr[HTMLElement] */](timeout: Double | Appear): TransitionProps[RefElement] = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionProps[RefElement]]
  }
  
  @scala.inline
  def EndListenerProps[RefElement /* <: js.UndefOr[HTMLElement] */](addEndListener: EndHandler[RefElement]): TransitionProps[RefElement] = {
    val __obj = js.Dynamic.literal(addEndListener = addEndListener.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionProps[RefElement]]
  }
}
