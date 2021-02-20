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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uiUtilMod {
  
  /* Inlined std.Record<rc-picker.rc-picker/es/interface.PickerMode, (next : rc-picker.rc-picker/es/interface.PanelMode): rc-picker.rc-picker/es/interface.PanelMode | null> */
  object PickerModeMap {
    
    @JSImport("rc-picker/es/utils/uiUtil", "PickerModeMap")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-picker/es/utils/uiUtil", "PickerModeMap.date")
    @js.native
    def date: (js.Function1[/* next */ PanelMode, PanelMode]) | Null = js.native
    @scala.inline
    def date_=(x: (js.Function1[/* next */ PanelMode, PanelMode]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("date")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-picker/es/utils/uiUtil", "PickerModeMap.month")
    @js.native
    def month: (js.Function1[/* next */ PanelMode, PanelMode]) | Null = js.native
    @scala.inline
    def month_=(x: (js.Function1[/* next */ PanelMode, PanelMode]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("month")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-picker/es/utils/uiUtil", "PickerModeMap.quarter")
    @js.native
    def quarter: (js.Function1[/* next */ PanelMode, PanelMode]) | Null = js.native
    @scala.inline
    def quarter_=(x: (js.Function1[/* next */ PanelMode, PanelMode]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("quarter")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-picker/es/utils/uiUtil", "PickerModeMap.time")
    @js.native
    def time: (js.Function1[/* next */ PanelMode, PanelMode]) | Null = js.native
    @scala.inline
    def time_=(x: (js.Function1[/* next */ PanelMode, PanelMode]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("time")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-picker/es/utils/uiUtil", "PickerModeMap.week")
    @js.native
    def week: (js.Function1[/* next */ PanelMode, PanelMode]) | Null = js.native
    @scala.inline
    def week_=(x: (js.Function1[/* next */ PanelMode, PanelMode]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("week")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-picker/es/utils/uiUtil", "PickerModeMap.year")
    @js.native
    def year: (js.Function1[/* next */ PanelMode, PanelMode]) | Null = js.native
    @scala.inline
    def year_=(x: (js.Function1[/* next */ PanelMode, PanelMode]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("year")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rc-picker/es/utils/uiUtil", "addGlobalMouseDownEvent")
  @js.native
  def addGlobalMouseDownEvent(callback: ClickEventHandler): js.Function0[Unit] = js.native
  
  @JSImport("rc-picker/es/utils/uiUtil", "createKeyDownHandler")
  @js.native
  def createKeyDownHandler(
    event: KeyboardEvent[HTMLElement],
    hasOnLeftRightOnCtrlLeftRightOnUpDownOnPageUpDownOnEnter: KeyboardConfig
  ): Boolean = js.native
  
  @JSImport("rc-picker/es/utils/uiUtil", "elementsContains")
  @js.native
  def elementsContains(elements: js.Array[js.UndefOr[HTMLElement | Null]], target: HTMLElement): Boolean = js.native
  
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](
    format: js.UndefOr[scala.Nothing],
    picker: js.UndefOr[scala.Nothing],
    showTime: js.UndefOr[scala.Nothing],
    use12Hours: Boolean
  ): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](format: js.UndefOr[scala.Nothing], picker: js.UndefOr[scala.Nothing], showTime: js.Object): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](
    format: js.UndefOr[scala.Nothing],
    picker: js.UndefOr[scala.Nothing],
    showTime: js.Object,
    use12Hours: Boolean
  ): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](format: js.UndefOr[scala.Nothing], picker: js.UndefOr[scala.Nothing], showTime: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](
    format: js.UndefOr[scala.Nothing],
    picker: js.UndefOr[scala.Nothing],
    showTime: Boolean,
    use12Hours: Boolean
  ): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](format: js.UndefOr[scala.Nothing], picker: PickerMode): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](
    format: js.UndefOr[scala.Nothing],
    picker: PickerMode,
    showTime: js.UndefOr[scala.Nothing],
    use12Hours: Boolean
  ): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](format: js.UndefOr[scala.Nothing], picker: PickerMode, showTime: js.Object): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](format: js.UndefOr[scala.Nothing], picker: PickerMode, showTime: js.Object, use12Hours: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](format: js.UndefOr[scala.Nothing], picker: PickerMode, showTime: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](format: js.UndefOr[scala.Nothing], picker: PickerMode, showTime: Boolean, use12Hours: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](format: String): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](
    format: String,
    picker: js.UndefOr[scala.Nothing],
    showTime: js.UndefOr[scala.Nothing],
    use12Hours: Boolean
  ): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](format: String, picker: js.UndefOr[scala.Nothing], showTime: js.Object): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](format: String, picker: js.UndefOr[scala.Nothing], showTime: js.Object, use12Hours: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](format: String, picker: js.UndefOr[scala.Nothing], showTime: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](format: String, picker: js.UndefOr[scala.Nothing], showTime: Boolean, use12Hours: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](format: String, picker: PickerMode): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](format: String, picker: PickerMode, showTime: js.UndefOr[scala.Nothing], use12Hours: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](format: String, picker: PickerMode, showTime: js.Object): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](format: String, picker: PickerMode, showTime: js.Object, use12Hours: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](format: String, picker: PickerMode, showTime: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](format: String, picker: PickerMode, showTime: Boolean, use12Hours: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](format: js.Array[String | CustomFormat[DateType]]): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](
    format: js.Array[String | CustomFormat[DateType]],
    picker: js.UndefOr[scala.Nothing],
    showTime: js.UndefOr[scala.Nothing],
    use12Hours: Boolean
  ): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](
    format: js.Array[String | CustomFormat[DateType]],
    picker: js.UndefOr[scala.Nothing],
    showTime: js.Object
  ): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](
    format: js.Array[String | CustomFormat[DateType]],
    picker: js.UndefOr[scala.Nothing],
    showTime: js.Object,
    use12Hours: Boolean
  ): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](
    format: js.Array[String | CustomFormat[DateType]],
    picker: js.UndefOr[scala.Nothing],
    showTime: Boolean
  ): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](
    format: js.Array[String | CustomFormat[DateType]],
    picker: js.UndefOr[scala.Nothing],
    showTime: Boolean,
    use12Hours: Boolean
  ): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](format: js.Array[String | CustomFormat[DateType]], picker: PickerMode): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](
    format: js.Array[String | CustomFormat[DateType]],
    picker: PickerMode,
    showTime: js.UndefOr[scala.Nothing],
    use12Hours: Boolean
  ): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](format: js.Array[String | CustomFormat[DateType]], picker: PickerMode, showTime: js.Object): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](
    format: js.Array[String | CustomFormat[DateType]],
    picker: PickerMode,
    showTime: js.Object,
    use12Hours: Boolean
  ): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](format: js.Array[String | CustomFormat[DateType]], picker: PickerMode, showTime: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](
    format: js.Array[String | CustomFormat[DateType]],
    picker: PickerMode,
    showTime: Boolean,
    use12Hours: Boolean
  ): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](format: CustomFormat[DateType]): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](
    format: CustomFormat[DateType],
    picker: js.UndefOr[scala.Nothing],
    showTime: js.UndefOr[scala.Nothing],
    use12Hours: Boolean
  ): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](format: CustomFormat[DateType], picker: js.UndefOr[scala.Nothing], showTime: js.Object): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](
    format: CustomFormat[DateType],
    picker: js.UndefOr[scala.Nothing],
    showTime: js.Object,
    use12Hours: Boolean
  ): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](format: CustomFormat[DateType], picker: js.UndefOr[scala.Nothing], showTime: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](
    format: CustomFormat[DateType],
    picker: js.UndefOr[scala.Nothing],
    showTime: Boolean,
    use12Hours: Boolean
  ): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](format: CustomFormat[DateType], picker: PickerMode): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](
    format: CustomFormat[DateType],
    picker: PickerMode,
    showTime: js.UndefOr[scala.Nothing],
    use12Hours: Boolean
  ): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](format: CustomFormat[DateType], picker: PickerMode, showTime: js.Object): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](format: CustomFormat[DateType], picker: PickerMode, showTime: js.Object, use12Hours: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](format: CustomFormat[DateType], picker: PickerMode, showTime: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getDefaultFormat")
  @js.native
  def getDefaultFormat[DateType](format: CustomFormat[DateType], picker: PickerMode, showTime: Boolean, use12Hours: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = js.native
  
  @JSImport("rc-picker/es/utils/uiUtil", "getInputSize")
  @js.native
  def getInputSize[DateType](picker: js.UndefOr[scala.Nothing], format: String, generateConfig: GenerateConfig[DateType]): Double = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getInputSize")
  @js.native
  def getInputSize[DateType](
    picker: js.UndefOr[scala.Nothing],
    format: CustomFormat[DateType],
    generateConfig: GenerateConfig[DateType]
  ): Double = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getInputSize")
  @js.native
  def getInputSize[DateType](picker: PickerMode, format: String, generateConfig: GenerateConfig[DateType]): Double = js.native
  @JSImport("rc-picker/es/utils/uiUtil", "getInputSize")
  @js.native
  def getInputSize[DateType](picker: PickerMode, format: CustomFormat[DateType], generateConfig: GenerateConfig[DateType]): Double = js.native
  
  @JSImport("rc-picker/es/utils/uiUtil", "scrollTo")
  @js.native
  def scrollTo(element: HTMLElement, to: Double, duration: Double): Unit = js.native
  
  @JSImport("rc-picker/es/utils/uiUtil", "waitElementReady")
  @js.native
  def waitElementReady(element: HTMLElement, callback: js.Function0[Unit]): js.Function0[Unit] = js.native
  
  type ClickEventHandler = js.Function1[/* event */ MouseEvent, Unit]
  
  @js.native
  trait KeyboardConfig extends StObject {
    
    var onCtrlLeftRight: js.UndefOr[(js.Function1[/* diff */ Double, Unit]) | Null] = js.native
    
    var onEnter: js.UndefOr[js.Function0[Unit] | Null] = js.native
    
    var onLeftRight: js.UndefOr[(js.Function1[/* diff */ Double, Unit]) | Null] = js.native
    
    var onPageUpDown: js.UndefOr[(js.Function1[/* diff */ Double, Unit]) | Null] = js.native
    
    var onUpDown: js.UndefOr[(js.Function1[/* diff */ Double, Unit]) | Null] = js.native
  }
  object KeyboardConfig {
    
    @scala.inline
    def apply(): KeyboardConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyboardConfig]
    }
    
    @scala.inline
    implicit class KeyboardConfigMutableBuilder[Self <: KeyboardConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnCtrlLeftRight(value: /* diff */ Double => Unit): Self = StObject.set(x, "onCtrlLeftRight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCtrlLeftRightNull: Self = StObject.set(x, "onCtrlLeftRight", null)
      
      @scala.inline
      def setOnCtrlLeftRightUndefined: Self = StObject.set(x, "onCtrlLeftRight", js.undefined)
      
      @scala.inline
      def setOnEnter(value: () => Unit): Self = StObject.set(x, "onEnter", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnEnterNull: Self = StObject.set(x, "onEnter", null)
      
      @scala.inline
      def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      @scala.inline
      def setOnLeftRight(value: /* diff */ Double => Unit): Self = StObject.set(x, "onLeftRight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLeftRightNull: Self = StObject.set(x, "onLeftRight", null)
      
      @scala.inline
      def setOnLeftRightUndefined: Self = StObject.set(x, "onLeftRight", js.undefined)
      
      @scala.inline
      def setOnPageUpDown(value: /* diff */ Double => Unit): Self = StObject.set(x, "onPageUpDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPageUpDownNull: Self = StObject.set(x, "onPageUpDown", null)
      
      @scala.inline
      def setOnPageUpDownUndefined: Self = StObject.set(x, "onPageUpDown", js.undefined)
      
      @scala.inline
      def setOnUpDown(value: /* diff */ Double => Unit): Self = StObject.set(x, "onUpDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUpDownNull: Self = StObject.set(x, "onUpDown", null)
      
      @scala.inline
      def setOnUpDownUndefined: Self = StObject.set(x, "onUpDown", js.undefined)
    }
  }
}
