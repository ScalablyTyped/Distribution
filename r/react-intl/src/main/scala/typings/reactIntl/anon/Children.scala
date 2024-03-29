package typings.reactIntl.anon

import typings.react.mod.ReactElement
import typings.std.Intl.NumberFormatPart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Children extends StObject {
  
  def children(`val`: js.Array[NumberFormatPart]): ReactElement | Null
  
  var value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.anon.FnCallValueOpts>[0] */ js.Any
}
object Children {
  
  inline def apply(
    children: js.Array[NumberFormatPart] => ReactElement | Null,
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.anon.FnCallValueOpts>[0] */ js.Any
  ): Children = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: js.Array[NumberFormatPart] => ReactElement | Null): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setValue(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.anon.FnCallValueOpts>[0] */ js.Any
    ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
