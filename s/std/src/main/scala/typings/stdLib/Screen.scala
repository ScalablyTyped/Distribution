package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The Screen interface represents a screen, usually the one on which the current window is being rendered, and is obtained using window.screen. */
trait Screen extends js.Object {
  val availHeight: scala.Double
  val availWidth: scala.Double
  val colorDepth: scala.Double
  val height: scala.Double
  val orientation: ScreenOrientation
  val pixelDepth: scala.Double
  val width: scala.Double
}

@JSGlobal("Screen")
@js.native
class ScreenCls () extends Screen {
  /* CompleteClass */
  override val availHeight: scala.Double = js.native
  /* CompleteClass */
  override val availWidth: scala.Double = js.native
  /* CompleteClass */
  override val colorDepth: scala.Double = js.native
  /* CompleteClass */
  override val height: scala.Double = js.native
  /* CompleteClass */
  override val orientation: ScreenOrientation = js.native
  /* CompleteClass */
  override val pixelDepth: scala.Double = js.native
  /* CompleteClass */
  override val width: scala.Double = js.native
}

@JSGlobal("Screen")
@js.native
object Screen
  extends org.scalablytyped.runtime.Instantiable0[Screen]

