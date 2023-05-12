package typings.smallweiAvue.anon

import typings.smallweiAvue.formMod.AvueFormColumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnIndex[T] extends StObject {
  
  var column: js.Array[
    AvueFormColumn[
      T, 
      /* import warning: importer.ImportType#apply Failed type conversion: keyof T extends string ? keyof T : string */ js.Any
    ]
  ]
  
  var index: Double
  
  var label: Any
  
  var row: T
  
  var value: Any
}
object ColumnIndex {
  
  inline def apply[T](
    column: js.Array[
      AvueFormColumn[
        T, 
        /* import warning: importer.ImportType#apply Failed type conversion: keyof T extends string ? keyof T : string */ js.Any
      ]
    ],
    index: Double,
    label: Any,
    row: T,
    value: Any
  ): ColumnIndex[T] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnIndex[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnIndex[?], T] (val x: Self & ColumnIndex[T]) extends AnyVal {
    
    inline def setColumn(
      value: js.Array[
          AvueFormColumn[
            T, 
            /* import warning: importer.ImportType#apply Failed type conversion: keyof T extends string ? keyof T : string */ js.Any
          ]
        ]
    ): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnVarargs(
      value: (AvueFormColumn[
          T, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof T extends string ? keyof T : string */ js.Any
        ])*
    ): Self = StObject.set(x, "column", js.Array(value*))
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Any): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setRow(value: T): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
