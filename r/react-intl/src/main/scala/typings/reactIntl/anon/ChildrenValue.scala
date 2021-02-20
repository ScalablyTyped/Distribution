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
trait ChildrenValue[Name /* <: formatDate | formatTime */] extends StObject {
  
  def children(`val`: js.Array[DateTimeFormatPart]): ReactElement | Null = js.native
  
  var value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.react-intl/lib/src/types.IntlShape[Name]>[0] */ js.Any = js.native
}
object ChildrenValue {
  
  @scala.inline
  def apply[Name /* <: formatDate | formatTime */](
    children: js.Array[DateTimeFormatPart] => ReactElement | Null,
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.react-intl/lib/src/types.IntlShape[Name]>[0] */ js.Any
  ): ChildrenValue[Name] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenValue[Name]]
  }
  
  @scala.inline
  implicit class ChildrenValueMutableBuilder[Self <: ChildrenValue[_], Name /* <: formatDate | formatTime */] (val x: Self with ChildrenValue[Name]) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[DateTimeFormatPart] => ReactElement | Null): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValue(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.react-intl/lib/src/types.IntlShape[Name]>[0] */ js.Any
    ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
