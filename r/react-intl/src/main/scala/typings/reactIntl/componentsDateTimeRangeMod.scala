package typings.reactIntl

import org.scalablytyped.runtime.Shortcut
import typings.formatjsIntl.srcTypesMod.CustomFormatConfig
import typings.react.mod.FC
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsDateTimeRangeMod extends Shortcut {
  
  @JSImport("react-intl/src/components/dateTimeRange", JSImport.Default)
  @js.native
  val default: FC[Props] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/date-time.DateTimeFormatOptions extends 'localeMatcher' ? never : @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/date-time.DateTimeFormatOptions */ trait Props
    extends StObject
       with CustomFormatConfig {
    
    var children: js.UndefOr[js.Function1[/* value */ ReactNode, ReactElement | Null]] = js.undefined
    
    var from: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.anon.FnCallStartDateEndDate>[0] */ js.Any
    
    var to: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.anon.FnCallStartDateEndDate>[1] */ js.Any
  }
  object Props {
    
    @scala.inline
    def apply(
      from: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.anon.FnCallStartDateEndDate>[0] */ js.Any,
      to: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.anon.FnCallStartDateEndDate>[1] */ js.Any
    ): Props = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: /* value */ ReactNode => ReactElement | Null): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setFrom(
        value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.anon.FnCallStartDateEndDate>[0] */ js.Any
      ): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo(
        value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.anon.FnCallStartDateEndDate>[1] */ js.Any
      ): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[Props]
  
  /* This means you don't have to write `default`, but can instead just say `componentsDateTimeRangeMod.foo` */
  override def _to: FC[Props] = default
}
