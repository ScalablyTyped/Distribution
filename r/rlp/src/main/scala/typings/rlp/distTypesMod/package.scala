package typings.rlp

import typings.bnDotJs.bnDotJsMod.^
import typings.node.Buffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  /* Rewritten from type alias, can be one of: 
    - typings.node.Buffer
    - java.lang.String
    - scala.Double
    - typings.std.Uint8Array
    - typings.bnDotJs.bnDotJsMod.^
    - typings.rlp.distTypesMod.Dictionary
    - typings.rlp.distTypesMod.List
    - scala.Null
  */
  type Input = _Input | Buffer | String | Double | Uint8Array | ^  | Null
}
