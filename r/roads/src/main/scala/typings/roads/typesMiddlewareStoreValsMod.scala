package typings.roads

import typings.roads.typesCoreRoadMod.Middleware
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMiddlewareStoreValsMod {
  
  @JSImport("roads/types/middleware/storeVals", "middleware")
  @js.native
  val middleware: Middleware[StoreValsContext] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: unknown} */ trait StoreValsContext extends StObject {
    
    /**
      * Retrieves all values
      */
    def getAllVals(): Record[String, Any]
    
    /**
      * Retrieves a value
      * @param field string
      */
    def getVal(field: String): Any
    
    /**
      * Stores a value
      * @param field string
      * @param val unknown
      */
    def storeVal(field: String, `val`: Any): Unit
  }
  object StoreValsContext {
    
    inline def apply(getAllVals: () => Record[String, Any], getVal: String => Any, storeVal: (String, Any) => Unit): StoreValsContext = {
      val __obj = js.Dynamic.literal(getAllVals = js.Any.fromFunction0(getAllVals), getVal = js.Any.fromFunction1(getVal), storeVal = js.Any.fromFunction2(storeVal))
      __obj.asInstanceOf[StoreValsContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StoreValsContext] (val x: Self) extends AnyVal {
      
      inline def setGetAllVals(value: () => Record[String, Any]): Self = StObject.set(x, "getAllVals", js.Any.fromFunction0(value))
      
      inline def setGetVal(value: String => Any): Self = StObject.set(x, "getVal", js.Any.fromFunction1(value))
      
      inline def setStoreVal(value: (String, Any) => Unit): Self = StObject.set(x, "storeVal", js.Any.fromFunction2(value))
    }
  }
}
