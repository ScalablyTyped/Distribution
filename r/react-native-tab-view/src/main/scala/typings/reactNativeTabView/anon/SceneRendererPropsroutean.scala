package typings.reactNativeTabView.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-tab-view.react-native-tab-view/lib/typescript/src/types.SceneRendererProps & {  route  :any} */
trait SceneRendererPropsroutean extends js.Object {
  var layout: typings.reactNativeTabView.typesMod.Layout
  var position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any
  var route: js.Any
  def jumpTo(key: String): Unit
}

object SceneRendererPropsroutean {
  @scala.inline
  def apply(
    jumpTo: String => Unit,
    layout: typings.reactNativeTabView.typesMod.Layout,
    position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any,
    route: js.Any
  ): SceneRendererPropsroutean = {
    val __obj = js.Dynamic.literal(jumpTo = js.Any.fromFunction1(jumpTo), layout = layout.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneRendererPropsroutean]
  }
}

