package typings
package reactDashTransitionDashGroupLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Child
  extends /* prop */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var childFactory: js.UndefOr[
    js.Function1[/* child */ reactLib.reactMod.ReactElement, reactLib.reactMod.ReactElement]
  ] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactElement | js.Array[reactLib.reactMod.ReactElement]] = js.undefined
}

object Anon_Child {
  @scala.inline
  def apply(
    StringDictionary: /* prop */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    childFactory: /* child */ reactLib.reactMod.ReactElement => reactLib.reactMod.ReactElement = null,
    children: reactLib.reactMod.ReactElement | js.Array[reactLib.reactMod.ReactElement] = null
  ): Anon_Child = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (childFactory != null) __obj.updateDynamic("childFactory")(js.Any.fromFunction1(childFactory))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Child]
  }
}

