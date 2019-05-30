package typings
package stdLib.WebAssemblyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instance extends js.Object {
  val exports: js.Any
}

@JSGlobal("WebAssembly.Instance")
@js.native
class InstanceCls protected () extends Instance {
  def this(module: Module) = this()
  def this(module: Module, importObject: js.Any) = this()
  /* CompleteClass */
  override val exports: js.Any = js.native
}

@JSGlobal("WebAssembly.Instance")
@js.native
object Instance
  extends org.scalablytyped.runtime.Instantiable1[/* module */ Module, Instance]
     with org.scalablytyped.runtime.Instantiable2[/* module */ Module, /* importObject */ js.Any, Instance]

