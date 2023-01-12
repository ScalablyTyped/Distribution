package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxGetBookmarkOptions.
  */
trait INxGetBookmarkOptions extends StObject {
  
  /**
    * Set of data.
    */
  var qData: Any
  
  /**
    * List of object types..
    */
  var qTypes: js.Array[String]
}
object INxGetBookmarkOptions {
  
  inline def apply(qData: Any, qTypes: js.Array[String]): INxGetBookmarkOptions = {
    val __obj = js.Dynamic.literal(qData = qData.asInstanceOf[js.Any], qTypes = qTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxGetBookmarkOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: INxGetBookmarkOptions] (val x: Self) extends AnyVal {
    
    inline def setQData(value: Any): Self = StObject.set(x, "qData", value.asInstanceOf[js.Any])
    
    inline def setQTypes(value: js.Array[String]): Self = StObject.set(x, "qTypes", value.asInstanceOf[js.Any])
    
    inline def setQTypesVarargs(value: String*): Self = StObject.set(x, "qTypes", js.Array(value*))
  }
}
