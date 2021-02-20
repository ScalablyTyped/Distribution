package typings.rcFieldForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Store extends StObject {
  
  var store: typings.rcFieldForm.interfaceMod.Store = js.native
}
object Store {
  
  @scala.inline
  def apply(store: typings.rcFieldForm.interfaceMod.Store): Store = {
    val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[Store]
  }
  
  @scala.inline
  implicit class StoreMutableBuilder[Self <: Store] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStore(value: typings.rcFieldForm.interfaceMod.Store): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
  }
}
