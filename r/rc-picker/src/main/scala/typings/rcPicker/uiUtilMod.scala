package typings.rcPicker

import typings.rcPicker.generateMod.GenerateConfig
import typings.rcPicker.interfaceMod.CustomFormat
import typings.rcPicker.interfaceMod.PanelMode
import typings.rcPicker.interfaceMod.PickerMode
import typings.react.mod.KeyboardEvent
import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uiUtilMod {
  
  @JSImport("rc-picker/es/utils/uiUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined std.Record<rc-picker.rc-picker/es/interface.PickerMode, (next : rc-picker.rc-picker/es/interface.PanelMode): rc-picker.rc-picker/es/interface.PanelMode | null> */
  object PickerModeMap {
    
    @JSImport("rc-picker/es/utils/uiUtil", "PickerModeMap")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-picker/es/utils/uiUtil", "PickerModeMap.date")
    @js.native
    def date: (js.Function1[/* next */ PanelMode, PanelMode]) | Null = js.native
    inline def date_=(x: (js.Function1[/* next */ PanelMode, PanelMode]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("date")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-picker/es/utils/uiUtil", "PickerModeMap.month")
    @js.native
    def month: (js.Function1[/* next */ PanelMode, PanelMode]) | Null = js.native
    inline def month_=(x: (js.Function1[/* next */ PanelMode, PanelMode]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("month")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-picker/es/utils/uiUtil", "PickerModeMap.quarter")
    @js.native
    def quarter: (js.Function1[/* next */ PanelMode, PanelMode]) | Null = js.native
    inline def quarter_=(x: (js.Function1[/* next */ PanelMode, PanelMode]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("quarter")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-picker/es/utils/uiUtil", "PickerModeMap.time")
    @js.native
    def time: (js.Function1[/* next */ PanelMode, PanelMode]) | Null = js.native
    inline def time_=(x: (js.Function1[/* next */ PanelMode, PanelMode]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("time")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-picker/es/utils/uiUtil", "PickerModeMap.week")
    @js.native
    def week: (js.Function1[/* next */ PanelMode, PanelMode]) | Null = js.native
    inline def week_=(x: (js.Function1[/* next */ PanelMode, PanelMode]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("week")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-picker/es/utils/uiUtil", "PickerModeMap.year")
    @js.native
    def year: (js.Function1[/* next */ PanelMode, PanelMode]) | Null = js.native
    inline def year_=(x: (js.Function1[/* next */ PanelMode, PanelMode]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("year")(x.asInstanceOf[js.Any])
  }
  
  inline def addGlobalMouseDownEvent(callback: ClickEventHandler): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("addGlobalMouseDownEvent")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  inline def createKeyDownHandler(
    event: KeyboardEvent[HTMLElement],
    hasOnLeftRightOnCtrlLeftRightOnUpDownOnPageUpDownOnEnter: KeyboardConfig
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("createKeyDownHandler")(event.asInstanceOf[js.Any], hasOnLeftRightOnCtrlLeftRightOnUpDownOnPageUpDownOnEnter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def elementsContains(elements: js.Array[js.UndefOr[HTMLElement | Null]], target: HTMLElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("elementsContains")(elements.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def getDefaultFormat[DateType](): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")().asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](format: String): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any]).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](format: String, picker: Unit, showTime: js.Object): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](format: String, picker: Unit, showTime: js.Object, use12Hours: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](format: String, picker: Unit, showTime: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](format: String, picker: Unit, showTime: Boolean, use12Hours: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](format: String, picker: Unit, showTime: Unit, use12Hours: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](format: String, picker: PickerMode): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](format: String, picker: PickerMode, showTime: js.Object): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](format: String, picker: PickerMode, showTime: js.Object, use12Hours: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](format: String, picker: PickerMode, showTime: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](format: String, picker: PickerMode, showTime: Boolean, use12Hours: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](format: String, picker: PickerMode, showTime: Unit, use12Hours: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](format: js.Array[String | CustomFormat[DateType]]): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any]).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](format: js.Array[String | CustomFormat[DateType]], picker: Unit, showTime: js.Object): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](
    format: js.Array[String | CustomFormat[DateType]],
    picker: Unit,
    showTime: js.Object,
    use12Hours: Boolean
  ): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](format: js.Array[String | CustomFormat[DateType]], picker: Unit, showTime: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](
    format: js.Array[String | CustomFormat[DateType]],
    picker: Unit,
    showTime: Boolean,
    use12Hours: Boolean
  ): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](
    format: js.Array[String | CustomFormat[DateType]],
    picker: Unit,
    showTime: Unit,
    use12Hours: Boolean
  ): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](format: js.Array[String | CustomFormat[DateType]], picker: PickerMode): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](format: js.Array[String | CustomFormat[DateType]], picker: PickerMode, showTime: js.Object): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](
    format: js.Array[String | CustomFormat[DateType]],
    picker: PickerMode,
    showTime: js.Object,
    use12Hours: Boolean
  ): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](format: js.Array[String | CustomFormat[DateType]], picker: PickerMode, showTime: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](
    format: js.Array[String | CustomFormat[DateType]],
    picker: PickerMode,
    showTime: Boolean,
    use12Hours: Boolean
  ): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](
    format: js.Array[String | CustomFormat[DateType]],
    picker: PickerMode,
    showTime: Unit,
    use12Hours: Boolean
  ): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](format: Unit, picker: Unit, showTime: js.Object): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](format: Unit, picker: Unit, showTime: js.Object, use12Hours: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](format: Unit, picker: Unit, showTime: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](format: Unit, picker: Unit, showTime: Boolean, use12Hours: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](format: Unit, picker: Unit, showTime: Unit, use12Hours: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](format: Unit, picker: PickerMode): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](format: Unit, picker: PickerMode, showTime: js.Object): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](format: Unit, picker: PickerMode, showTime: js.Object, use12Hours: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](format: Unit, picker: PickerMode, showTime: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](format: Unit, picker: PickerMode, showTime: Boolean, use12Hours: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](format: Unit, picker: PickerMode, showTime: Unit, use12Hours: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](format: CustomFormat[DateType]): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any]).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](format: CustomFormat[DateType], picker: Unit, showTime: js.Object): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](format: CustomFormat[DateType], picker: Unit, showTime: js.Object, use12Hours: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](format: CustomFormat[DateType], picker: Unit, showTime: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](format: CustomFormat[DateType], picker: Unit, showTime: Boolean, use12Hours: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](format: CustomFormat[DateType], picker: Unit, showTime: Unit, use12Hours: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](format: CustomFormat[DateType], picker: PickerMode): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](format: CustomFormat[DateType], picker: PickerMode, showTime: js.Object): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](format: CustomFormat[DateType], picker: PickerMode, showTime: js.Object, use12Hours: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](format: CustomFormat[DateType], picker: PickerMode, showTime: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](format: CustomFormat[DateType], picker: PickerMode, showTime: Boolean, use12Hours: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  inline def getDefaultFormat[DateType](format: CustomFormat[DateType], picker: PickerMode, showTime: Unit, use12Hours: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  
  inline def getInputSize[DateType](picker: Unit, format: String, generateConfig: GenerateConfig[DateType]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getInputSize")(picker.asInstanceOf[js.Any], format.asInstanceOf[js.Any], generateConfig.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getInputSize[DateType](picker: Unit, format: CustomFormat[DateType], generateConfig: GenerateConfig[DateType]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getInputSize")(picker.asInstanceOf[js.Any], format.asInstanceOf[js.Any], generateConfig.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getInputSize[DateType](picker: PickerMode, format: String, generateConfig: GenerateConfig[DateType]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getInputSize")(picker.asInstanceOf[js.Any], format.asInstanceOf[js.Any], generateConfig.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getInputSize[DateType](picker: PickerMode, format: CustomFormat[DateType], generateConfig: GenerateConfig[DateType]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getInputSize")(picker.asInstanceOf[js.Any], format.asInstanceOf[js.Any], generateConfig.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def scrollTo(element: HTMLElement, to: Double, duration: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollTo")(element.asInstanceOf[js.Any], to.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def waitElementReady(element: HTMLElement, callback: js.Function0[Unit]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitElementReady")(element.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  type ClickEventHandler = js.Function1[/* event */ MouseEvent, Unit]
  
  trait KeyboardConfig extends StObject {
    
    var onCtrlLeftRight: js.UndefOr[(js.Function1[/* diff */ Double, Unit]) | Null] = js.undefined
    
    var onEnter: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
    
    var onLeftRight: js.UndefOr[(js.Function1[/* diff */ Double, Unit]) | Null] = js.undefined
    
    var onPageUpDown: js.UndefOr[(js.Function1[/* diff */ Double, Unit]) | Null] = js.undefined
    
    var onUpDown: js.UndefOr[(js.Function1[/* diff */ Double, Unit]) | Null] = js.undefined
  }
  object KeyboardConfig {
    
    inline def apply(): KeyboardConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyboardConfig]
    }
    
    extension [Self <: KeyboardConfig](x: Self) {
      
      inline def setOnCtrlLeftRight(value: /* diff */ Double => Unit): Self = StObject.set(x, "onCtrlLeftRight", js.Any.fromFunction1(value))
      
      inline def setOnCtrlLeftRightNull: Self = StObject.set(x, "onCtrlLeftRight", null)
      
      inline def setOnCtrlLeftRightUndefined: Self = StObject.set(x, "onCtrlLeftRight", js.undefined)
      
      inline def setOnEnter(value: () => Unit): Self = StObject.set(x, "onEnter", js.Any.fromFunction0(value))
      
      inline def setOnEnterNull: Self = StObject.set(x, "onEnter", null)
      
      inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      inline def setOnLeftRight(value: /* diff */ Double => Unit): Self = StObject.set(x, "onLeftRight", js.Any.fromFunction1(value))
      
      inline def setOnLeftRightNull: Self = StObject.set(x, "onLeftRight", null)
      
      inline def setOnLeftRightUndefined: Self = StObject.set(x, "onLeftRight", js.undefined)
      
      inline def setOnPageUpDown(value: /* diff */ Double => Unit): Self = StObject.set(x, "onPageUpDown", js.Any.fromFunction1(value))
      
      inline def setOnPageUpDownNull: Self = StObject.set(x, "onPageUpDown", null)
      
      inline def setOnPageUpDownUndefined: Self = StObject.set(x, "onPageUpDown", js.undefined)
      
      inline def setOnUpDown(value: /* diff */ Double => Unit): Self = StObject.set(x, "onUpDown", js.Any.fromFunction1(value))
      
      inline def setOnUpDownNull: Self = StObject.set(x, "onUpDown", null)
      
      inline def setOnUpDownUndefined: Self = StObject.set(x, "onUpDown", js.undefined)
    }
  }
}
