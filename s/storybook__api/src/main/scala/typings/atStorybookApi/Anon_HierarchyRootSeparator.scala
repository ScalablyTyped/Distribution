package typings.atStorybookApi

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HierarchyRootSeparator
  extends /* key */ StringDictionary[js.Any] {
  var hierarchyRootSeparator: RegExp
  var hierarchySeparator: RegExp
}

object Anon_HierarchyRootSeparator {
  @scala.inline
  def apply(
    hierarchyRootSeparator: RegExp,
    hierarchySeparator: RegExp,
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): Anon_HierarchyRootSeparator = {
    val __obj = js.Dynamic.literal(hierarchyRootSeparator = hierarchyRootSeparator, hierarchySeparator = hierarchySeparator)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_HierarchyRootSeparator]
  }
}

