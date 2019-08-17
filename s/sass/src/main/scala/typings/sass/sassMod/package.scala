package typings.sass

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sassMod {
  import typings.std.Error

  type Importer = js.Function3[
    /* url */ String, 
    /* prev */ String, 
    /* done */ js.Function1[/* data */ ImporterReturnType, Unit], 
    ImporterReturnType | Unit
  ]
  /* Rewritten from type alias, can be one of: 
    - typings.sass.Anon_File
    - typings.sass.Anon_Contents
    - typings.std.Error
    - scala.Null
  */
  type ImporterReturnType = _ImporterReturnType | Error | Null
}
