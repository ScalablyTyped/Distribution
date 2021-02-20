package typings.rcTable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Children[RecordType /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  children :std.Array<RecordType> | undefined} */ js.Any */] extends StObject {
  
  var children: js.UndefOr[js.Array[RecordType]] = js.native
}
object Children {
  
  @scala.inline
  def apply[RecordType /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  children :std.Array<RecordType> | undefined} */ js.Any */](): Children[RecordType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Children[RecordType]]
  }
  
  @scala.inline
  implicit class ChildrenMutableBuilder[Self <: Children[_], RecordType /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  children :std.Array<RecordType> | undefined} */ js.Any */] (val x: Self with Children[RecordType]) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[RecordType]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: RecordType*): Self = StObject.set(x, "children", js.Array(value :_*))
  }
}
