package typings.reactDayPicker

import typings.reactDayPicker.dateUtilsMod.DateUtils
import typings.reactDayPicker.localeUtilsMod.LocaleUtils
import typings.reactDayPicker.mod.default
import typings.reactDayPicker.modifiersMod.DayModifiers
import typings.reactDayPicker.modifiersMod.Modifiers
import typings.reactDayPicker.modifiersMod.ModifiersUtils
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("DayPicker")
  @js.native
  class DayPicker () extends default
  /* static members */
  object DayPicker {
    
    @JSGlobal("DayPicker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("DayPicker.DateUtils")
    @js.native
    def DateUtils: typings.reactDayPicker.dateUtilsMod.DateUtils = js.native
    inline def DateUtils_=(x: DateUtils): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DateUtils")(x.asInstanceOf[js.Any])
    
    @JSGlobal("DayPicker.DayModifiers")
    @js.native
    def DayModifiers: typings.reactDayPicker.modifiersMod.DayModifiers = js.native
    inline def DayModifiers_=(x: DayModifiers): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DayModifiers")(x.asInstanceOf[js.Any])
    
    @JSGlobal("DayPicker.LocaleUtils")
    @js.native
    def LocaleUtils: typings.reactDayPicker.localeUtilsMod.LocaleUtils = js.native
    inline def LocaleUtils_=(x: LocaleUtils): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LocaleUtils")(x.asInstanceOf[js.Any])
    
    @JSGlobal("DayPicker.Modifiers")
    @js.native
    def Modifiers: typings.reactDayPicker.modifiersMod.Modifiers = js.native
    
    @JSGlobal("DayPicker.ModifiersUtils")
    @js.native
    def ModifiersUtils: typings.reactDayPicker.modifiersMod.ModifiersUtils = js.native
    inline def ModifiersUtils_=(x: ModifiersUtils): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ModifiersUtils")(x.asInstanceOf[js.Any])
    
    inline def Modifiers_=(x: Modifiers): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Modifiers")(x.asInstanceOf[js.Any])
    
    @JSGlobal("DayPicker.VERSION")
    @js.native
    def VERSION: String = js.native
    inline def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  }
}
