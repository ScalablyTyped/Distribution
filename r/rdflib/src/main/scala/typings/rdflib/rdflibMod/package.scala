package typings.rdflib

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rdflibMod {
  type Bindings = StringDictionary[Node]
  type ValueType = js.UndefOr[Node | Date | String | Double | Boolean]
}
