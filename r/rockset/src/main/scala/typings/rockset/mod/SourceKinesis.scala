package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceKinesis extends js.Object {
  
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
  implicit class SourceKinesisOps[Self <: SourceKinesis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStream_name(value: String): Self = this.set("stream_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAws_region(value: String): Self = this.set("aws_region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAws_region: Self = this.set("aws_region", js.undefined)
  }
}
