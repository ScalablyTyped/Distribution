package typings.reactNativeWindows.appThemeMod

import typings.reactNative.mod.NativeEventEmitter
import typings.reactNativeWindows.appThemeTypesMod.AppThemeTypes
import typings.reactNativeWindows.appThemeTypesMod.IHighContrastColors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppThemeModule extends NativeEventEmitter {
  
  var _currentTheme: js.Any = js.native
  
  var _highContrastColors: js.Any = js.native
  
  var _isHighContrast: js.Any = js.native
  
  def currentHighContrastColors: IHighContrastColors = js.native
  
  def currentTheme: AppThemeTypes = js.native
  
  var isAvailable: Boolean = js.native
  
  def isHighContrast: Boolean = js.native
}
