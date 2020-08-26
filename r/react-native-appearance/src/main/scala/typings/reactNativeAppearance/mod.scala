package typings.reactNativeAppearance

import typings.fbemitter.mod.EventSubscription
import typings.react.mod.global.JSX.Element
import typings.reactNativeAppearance.anon.Children
import typings.reactNativeAppearance.appearanceTypesMod.AppearanceListener
import typings.reactNativeAppearance.appearanceTypesMod.AppearancePreferences
import typings.reactNativeAppearance.appearanceTypesMod.ColorSchemeName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-appearance", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Appearance () extends js.Object
  
  def AppearanceProvider(props: Children): Element = js.native
  def useColorScheme(): ColorSchemeName = js.native
  /* static members */
  @js.native
  object Appearance extends js.Object {
    /**
      * Add an event handler that is fired when appearance preferences change.
      */
    def addChangeListener(listener: AppearanceListener): EventSubscription = js.native
    /**
      * Note: Although appearance is available immediately, it may change (e.g
      * Dark Mode) so any rendering logic or styles that depend on this should try
      * to call this function on every render, rather than caching the value (for
      * example, using inline styles rather than setting a value in a
      * `StyleSheet`).
      *
      * Example: `const colorScheme = Appearance.get('colorScheme');`
      *
      * @param {string} preference Name of preference (e.g. 'colorScheme').
      * @returns {ColorSchemeName} Value for the preference.
      */
    def getColorScheme(): ColorSchemeName = js.native
    /**
      * This should only be called from native code by sending the
      * appearanceChanged event.
      *
      * @param {object} appearancePreferences Simple string-keyed object of
      * appearance preferences to set.
      */
    def set(preferences: AppearancePreferences): Unit = js.native
  }
  
}

