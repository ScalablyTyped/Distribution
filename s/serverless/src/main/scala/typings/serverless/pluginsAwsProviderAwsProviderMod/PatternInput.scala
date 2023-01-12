package typings.serverless.pluginsAwsProviderAwsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatternInput extends StObject {
  
  var detail: Detail
  
  var `detail-type`: js.Array[String]
  
  var source: js.Array[String]
}
object PatternInput {
  
  inline def apply(detail: Detail, `detail-type`: js.Array[String], source: js.Array[String]): PatternInput = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("detail-type")(`detail-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatternInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PatternInput] (val x: Self) extends AnyVal {
    
    inline def setDetail(value: Detail): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def `setDetail-type`(value: js.Array[String]): Self = StObject.set(x, "detail-type", value.asInstanceOf[js.Any])
    
    inline def `setDetail-typeVarargs`(value: String*): Self = StObject.set(x, "detail-type", js.Array(value*))
    
    inline def setSource(value: js.Array[String]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceVarargs(value: String*): Self = StObject.set(x, "source", js.Array(value*))
  }
}
