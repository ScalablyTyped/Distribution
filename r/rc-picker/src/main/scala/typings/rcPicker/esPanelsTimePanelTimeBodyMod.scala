package typings.rcPicker

import typings.rcPicker.esGenerateMod.GenerateConfig
import typings.rcPicker.esInterfaceMod.CellRender
import typings.rcPicker.esInterfaceMod.CellRenderInfo
import typings.rcPicker.esInterfaceMod.Locale
import typings.rcPicker.esInterfaceMod.OnSelect
import typings.rcPicker.esPanelsTimePanelMod.SharedTimeProps
import typings.rcPicker.rcPickerStrings.key
import typings.rcPicker.rcPickerStrings.mouse
import typings.rcPicker.rcPickerStrings.submit
import typings.react.mod.MutableRefObject
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPanelsTimePanelTimeBodyMod {
  
  @JSImport("rc-picker/es/panels/TimePanel/TimeBody", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[DateType](props: TimeBodyProps[DateType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait BodyOperationRef extends StObject {
    
    def onUpDown(diff: Double): Unit
  }
  object BodyOperationRef {
    
    inline def apply(onUpDown: Double => Unit): BodyOperationRef = {
      val __obj = js.Dynamic.literal(onUpDown = js.Any.fromFunction1(onUpDown))
      __obj.asInstanceOf[BodyOperationRef]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BodyOperationRef] (val x: Self) extends AnyVal {
      
      inline def setOnUpDown(value: Double => Unit): Self = StObject.set(x, "onUpDown", js.Any.fromFunction1(value))
    }
  }
  
  trait TimeBodyProps[DateType]
    extends StObject
       with SharedTimeProps[DateType] {
    
    var activeColumnIndex: Double
    
    var cellRender: js.UndefOr[CellRender[DateType, Double]] = js.undefined
    
    var generateConfig: GenerateConfig[DateType]
    
    var locale: Locale
    
    var onSelect: OnSelect[DateType]
    
    var operationRef: MutableRefObject[js.UndefOr[BodyOperationRef]]
    
    var prefixCls: String
    
    var value: js.UndefOr[DateType | Null] = js.undefined
  }
  object TimeBodyProps {
    
    inline def apply[DateType](
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
    implicit open class MutableBuilder[Self <: TimeBodyProps[?], DateType] (val x: Self & TimeBodyProps[DateType]) extends AnyVal {
      
      inline def setActiveColumnIndex(value: Double): Self = StObject.set(x, "activeColumnIndex", value.asInstanceOf[js.Any])
      
      inline def setCellRender(value: (Double, /* info */ CellRenderInfo[DateType]) => ReactNode): Self = StObject.set(x, "cellRender", js.Any.fromFunction2(value))
      
      inline def setCellRenderUndefined: Self = StObject.set(x, "cellRender", js.undefined)
      
      inline def setGenerateConfig(value: GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setOnSelect(value: (DateType, /* type */ key | mouse | submit) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      inline def setOperationRef(value: MutableRefObject[js.UndefOr[BodyOperationRef]]): Self = StObject.set(x, "operationRef", value.asInstanceOf[js.Any])
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setValue(value: DateType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
