package typings
package reactDashNativeDashElementsLib.reactDashNativeDashElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeProps[T] extends js.Object {
  var theme: Theme[T]
  var updateTheme: UpdateTheme
}

object ThemeProps {
  @scala.inline
  def apply[T](theme: Theme[T], updateTheme: UpdateTheme): ThemeProps[T] = {
    val __obj = js.Dynamic.literal(theme = theme, updateTheme = updateTheme)
  
    __obj.asInstanceOf[ThemeProps[T]]
  }
}

