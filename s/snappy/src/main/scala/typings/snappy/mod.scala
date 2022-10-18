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
  inline def compress(input: String, options: Null, signal: AbortSignal): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def compress(input: String, options: Unit, signal: AbortSignal): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def compress(input: String, options: EncOptions): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def compress(input: String, options: EncOptions, signal: AbortSignal): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def compress(input: Buffer): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("compress")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def compress(input: Buffer, options: Null, signal: AbortSignal): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def compress(input: Buffer, options: Unit, signal: AbortSignal): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def compress(input: Buffer, options: EncOptions): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def compress(input: Buffer, options: EncOptions, signal: AbortSignal): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  inline def compressSync(input: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("compressSync")(input.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def compressSync(input: String, options: EncOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("compressSync")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def compressSync(input: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("compressSync")(input.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def compressSync(input: Buffer, options: EncOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("compressSync")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def uncompress(input: String): js.Promise[String | Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("uncompress")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String | Buffer]]
  inline def uncompress(input: String, options: Null, signal: AbortSignal): js.Promise[String | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("uncompress")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Buffer]]
  inline def uncompress(input: String, options: Unit, signal: AbortSignal): js.Promise[String | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("uncompress")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Buffer]]
  inline def uncompress(input: String, options: DecOptions): js.Promise[String | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("uncompress")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Buffer]]
  inline def uncompress(input: String, options: DecOptions, signal: AbortSignal): js.Promise[String | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("uncompress")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Buffer]]
  inline def uncompress(input: Buffer): js.Promise[String | Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("uncompress")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String | Buffer]]
  inline def uncompress(input: Buffer, options: Null, signal: AbortSignal): js.Promise[String | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("uncompress")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Buffer]]
  inline def uncompress(input: Buffer, options: Unit, signal: AbortSignal): js.Promise[String | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("uncompress")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Buffer]]
  inline def uncompress(input: Buffer, options: DecOptions): js.Promise[String | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("uncompress")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Buffer]]
  inline def uncompress(input: Buffer, options: DecOptions, signal: AbortSignal): js.Promise[String | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("uncompress")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Buffer]]
  
  inline def uncompressSync(input: String): String | Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("uncompressSync")(input.asInstanceOf[js.Any]).asInstanceOf[String | Buffer]
  inline def uncompressSync(input: String, options: DecOptions): String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("uncompressSync")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Buffer]
  inline def uncompressSync(input: Buffer): String | Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("uncompressSync")(input.asInstanceOf[js.Any]).asInstanceOf[String | Buffer]
  inline def uncompressSync(input: Buffer, options: DecOptions): String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("uncompressSync")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Buffer]
  
  trait DecOptions extends StObject {
    
    var asBuffer: js.UndefOr[Boolean] = js.undefined
    
    /**
      * do not use `create_external_buffer` to create the output buffer
      
      * set this option to `true` will make the API slower
      
      * for compatibility with electron >= 21
      
      * see https://www.electronjs.org/blog/v8-memory-cage and https://github.com/electron/electron/issues/35801#issuecomment-1261206333
      */
    var copyOutputData: js.UndefOr[Boolean] = js.undefined
  }
  object DecOptions {
    
    inline def apply(): DecOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecOptions]
    }
    
    extension [Self <: DecOptions](x: Self) {
      
      inline def setAsBuffer(value: Boolean): Self = StObject.set(x, "asBuffer", value.asInstanceOf[js.Any])
      
      inline def setAsBufferUndefined: Self = StObject.set(x, "asBuffer", js.undefined)
      
      inline def setCopyOutputData(value: Boolean): Self = StObject.set(x, "copyOutputData", value.asInstanceOf[js.Any])
      
      inline def setCopyOutputDataUndefined: Self = StObject.set(x, "copyOutputData", js.undefined)
    }
  }
  
  trait EncOptions extends StObject {
    
    /**
      * do not use `create_external_buffer` to create the output buffer
      
      * for compatibility with electron >= 21
      
      * set this option to `true` will make the API slower
      
      * see https://www.electronjs.org/blog/v8-memory-cage and https://github.com/electron/electron/issues/35801#issuecomment-1261206333
      */
    var copyOutputData: js.UndefOr[Boolean] = js.undefined
  }
  object EncOptions {
    
    inline def apply(): EncOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncOptions]
    }
    
    extension [Self <: EncOptions](x: Self) {
      
      inline def setCopyOutputData(value: Boolean): Self = StObject.set(x, "copyOutputData", value.asInstanceOf[js.Any])
      
      inline def setCopyOutputDataUndefined: Self = StObject.set(x, "copyOutputData", js.undefined)
    }
  }
}
