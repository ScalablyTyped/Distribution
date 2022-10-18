package typings.storybookDocsTools

import typings.storybookDocsTools.distTs3Dot9ArgTypesDocgenPropDefMod.PropSummaryValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ArgTypesUtilsMod {
  
  @JSImport("@storybook/docs-tools/dist/ts3.9/argTypes/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/docs-tools/dist/ts3.9/argTypes/utils", "MAX_DEFAULT_VALUE_SUMMARY_LENGTH")
  @js.native
  val MAX_DEFAULT_VALUE_SUMMARY_LENGTH: /* 50 */ Double = js.native
  
  @JSImport("@storybook/docs-tools/dist/ts3.9/argTypes/utils", "MAX_TYPE_SUMMARY_LENGTH")
  @js.native
  val MAX_TYPE_SUMMARY_LENGTH: /* 90 */ Double = js.native
  
  inline def createSummaryValue(summary: String): PropSummaryValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createSummaryValue")(summary.asInstanceOf[js.Any]).asInstanceOf[PropSummaryValue]
  inline def createSummaryValue(summary: String, detail: String): PropSummaryValue = (^.asInstanceOf[js.Dynamic].applyDynamic("createSummaryValue")(summary.asInstanceOf[js.Any], detail.asInstanceOf[js.Any])).asInstanceOf[PropSummaryValue]
  
  inline def isTooLongForDefaultValueSummary(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTooLongForDefaultValueSummary")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTooLongForTypeSummary(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTooLongForTypeSummary")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def normalizeNewlines(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeNewlines")(string.asInstanceOf[js.Any]).asInstanceOf[String]
}
