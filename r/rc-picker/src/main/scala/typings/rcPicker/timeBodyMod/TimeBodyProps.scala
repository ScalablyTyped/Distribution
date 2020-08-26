package typings.rcPicker.timeBodyMod

import typings.rcPicker.generateMod.GenerateConfig
import typings.rcPicker.interfaceMod.Locale
import typings.rcPicker.interfaceMod.OnSelect
import typings.rcPicker.rcPickerStrings.key
import typings.rcPicker.rcPickerStrings.mouse
import typings.rcPicker.rcPickerStrings.submit
import typings.rcPicker.timePanelMod.SharedTimeProps
import typings.react.mod.MutableRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeBodyProps[DateType] extends SharedTimeProps[DateType] {
  var activeColumnIndex: Double = js.native
  var generateConfig: GenerateConfig[DateType] = js.native
  var locale: Locale = js.native
  var onSelect: OnSelect[DateType] = js.native
  var operationRef: MutableRefObject[js.UndefOr[BodyOperationRef]] = js.native
  var prefixCls: String = js.native
  var value: js.UndefOr[DateType | Null] = js.native
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
  implicit class TimeBodyPropsOps[Self <: TimeBodyProps[_], DateType] (val x: Self with TimeBodyProps[DateType]) extends AnyVal {
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
    def setActiveColumnIndex(value: Double): Self = this.set("activeColumnIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setGenerateConfig(value: GenerateConfig[DateType]): Self = this.set("generateConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocale(value: Locale): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnSelect(value: (DateType, /* type */ key | mouse | submit) => Unit): Self = this.set("onSelect", js.Any.fromFunction2(value))
    @scala.inline
    def setOperationRef(value: MutableRefObject[js.UndefOr[BodyOperationRef]]): Self = this.set("operationRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: DateType): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
  
}

