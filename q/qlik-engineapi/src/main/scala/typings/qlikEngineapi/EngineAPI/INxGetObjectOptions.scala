package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxGetObjectOptions.
  */
trait INxGetObjectOptions extends StObject {
  
  /**
    * Set of data.
    */
  var qData: js.Any
  
  /**
    * Set to true to include session objects.
    *
    * Default: false
    */
  var qIncludeSessionObjects: Boolean
  
  /**
    * List of object types..
    */
  var qTypes: js.Array[String]
}
object INxGetObjectOptions {
  
  @scala.inline
  def apply(qData: js.Any, qIncludeSessionObjects: Boolean, qTypes: js.Array[String]): INxGetObjectOptions = {
    val __obj = js.Dynamic.literal(qData = qData.asInstanceOf[js.Any], qIncludeSessionObjects = qIncludeSessionObjects.asInstanceOf[js.Any], qTypes = qTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxGetObjectOptions]
  }
  
  @scala.inline
  implicit class INxGetObjectOptionsMutableBuilder[Self <: INxGetObjectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQData(value: js.Any): Self = StObject.set(x, "qData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQIncludeSessionObjects(value: Boolean): Self = StObject.set(x, "qIncludeSessionObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTypes(value: js.Array[String]): Self = StObject.set(x, "qTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTypesVarargs(value: String*): Self = StObject.set(x, "qTypes", js.Array(value :_*))
  }
}
