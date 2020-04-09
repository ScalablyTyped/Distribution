package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLaunchTemplateFilter extends js.Object {
  /**
    * The name of the filter field. Valid values can be found in the [EC2 DescribeLaunchTemplates API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeLaunchTemplates.html).
    */
  var name: String = js.native
  /**
    * Set of values that are accepted for the given filter field. Results will be selected if any given value matches.
    */
  var values: js.Array[String] = js.native
}

object GetLaunchTemplateFilter {
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetLaunchTemplateFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetLaunchTemplateFilter]
  }
}

