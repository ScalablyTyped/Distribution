package typings
package smoothDashScrollbarLib.pluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smooth-scrollbar/plugin", "ScrollbarPlugin")
@js.native
class ScrollbarPlugin protected ()
  extends smoothDashScrollbarLib.interfacesPluginMod.ScrollbarPlugin {
  def this(scrollbar: smoothDashScrollbarLib.scrollbarMod.Scrollbar) = this()
  def this(scrollbar: smoothDashScrollbarLib.scrollbarMod.Scrollbar, options: js.Any) = this()
  /* CompleteClass */
  override val name: java.lang.String = js.native
  /* CompleteClass */
  override val options: js.Any = js.native
  /* CompleteClass */
  override val scrollbar: smoothDashScrollbarLib.interfacesScrollbarMod.Scrollbar = js.native
  @JSName("scrollbar")
  val scrollbar_ScrollbarPlugin: smoothDashScrollbarLib.scrollbarMod.Scrollbar = js.native
  /* CompleteClass */
  override def onDestory(): scala.Unit = js.native
  /* CompleteClass */
  override def onInit(): scala.Unit = js.native
  /* CompleteClass */
  override def onRender(remainMomentum: smoothDashScrollbarLib.interfacesDataDash2dMod.Data2d): scala.Unit = js.native
  /* CompleteClass */
  override def onUpdate(): scala.Unit = js.native
  def transformDelta(delta: smoothDashScrollbarLib.interfacesDataDash2dMod.Data2d, _evt: stdLib.Event): smoothDashScrollbarLib.interfacesDataDash2dMod.Data2d = js.native
  /* CompleteClass */
  override def transformDelta(delta: smoothDashScrollbarLib.interfacesDataDash2dMod.Data2d, fromEvent: js.Any): smoothDashScrollbarLib.interfacesDataDash2dMod.Data2d = js.native
}

/* static members */
@JSImport("smooth-scrollbar/plugin", "ScrollbarPlugin")
@js.native
object ScrollbarPlugin extends js.Object {
  var defaultOptions: js.Any = js.native
  var pluginName: java.lang.String = js.native
}

