package typings
package remarkableLib.libMod.RemarkableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BlockContentToken extends TagToken {
  /**
           * This is initialized with an empty array (`[]`) and will be filled
           * with the inline parser tokens as the inline parsing rules are applied.
           */
  var children: js.Array[Token]
  /**
           * The content of the block. This might include inline mardown syntax
           * which may need further processing by the inline rules.
           */
  var content: java.lang.String
}

