package typings
package prettierLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object prettierMod {
  type AST = js.Any
  type BuiltInParser = js.Function2[/* text */ java.lang.String, /* options */ js.UndefOr[js.Any], AST]
  type CustomParser = js.Function3[
    /* text */ java.lang.String, 
    /* parsers */ stdLib.Record[BuiltInParserName, BuiltInParser], 
    /* options */ Options, 
    AST
  ]
  type Doc = prettierLib.prettierMod.docNs.buildersNs.Doc
  type SupportOptionValue = scala.Double | scala.Boolean | java.lang.String
}
