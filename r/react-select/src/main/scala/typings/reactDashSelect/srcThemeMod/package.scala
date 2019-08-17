package typings.reactDashSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcThemeMod {
  import typings.reactDashSelect.srcTypesMod.Theme

  type ThemeConfig = Theme | (js.Function1[/* theme */ Theme, Theme])
}
