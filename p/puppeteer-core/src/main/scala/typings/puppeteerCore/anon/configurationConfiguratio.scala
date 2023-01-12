package typings.puppeteerCore.anon

import typings.puppeteerCore.libCjsPuppeteerCommonConfigurationMod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  configuration :puppeteer-core.puppeteer-core/lib/cjs/puppeteer/common/Configuration.Configuration | undefined} & puppeteer-core.puppeteer-core/lib/cjs/puppeteer/common/Puppeteer.CommonPuppeteerSettings */
trait configurationConfiguratio extends StObject {
  
  var configuration: js.UndefOr[Configuration] = js.undefined
  
  var isPuppeteerCore: Boolean
}
object configurationConfiguratio {
  
  inline def apply(isPuppeteerCore: Boolean): configurationConfiguratio = {
    val __obj = js.Dynamic.literal(isPuppeteerCore = isPuppeteerCore.asInstanceOf[js.Any])
    __obj.asInstanceOf[configurationConfiguratio]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: configurationConfiguratio] (val x: Self) extends AnyVal {
    
    inline def setConfiguration(value: Configuration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    inline def setIsPuppeteerCore(value: Boolean): Self = StObject.set(x, "isPuppeteerCore", value.asInstanceOf[js.Any])
  }
}
