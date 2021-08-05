package typings.rcTable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Children[RecordType /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  children :std.Array<RecordType> | undefined} */ js.Any */] extends StObject {
  
  var children: js.UndefOr[js.Array[RecordType]] = js.undefined
}
object Children {
  
  inline def apply[RecordType /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  children :std.Array<RecordType> | undefined} */ js.Any */](): Children[RecordType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Children[RecordType]]
  }
  
  extension [Self <: Children[?], RecordType /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  children :std.Array<RecordType> | undefined} */ js.Any */](x: Self & Children[RecordType]) {
    
    inline def setChildren(value: js.Array[RecordType]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: RecordType*): Self = StObject.set(x, "children", js.Array(value :_*))
  }
}
