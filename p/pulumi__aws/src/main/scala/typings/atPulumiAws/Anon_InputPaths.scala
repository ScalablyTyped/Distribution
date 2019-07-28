package typings.atPulumiAws

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InputPaths extends js.Object {
  var inputPaths: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var inputTemplate: String
}

object Anon_InputPaths {
  @scala.inline
  def apply(inputTemplate: String, inputPaths: StringDictionary[js.Any] = null): Anon_InputPaths = {
    val __obj = js.Dynamic.literal(inputTemplate = inputTemplate)
    if (inputPaths != null) __obj.updateDynamic("inputPaths")(inputPaths)
    __obj.asInstanceOf[Anon_InputPaths]
  }
}

