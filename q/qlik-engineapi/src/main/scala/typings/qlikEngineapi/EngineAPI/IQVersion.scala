package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IQVersion extends StObject {
  
  var qComponentVersion: String
}
object IQVersion {
  
  inline def apply(qComponentVersion: String): IQVersion = {
    val __obj = js.Dynamic.literal(qComponentVersion = qComponentVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQVersion]
  }
  
  extension [Self <: IQVersion](x: Self) {
    
    inline def setQComponentVersion(value: String): Self = StObject.set(x, "qComponentVersion", value.asInstanceOf[js.Any])
  }
}
