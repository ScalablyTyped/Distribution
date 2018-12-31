package typings
package atPulumiAwsLib.lambdaGetInvocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInvocationArgs extends js.Object {
  /**
    * The name of the lambda function.
    */
  val functionName: java.lang.String
  /**
    * A string in JSON format that is passed as payload to the lambda function.
    */
  val input: java.lang.String
  /**
    * The qualifier (a.k.a version) of the lambda function. Defaults
    * to `$LATEST`.
    */
  val qualifier: js.UndefOr[java.lang.String] = js.undefined
}

