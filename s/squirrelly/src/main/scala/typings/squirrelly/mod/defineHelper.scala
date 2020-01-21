package typings.squirrelly.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("squirrelly", "defineHelper")
@js.native
object defineHelper extends js.Object {
  def apply(
    name: String,
    callback: js.Function3[
      /* args */ js.Array[String], 
      /* content */ js.Function0[String], 
      /* blocks */ Blocks, 
      String
    ]
  ): Unit = js.native
}

