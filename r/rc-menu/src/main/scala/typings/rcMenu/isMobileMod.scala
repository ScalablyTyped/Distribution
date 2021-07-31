package typings.rcMenu

import typings.rcMenu.anon.Amazon
import typings.rcMenu.anon.Blackberry
import typings.rcMenu.anon.Device
import typings.rcMenu.anon.Phone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isMobileMod {
  
  object default {
    
    @JSImport("rc-menu/es/utils/isMobile", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-menu/es/utils/isMobile", "default.amazon")
    @js.native
    def amazon: Phone = js.native
    @scala.inline
    def amazon_=(x: Phone): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("amazon")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-menu/es/utils/isMobile", "default.android")
    @js.native
    def android: Phone = js.native
    @scala.inline
    def android_=(x: Phone): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("android")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-menu/es/utils/isMobile", "default.any")
    @js.native
    def any: js.Any = js.native
    @scala.inline
    def any_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("any")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-menu/es/utils/isMobile", "default.apple")
    @js.native
    def apple: Device = js.native
    @scala.inline
    def apple_=(x: Device): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("apple")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-menu/es/utils/isMobile", "default.isMobile")
    @js.native
    def isMobile: js.Function1[/* userAgent */ js.UndefOr[String], Amazon] = js.native
    @scala.inline
    def isMobile_=(x: js.Function1[/* userAgent */ js.UndefOr[String], Amazon]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isMobile")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-menu/es/utils/isMobile", "default.other")
    @js.native
    def other: Blackberry = js.native
    @scala.inline
    def other_=(x: Blackberry): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("other")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-menu/es/utils/isMobile", "default.phone")
    @js.native
    def phone: js.Any = js.native
    @scala.inline
    def phone_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("phone")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-menu/es/utils/isMobile", "default.tablet")
    @js.native
    def tablet: js.Any = js.native
    @scala.inline
    def tablet_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tablet")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-menu/es/utils/isMobile", "default.windows")
    @js.native
    def windows: Phone = js.native
    @scala.inline
    def windows_=(x: Phone): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("windows")(x.asInstanceOf[js.Any])
  }
}
