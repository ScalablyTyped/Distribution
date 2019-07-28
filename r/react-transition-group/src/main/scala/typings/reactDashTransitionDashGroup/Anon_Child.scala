package typings.reactDashTransitionDashGroup

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Child
  extends /* prop */ StringDictionary[js.Any] {
  var childFactory: js.UndefOr[js.Function1[/* child */ ReactElement, ReactElement]] = js.undefined
  var children: js.UndefOr[ReactElement | js.Array[ReactElement]] = js.undefined
}

object Anon_Child {
  @scala.inline
  def apply(
    StringDictionary: /* prop */ StringDictionary[js.Any] = null,
    childFactory: /* child */ ReactElement => ReactElement = null,
    children: ReactElement | js.Array[ReactElement] = null
  ): Anon_Child = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (childFactory != null) __obj.updateDynamic("childFactory")(js.Any.fromFunction1(childFactory))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Child]
  }
}

