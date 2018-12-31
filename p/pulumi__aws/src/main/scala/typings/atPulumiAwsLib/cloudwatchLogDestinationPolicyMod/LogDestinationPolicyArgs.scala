package typings
package atPulumiAwsLib.cloudwatchLogDestinationPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogDestinationPolicyArgs extends js.Object {
  /**
    * The policy document. This is a JSON formatted string.
    */
  val accessPolicy: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * A name for the subscription filter
    */
  val destinationName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

