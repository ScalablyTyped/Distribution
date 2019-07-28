package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultValueDimensionNameValueSource extends js.Object {
  var defaultValue: Input[String]
  var dimensionName: Input[String]
  var valueSource: Input[String]
}

object Anon_DefaultValueDimensionNameValueSource {
  @scala.inline
  def apply(defaultValue: Input[String], dimensionName: Input[String], valueSource: Input[String]): Anon_DefaultValueDimensionNameValueSource = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], dimensionName = dimensionName.asInstanceOf[js.Any], valueSource = valueSource.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DefaultValueDimensionNameValueSource]
  }
}

