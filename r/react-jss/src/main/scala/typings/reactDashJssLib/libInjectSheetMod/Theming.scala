package typings
package reactDashJssLib.libInjectSheetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Theming extends js.Object {
  var ThemeProvider: org.scalablytyped.runtime.Instantiable0[themingLib.themingMod.ThemeProvider]
  var channel: java.lang.String
  var createTheming: reactDashJssLib.Anon_CustomChannel
  var themeListener: themingLib.themingMod.ThemeListener[reactDashJssLib.reactDashJssLibStrings.__THEMING__]
  var withTheme: reactDashJssLib.Anon_Component
}

object Theming {
  @scala.inline
  def apply(
    ThemeProvider: org.scalablytyped.runtime.Instantiable0[themingLib.themingMod.ThemeProvider],
    channel: java.lang.String,
    createTheming: reactDashJssLib.Anon_CustomChannel,
    themeListener: themingLib.themingMod.ThemeListener[reactDashJssLib.reactDashJssLibStrings.__THEMING__],
    withTheme: reactDashJssLib.Anon_Component
  ): Theming = {
    val __obj = js.Dynamic.literal(ThemeProvider = ThemeProvider, channel = channel, createTheming = createTheming, themeListener = themeListener, withTheme = withTheme)
  
    __obj.asInstanceOf[Theming]
  }
}

