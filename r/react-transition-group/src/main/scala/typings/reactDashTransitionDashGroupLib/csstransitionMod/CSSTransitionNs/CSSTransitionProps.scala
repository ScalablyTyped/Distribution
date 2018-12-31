package typings
package reactDashTransitionDashGroupLib.csstransitionMod.CSSTransitionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The animation classNames applied to the component as it enters or exits.
  * A single name can be provided and it will be suffixed for each stage: e.g.
  *
  * `classNames="fade"` applies `fade-enter`, `fade-enter-active`,
  * `fade-exit`, `fade-exit-active`, `fade-appear`, and `fade-appear-active`.
  * Each individual classNames can also be specified independently like:
  *
  * ```js
  * classNames={{
  *  appear: 'my-appear',
  *  appearActive: 'my-active-appear',
  *  enter: 'my-enter',
  *  enterActive: 'my-active-enter',
  *  exit: 'my-exit',
  *  exitActive: 'my-active-exit',
  * }}
  * ```
  */
trait CSSTransitionProps
  extends reactDashTransitionDashGroupLib.transitionMod.TransitionProps {
  var classNames: java.lang.String | CSSTransitionClassNames
}

