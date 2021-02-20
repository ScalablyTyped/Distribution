package typings.rollup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputPluginValueHooks extends StObject {
  
  var banner: AddonHook = js.native
  
  var cacheKey: String = js.native
  
  var footer: AddonHook = js.native
  
  var intro: AddonHook = js.native
  
  var outro: AddonHook = js.native
}
object OutputPluginValueHooks {
  
  @scala.inline
  def apply(banner: AddonHook, cacheKey: String, footer: AddonHook, intro: AddonHook, outro: AddonHook): OutputPluginValueHooks = {
    val __obj = js.Dynamic.literal(banner = banner.asInstanceOf[js.Any], cacheKey = cacheKey.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], intro = intro.asInstanceOf[js.Any], outro = outro.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputPluginValueHooks]
  }
  
  @scala.inline
  implicit class OutputPluginValueHooksMutableBuilder[Self <: OutputPluginValueHooks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBanner(value: AddonHook): Self = StObject.set(x, "banner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheKey(value: String): Self = StObject.set(x, "cacheKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooter(value: AddonHook): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntro(value: AddonHook): Self = StObject.set(x, "intro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutro(value: AddonHook): Self = StObject.set(x, "outro", value.asInstanceOf[js.Any])
  }
}
