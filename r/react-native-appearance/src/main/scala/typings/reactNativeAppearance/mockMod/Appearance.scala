package typings.reactNativeAppearance.mockMod

import typings.reactNativeAppearance.appearanceTypesMod.AppearanceListener
import typings.reactNativeAppearance.appearanceTypesMod.AppearancePreferences
import typings.reactNativeAppearance.appearanceTypesMod.ColorSchemeName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-appearance/lib/typescript/mock", "Appearance")
@js.native
class Appearance () extends js.Object

/* static members */
@JSImport("react-native-appearance/lib/typescript/mock", "Appearance")
@js.native
object Appearance extends js.Object {
  def addChangeListener(_listener: AppearanceListener): FakeEventSubscription = js.native
  def getColorScheme(): ColorSchemeName = js.native
  /**
    * Unused: some people might expect to remove the listener like this, but they shouldn't.
    */
  def removeChangeListener(_listener: AppearanceListener): Unit = js.native
  def set(_preferences: AppearancePreferences): Unit = js.native
}

