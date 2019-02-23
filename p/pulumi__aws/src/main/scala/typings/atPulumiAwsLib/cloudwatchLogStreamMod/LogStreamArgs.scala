package typings
package atPulumiAwsLib.cloudwatchLogStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogStreamArgs extends js.Object {
  /**
    * The name of the log group under which the log stream is to be created.
    */
  val logGroupName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The name of the log stream. Must not be longer than 512 characters and must not contain `:`
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

