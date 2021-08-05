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
    
    def destroy(): js.Promise[js.Any] = js.native
    
    def fetch(id: js.Any): js.Promise[js.Any] = js.native
    
    // This is suspicious, but tests show model instances being constructable...
    def get(property: String): js.Any = js.native
    
    def save(): js.Promise[js.Any] = js.native
    def save(arg: js.Any): js.Promise[js.Any] = js.native
    
    def set(property: String, value: js.Any): Unit = js.native
    
    def signup(arg: js.Any): js.Promise[js.Any] = js.native
    
    def unset(property: String): Unit = js.native
    
    // TODO: Don't know what this is supposed to be.
    def upVote(): js.Promise[js.Any] = js.native
  }
  
  trait StamplayObject extends StObject {
    
    var Collection: js.Any
    
    var Model: typings.stamplayJsSdk.Stamplay.Model
  }
  object StamplayObject {
    
    inline def apply(Collection: js.Any, Model: Model): StamplayObject = {
      val __obj = js.Dynamic.literal(Collection = Collection.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any])
      __obj.asInstanceOf[StamplayObject]
    }
    
    extension [Self <: StamplayObject](x: Self) {
      
      inline def setCollection(value: js.Any): Self = StObject.set(x, "Collection", value.asInstanceOf[js.Any])
      
      inline def setModel(value: Model): Self = StObject.set(x, "Model", value.asInstanceOf[js.Any])
    }
  }
}
