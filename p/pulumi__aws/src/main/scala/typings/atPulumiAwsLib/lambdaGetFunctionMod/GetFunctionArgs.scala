package typings
package atPulumiAwsLib.lambdaGetFunctionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFunctionArgs extends js.Object {
  /**
    * Name of the lambda function.
    */
  val functionName: java.lang.String
  /**
    * Qualifier of the lambda function. Defaults to `$LATEST`.
    */
  val qualifier: js.UndefOr[java.lang.String] = js.undefined
}

