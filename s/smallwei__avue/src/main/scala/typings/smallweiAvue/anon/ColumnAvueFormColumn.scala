package typings.smallweiAvue.anon

import typings.smallweiAvue.formMod.AvueFormColumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnAvueFormColumn[T] extends StObject {
  
  var column: AvueFormColumn[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: keyof T extends string ? keyof T : string */ js.Any
  ]
}
object ColumnAvueFormColumn {
  
  inline def apply[T](
    column: AvueFormColumn[
      T, 
      /* import warning: importer.ImportType#apply Failed type conversion: keyof T extends string ? keyof T : string */ js.Any
    ]
  ): ColumnAvueFormColumn[T] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnAvueFormColumn[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnAvueFormColumn[?], T] (val x: Self & ColumnAvueFormColumn[T]) extends AnyVal {
    
    inline def setColumn(
      value: AvueFormColumn[
          T, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof T extends string ? keyof T : string */ js.Any
        ]
    ): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
  }
}
