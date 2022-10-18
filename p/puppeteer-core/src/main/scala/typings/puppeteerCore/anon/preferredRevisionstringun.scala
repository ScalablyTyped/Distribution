package typings.puppeteerCore.anon

import typings.puppeteerCore.libCjsPuppeteerCommonProductMod.Product
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  preferredRevision :string | undefined,   productName :puppeteer-core.puppeteer-core/lib/cjs/puppeteer/common/Product.Product | undefined} & puppeteer-core.puppeteer-core/lib/cjs/puppeteer/common/Puppeteer.CommonPuppeteerSettings */
trait preferredRevisionstringun extends StObject {
  
  var isPuppeteerCore: Boolean
  
  var preferredRevision: js.UndefOr[String] = js.undefined
  
  var productName: js.UndefOr[Product] = js.undefined
}
object preferredRevisionstringun {
  
  inline def apply(isPuppeteerCore: Boolean): preferredRevisionstringun = {
    val __obj = js.Dynamic.literal(isPuppeteerCore = isPuppeteerCore.asInstanceOf[js.Any])
    __obj.asInstanceOf[preferredRevisionstringun]
  }
  
  extension [Self <: preferredRevisionstringun](x: Self) {
    
    inline def setIsPuppeteerCore(value: Boolean): Self = StObject.set(x, "isPuppeteerCore", value.asInstanceOf[js.Any])
    
    inline def setPreferredRevision(value: String): Self = StObject.set(x, "preferredRevision", value.asInstanceOf[js.Any])
    
    inline def setPreferredRevisionUndefined: Self = StObject.set(x, "preferredRevision", js.undefined)
    
    inline def setProductName(value: Product): Self = StObject.set(x, "productName", value.asInstanceOf[js.Any])
    
    inline def setProductNameUndefined: Self = StObject.set(x, "productName", js.undefined)
  }
}
