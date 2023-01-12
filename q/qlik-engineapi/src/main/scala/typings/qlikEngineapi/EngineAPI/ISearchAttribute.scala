package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SearchAttribute...
  */
trait ISearchAttribute extends StObject {
  
  /**
    * String corresponding to
    * SearchObjectOptions.qAttributes
    * It will be qProperty for SearchObjectOptions.
    */
  var qKey: String
  
  /**
    * String corresponding to qKey for the current SearchGroupItemMatch.
    * For example, if the match is Make by Price found in the title of a generic object, qValue will be qMetaDef/title.
    */
  var qValue: String
}
object ISearchAttribute {
  
  inline def apply(qKey: String, qValue: String): ISearchAttribute = {
    val __obj = js.Dynamic.literal(qKey = qKey.asInstanceOf[js.Any], qValue = qValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchAttribute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISearchAttribute] (val x: Self) extends AnyVal {
    
    inline def setQKey(value: String): Self = StObject.set(x, "qKey", value.asInstanceOf[js.Any])
    
    inline def setQValue(value: String): Self = StObject.set(x, "qValue", value.asInstanceOf[js.Any])
  }
}
