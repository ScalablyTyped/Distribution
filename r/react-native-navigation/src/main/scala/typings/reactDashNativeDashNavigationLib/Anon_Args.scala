package typings
package reactDashNativeDashNavigationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var children: propDashTypesLib.propDashTypesMod.Requireable[propDashTypesLib.propDashTypesMod.ReactNodeLike]
  var onPeekIn: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]]
  var onPeekOut: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]]
  var onPress: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]]
  var onPressIn: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]]
  var touchableComponent: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]]
}

object Anon_Args {
  @scala.inline
  def apply(
    children: propDashTypesLib.propDashTypesMod.Requireable[propDashTypesLib.propDashTypesMod.ReactNodeLike],
    onPeekIn: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]],
    onPeekOut: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]],
    onPress: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]],
    onPressIn: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]],
    touchableComponent: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]]
  ): Anon_Args = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children)
    __obj.updateDynamic("onPeekIn")(onPeekIn)
    __obj.updateDynamic("onPeekOut")(onPeekOut)
    __obj.updateDynamic("onPress")(onPress)
    __obj.updateDynamic("onPressIn")(onPressIn)
    __obj.updateDynamic("touchableComponent")(touchableComponent)
    __obj.asInstanceOf[Anon_Args]
  }
}

