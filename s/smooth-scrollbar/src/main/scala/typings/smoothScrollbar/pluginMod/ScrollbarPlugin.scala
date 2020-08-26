package typings.smoothScrollbar.pluginMod

import typings.smoothScrollbar.data2dMod.Data2d
import typings.smoothScrollbar.scrollbarMod.Scrollbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollbarPlugin extends js.Object {
  val name: String = js.native
  val options: js.Any = js.native
  val scrollbar: Scrollbar = js.native
  def onDestroy(): Unit = js.native
  def onInit(): Unit = js.native
  def onRender(remainMomentum: Data2d): Unit = js.native
  def onUpdate(): Unit = js.native
  def transformDelta(delta: Data2d, fromEvent: js.Any): Data2d = js.native
}

object ScrollbarPlugin {
  @scala.inline
  def apply(
    name: String,
    onDestroy: () => Unit,
    onInit: () => Unit,
    onRender: Data2d => Unit,
    onUpdate: () => Unit,
    options: js.Any,
    scrollbar: Scrollbar,
    transformDelta: (Data2d, js.Any) => Data2d
  ): ScrollbarPlugin = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onDestroy = js.Any.fromFunction0(onDestroy), onInit = js.Any.fromFunction0(onInit), onRender = js.Any.fromFunction1(onRender), onUpdate = js.Any.fromFunction0(onUpdate), options = options.asInstanceOf[js.Any], scrollbar = scrollbar.asInstanceOf[js.Any], transformDelta = js.Any.fromFunction2(transformDelta))
    __obj.asInstanceOf[ScrollbarPlugin]
  }
  @scala.inline
  implicit class ScrollbarPluginOps[Self <: ScrollbarPlugin] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnDestroy(value: () => Unit): Self = this.set("onDestroy", js.Any.fromFunction0(value))
    @scala.inline
    def setOnInit(value: () => Unit): Self = this.set("onInit", js.Any.fromFunction0(value))
    @scala.inline
    def setOnRender(value: Data2d => Unit): Self = this.set("onRender", js.Any.fromFunction1(value))
    @scala.inline
    def setOnUpdate(value: () => Unit): Self = this.set("onUpdate", js.Any.fromFunction0(value))
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollbar(value: Scrollbar): Self = this.set("scrollbar", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformDelta(value: (Data2d, js.Any) => Data2d): Self = this.set("transformDelta", js.Any.fromFunction2(value))
  }
  
}

