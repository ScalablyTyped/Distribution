package typings.rlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  /* Rewritten from type alias, can be one of: 
    - typings.node.Buffer
    - java.lang.String
    - scala.Double
    - typings.std.Uint8Array
    - typings.bnJs.mod.^
    - typings.rlp.typesMod.Dictionary
    - typings.rlp.typesMod.List
    - scala.Null
  */
  type Input = typings.rlp.typesMod._Input | typings.node.Buffer | java.lang.String | scala.Double | typings.std.Uint8Array | typings.bnJs.mod.^  | scala.Null
}
