package typings.reduxLocalstorageDebounce

import org.scalablytyped.runtime.StringDictionary
import typings.reduxLocalstorage.mod.StorageAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-localstorage-debounce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(wait: Double): js.Function1[/* adapter */ StorageAdapter[js.Any], StorageAdapter[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(wait.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* adapter */ StorageAdapter[js.Any], StorageAdapter[js.Any]]]
  @scala.inline
  def default(wait: Double, options: Double): js.Function1[/* adapter */ StorageAdapter[js.Any], StorageAdapter[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* adapter */ StorageAdapter[js.Any], StorageAdapter[js.Any]]]
  @scala.inline
  def default(wait: Double, options: DebounceOptions): js.Function1[/* adapter */ StorageAdapter[js.Any], StorageAdapter[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* adapter */ StorageAdapter[js.Any], StorageAdapter[js.Any]]]
  
  trait DebounceOptions
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var maxWait: js.UndefOr[Double] = js.undefined
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
