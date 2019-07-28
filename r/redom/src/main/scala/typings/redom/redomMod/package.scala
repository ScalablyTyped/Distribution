package typings.redom

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object redomMod {
  type RedomElement = Node | RedomComponent
  type RedomMiddleware = js.Function1[/* el */ HTMLElement, Unit]
  type RedomQuery = String | RedomElement
  type RedomQueryArgument = RedomQueryArgumentValue | js.Array[RedomQueryArgumentValue]
  type RedomQueryArgumentValue = RedomElement | String | Double | StringDictionary[js.Any] | RedomMiddleware
  type RouterDictionary = StringDictionary[RedomComponentConstructor]
}
