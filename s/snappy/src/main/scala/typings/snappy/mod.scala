package typings.snappy

import typings.node.bufferMod.global.Buffer
import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("snappy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compress(input: String): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("compress")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def compress(input: String, signal: AbortSignal): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(input.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def compress(input: Buffer): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("compress")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def compress(input: Buffer, signal: AbortSignal): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(input.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  inline def compressSync(input: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("compressSync")(input.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def compressSync(input: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("compressSync")(input.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def uncompress(input: String): js.Promise[String | Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("uncompress")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String | Buffer]]
  inline def uncompress(input: String, options: Null, signal: AbortSignal): js.Promise[String | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("uncompress")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Buffer]]
  inline def uncompress(input: String, options: Unit, signal: AbortSignal): js.Promise[String | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("uncompress")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Buffer]]
  inline def uncompress(input: String, options: Options): js.Promise[String | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("uncompress")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Buffer]]
  inline def uncompress(input: String, options: Options, signal: AbortSignal): js.Promise[String | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("uncompress")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Buffer]]
  inline def uncompress(input: Buffer): js.Promise[String | Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("uncompress")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String | Buffer]]
  inline def uncompress(input: Buffer, options: Null, signal: AbortSignal): js.Promise[String | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("uncompress")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Buffer]]
  inline def uncompress(input: Buffer, options: Unit, signal: AbortSignal): js.Promise[String | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("uncompress")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Buffer]]
  inline def uncompress(input: Buffer, options: Options): js.Promise[String | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("uncompress")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Buffer]]
  inline def uncompress(input: Buffer, options: Options, signal: AbortSignal): js.Promise[String | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("uncompress")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Buffer]]
  
  inline def uncompressSync(input: String): String | Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("uncompressSync")(input.asInstanceOf[js.Any]).asInstanceOf[String | Buffer]
  inline def uncompressSync(input: String, asBuffer: Options): String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("uncompressSync")(input.asInstanceOf[js.Any], asBuffer.asInstanceOf[js.Any])).asInstanceOf[String | Buffer]
  inline def uncompressSync(input: Buffer): String | Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("uncompressSync")(input.asInstanceOf[js.Any]).asInstanceOf[String | Buffer]
  inline def uncompressSync(input: Buffer, asBuffer: Options): String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("uncompressSync")(input.asInstanceOf[js.Any], asBuffer.asInstanceOf[js.Any])).asInstanceOf[String | Buffer]
  
  trait Options extends StObject {
    
    var asBuffer: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAsBuffer(value: Boolean): Self = StObject.set(x, "asBuffer", value.asInstanceOf[js.Any])
      
      inline def setAsBufferUndefined: Self = StObject.set(x, "asBuffer", js.undefined)
    }
  }
}
