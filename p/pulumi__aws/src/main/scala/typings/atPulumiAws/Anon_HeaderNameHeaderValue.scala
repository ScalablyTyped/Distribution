package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeaderNameHeaderValue extends js.Object {
  var headerName: Input[String]
  var headerValue: Input[String]
  var position: Input[Double]
}

object Anon_HeaderNameHeaderValue {
  @scala.inline
  def apply(headerName: Input[String], headerValue: Input[String], position: Input[Double]): Anon_HeaderNameHeaderValue = {
    val __obj = js.Dynamic.literal(headerName = headerName.asInstanceOf[js.Any], headerValue = headerValue.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_HeaderNameHeaderValue]
  }
}

