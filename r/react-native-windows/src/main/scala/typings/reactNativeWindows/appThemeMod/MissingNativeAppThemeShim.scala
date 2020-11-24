package typings.reactNativeWindows.appThemeMod

import typings.reactNativeWindows.appThemeTypesMod.IAppThemeChangedEvent
import typings.reactNativeWindows.appThemeTypesMod.IHighContrastChangedEvent
import typings.reactNativeWindows.appThemeTypesMod.IHighContrastColors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MissingNativeAppThemeShim extends js.Object {
  
  def addEventListener(): Unit = js.native
  
  def addListener(
    _eventType: String,
    _listener: js.Function1[/* nativeEvent */ IAppThemeChangedEvent with IHighContrastChangedEvent, Unit]
  ): js.Any = js.native
  
  var currentHighContrastColors: IHighContrastColors = js.native
  
  var currentTheme: String = js.native
  
  var isAvailable: Boolean = js.native
  
  var isHighContrast: Boolean = js.native
  
  def removeAllListeners(): Unit = js.native
  
  def removeEventListener(): Unit = js.native
  
  def removeListener(
    _eventType: String,
    _listener: js.Function1[/* nativeEvent */ IAppThemeChangedEvent with IHighContrastChangedEvent, Unit]
  ): Unit = js.native
  
  def removeSubscription(): Unit = js.native
}
object MissingNativeAppThemeShim {
  
  @scala.inline
  def apply(
    addEventListener: () => Unit,
    addListener: (String, js.Function1[/* nativeEvent */ IAppThemeChangedEvent with IHighContrastChangedEvent, Unit]) => js.Any,
    currentHighContrastColors: IHighContrastColors,
    currentTheme: String,
    isAvailable: Boolean,
    isHighContrast: Boolean,
    removeAllListeners: () => Unit,
    removeEventListener: () => Unit,
    removeListener: (String, js.Function1[/* nativeEvent */ IAppThemeChangedEvent with IHighContrastChangedEvent, Unit]) => Unit,
    removeSubscription: () => Unit
  ): MissingNativeAppThemeShim = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction0(addEventListener), addListener = js.Any.fromFunction2(addListener), currentHighContrastColors = currentHighContrastColors.asInstanceOf[js.Any], currentTheme = currentTheme.asInstanceOf[js.Any], isAvailable = isAvailable.asInstanceOf[js.Any], isHighContrast = isHighContrast.asInstanceOf[js.Any], removeAllListeners = js.Any.fromFunction0(removeAllListeners), removeEventListener = js.Any.fromFunction0(removeEventListener), removeListener = js.Any.fromFunction2(removeListener), removeSubscription = js.Any.fromFunction0(removeSubscription))
    __obj.asInstanceOf[MissingNativeAppThemeShim]
  }
  
  @scala.inline
  implicit class MissingNativeAppThemeShimOps[Self <: MissingNativeAppThemeShim] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddEventListener(value: () => Unit): Self = this.set("addEventListener", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAddListener(
      value: (String, js.Function1[/* nativeEvent */ IAppThemeChangedEvent with IHighContrastChangedEvent, Unit]) => js.Any
    ): Self = this.set("addListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCurrentHighContrastColors(value: IHighContrastColors): Self = this.set("currentHighContrastColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTheme(value: String): Self = this.set("currentTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAvailable(value: Boolean): Self = this.set("isAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHighContrast(value: Boolean): Self = this.set("isHighContrast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveAllListeners(value: () => Unit): Self = this.set("removeAllListeners", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveEventListener(value: () => Unit): Self = this.set("removeEventListener", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveListener(
      value: (String, js.Function1[/* nativeEvent */ IAppThemeChangedEvent with IHighContrastChangedEvent, Unit]) => Unit
    ): Self = this.set("removeListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveSubscription(value: () => Unit): Self = this.set("removeSubscription", js.Any.fromFunction0(value))
  }
}
