package typings.simpleSha1

import typings.std.DataView
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(buf: String, cb: js.Function1[/* data */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(buf.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(buf: ArrayBufferView, cb: js.Function1[/* data */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(buf.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("simple-sha1", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sync(buf: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(buf.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def sync(buf: ArrayBufferView): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(buf.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type ArrayBufferView = TypedArray | DataView
  
  type TypedArray = Uint8Array | Uint8ClampedArray | Uint16Array | Uint32Array | Int8Array | Int16Array | Int32Array | Float32Array | Float64Array
}
