package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiCacheQueryOptions
  extends StObject
     with CacheQueryOptions {
  
  var cacheName: js.UndefOr[java.lang.String] = js.undefined
}
object MultiCacheQueryOptions {
  
  @scala.inline
  def apply(): MultiCacheQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiCacheQueryOptions]
  }
  
  @scala.inline
  implicit class MultiCacheQueryOptionsMutableBuilder[Self <: MultiCacheQueryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheName(value: java.lang.String): Self = StObject.set(x, "cacheName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheNameUndefined: Self = StObject.set(x, "cacheName", js.undefined)
  }
}
