package typings.atStorybookApi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Filename
  extends /* parameterName */ StringDictionary[js.Any] {
  var filename: String
  var options: Anon_HierarchyRootSeparator
}

object Anon_Filename {
  @scala.inline
  def apply(
    filename: String,
    options: Anon_HierarchyRootSeparator,
    StringDictionary: /* parameterName */ StringDictionary[js.Any] = null
  ): Anon_Filename = {
    val __obj = js.Dynamic.literal(filename = filename, options = options)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Filename]
  }
}

