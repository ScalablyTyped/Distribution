package typings.rabinWasm.mod

import typings.rabinWasm.mod.ASModule.i32
import typings.rabinWasm.mod.ASModule.u32
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rabin-wasm/dist/rabin-wasm", JSImport.Default)
@js.native
object default extends js.Object {
  
  @JSName("Int32Array_ID")
  var Int32ArrayID: u32 = js.native
  
  @JSName("Uint8Array_ID")
  var Uint8ArrayID: u32 = js.native
  
  @JSName("__alloc")
  def alloc(size: u32, id: u32): u32 = js.native
  
  @JSName("__collect")
  def collect(): Unit = js.native
  
  def degree(
    polynom: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any
  ): i32 = js.native
  
  def mod(
    x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any,
    p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any
  ): js.Any = js.native
  
  @JSName("__release")
  def release(ptr: u32): Unit = js.native
  
  @JSName("__retain")
  def retain(ptr: u32): u32 = js.native
  
  @JSName("__rtti_base")
  var rttiBase: u32 = js.native
  
  @js.native
  class Rabin protected ()
    extends typings.rabinWasm.mod.ASModule.Rabin {
    def this(average_bits: u32, minsize: u32, maxsize: u32, window_size: i32) = this()
  }
}
