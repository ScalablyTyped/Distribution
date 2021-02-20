package typings.sharp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheOptions extends StObject {
  
  /** Is the maximum number of files to hold open (optional, default 20) */
  var files: js.UndefOr[Double] = js.native
  
  /** Is the maximum number of operations to cache (optional, default 100) */
  var items: js.UndefOr[Double] = js.native
  
  /** Is the maximum memory in MB to use for this cache (optional, default 50) */
  var memory: js.UndefOr[Double] = js.native
}
object CacheOptions {
  
  @scala.inline
  def apply(): CacheOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheOptions]
  }
  
  @scala.inline
  implicit class CacheOptionsMutableBuilder[Self <: CacheOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFiles(value: Double): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    @scala.inline
    def setItems(value: Double): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setMemory(value: Double): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
  }
}
