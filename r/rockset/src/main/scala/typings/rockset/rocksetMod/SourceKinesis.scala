package typings.rockset.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceKinesis extends js.Object {
  // AWS region name of Kinesis stream, by default us-west-2 is used
  var aws_region: js.UndefOr[String] = js.undefined
  // name of kinesis stream
  var stream_name: String
}

object SourceKinesis {
  @scala.inline
  def apply(stream_name: String, aws_region: String = null): SourceKinesis = {
    val __obj = js.Dynamic.literal(stream_name = stream_name.asInstanceOf[js.Any])
    if (aws_region != null) __obj.updateDynamic("aws_region")(aws_region.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceKinesis]
  }
}

