package typings.prettier

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AST = js.Any
  type BuiltInParser = js.Function2[
    /* text */ java.lang.String, 
    /* options */ js.UndefOr[js.Any], 
    typings.prettier.mod.AST
  ]
  type CustomParser = js.Function3[
    /* text */ java.lang.String, 
    /* parsers */ typings.std.Record[typings.prettier.mod.BuiltInParserName, typings.prettier.mod.BuiltInParser], 
    /* options */ typings.prettier.mod.Options, 
    typings.prettier.mod.AST
  ]
  type Doc_ = typings.prettier.mod.doc.builders.Doc
  type Options = typings.std.Partial[typings.prettier.mod.RequiredOptions]
  type SupportOptionValue = scala.Double | scala.Boolean | java.lang.String
}
