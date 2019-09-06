package typings.reactDashNativeDashElements.reactDashNativeDashElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeProps[T] extends js.Object {
  var replaceTheme: ReplaceTheme
  var theme: Theme[T]
  var updateTheme: UpdateTheme
}

object ThemeProps {
  @scala.inline
  def apply[T](replaceTheme: ReplaceTheme, theme: Theme[T], updateTheme: UpdateTheme): ThemeProps[T] = {
    val __obj = js.Dynamic.literal(replaceTheme = replaceTheme, theme = theme, updateTheme = updateTheme)
  
    __obj.asInstanceOf[ThemeProps[T]]
  }
}

