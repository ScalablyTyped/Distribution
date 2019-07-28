package typings.atPulumiAws.lambdaGetFunctionMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFunctionArgs extends js.Object {
  /**
    * Name of the lambda function.
    */
  val functionName: String
  /**
    * Alias name or version number of the lambda function. e.g. `$LATEST`, `my-alias`, or `1`
    */
  val qualifier: js.UndefOr[String] = js.undefined
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object GetFunctionArgs {
  @scala.inline
  def apply(functionName: String, qualifier: String = null, tags: StringDictionary[js.Any] = null): GetFunctionArgs = {
    val __obj = js.Dynamic.literal(functionName = functionName)
    if (qualifier != null) __obj.updateDynamic("qualifier")(qualifier)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetFunctionArgs]
  }
}

