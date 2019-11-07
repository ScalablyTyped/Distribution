package typings.std.WebAssembly

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instance extends js.Object {
  val exports: Exports
}

@JSGlobal("WebAssembly.Instance")
@js.native
object Instance
  extends Instantiable1[/* module */ Module, Instance]
     with Instantiable2[/* module */ Module, /* importObject */ Imports, Instance]

