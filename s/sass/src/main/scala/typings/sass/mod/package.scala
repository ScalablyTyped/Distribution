package typings.sass

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Importer = js.Function3[
    /* url */ java.lang.String, 
    /* prev */ java.lang.String, 
    /* done */ js.Function1[/* data */ typings.sass.mod.ImporterReturnType, scala.Unit], 
    typings.sass.mod.ImporterReturnType | scala.Unit
  ]
  /* Rewritten from type alias, can be one of: 
    - typings.sass.anon.File
    - typings.sass.anon.Contents
    - typings.std.Error
    - scala.Null
  */
  type ImporterReturnType = typings.sass.mod._ImporterReturnType | typings.std.Error | scala.Null
}
