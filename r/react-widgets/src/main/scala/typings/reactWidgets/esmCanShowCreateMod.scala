package typings.reactWidgets

import typings.reactWidgets.esmAccessorsMod.Accessors
import typings.reactWidgets.esmSharedMod.AllowCreate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmCanShowCreateMod {
  
  @JSImport("react-widgets/esm/canShowCreate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(allowCreate: AllowCreate, param1: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(allowCreate.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait Options extends StObject {
    
    var accessors: Accessors
    
    var data: js.Array[Any]
    
    var dataItems: js.UndefOr[js.Array[Any]] = js.undefined
    
    var searchTerm: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(accessors: Accessors, data: js.Array[Any]): Options = {
      val __obj = js.Dynamic.literal(accessors = accessors.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAccessors(value: Accessors): Self = StObject.set(x, "accessors", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataItems(value: js.Array[Any]): Self = StObject.set(x, "dataItems", value.asInstanceOf[js.Any])
      
      inline def setDataItemsUndefined: Self = StObject.set(x, "dataItems", js.undefined)
      
      inline def setDataItemsVarargs(value: Any*): Self = StObject.set(x, "dataItems", js.Array(value*))
      
      inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setSearchTerm(value: String): Self = StObject.set(x, "searchTerm", value.asInstanceOf[js.Any])
      
      inline def setSearchTermUndefined: Self = StObject.set(x, "searchTerm", js.undefined)
    }
  }
}
