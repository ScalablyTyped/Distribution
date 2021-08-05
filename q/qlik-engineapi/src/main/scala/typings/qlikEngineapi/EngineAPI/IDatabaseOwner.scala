package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DatabaseOwner...
  */
trait IDatabaseOwner extends StObject {
  
  /**
    * Name of the owner
    */
  var qName: String
}
object IDatabaseOwner {
  
  inline def apply(qName: String): IDatabaseOwner = {
    val __obj = js.Dynamic.literal(qName = qName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatabaseOwner]
  }
  
  extension [Self <: IDatabaseOwner](x: Self) {
    
    inline def setQName(value: String): Self = StObject.set(x, "qName", value.asInstanceOf[js.Any])
  }
}
