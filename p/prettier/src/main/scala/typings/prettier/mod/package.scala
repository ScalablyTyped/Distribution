package typings.prettier

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AST = js.Any
  
  type BuiltInParser = js.Function2[
    /* text */ java.lang.String, 
    /* options */ js.UndefOr[js.Any], 
    typings.prettier.mod.AST
  ]
  
  type CustomParser = js.Function3[
    /* text */ java.lang.String, 
    /* parsers */ typings.prettier.mod.BuiltInParsers, 
    /* options */ typings.prettier.mod.Options, 
    typings.prettier.mod.AST
  ]
  
  type Doc_ = typings.prettier.mod.doc.builders.Doc
  
  type LiteralUnion[T /* <: U */, U] = T | ((typings.std.Pick[U, scala.Nothing]) with typings.prettier.anon._empty)
  
  /* Rewritten from type alias, can be one of: 
    - typings.prettier.mod.IntSupportOption
    - typings.prettier.mod.IntArraySupportOption
    - typings.prettier.mod.BooleanSupportOption
    - typings.prettier.mod.BooleanArraySupportOption
    - typings.prettier.mod.ChoiceSupportOption[js.Any]
    - typings.prettier.mod.PathSupportOption
    - typings.prettier.mod.PathArraySupportOption
  */
  type SupportOption = typings.prettier.mod._SupportOption | typings.prettier.mod.ChoiceSupportOption[js.Any]
  
  type SupportOptions = typings.std.Record[java.lang.String, typings.prettier.mod.SupportOption]
}
