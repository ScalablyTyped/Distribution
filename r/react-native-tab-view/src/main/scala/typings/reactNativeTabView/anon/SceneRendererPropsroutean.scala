package typings.reactNativeTabView.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-tab-view.react-native-tab-view/lib/typescript/src/types.SceneRendererProps & {  route :any} */
@js.native
trait SceneRendererPropsroutean extends js.Object {
  var layout: typings.reactNativeTabView.typesMod.Layout = js.native
  var position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any = js.native
  var route: js.Any = js.native
  def jumpTo(key: String): Unit = js.native
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
  @scala.inline
  implicit class SceneRendererPropsrouteanOps[Self <: SceneRendererPropsroutean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setJumpTo(value: String => Unit): Self = this.set("jumpTo", js.Any.fromFunction1(value))
    @scala.inline
    def setLayout(value: typings.reactNativeTabView.typesMod.Layout): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any
    ): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoute(value: js.Any): Self = this.set("route", value.asInstanceOf[js.Any])
  }
  
}

