package typings.stremioAddonSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheMaxAge extends StObject {
  
  /**
    * (in seconds) cacheMaxAge means the Cache-Control header being set to max-age=$cacheMaxAge
    */
  var cacheMaxAge: js.UndefOr[Double] = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  /**
    * Static directory to serve.
    */
  var static: js.UndefOr[String] = js.native
}
object CacheMaxAge {
  
  @scala.inline
  def apply(): CacheMaxAge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheMaxAge]
  }
  
  @scala.inline
  implicit class CacheMaxAgeMutableBuilder[Self <: CacheMaxAge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheMaxAge(value: Double): Self = StObject.set(x, "cacheMaxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheMaxAgeUndefined: Self = StObject.set(x, "cacheMaxAge", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setStatic(value: String): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
  }
}
