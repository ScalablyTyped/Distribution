package typings.puppeteer.anon

import typings.puppeteer.productMod.Product
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  projectRoot :string | undefined,   preferredRevision :string,   productName :puppeteer.puppeteer/lib/cjs/puppeteer/common/Product.Product | undefined} & puppeteer.puppeteer/lib/cjs/puppeteer/common/Puppeteer.CommonPuppeteerSettings */
trait projectRootstringundefine extends StObject {
  
  var isPuppeteerCore: Boolean
  
  var preferredRevision: String
  
  var productName: js.UndefOr[Product] = js.undefined
  
  var projectRoot: js.UndefOr[String] = js.undefined
}
object projectRootstringundefine {
  
  inline def apply(isPuppeteerCore: Boolean, preferredRevision: String): projectRootstringundefine = {
    val __obj = js.Dynamic.literal(isPuppeteerCore = isPuppeteerCore.asInstanceOf[js.Any], preferredRevision = preferredRevision.asInstanceOf[js.Any])
    __obj.asInstanceOf[projectRootstringundefine]
  }
  
  extension [Self <: projectRootstringundefine](x: Self) {
    
    inline def setIsPuppeteerCore(value: Boolean): Self = StObject.set(x, "isPuppeteerCore", value.asInstanceOf[js.Any])
    
    inline def setPreferredRevision(value: String): Self = StObject.set(x, "preferredRevision", value.asInstanceOf[js.Any])
    
    inline def setProductName(value: Product): Self = StObject.set(x, "productName", value.asInstanceOf[js.Any])
    
    inline def setProductNameUndefined: Self = StObject.set(x, "productName", js.undefined)
    
    inline def setProjectRoot(value: String): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
    
    inline def setProjectRootUndefined: Self = StObject.set(x, "projectRoot", js.undefined)
  }
}
