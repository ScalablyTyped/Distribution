package typings.reactIntl.anon

import typings.react.mod.ReactElement
import typings.std.Intl.DateTimeFormatPart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Children extends StObject {
  
  def children(`val`: js.Array[DateTimeFormatPart]): ReactElement | Null = js.native
  
  var value: (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.anon.FnCall>[0] */ js.Any) | String = js.native
}
object Children {
  
  @scala.inline
  def apply(
    children: js.Array[DateTimeFormatPart] => ReactElement | Null,
    value: (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.anon.FnCall>[0] */ js.Any) | String
  ): Children = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
  
  @scala.inline
  implicit class ChildrenMutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[DateTimeFormatPart] => ReactElement | Null): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValue(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.anon.FnCall>[0] */ js.Any) | String
    ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
