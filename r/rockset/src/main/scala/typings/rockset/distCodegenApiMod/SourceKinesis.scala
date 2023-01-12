package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceKinesis extends StObject {
  
  /**
    * AWS region name of Kinesis stream, by default us-west-2 is used
    * @type {string}
    * @memberof SourceKinesis
    */
  var aws_region: js.UndefOr[String] = js.undefined
  
  /**
    * name of kinesis stream
    * @type {string}
    * @memberof SourceKinesis
    */
  var stream_name: String
}
object SourceKinesis {
  
  inline def apply(stream_name: String): SourceKinesis = {
    val __obj = js.Dynamic.literal(stream_name = stream_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceKinesis]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceKinesis] (val x: Self) extends AnyVal {
    
    inline def setAws_region(value: String): Self = StObject.set(x, "aws_region", value.asInstanceOf[js.Any])
    
    inline def setAws_regionUndefined: Self = StObject.set(x, "aws_region", js.undefined)
    
    inline def setStream_name(value: String): Self = StObject.set(x, "stream_name", value.asInstanceOf[js.Any])
  }
}
