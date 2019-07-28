package typings.split2

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object split2Mod {
  type Mapper = js.Function1[/* line */ String, js.Any]
  type Matcher = String | RegExp
}
