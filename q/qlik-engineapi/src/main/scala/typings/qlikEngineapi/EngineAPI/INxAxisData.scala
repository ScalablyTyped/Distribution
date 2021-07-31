package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxAxisData...
  */
trait INxAxisData extends StObject {
  
  /**
    * List of Axis data.
    */
  var qAxis: js.Array[INxAxisTicks]
}
object INxAxisData {
  
  @scala.inline
  def apply(qAxis: js.Array[INxAxisTicks]): INxAxisData = {
    val __obj = js.Dynamic.literal(qAxis = qAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxAxisData]
  }
  
  @scala.inline
  implicit class INxAxisDataMutableBuilder[Self <: INxAxisData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQAxis(value: js.Array[INxAxisTicks]): Self = StObject.set(x, "qAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQAxisVarargs(value: INxAxisTicks*): Self = StObject.set(x, "qAxis", js.Array(value :_*))
  }
}
