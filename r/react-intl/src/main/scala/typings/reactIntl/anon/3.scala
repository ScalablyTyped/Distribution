package typings.reactIntl.anon

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3` extends StObject {
  
  var children: js.UndefOr[js.Function1[/* val */ String, ReactElement | Null]] = js.undefined
  
  var value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl.anon.FnCallCode>[0], opts : @formatjs/intl.@formatjs/intl/src/types.FormatDisplayNameOptions): string | undefined>[0] */ js.Any
}
object `3` {
  
  @scala.inline
  def apply(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl.anon.FnCallCode>[0], opts : @formatjs/intl.@formatjs/intl/src/types.FormatDisplayNameOptions): string | undefined>[0] */ js.Any
  ): `3` = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`]
  }
  
  @scala.inline
  implicit class `3MutableBuilder`[Self <: `3`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: /* val */ String => ReactElement | Null): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setValue(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl.anon.FnCallCode>[0], opts : @formatjs/intl.@formatjs/intl/src/types.FormatDisplayNameOptions): string | undefined>[0] */ js.Any
    ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
