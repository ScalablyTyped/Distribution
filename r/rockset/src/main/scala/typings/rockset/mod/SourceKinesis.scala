package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceKinesis extends StObject {
  
  // AWS region name of Kinesis stream, by default us-west-2 is used
  var aws_region: js.UndefOr[String] = js.native
  
  // name of kinesis stream
  var stream_name: String = js.native
}
object SourceKinesis {
  
  @scala.inline
  def apply(stream_name: String): SourceKinesis = {
    val __obj = js.Dynamic.literal(stream_name = stream_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceKinesis]
  }
  
  @scala.inline
  implicit class SourceKinesisMutableBuilder[Self <: SourceKinesis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAws_region(value: String): Self = StObject.set(x, "aws_region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAws_regionUndefined: Self = StObject.set(x, "aws_region", js.undefined)
    
    @scala.inline
    def setStream_name(value: String): Self = StObject.set(x, "stream_name", value.asInstanceOf[js.Any])
  }
}
