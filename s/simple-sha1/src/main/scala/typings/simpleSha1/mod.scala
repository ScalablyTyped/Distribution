package typings.simpleSha1

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
  
  type ArrayBufferView = TypedArray | js.typedarray.DataView
  
  type TypedArray = js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Float32Array | js.typedarray.Float64Array
}
