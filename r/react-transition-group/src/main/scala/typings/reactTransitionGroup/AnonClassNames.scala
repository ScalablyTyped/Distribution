package typings.reactTransitionGroup

import typings.reactTransitionGroup.csstransitionMod.CSSTransitionClassNames
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClassNames extends js.Object {
  /**
    * The animation `classNames` applied to the component as it enters or exits.
    * A single name can be provided and it will be suffixed for each stage: e.g.
    *
    * `classNames="fade"` applies `fade-enter`, `fade-enter-active`,
    * `fade-exit`, `fade-exit-active`, `fade-appear`, and `fade-appear-active`.
    *
    * Each individual classNames can also be specified independently like:
    *
    * ```js
    * classNames={{
    *   appear: 'my-appear',
    *   appearActive: 'my-appear-active',
    *   appearDone: 'my-appear-done',
    *   enter: 'my-enter',
    *   enterActive: 'my-enter-active',
    *   enterDone: 'my-enter-done',
    *   exit: 'my-exit',
    *   exitActive: 'my-exit-active',
    *   exitDone: 'my-exit-done'
    * }}
    * ```
    */
  var classNames: js.UndefOr[String | CSSTransitionClassNames] = js.undefined
}

object AnonClassNames {
  @scala.inline
  def apply(classNames: String | CSSTransitionClassNames = null): AnonClassNames = {
    val __obj = js.Dynamic.literal()
    if (classNames != null) __obj.updateDynamic("classNames")(classNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClassNames]
  }
}

