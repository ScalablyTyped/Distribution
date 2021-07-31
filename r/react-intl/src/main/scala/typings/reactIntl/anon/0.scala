package typings.reactIntl.anon

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var children: js.UndefOr[js.Function1[/* val */ String, ReactElement | Null]] = js.undefined
  
  var value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.anon.Fn0>[0] */ js.Any
}
object `0` {
  
  @scala.inline
  def apply(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.anon.Fn0>[0] */ js.Any
  ): `0` = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: /* val */ String => ReactElement | Null): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setValue(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.anon.Fn0>[0] */ js.Any
    ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
