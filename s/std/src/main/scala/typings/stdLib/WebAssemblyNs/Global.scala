package typings
package stdLib.WebAssemblyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Global extends js.Object {
  var value: js.Any
}

@JSGlobal("WebAssembly.Global")
@js.native
class GlobalCls protected () extends Global {
  def this(descriptor: GlobalDescriptor) = this()
  def this(descriptor: GlobalDescriptor, value: js.Any) = this()
  /* CompleteClass */
  override var value: js.Any = js.native
}

@JSGlobal("WebAssembly.Global")
@js.native
object Global
  extends org.scalablytyped.runtime.Instantiable1[/* descriptor */ GlobalDescriptor, Global]
     with org.scalablytyped.runtime.Instantiable2[/* descriptor */ GlobalDescriptor, /* value */ js.Any, Global]

