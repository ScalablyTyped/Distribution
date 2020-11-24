package typings.rcTable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Children[RecordType /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  children :std.Array<RecordType> | undefined} */ js.Any */] extends js.Object {
  
  var children: js.UndefOr[js.Array[RecordType]] = js.native
}
object Children {
  
  @scala.inline
  def apply[RecordType /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  children :std.Array<RecordType> | undefined} */ js.Any */](): Children[RecordType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Children[RecordType]]
  }
  
  @scala.inline
  implicit class ChildrenOps[Self <: Children[_], RecordType /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  children :std.Array<RecordType> | undefined} */ js.Any */] (val x: Self with Children[RecordType]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChildrenVarargs(value: RecordType*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[RecordType]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
}
