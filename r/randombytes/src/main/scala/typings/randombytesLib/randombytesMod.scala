package typings
package randombytesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("randombytes", JSImport.Namespace)
@js.native
object randombytesMod
  extends ScalablyTyped.runtime.TopLevel[
      js.Function2[
        /* size */ scala.Double, 
        /* callback */ js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ nodeLib.Buffer, scala.Unit], 
        scala.Unit
      ]
    ]

