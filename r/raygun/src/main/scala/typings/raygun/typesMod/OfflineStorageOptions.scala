package typings.raygun.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OfflineStorageOptions extends StObject {
  
  var cacheLimit: js.UndefOr[Double] = js.native
  
  var cachePath: String = js.native
}
object OfflineStorageOptions {
  
  @scala.inline
  def apply(cachePath: String): OfflineStorageOptions = {
    val __obj = js.Dynamic.literal(cachePath = cachePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfflineStorageOptions]
  }
  
  @scala.inline
  implicit class OfflineStorageOptionsMutableBuilder[Self <: OfflineStorageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheLimit(value: Double): Self = StObject.set(x, "cacheLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheLimitUndefined: Self = StObject.set(x, "cacheLimit", js.undefined)
    
    @scala.inline
    def setCachePath(value: String): Self = StObject.set(x, "cachePath", value.asInstanceOf[js.Any])
  }
}
