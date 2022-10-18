package typings.sharedb.libSharedbMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientRequest
  extends StObject
     with // Users can use server middleware to add additional metadata to snapshots.
/* key */ StringDictionary[Any] {
  
  /** Short name of the request's action */
  var a: RequestAction
}
object ClientRequest {
  
  inline def apply(a: RequestAction): ClientRequest = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientRequest]
  }
  
  extension [Self <: ClientRequest](x: Self) {
    
    inline def setA(value: RequestAction): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
  }
}
