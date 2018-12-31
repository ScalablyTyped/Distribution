package typings
package atPulumiAwsLib.lambdaGetInvocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInvocationResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * A result of the lambda function invocation.
    */
  val result: java.lang.String
  /**
    * This field is set only if result is a map of primitive types.
    */
  val resultMap: org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

