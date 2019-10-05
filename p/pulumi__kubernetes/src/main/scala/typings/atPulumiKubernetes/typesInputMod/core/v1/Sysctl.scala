package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sysctl defines a kernel parameter to be set
  */
trait Sysctl extends js.Object {
  /**
    * Name of a property to set
    */
  var name: Input[String]
  /**
    * Value of a property to set
    */
  var value: Input[String]
}

object Sysctl {
  @scala.inline
  def apply(name: Input[String], value: Input[String]): Sysctl = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Sysctl]
  }
}

