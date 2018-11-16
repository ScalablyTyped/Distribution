package typings
package remarkableLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object RemarkableNs {
  type GetBreak = js.Function2[
    /* tokens */ js.Array[ContentToken], 
    /* idx */ scala.Double, 
    remarkableLib.remarkableLibStrings.Empty | remarkableLib.remarkableLibStrings.BACKSLASHn
  ]
  /**
       * Return `true` if the parsing function has recognized the current position
       * in the input as one if its tokens.
       */
  type ParsingRule = js.Function2[/* state */ ParsingState, /* silent */ scala.Boolean, scala.Boolean]
  type Plugin = js.Function2[
    /* md */ remarkableLib.libMod.Remarkable, 
    /* options */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  type Rule = js.Function4[
    /* tokens */ js.Array[ContentToken], 
    /* idx */ scala.Double, 
    /* options */ Options, 
    /* env */ Env, 
    java.lang.String
  ]
  type Token = (BlockContentToken | ContentToken | TagToken) with MiscTokenProps
}
