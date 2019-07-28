package typings.riot

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object riotMod {
  type NestedTags = StringDictionary[TagInstance | js.Array[TagInstance]]
  type ObservableCallback = js.Function1[/* repeated */ js.Any, js.Any]
  type TagOpts = StringDictionary[js.Any]
  type TagRefs = StringDictionary[TagInstance | Element]
}
