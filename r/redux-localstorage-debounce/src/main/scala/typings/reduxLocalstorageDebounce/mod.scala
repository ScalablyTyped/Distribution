package typings.reduxLocalstorageDebounce

import org.scalablytyped.runtime.StringDictionary
import typings.reduxLocalstorage.mod.StorageAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-localstorage-debounce", JSImport.Default)
  @js.native
  def default(wait: Double): js.Function1[/* adapter */ StorageAdapter[_], StorageAdapter[_]] = js.native
  @JSImport("redux-localstorage-debounce", JSImport.Default)
  @js.native
  def default(wait: Double, options: Double): js.Function1[/* adapter */ StorageAdapter[_], StorageAdapter[_]] = js.native
  @JSImport("redux-localstorage-debounce", JSImport.Default)
  @js.native
  def default(wait: Double, options: DebounceOptions): js.Function1[/* adapter */ StorageAdapter[_], StorageAdapter[_]] = js.native
  
  @js.native
  trait DebounceOptions
    extends /* key */ StringDictionary[js.Any] {
    
    var maxWait: js.UndefOr[Double] = js.native
  }
  object DebounceOptions {
    
    @scala.inline
    def apply(): DebounceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DebounceOptions]
    }
    
    @scala.inline
    implicit class DebounceOptionsMutableBuilder[Self <: DebounceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxWait(value: Double): Self = StObject.set(x, "maxWait", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWaitUndefined: Self = StObject.set(x, "maxWait", js.undefined)
    }
  }
}
