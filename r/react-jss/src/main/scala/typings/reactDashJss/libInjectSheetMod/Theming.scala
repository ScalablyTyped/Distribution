package typings.reactDashJss.libInjectSheetMod

import org.scalablytyped.runtime.Instantiable0
import typings.reactDashJss.Fn_Component
import typings.reactDashJss.Fn_CustomChannel
import typings.reactDashJss.reactDashJssStrings.__THEMING__
import typings.theming.themingMod.ThemeListener
import typings.theming.themingMod.ThemeProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Theming extends js.Object {
  var ThemeProvider: Instantiable0[typings.theming.themingMod.ThemeProvider]
  var channel: String
  var createTheming: Fn_CustomChannel
  var themeListener: ThemeListener[__THEMING__]
  var withTheme: Fn_Component
}

object Theming {
  @scala.inline
  def apply(
    ThemeProvider: Instantiable0[ThemeProvider],
    channel: String,
    createTheming: Fn_CustomChannel,
    themeListener: ThemeListener[__THEMING__],
    withTheme: Fn_Component
  ): Theming = {
    val __obj = js.Dynamic.literal(ThemeProvider = ThemeProvider, channel = channel, createTheming = createTheming, themeListener = themeListener, withTheme = withTheme)
  
    __obj.asInstanceOf[Theming]
  }
}

