package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Container for the dynamic properties of an attribute expression.
  */
@js.native
trait INxAxisTicks extends StObject {
  
  /**
    * Name of the derived definition.
    */
  var qName: String = js.native
  
  /**
    * List of tags.
    */
  var qTags: js.Array[String] = js.native
  
  /**
    * List of ticks.
    */
  var qTicks: js.Array[INxTickCell] = js.native
}
object INxAxisTicks {
  
  @scala.inline
  def apply(qName: String, qTags: js.Array[String], qTicks: js.Array[INxTickCell]): INxAxisTicks = {
    val __obj = js.Dynamic.literal(qName = qName.asInstanceOf[js.Any], qTags = qTags.asInstanceOf[js.Any], qTicks = qTicks.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxAxisTicks]
  }
  
  @scala.inline
  implicit class INxAxisTicksMutableBuilder[Self <: INxAxisTicks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQName(value: String): Self = StObject.set(x, "qName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTags(value: js.Array[String]): Self = StObject.set(x, "qTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTagsVarargs(value: String*): Self = StObject.set(x, "qTags", js.Array(value :_*))
    
    @scala.inline
    def setQTicks(value: js.Array[INxTickCell]): Self = StObject.set(x, "qTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTicksVarargs(value: INxTickCell*): Self = StObject.set(x, "qTicks", js.Array(value :_*))
  }
}
