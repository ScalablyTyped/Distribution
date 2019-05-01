package typings
package reactDashNativeDashElementsLib.reactDashNativeDashElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeProps[T] extends js.Object {
  var theme: Theme[T] = js.native
  @JSName("updateTheme")
  var updateTheme_Original: UpdateTheme = js.native
  def updateTheme(updates: RecursivePartial[FullTheme]): scala.Unit = js.native
}

