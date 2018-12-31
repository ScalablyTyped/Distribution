package typings
package reactDashJssLib.libInjectSheetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Theming extends js.Object {
  var ThemeProvider: org.scalablytyped.runtime.Instantiable0[themingLib.themingMod.ThemeProvider] = js.native
  var channel: java.lang.String = js.native
  @JSName("createTheming")
  var createTheming_Original: reactDashJssLib.Anon_CustomChannel = js.native
  var themeListener: themingLib.themingMod.ThemeListener[reactDashJssLib.reactDashJssLibStrings.`__THEMING__`] = js.native
  @JSName("withTheme")
  var withTheme_Original: reactDashJssLib.Anon_Component = js.native
  def createTheming[C /* <: java.lang.String */](): themingLib.themingMod.Theming[C] = js.native
  def createTheming[C /* <: java.lang.String */](customChannel: C): themingLib.themingMod.Theming[C] = js.native
  def withTheme[P](component: reactLib.reactMod.ReactNs.ComponentType[P with themingLib.Anon_Theme]): reactLib.reactMod.ReactNs.ComponentType[
    stdLib.Pick[P, stdLib.Exclude[java.lang.String, reactDashJssLib.reactDashJssLibStrings.theme]]
  ] = js.native
}

