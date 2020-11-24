package typings.resolve.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncOpts extends Opts {
  
  /** function to asynchronously test whether a directory exists */
  var isDirectory: js.UndefOr[js.Function2[/* directory */ String, /* cb */ existsCallback, Unit]] = js.native
  
  /** function to asynchronously test whether a file exists */
  var isFile: js.UndefOr[js.Function2[/* file */ String, /* cb */ existsCallback, Unit]] = js.native
  
  /** how to read files asynchronously (defaults to fs.readFile) */
  var readFile: js.UndefOr[js.Function2[/* file */ String, /* cb */ readFileCallback, Unit]] = js.native
  
  /** function to asynchronously resolve a potential symlink to its real path */
  var realpath: js.UndefOr[js.Function2[/* file */ String, /* cb */ realpathCallback, Unit]] = js.native
}
object AsyncOpts {
  
  @scala.inline
  def apply(): AsyncOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncOpts]
  }
  
  @scala.inline
  implicit class AsyncOptsOps[Self <: AsyncOpts] (val x: Self) extends AnyVal {
    
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
    def setIsDirectory(value: (/* directory */ String, /* cb */ existsCallback) => Unit): Self = this.set("isDirectory", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteIsDirectory: Self = this.set("isDirectory", js.undefined)
    
    @scala.inline
    def setIsFile(value: (/* file */ String, /* cb */ existsCallback) => Unit): Self = this.set("isFile", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteIsFile: Self = this.set("isFile", js.undefined)
    
    @scala.inline
    def setReadFile(value: (/* file */ String, /* cb */ readFileCallback) => Unit): Self = this.set("readFile", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteReadFile: Self = this.set("readFile", js.undefined)
    
    @scala.inline
    def setRealpath(value: (/* file */ String, /* cb */ realpathCallback) => Unit): Self = this.set("realpath", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRealpath: Self = this.set("realpath", js.undefined)
  }
}
