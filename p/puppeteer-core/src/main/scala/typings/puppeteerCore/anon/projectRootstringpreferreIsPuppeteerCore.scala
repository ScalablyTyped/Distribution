package typings.puppeteerCore.anon

import typings.puppeteerCore.commonProductMod.Product
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  projectRoot :string,   preferredRevision :string,   productName :puppeteer-core.puppeteer-core/lib/esm/puppeteer/common/Product.Product | undefined} & puppeteer-core.puppeteer-core/lib/esm/puppeteer/common/Puppeteer.CommonPuppeteerSettings */
trait projectRootstringpreferreIsPuppeteerCore extends StObject {
  
  var isPuppeteerCore: Boolean
  
  var preferredRevision: String
  
  var productName: js.UndefOr[Product] = js.undefined
  
  var projectRoot: String
}
object projectRootstringpreferreIsPuppeteerCore {
  
  @scala.inline
  def apply(isPuppeteerCore: Boolean, preferredRevision: String, projectRoot: String): projectRootstringpreferreIsPuppeteerCore = {
    val __obj = js.Dynamic.literal(isPuppeteerCore = isPuppeteerCore.asInstanceOf[js.Any], preferredRevision = preferredRevision.asInstanceOf[js.Any], projectRoot = projectRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[projectRootstringpreferreIsPuppeteerCore]
  }
  
  @scala.inline
  implicit class projectRootstringpreferreIsPuppeteerCoreMutableBuilder[Self <: projectRootstringpreferreIsPuppeteerCore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsPuppeteerCore(value: Boolean): Self = StObject.set(x, "isPuppeteerCore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredRevision(value: String): Self = StObject.set(x, "preferredRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductName(value: Product): Self = StObject.set(x, "productName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductNameUndefined: Self = StObject.set(x, "productName", js.undefined)
    
    @scala.inline
    def setProjectRoot(value: String): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
  }
}
