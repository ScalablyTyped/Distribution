package typings.resolve.mod

import typings.node.Buffer
import typings.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyncOpts extends Opts {
  
  /** function to synchronously test whether a directory exists */
  var isDirectory: js.UndefOr[js.Function1[/* directory */ String, Boolean]] = js.native
  
  /** function to synchronously test whether a file exists */
  var isFile: js.UndefOr[js.Function1[/* file */ String, Boolean]] = js.native
  
  /** how to read files synchronously (defaults to fs.readFileSync) */
  var readFileSync: js.UndefOr[js.Function2[/* file */ String, /* encoding */ BufferEncoding, String | Buffer]] = js.native
  
  /** function to synchronously resolve a potential symlink to its real path */
  var realpathSync: js.UndefOr[js.Function1[/* file */ String, String]] = js.native
}
object SyncOpts {
  
  @scala.inline
  def apply(): SyncOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncOpts]
  }
  
  @scala.inline
  implicit class SyncOptsOps[Self <: SyncOpts] (val x: Self) extends AnyVal {
    
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
    def setIsDirectory(value: /* directory */ String => Boolean): Self = this.set("isDirectory", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsDirectory: Self = this.set("isDirectory", js.undefined)
    
    @scala.inline
    def setIsFile(value: /* file */ String => Boolean): Self = this.set("isFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsFile: Self = this.set("isFile", js.undefined)
    
    @scala.inline
    def setReadFileSync(value: (/* file */ String, /* encoding */ BufferEncoding) => String | Buffer): Self = this.set("readFileSync", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteReadFileSync: Self = this.set("readFileSync", js.undefined)
    
    @scala.inline
    def setRealpathSync(value: /* file */ String => String): Self = this.set("realpathSync", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRealpathSync: Self = this.set("realpathSync", js.undefined)
  }
}
