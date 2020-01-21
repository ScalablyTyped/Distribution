package typings.reactNativeNavigation

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgs extends js.Object {
  var children: Requireable[ReactNodeLike]
  var onPeekIn: Requireable[js.Function1[/* repeated */ _, _]]
  var onPeekOut: Requireable[js.Function1[/* repeated */ _, _]]
  var onPress: Requireable[js.Function1[/* repeated */ _, _]]
  var onPressIn: Requireable[js.Function1[/* repeated */ _, _]]
  var touchableComponent: Requireable[js.Function1[/* repeated */ _, _]]
}

object AnonArgs {
  @scala.inline
  def apply(
    children: Requireable[ReactNodeLike],
    onPeekIn: Requireable[js.Function1[/* repeated */ _, _]],
    onPeekOut: Requireable[js.Function1[/* repeated */ _, _]],
    onPress: Requireable[js.Function1[/* repeated */ _, _]],
    onPressIn: Requireable[js.Function1[/* repeated */ _, _]],
    touchableComponent: Requireable[js.Function1[/* repeated */ _, _]]
  ): AnonArgs = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], onPeekIn = onPeekIn.asInstanceOf[js.Any], onPeekOut = onPeekOut.asInstanceOf[js.Any], onPress = onPress.asInstanceOf[js.Any], onPressIn = onPressIn.asInstanceOf[js.Any], touchableComponent = touchableComponent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonArgs]
  }
}

