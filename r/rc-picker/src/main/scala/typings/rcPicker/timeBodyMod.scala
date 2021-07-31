package typings.rcPicker

import typings.rcPicker.generateMod.GenerateConfig
import typings.rcPicker.interfaceMod.Locale
import typings.rcPicker.interfaceMod.OnSelect
import typings.rcPicker.rcPickerStrings.key
import typings.rcPicker.rcPickerStrings.mouse
import typings.rcPicker.rcPickerStrings.submit
import typings.rcPicker.timePanelMod.SharedTimeProps
import typings.react.mod.MutableRefObject
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeBodyMod {
  
  @JSImport("rc-picker/es/panels/TimePanel/TimeBody", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[DateType](props: TimeBodyProps[DateType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait BodyOperationRef extends StObject {
    
    def onUpDown(diff: Double): Unit
  }
  object BodyOperationRef {
    
    @scala.inline
    def apply(onUpDown: Double => Unit): BodyOperationRef = {
      val __obj = js.Dynamic.literal(onUpDown = js.Any.fromFunction1(onUpDown))
      __obj.asInstanceOf[BodyOperationRef]
    }
    
    @scala.inline
    implicit class BodyOperationRefMutableBuilder[Self <: BodyOperationRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnUpDown(value: Double => Unit): Self = StObject.set(x, "onUpDown", js.Any.fromFunction1(value))
    }
  }
  
  trait TimeBodyProps[DateType]
    extends StObject
       with SharedTimeProps[DateType] {
    
    var activeColumnIndex: Double
    
    var generateConfig: GenerateConfig[DateType]
    
    var locale: Locale
    
    var onSelect: OnSelect[DateType]
    
    var operationRef: MutableRefObject[js.UndefOr[BodyOperationRef]]
    
    var prefixCls: String
    
    var value: js.UndefOr[DateType | Null] = js.undefined
  }
  object TimeBodyProps {
    
    @scala.inline
    def apply[DateType](
      activeColumnIndex: Double,
      generateConfig: GenerateConfig[DateType],
      locale: Locale,
      onSelect: (DateType, /* type */ key | mouse | submit) => Unit,
      operationRef: MutableRefObject[js.UndefOr[BodyOperationRef]],
      prefixCls: String
    ): TimeBodyProps[DateType] = {
      val __obj = js.Dynamic.literal(activeColumnIndex = activeColumnIndex.asInstanceOf[js.Any], generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], onSelect = js.Any.fromFunction2(onSelect), operationRef = operationRef.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeBodyProps[DateType]]
    }
    
    @scala.inline
    implicit class TimeBodyPropsMutableBuilder[Self <: TimeBodyProps[?], DateType] (val x: Self & TimeBodyProps[DateType]) extends AnyVal {
      
      @scala.inline
      def setActiveColumnIndex(value: Double): Self = StObject.set(x, "activeColumnIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenerateConfig(value: GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSelect(value: (DateType, /* type */ key | mouse | submit) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOperationRef(value: MutableRefObject[js.UndefOr[BodyOperationRef]]): Self = StObject.set(x, "operationRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: DateType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
