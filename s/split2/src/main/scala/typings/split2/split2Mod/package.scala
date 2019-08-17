package typings.split2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object split2Mod {
  import typings.std.RegExp

  type Mapper = js.Function1[/* line */ String, js.Any]
  type Matcher = String | RegExp
}
