package typings.reactIntl.anon

import typings.react.mod.ReactElement
import typings.reactIntl.reactIntlStrings.formatDate
import typings.reactIntl.reactIntlStrings.formatTime
import typings.std.Intl.DateTimeFormatPart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `4`[Name /* <: formatDate | formatTime */] extends StObject {
  
  def children(`val`: js.Array[DateTimeFormatPart]): ReactElement | Null = js.native
  
  var value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.react-intl/src/types.IntlShape[Name]>[0] */ js.Any = js.native
}
object `4` {
  
  @scala.inline
  def apply[Name /* <: formatDate | formatTime */](
    children: js.Array[DateTimeFormatPart] => ReactElement | Null,
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.react-intl/src/types.IntlShape[Name]>[0] */ js.Any
  ): `4`[Name] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4`[Name]]
  }
  
  @scala.inline
  implicit class `4MutableBuilder`[Self <: `4`[_], Name /* <: formatDate | formatTime */] (val x: Self with `4`[Name]) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[DateTimeFormatPart] => ReactElement | Null): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValue(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.react-intl/src/types.IntlShape[Name]>[0] */ js.Any
    ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
