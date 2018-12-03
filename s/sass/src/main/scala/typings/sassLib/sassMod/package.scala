package typings
package sassLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sassMod {
  type Importer = js.Function3[
    /* url */ java.lang.String, 
    /* prev */ java.lang.String, 
    /* done */ js.Function1[/* data */ ImporterReturnType, scala.Unit], 
    ImporterReturnType | scala.Unit
  ]
  type ImporterReturnType = sassLib.Anon_File | sassLib.Anon_Contents | nodeLib.Error | scala.Null
}
