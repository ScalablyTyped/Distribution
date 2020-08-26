package typings.reactNativeTabView.anon

import typings.react.mod.ReactNode
import typings.reactNativeTabView.reactNativeTabViewStrings.enter
import typings.reactNativeTabView.typesMod.Listener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-tab-view.react-native-tab-view/lib/typescript/src/types.EventEmitterProps & {  position :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> * / any, render (children : react.react.ReactNode): react.react.ReactNode, jumpTo (key : string): void} */
@js.native
trait EventEmitterPropsposition extends js.Object {
  var position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any = js.native
  @JSName("addListener")
  def addListener_enter(`type`: enter, listener: Listener): Unit = js.native
  def jumpTo(key: String): Unit = js.native
  @JSName("removeListener")
  def removeListener_enter(`type`: enter, listener: Listener): Unit = js.native
  def render(children: ReactNode): ReactNode = js.native
}

object EventEmitterPropsposition {
  @scala.inline
  def apply(
    addListener: (enter, Listener) => Unit,
    jumpTo: String => Unit,
    position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any,
    removeListener: (enter, Listener) => Unit,
    render: ReactNode => ReactNode
  ): EventEmitterPropsposition = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), jumpTo = js.Any.fromFunction1(jumpTo), position = position.asInstanceOf[js.Any], removeListener = js.Any.fromFunction2(removeListener), render = js.Any.fromFunction1(render))
    __obj.asInstanceOf[EventEmitterPropsposition]
  }
  @scala.inline
  implicit class EventEmitterPropspositionOps[Self <: EventEmitterPropsposition] (val x: Self) extends AnyVal {
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
    def setAddListener(value: (enter, Listener) => Unit): Self = this.set("addListener", js.Any.fromFunction2(value))
    @scala.inline
    def setJumpTo(value: String => Unit): Self = this.set("jumpTo", js.Any.fromFunction1(value))
    @scala.inline
    def setPosition(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any
    ): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveListener(value: (enter, Listener) => Unit): Self = this.set("removeListener", js.Any.fromFunction2(value))
    @scala.inline
    def setRender(value: ReactNode => ReactNode): Self = this.set("render", js.Any.fromFunction1(value))
  }
  
}

