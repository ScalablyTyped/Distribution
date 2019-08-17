package typings.pug

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pugMod {
  import org.scalablytyped.runtime.StringDictionary

  type LocalsObject = StringDictionary[js.Any]
  type compileTemplate = js.Function1[/* locals */ js.UndefOr[LocalsObject], String]
}
