package typings.reactMdUtils

import typings.react.mod.CSSProperties
import typings.reactMdUtils.typesWiaAriaRadioTypesMod.RadioItem
import typings.reactMdUtils.typesWiaAriaRadioTypesMod.RadioItemStyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWiaAriaRadioUtilsMod {
  
  @JSImport("@react-md/utils/types/wia-aria/radio/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultGetRadioClassName(item: RadioItemStyleObject): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultGetRadioClassName")(item.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def defaultGetRadioStyle(item: RadioItemStyleObject): js.UndefOr[CSSProperties] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultGetRadioStyle")(item.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[CSSProperties]]
  
  inline def getRadioItemValue(value: RadioItem): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRadioItemValue")(value.asInstanceOf[js.Any]).asInstanceOf[String]
}
