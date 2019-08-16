package typings.rfc4648

import typings.rfc4648.Anon_Loose
import typings.rfc4648.Anon_Pad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rfc4648Mod {
  type parseBase = js.Function2[/* data */ String, /* options */ js.UndefOr[Anon_Loose[js.Any]], js.Any]
  type stringifyBase = js.Function2[/* data */ js.Object, /* options */ js.UndefOr[Anon_Pad], String]
}
