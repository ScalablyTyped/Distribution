package typings.sqlTemplate

import typings.sqlTemplate.sqlTemplateBooleans.`false`
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(parts: TemplateStringsArray, values: Any*): Fragment = ^.asInstanceOf[js.Dynamic].apply(scala.List(parts.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Fragment]
  
  @JSImport("sql-template", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def insert(table: String, values: js.Object): Fragment = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(table.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Fragment]
  
  inline def insertBulk(table: String, keys: js.Array[String], values: js.Array[js.Array[Any]]): Fragment = (^.asInstanceOf[js.Dynamic].applyDynamic("insert_bulk")(table.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Fragment]
  
  inline def searchBlob(search_field: String, qs: String): Fragment | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("search_blob")(search_field.asInstanceOf[js.Any], qs.asInstanceOf[js.Any])).asInstanceOf[Fragment | `false`]
  inline def searchBlob(search_field: String, qs: String, main_field: String): Fragment | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("search_blob")(search_field.asInstanceOf[js.Any], qs.asInstanceOf[js.Any], main_field.asInstanceOf[js.Any])).asInstanceOf[Fragment | `false`]
  inline def searchBlob(search_field: String, qs: String, main_field: String, LIKE: String): Fragment | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("search_blob")(search_field.asInstanceOf[js.Any], qs.asInstanceOf[js.Any], main_field.asInstanceOf[js.Any], LIKE.asInstanceOf[js.Any])).asInstanceOf[Fragment | `false`]
  inline def searchBlob(search_field: String, qs: String, main_field: Unit, LIKE: String): Fragment | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("search_blob")(search_field.asInstanceOf[js.Any], qs.asInstanceOf[js.Any], main_field.asInstanceOf[js.Any], LIKE.asInstanceOf[js.Any])).asInstanceOf[Fragment | `false`]
  
  inline def select(table: String): Fragment = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(table.asInstanceOf[js.Any]).asInstanceOf[Fragment]
  inline def select(table: String, where: Any): Fragment = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(table.asInstanceOf[js.Any], where.asInstanceOf[js.Any])).asInstanceOf[Fragment]
  inline def select(table: String, where: Any, cols: String): Fragment = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(table.asInstanceOf[js.Any], where.asInstanceOf[js.Any], cols.asInstanceOf[js.Any])).asInstanceOf[Fragment]
  inline def select(table: String, where: Any, cols: String, extra: String): Fragment = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(table.asInstanceOf[js.Any], where.asInstanceOf[js.Any], cols.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[Fragment]
  inline def select(table: String, where: Any, cols: Unit, extra: String): Fragment = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(table.asInstanceOf[js.Any], where.asInstanceOf[js.Any], cols.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[Fragment]
  inline def select(table: String, where: Unit, cols: String): Fragment = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(table.asInstanceOf[js.Any], where.asInstanceOf[js.Any], cols.asInstanceOf[js.Any])).asInstanceOf[Fragment]
  inline def select(table: String, where: Unit, cols: String, extra: String): Fragment = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(table.asInstanceOf[js.Any], where.asInstanceOf[js.Any], cols.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[Fragment]
  inline def select(table: String, where: Unit, cols: Unit, extra: String): Fragment = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(table.asInstanceOf[js.Any], where.asInstanceOf[js.Any], cols.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[Fragment]
  
  inline def update(table: String, values: js.Object): Fragment = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(table.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Fragment]
  inline def update(table: String, values: js.Object, where: Any): Fragment = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(table.asInstanceOf[js.Any], values.asInstanceOf[js.Any], where.asInstanceOf[js.Any])).asInstanceOf[Fragment]
  
  type ChainFn = js.Function2[/* values */ js.Array[Any], /* part */ String, String]
  
  trait Fragment extends StObject {
    
    var raw: String
    
    var text: String
    
    var values: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object Fragment {
    
    inline def apply(raw: String, text: String): Fragment = {
      val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fragment]
    }
    
    extension [Self <: Fragment](x: Self) {
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  type Transformer = js.Function3[/* values */ js.Array[Any], /* str */ String, /* chain */ ChainFn, Unit]
}
