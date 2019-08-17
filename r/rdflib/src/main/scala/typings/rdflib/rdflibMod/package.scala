package typings.rdflib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rdflibMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Date

  type Bindings = StringDictionary[Node]
  type ValueType = js.UndefOr[Node | Date | String | Double | Boolean]
}
