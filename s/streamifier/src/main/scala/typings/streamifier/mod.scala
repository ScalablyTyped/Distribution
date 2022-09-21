package typings.streamifier

import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import typings.node.streamMod.ReadableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("streamifier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createReadStream(`object`: String): Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(`object`.asInstanceOf[js.Any]).asInstanceOf[Readable]
  inline def createReadStream(`object`: String, options: ReadableOptions): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Readable]
  inline def createReadStream(`object`: js.typedarray.Uint8Array): Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(`object`.asInstanceOf[js.Any]).asInstanceOf[Readable]
  inline def createReadStream(`object`: js.typedarray.Uint8Array, options: ReadableOptions): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Readable]
  inline def createReadStream(`object`: Buffer): Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(`object`.asInstanceOf[js.Any]).asInstanceOf[Readable]
  inline def createReadStream(`object`: Buffer, options: ReadableOptions): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Readable]
}
