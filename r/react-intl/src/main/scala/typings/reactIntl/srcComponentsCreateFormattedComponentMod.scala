package typings.reactIntl

import typings.formatjsIntl.srcTypesMod.FormatDateOptions
import typings.formatjsIntl.srcTypesMod.FormatDisplayNameOptions
import typings.formatjsIntl.srcTypesMod.FormatListOptions
import typings.formatjsIntl.srcTypesMod.FormatNumberOptions
import typings.react.mod.FC
import typings.reactIntl.anon.Children
import typings.reactIntl.anon.ChildrenValue
import typings.reactIntl.anon.Value
import typings.reactIntl.anon.`0`
import typings.reactIntl.anon.`1`
import typings.reactIntl.anon.`2`
import typings.reactIntl.anon.`4`
import typings.reactIntl.reactIntlStrings.formatDate
import typings.reactIntl.reactIntlStrings.formatDisplayName
import typings.reactIntl.reactIntlStrings.formatList
import typings.reactIntl.reactIntlStrings.formatNumber
import typings.reactIntl.reactIntlStrings.formatTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsCreateFormattedComponentMod {
  
  @JSImport("react-intl/src/components/createFormattedComponent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-intl/src/components/createFormattedComponent", "FormattedListParts")
  @js.native
  val FormattedListParts: FC[FormatListOptions & Children] = js.native
  
  @JSImport("react-intl/src/components/createFormattedComponent", "FormattedNumberParts")
  @js.native
  val FormattedNumberParts: FC[FormatNumberOptions & Value] = js.native
  
  inline def createFormattedComponent_formatDate(name: formatDate): FC[FormatDateOptions & ChildrenValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormattedComponent")(name.asInstanceOf[js.Any]).asInstanceOf[FC[FormatDateOptions & ChildrenValue]]
  
  inline def createFormattedComponent_formatDisplayName(name: formatDisplayName): FC[FormatDisplayNameOptions & `2`] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormattedComponent")(name.asInstanceOf[js.Any]).asInstanceOf[FC[FormatDisplayNameOptions & `2`]]
  
  inline def createFormattedComponent_formatList(name: formatList): FC[FormatListOptions & `1`] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormattedComponent")(name.asInstanceOf[js.Any]).asInstanceOf[FC[FormatListOptions & `1`]]
  
  inline def createFormattedComponent_formatNumber(name: formatNumber): FC[FormatNumberOptions & `0`] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormattedComponent")(name.asInstanceOf[js.Any]).asInstanceOf[FC[FormatNumberOptions & `0`]]
  
  inline def createFormattedComponent_formatTime(name: formatTime): FC[FormatDateOptions & ChildrenValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormattedComponent")(name.asInstanceOf[js.Any]).asInstanceOf[FC[FormatDateOptions & ChildrenValue]]
  
  inline def createFormattedDateTimePartsComponent[Name /* <: formatDate | formatTime */](name: Name): FC[
    (/* import warning: importer.ImportType#apply Failed type conversion: react-intl.react-intl/src/components/createFormattedComponent.Formatter[Name] */ js.Any) & `4`[Name]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormattedDateTimePartsComponent")(name.asInstanceOf[js.Any]).asInstanceOf[FC[
    (/* import warning: importer.ImportType#apply Failed type conversion: react-intl.react-intl/src/components/createFormattedComponent.Formatter[Name] */ js.Any) & `4`[Name]
  ]]
  
  trait Formatter extends StObject {
    
    var formatDate: FormatDateOptions
    
    var formatDisplayName: FormatDisplayNameOptions
    
    var formatList: FormatListOptions
    
    var formatNumber: FormatNumberOptions
    
    var formatTime: FormatDateOptions
  }
  object Formatter {
    
    inline def apply(
      formatDate: FormatDateOptions,
      formatDisplayName: FormatDisplayNameOptions,
      formatList: FormatListOptions,
      formatNumber: FormatNumberOptions,
      formatTime: FormatDateOptions
    ): Formatter = {
      val __obj = js.Dynamic.literal(formatDate = formatDate.asInstanceOf[js.Any], formatDisplayName = formatDisplayName.asInstanceOf[js.Any], formatList = formatList.asInstanceOf[js.Any], formatNumber = formatNumber.asInstanceOf[js.Any], formatTime = formatTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[Formatter]
    }
    
    extension [Self <: Formatter](x: Self) {
      
      inline def setFormatDate(value: FormatDateOptions): Self = StObject.set(x, "formatDate", value.asInstanceOf[js.Any])
      
      inline def setFormatDisplayName(value: FormatDisplayNameOptions): Self = StObject.set(x, "formatDisplayName", value.asInstanceOf[js.Any])
      
      inline def setFormatList(value: FormatListOptions): Self = StObject.set(x, "formatList", value.asInstanceOf[js.Any])
      
      inline def setFormatNumber(value: FormatNumberOptions): Self = StObject.set(x, "formatNumber", value.asInstanceOf[js.Any])
      
      inline def setFormatTime(value: FormatDateOptions): Self = StObject.set(x, "formatTime", value.asInstanceOf[js.Any])
    }
  }
}
