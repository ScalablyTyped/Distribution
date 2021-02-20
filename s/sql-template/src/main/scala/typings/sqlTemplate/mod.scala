package typings.sqlTemplate

import typings.sqlTemplate.sqlTemplateBooleans.`false`
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sql-template", JSImport.Namespace)
  @js.native
  def apply(parts: TemplateStringsArray, values: js.Any*): Fragment = js.native
  
  @JSImport("sql-template", "insert")
  @js.native
  def insert(table: String, values: js.Object): Fragment = js.native
  
  @JSImport("sql-template", "insert_bulk")
  @js.native
  def insertBulk(table: String, keys: js.Array[String], values: js.Array[js.Array[_]]): Fragment = js.native
  
  @JSImport("sql-template", "search_blob")
  @js.native
  def searchBlob(search_field: String, qs: String): Fragment | `false` = js.native
  @JSImport("sql-template", "search_blob")
  @js.native
  def searchBlob(search_field: String, qs: String, main_field: js.UndefOr[scala.Nothing], LIKE: String): Fragment | `false` = js.native
  @JSImport("sql-template", "search_blob")
  @js.native
  def searchBlob(search_field: String, qs: String, main_field: String): Fragment | `false` = js.native
  @JSImport("sql-template", "search_blob")
  @js.native
  def searchBlob(search_field: String, qs: String, main_field: String, LIKE: String): Fragment | `false` = js.native
  
  @JSImport("sql-template", "select")
  @js.native
  def select(table: String): Fragment = js.native
  @JSImport("sql-template", "select")
  @js.native
  def select(table: String, where: js.UndefOr[scala.Nothing], cols: js.UndefOr[scala.Nothing], extra: String): Fragment = js.native
  @JSImport("sql-template", "select")
  @js.native
  def select(table: String, where: js.UndefOr[scala.Nothing], cols: String): Fragment = js.native
  @JSImport("sql-template", "select")
  @js.native
  def select(table: String, where: js.UndefOr[scala.Nothing], cols: String, extra: String): Fragment = js.native
  @JSImport("sql-template", "select")
  @js.native
  def select(table: String, where: js.Any): Fragment = js.native
  @JSImport("sql-template", "select")
  @js.native
  def select(table: String, where: js.Any, cols: js.UndefOr[scala.Nothing], extra: String): Fragment = js.native
  @JSImport("sql-template", "select")
  @js.native
  def select(table: String, where: js.Any, cols: String): Fragment = js.native
  @JSImport("sql-template", "select")
  @js.native
  def select(table: String, where: js.Any, cols: String, extra: String): Fragment = js.native
  
  @JSImport("sql-template", "update")
  @js.native
  def update(table: String, values: js.Object): Fragment = js.native
  @JSImport("sql-template", "update")
  @js.native
  def update(table: String, values: js.Object, where: js.Any): Fragment = js.native
  
  type ChainFn = js.Function2[/* values */ js.Array[js.Any], /* part */ String, String]
  
  @js.native
  trait Fragment extends StObject {
    
    var raw: String = js.native
    
    var text: String = js.native
    
    var values: js.UndefOr[js.Array[_]] = js.native
  }
  object Fragment {
    
    @scala.inline
    def apply(raw: String, text: String): Fragment = {
      val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fragment]
    }
    
    @scala.inline
    implicit class FragmentMutableBuilder[Self <: Fragment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: js.Array[_]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  type Transformer = js.Function3[/* values */ js.Array[js.Any], /* str */ String, /* chain */ ChainFn, Unit]
}
