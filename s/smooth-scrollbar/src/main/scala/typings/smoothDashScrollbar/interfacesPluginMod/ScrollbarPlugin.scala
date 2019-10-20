package typings.smoothDashScrollbar.interfacesPluginMod

import typings.smoothDashScrollbar.interfacesDataDash2dMod.Data2d
import typings.smoothDashScrollbar.interfacesScrollbarMod.Scrollbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollbarPlugin extends js.Object {
  val name: String
  val options: js.Any
  val scrollbar: Scrollbar
  def onDestroy(): Unit
  def onInit(): Unit
  def onRender(remainMomentum: Data2d): Unit
  def onUpdate(): Unit
  def transformDelta(delta: Data2d, fromEvent: js.Any): Data2d
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
    val __obj = js.Dynamic.literal(name = name, onDestroy = js.Any.fromFunction0(onDestroy), onInit = js.Any.fromFunction0(onInit), onRender = js.Any.fromFunction1(onRender), onUpdate = js.Any.fromFunction0(onUpdate), options = options, scrollbar = scrollbar, transformDelta = js.Any.fromFunction2(transformDelta))
  
    __obj.asInstanceOf[ScrollbarPlugin]
  }
}

