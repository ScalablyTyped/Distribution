package typings.reactIntl.anon

import typings.react.mod.ReactElement
import typings.std.Intl.DateTimeFormatPart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Children extends StObject {
  
  def children(`val`: js.Array[DateTimeFormatPart]): ReactElement | Null
  
  var value: (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.anon.FnCall>[0] */ js.Any) | String
}
object Children {
  
  inline def apply(
    children: js.Array[DateTimeFormatPart] => ReactElement | Null,
    value: (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.anon.FnCall>[0] */ js.Any) | String
  ): Children = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
  
  extension [Self <: Children](x: Self) {
    
    inline def setChildren(value: js.Array[DateTimeFormatPart] => ReactElement | Null): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setValue(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.anon.FnCall>[0] */ js.Any) | String
    ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
