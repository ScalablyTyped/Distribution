package typings.prettier

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object prettierMod {
  import typings.std.Partial
  import typings.std.Record

  type AST = js.Any
  type BuiltInParser = js.Function2[/* text */ String, /* options */ js.UndefOr[js.Any], AST]
  type CustomParser = js.Function3[
    /* text */ String, 
    /* parsers */ Record[BuiltInParserName, BuiltInParser], 
    /* options */ Options, 
    AST
  ]
  type Doc = typings.prettier.prettierMod.docNs.buildersNs.Doc
  type Options = Partial[RequiredOptions]
  type SupportOptionValue = Double | Boolean | String
}
