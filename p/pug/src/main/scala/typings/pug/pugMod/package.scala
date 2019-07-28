package typings.pug

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pugMod {
  type LocalsObject = StringDictionary[js.Any]
  type compileTemplate = js.Function1[/* locals */ js.UndefOr[LocalsObject], String]
}
