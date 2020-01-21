package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HTTPHeader describes a custom header to be used in HTTP probes
  */
trait HTTPHeader extends js.Object {
  /**
    * The header field name
    */
  var name: Input[String]
  /**
    * The header field value
    */
  var value: Input[String]
}

object HTTPHeader {
  @scala.inline
  def apply(name: Input[String], value: Input[String]): HTTPHeader = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HTTPHeader]
  }
}

