package typings.sdpTransform.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dir1 extends js.Object {
  
  var dir1: String = js.native
  
  var dir2: js.UndefOr[String] = js.native
  
  var list1: String = js.native
  
  var list2: js.UndefOr[String] = js.native
}
object Dir1 {
  
  @scala.inline
  def apply(dir1: String, list1: String): Dir1 = {
    val __obj = js.Dynamic.literal(dir1 = dir1.asInstanceOf[js.Any], list1 = list1.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dir1]
  }
  
  @scala.inline
  implicit class Dir1Ops[Self <: Dir1] (val x: Self) extends AnyVal {
    
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
    def setDir1(value: String): Self = this.set("dir1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setList1(value: String): Self = this.set("list1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDir2(value: String): Self = this.set("dir2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDir2: Self = this.set("dir2", js.undefined)
    
    @scala.inline
    def setList2(value: String): Self = this.set("list2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteList2: Self = this.set("list2", js.undefined)
  }
}
