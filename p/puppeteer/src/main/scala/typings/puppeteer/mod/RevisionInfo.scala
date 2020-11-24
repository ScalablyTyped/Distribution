package typings.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevisionInfo extends js.Object {
  
  /** Path to the revision executable */
  var executablePath: String = js.native
  
  /** Path to the extracted revision folder */
  var folderPath: String = js.native
  
  /** whether the revision is locally available on disk */
  var local: Boolean = js.native
  
  var product: Product_ = js.native
  
  /** The revision the info was created from */
  var revision: String = js.native
  
  /** URL this revision can be downloaded from */
  var url: String = js.native
}
object RevisionInfo {
  
  @scala.inline
  def apply(
    executablePath: String,
    folderPath: String,
    local: Boolean,
    product: Product_,
    revision: String,
    url: String
  ): RevisionInfo = {
    val __obj = js.Dynamic.literal(executablePath = executablePath.asInstanceOf[js.Any], folderPath = folderPath.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevisionInfo]
  }
  
  @scala.inline
  implicit class RevisionInfoOps[Self <: RevisionInfo] (val x: Self) extends AnyVal {
    
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
    def setExecutablePath(value: String): Self = this.set("executablePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderPath(value: String): Self = this.set("folderPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocal(value: Boolean): Self = this.set("local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProduct(value: Product_): Self = this.set("product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: String): Self = this.set("revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
