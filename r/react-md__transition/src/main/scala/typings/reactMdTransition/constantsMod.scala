package typings.reactMdTransition

import typings.reactMdTransition.typesMod.TransitionTimeout
import typings.reactTransitionGroup.csstransitionMod.CSSTransitionClassNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantsMod {
  
  @JSImport("@react-md/transition/types/constants", "COLLAPSE_TIMEOUT")
  @js.native
  val COLLAPSE_TIMEOUT: TransitionTimeout = js.native
  
  @JSImport("@react-md/transition/types/constants", "CROSS_FADE_CLASSNAMES")
  @js.native
  val CROSS_FADE_CLASSNAMES: CSSTransitionClassNames = js.native
  
  @JSImport("@react-md/transition/types/constants", "CROSS_FADE_TIMEOUT")
  @js.native
  val CROSS_FADE_TIMEOUT: TransitionTimeout = js.native
  
  @JSImport("@react-md/transition/types/constants", "DEFAULT_COLLAPSE_MIN_HEIGHT")
  @js.native
  val DEFAULT_COLLAPSE_MIN_HEIGHT: /* 0 */ Double = js.native
  
  @JSImport("@react-md/transition/types/constants", "DEFAULT_COLLAPSE_MIN_PADDING_BOTTOM")
  @js.native
  val DEFAULT_COLLAPSE_MIN_PADDING_BOTTOM: /* 0 */ Double = js.native
  
  @JSImport("@react-md/transition/types/constants", "DEFAULT_COLLAPSE_MIN_PADDING_TOP")
  @js.native
  val DEFAULT_COLLAPSE_MIN_PADDING_TOP: /* 0 */ Double = js.native
  
  @JSImport("@react-md/transition/types/constants", "ENTER")
  @js.native
  val ENTER: /* "enter" */ String = js.native
  
  @JSImport("@react-md/transition/types/constants", "ENTERED")
  @js.native
  val ENTERED: /* "entered" */ String = js.native
  
  @JSImport("@react-md/transition/types/constants", "ENTERING")
  @js.native
  val ENTERING: /* "entering" */ String = js.native
  
  @JSImport("@react-md/transition/types/constants", "EXIT")
  @js.native
  val EXIT: /* "exit" */ String = js.native
  
  @JSImport("@react-md/transition/types/constants", "EXITED")
  @js.native
  val EXITED: /* "exited" */ String = js.native
  
  @JSImport("@react-md/transition/types/constants", "EXITING")
  @js.native
  val EXITING: /* "exiting" */ String = js.native
  
  @JSImport("@react-md/transition/types/constants", "SCALE_CLASSNAMES")
  @js.native
  val SCALE_CLASSNAMES: CSSTransitionClassNames = js.native
  
  @JSImport("@react-md/transition/types/constants", "SCALE_TIMEOUT")
  @js.native
  val SCALE_TIMEOUT: TransitionTimeout = js.native
  
  @JSImport("@react-md/transition/types/constants", "SCALE_Y_CLASSNAMES")
  @js.native
  val SCALE_Y_CLASSNAMES: CSSTransitionClassNames = js.native
  
  @JSImport("@react-md/transition/types/constants", "UNMOUNT")
  @js.native
  val UNMOUNT: /* "unmount" */ String = js.native
  
  type TransitionAction = TransitionStage | (/* "unmount" */ String)
  
  type TransitionStage = /* "enter" */ String
}
