package typings.storybookApi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilename
  extends /* parameterName */ StringDictionary[js.Any] {
  var filename: String
  var options: AnonHierarchyRootSeparator
}

object AnonFilename {
  @scala.inline
  def apply(
    filename: String,
    options: AnonHierarchyRootSeparator,
    StringDictionary: /* parameterName */ StringDictionary[js.Any] = null
  ): AnonFilename = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonFilename]
  }
}

