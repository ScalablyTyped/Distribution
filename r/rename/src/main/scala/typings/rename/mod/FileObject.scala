package typings.rename.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileObject extends js.Object {
  
  var basename: js.UndefOr[String] = js.native
  
  // using package's terminology
  var dirname: js.UndefOr[String] = js.native
  
  var extname: js.UndefOr[String] = js.native
  
  var hash: js.UndefOr[String] = js.native
  
  var path: js.UndefOr[String] = js.native
}
object FileObject {
  
  @scala.inline
  def apply(): FileObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileObject]
  }
  
  @scala.inline
  implicit class FileObjectOps[Self <: FileObject] (val x: Self) extends AnyVal {
    
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
    def setBasename(value: String): Self = this.set("basename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasename: Self = this.set("basename", js.undefined)
    
    @scala.inline
    def setDirname(value: String): Self = this.set("dirname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirname: Self = this.set("dirname", js.undefined)
    
    @scala.inline
    def setExtname(value: String): Self = this.set("extname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtname: Self = this.set("extname", js.undefined)
    
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
}
