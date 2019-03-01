package typings
package reactDashTransitionDashGroupLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Child
  extends /* prop */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var childFactory: js.UndefOr[
    js.Function1[
      /* child */ reactLib.reactMod.ReactNs.ReactElement[_], 
      reactLib.reactMod.ReactNs.ReactElement[_]
    ]
  ] = js.undefined
  var children: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactElement[reactDashTransitionDashGroupLib.transitionMod.TransitionProps] | (js.Array[
      reactLib.reactMod.ReactNs.ReactElement[reactDashTransitionDashGroupLib.transitionMod.TransitionProps]
    ])
  ] = js.undefined
}

object Anon_Child {
  @scala.inline
  def apply(
    StringDictionary: /* prop */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    childFactory: js.Function1[
      /* child */ reactLib.reactMod.ReactNs.ReactElement[_], 
      reactLib.reactMod.ReactNs.ReactElement[_]
    ] = null,
    children: reactLib.reactMod.ReactNs.ReactElement[reactDashTransitionDashGroupLib.transitionMod.TransitionProps] | (js.Array[
      reactLib.reactMod.ReactNs.ReactElement[reactDashTransitionDashGroupLib.transitionMod.TransitionProps]
    ]) = null
  ): Anon_Child = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (childFactory != null) __obj.updateDynamic("childFactory")(childFactory)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Child]
  }
}

