package typings.storybookApi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictparameterName
  extends /* parameterName */ StringDictionary[js.Any] {
  var filename: String
  var options: AnonDictkey
}

object AnonDictparameterName {
  @scala.inline
  def apply(
    filename: String,
    options: AnonDictkey,
    StringDictionary: /* parameterName */ StringDictionary[js.Any] = null
  ): AnonDictparameterName = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonDictparameterName]
  }
}

