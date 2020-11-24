package typings.reactMdTransition

import typings.reactMdTransition.typesMod.TransitionTimeout
import typings.reactTransitionGroup.csstransitionMod.CSSTransitionClassNames
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/transition/types/constants", JSImport.Namespace)
@js.native
object constantsMod extends js.Object {
  
  val COLLAPSE_TIMEOUT: TransitionTimeout = js.native
  
  val CROSS_FADE_CLASSNAMES: CSSTransitionClassNames = js.native
  
  val CROSS_FADE_TIMEOUT: TransitionTimeout = js.native
  
  val DEFAULT_COLLAPSE_MIN_HEIGHT: /* 0 */ Double = js.native
  
  val DEFAULT_COLLAPSE_MIN_PADDING_BOTTOM: /* 0 */ Double = js.native
  
  val DEFAULT_COLLAPSE_MIN_PADDING_TOP: /* 0 */ Double = js.native
  
  val ENTER: /* "enter" */ String = js.native
  
  val ENTERED: /* "entered" */ String = js.native
  
  val ENTERING: /* "entering" */ String = js.native
  
  val EXIT: /* "exit" */ String = js.native
  
  val EXITED: /* "exited" */ String = js.native
  
  val EXITING: /* "exiting" */ String = js.native
  
  val SCALE_CLASSNAMES: CSSTransitionClassNames = js.native
  
  val SCALE_TIMEOUT: TransitionTimeout = js.native
  
  val SCALE_Y_CLASSNAMES: CSSTransitionClassNames = js.native
  
  val UNMOUNT: /* "unmount" */ String = js.native
  
  type TransitionAction = TransitionStage | (/* "unmount" */ String)
  
  type TransitionStage = /* "enter" */ String
}
