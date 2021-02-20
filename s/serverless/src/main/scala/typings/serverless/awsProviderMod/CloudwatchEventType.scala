package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudwatchEventType extends StObject {
  
  var detail: Detail = js.native
  
  var `detail-type`: js.Array[String] = js.native
  
  var source: js.Array[String] = js.native
}
object CloudwatchEventType {
  
  @scala.inline
  def apply(detail: Detail, `detail-type`: js.Array[String], source: js.Array[String]): CloudwatchEventType = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("detail-type")(`detail-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudwatchEventType]
  }
  
  @scala.inline
  implicit class CloudwatchEventTypeMutableBuilder[Self <: CloudwatchEventType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetail(value: Detail): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDetail-type`(value: js.Array[String]): Self = StObject.set(x, "detail-type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDetail-typeVarargs`(value: String*): Self = StObject.set(x, "detail-type", js.Array(value :_*))
    
    @scala.inline
    def setSource(value: js.Array[String]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceVarargs(value: String*): Self = StObject.set(x, "source", js.Array(value :_*))
  }
}
