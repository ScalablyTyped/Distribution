package typings.stamplayJsSdk

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Stamplay {
  
  @js.native
  trait Model
    extends StObject
       with Instantiable0[Model] {
    
    def destroy(): js.Promise[Any] = js.native
    
    def fetch(id: Any): js.Promise[Any] = js.native
    
    // This is suspicious, but tests show model instances being constructable...
    def get(property: String): Any = js.native
    
    def save(): js.Promise[Any] = js.native
    def save(arg: Any): js.Promise[Any] = js.native
    
    def set(property: String, value: Any): Unit = js.native
    
    def signup(arg: Any): js.Promise[Any] = js.native
    
    def unset(property: String): Unit = js.native
    
    // TODO: Don't know what this is supposed to be.
    def upVote(): js.Promise[Any] = js.native
  }
  
  trait StamplayObject extends StObject {
    
    var Collection: Any
    
    var Model: typings.stamplayJsSdk.Stamplay.Model
  }
  object StamplayObject {
    
    inline def apply(Collection: Any, Model: Model): StamplayObject = {
      val __obj = js.Dynamic.literal(Collection = Collection.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any])
      __obj.asInstanceOf[StamplayObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StamplayObject] (val x: Self) extends AnyVal {
      
      inline def setCollection(value: Any): Self = StObject.set(x, "Collection", value.asInstanceOf[js.Any])
      
      inline def setModel(value: Model): Self = StObject.set(x, "Model", value.asInstanceOf[js.Any])
    }
  }
}
