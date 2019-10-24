package typings.rfc4648

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rfc4648Mod {
  import typings.rfc4648.Anon_Loose
  import typings.rfc4648.Anon_Pad
  import typings.std.Uint8Array

  type parseBase = js.Function2[/* data */ String, /* options */ js.UndefOr[Anon_Loose[Uint8Array]], Uint8Array]
  type stringifyBase = js.Function2[/* data */ js.Object, /* options */ js.UndefOr[Anon_Pad], String]
}
