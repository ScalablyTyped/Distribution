package typings.reactTransitionGroup.anon

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictprop
  extends /* prop */ StringDictionary[js.Any] {
  var childFactory: js.UndefOr[js.Function1[/* child */ ReactElement, ReactElement]] = js.undefined
  var children: js.UndefOr[ReactElement | js.Array[ReactElement]] = js.undefined
}

object Dictprop {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    childFactory: /* child */ ReactElement => ReactElement = null,
    children: ReactElement | js.Array[ReactElement] = null
  ): Dictprop = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (childFactory != null) __obj.updateDynamic("childFactory")(js.Any.fromFunction1(childFactory))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictprop]
  }
}

