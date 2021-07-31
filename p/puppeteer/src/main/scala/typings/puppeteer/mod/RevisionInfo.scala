package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevisionInfo extends StObject {
  
  /** Path to the revision executable */
  var executablePath: String
  
  /** Path to the extracted revision folder */
  var folderPath: String
  
  /** whether the revision is locally available on disk */
  var local: Boolean
  
  var product: Product_
  
  /** The revision the info was created from */
  var revision: String
  
  /** URL this revision can be downloaded from */
  var url: String
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
  implicit class RevisionInfoMutableBuilder[Self <: RevisionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecutablePath(value: String): Self = StObject.set(x, "executablePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderPath(value: String): Self = StObject.set(x, "folderPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProduct(value: Product_): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
