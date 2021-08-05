package typings.snappy

import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("snappy/snappy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compress(input: String, callback: js.Function2[/* err */ Error, /* buffer */ js.UndefOr[Buffer], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(input.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def compress(input: Buffer, callback: js.Function2[/* err */ Error, /* buffer */ js.UndefOr[Buffer], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(input.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def compressSync(input: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("compressSync")(input.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def compressSync(input: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("compressSync")(input.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  @JSImport("snappy/snappy", "isValidCompressed")
  @js.native
  def isValidCompressed: js.Function2[
    /* buffer */ Buffer, 
    /* callback */ js.Function2[/* err */ Error | Null, /* isValid */ js.UndefOr[Boolean], Unit], 
    Unit
  ] = js.native
  
  @JSImport("snappy/snappy", "isValidCompressedSync")
  @js.native
  def isValidCompressedSync: js.Function1[/* buffer */ Buffer, Boolean] = js.native
  inline def isValidCompressedSync_=(x: js.Function1[/* buffer */ Buffer, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isValidCompressedSync")(x.asInstanceOf[js.Any])
  
  inline def isValidCompressed_=(
    x: js.Function2[
      /* buffer */ Buffer, 
      /* callback */ js.Function2[/* err */ Error | Null, /* isValid */ js.UndefOr[Boolean], Unit], 
      Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isValidCompressed")(x.asInstanceOf[js.Any])
  
  inline def uncompress(
    compressed: Buffer,
    opts: js.Any,
    callback: js.Function2[/* err */ Error, /* uncompressed */ js.UndefOr[String | Buffer], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uncompress")(compressed.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def uncompressSync(compressed: Buffer, opts: js.Any): String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("uncompressSync")(compressed.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String | Buffer]
}
