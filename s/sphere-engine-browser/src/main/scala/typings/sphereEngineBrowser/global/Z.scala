package typings.sphereEngineBrowser.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides functions for data compression and decompression.
  */
object Z {
  
  @JSGlobal("Z")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Compress data using the DEFLATE compression algorithm.
    * @param data  A buffer containing the data to compress.
    * @param level Compression level between 0 (no compression) and 9 (max).
    * @returns An ArrayBuffer containing the compressed data.
    */
  inline def deflate(data: js.typedarray.ArrayBuffer): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
  inline def deflate(data: js.typedarray.ArrayBufferView): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
  inline def deflate(data: js.typedarray.ArrayBufferView, level: Double): js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(data.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBuffer]
  inline def deflate(data: js.typedarray.ArrayBuffer, level: Double): js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(data.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBuffer]
  
  /**
    * Uncompress data that was previously compressed using `Z.deflate`, with optional "inflate
    * bomb" protection.
    * @param data    A buffer containing some data compressed using `deflate`.
    * @param maxSize The maximum allowed size of the data after inflation, in bytes.
    * @returns An ArrayBuffer containing the uncompressed data.
    */
  inline def inflate(data: js.typedarray.ArrayBuffer): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("inflate")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
  inline def inflate(data: js.typedarray.ArrayBufferView): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("inflate")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
  inline def inflate(data: js.typedarray.ArrayBufferView, maxSize: Double): js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("inflate")(data.asInstanceOf[js.Any], maxSize.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBuffer]
  inline def inflate(data: js.typedarray.ArrayBuffer, maxSize: Double): js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("inflate")(data.asInstanceOf[js.Any], maxSize.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBuffer]
}
