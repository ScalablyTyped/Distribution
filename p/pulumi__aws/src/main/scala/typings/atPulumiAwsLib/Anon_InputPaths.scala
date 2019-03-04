package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InputPaths extends js.Object {
  var inputPaths: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var inputTemplate: java.lang.String
}

object Anon_InputPaths {
  @scala.inline
  def apply(
    inputTemplate: java.lang.String,
    inputPaths: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_InputPaths = {
    val __obj = js.Dynamic.literal(inputTemplate = inputTemplate)
    if (inputPaths != null) __obj.updateDynamic("inputPaths")(inputPaths)
    __obj.asInstanceOf[Anon_InputPaths]
  }
}

