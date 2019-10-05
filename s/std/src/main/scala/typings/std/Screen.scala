package typings.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A screen, usually the one on which the current window is being rendered, and is obtained using window.screen. */
trait Screen extends js.Object {
  val availHeight: Double
  val availWidth: Double
  val colorDepth: Double
  val height: Double
  val orientation: ScreenOrientation
  val pixelDepth: Double
  val width: Double
}

@JSGlobal("Screen")
@js.native
object Screen extends Instantiable0[Screen]

@JSGlobal("screen")
@js.native
object screen extends TopLevel[Screen]

