package typings.reactMdUtils

import typings.react.mod.CSSProperties
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdUtils.typesWiaAriaRadioRadioGroupMod.RadioGroupProps
import typings.reactMdUtils.typesWiaAriaRadioRadioWidgetMod.RadioWidgetProps
import typings.reactMdUtils.typesWiaAriaRadioTypesMod.RadioItem
import typings.reactMdUtils.typesWiaAriaRadioTypesMod.RadioItemStyleObject
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWiaAriaRadioMod {
  
  @JSImport("@react-md/utils/types/wia-aria/radio", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/utils/types/wia-aria/radio", "RadioGroup")
  @js.native
  val RadioGroup: ForwardRefExoticComponent[RadioGroupProps & RefAttributes[HTMLSpanElement]] = js.native
  
  @JSImport("@react-md/utils/types/wia-aria/radio", "RadioWidget")
  @js.native
  val RadioWidget: ForwardRefExoticComponent[RadioWidgetProps & RefAttributes[HTMLSpanElement]] = js.native
  
  inline def defaultGetRadioClassName(item: RadioItemStyleObject): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultGetRadioClassName")(item.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def defaultGetRadioStyle(item: RadioItemStyleObject): js.UndefOr[CSSProperties] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultGetRadioStyle")(item.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[CSSProperties]]
  
  inline def getRadioItemValue(value: RadioItem): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRadioItemValue")(value.asInstanceOf[js.Any]).asInstanceOf[String]
}
