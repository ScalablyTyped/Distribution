package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxGetBookmarkOptions.
  */
@js.native
trait INxGetBookmarkOptions extends StObject {
  
  /**
    * Set of data.
    */
  var qData: js.Any = js.native
  
  /**
    * List of object types..
    */
  var qTypes: js.Array[String] = js.native
}
object INxGetBookmarkOptions {
  
  @scala.inline
  def apply(qData: js.Any, qTypes: js.Array[String]): INxGetBookmarkOptions = {
    val __obj = js.Dynamic.literal(qData = qData.asInstanceOf[js.Any], qTypes = qTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxGetBookmarkOptions]
  }
  
  @scala.inline
  implicit class INxGetBookmarkOptionsMutableBuilder[Self <: INxGetBookmarkOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQData(value: js.Any): Self = StObject.set(x, "qData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTypes(value: js.Array[String]): Self = StObject.set(x, "qTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTypesVarargs(value: String*): Self = StObject.set(x, "qTypes", js.Array(value :_*))
  }
}
