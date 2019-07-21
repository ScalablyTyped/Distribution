package typings
package rocksetLib.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceKinesis extends js.Object {
  // AWS region name of Kinesis stream, by default us-west-2 is used
  var aws_region: js.UndefOr[java.lang.String] = js.undefined
  // name of kinesis stream
  var stream_name: java.lang.String
}

object SourceKinesis {
  @scala.inline
  def apply(stream_name: java.lang.String, aws_region: java.lang.String = null): SourceKinesis = {
    val __obj = js.Dynamic.literal(stream_name = stream_name)
    if (aws_region != null) __obj.updateDynamic("aws_region")(aws_region)
    __obj.asInstanceOf[SourceKinesis]
  }
}

