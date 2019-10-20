package typings.smoothDashScrollbar.pluginMod

import typings.smoothDashScrollbar.interfacesDataDash2dMod.Data2d
import typings.smoothDashScrollbar.scrollbarMod.Scrollbar
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smooth-scrollbar/plugin", "ScrollbarPlugin")
@js.native
class ScrollbarPlugin protected ()
  extends typings.smoothDashScrollbar.interfacesPluginMod.ScrollbarPlugin {
  def this(scrollbar: Scrollbar) = this()
  def this(scrollbar: Scrollbar, options: js.Any) = this()
  /* CompleteClass */
  override val name: String = js.native
  /* CompleteClass */
  override val options: js.Any = js.native
  /* CompleteClass */
  override val scrollbar: typings.smoothDashScrollbar.interfacesScrollbarMod.Scrollbar = js.native
  @JSName("scrollbar")
  val scrollbar_ScrollbarPlugin: Scrollbar = js.native
  /* CompleteClass */
  override def onDestroy(): Unit = js.native
  /* CompleteClass */
  override def onInit(): Unit = js.native
  /* CompleteClass */
  override def onRender(remainMomentum: Data2d): Unit = js.native
  /* CompleteClass */
  override def onUpdate(): Unit = js.native
  def transformDelta(delta: Data2d, _evt: Event): Data2d = js.native
  /* CompleteClass */
  override def transformDelta(delta: Data2d, fromEvent: js.Any): Data2d = js.native
}

/* static members */
@JSImport("smooth-scrollbar/plugin", "ScrollbarPlugin")
@js.native
object ScrollbarPlugin extends js.Object {
  var defaultOptions: js.Any = js.native
  var pluginName: String = js.native
}

