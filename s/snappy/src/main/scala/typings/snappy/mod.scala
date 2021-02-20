package typings.snappy

import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("snappy/snappy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("snappy/snappy", "compress")
  @js.native
  def compress(input: String, callback: js.Function2[/* err */ Error, /* buffer */ js.UndefOr[Buffer], Unit]): Unit = js.native
  @JSImport("snappy/snappy", "compress")
  @js.native
  def compress(input: Buffer, callback: js.Function2[/* err */ Error, /* buffer */ js.UndefOr[Buffer], Unit]): Unit = js.native
  
  @JSImport("snappy/snappy", "compressSync")
  @js.native
  def compressSync(input: String): Buffer = js.native
  @JSImport("snappy/snappy", "compressSync")
  @js.native
  def compressSync(input: Buffer): Buffer = js.native
  
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
  @scala.inline
  def isValidCompressedSync_=(x: js.Function1[/* buffer */ Buffer, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isValidCompressedSync")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def isValidCompressed_=(
    x: js.Function2[
      /* buffer */ Buffer, 
      /* callback */ js.Function2[/* err */ Error | Null, /* isValid */ js.UndefOr[Boolean], Unit], 
      Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isValidCompressed")(x.asInstanceOf[js.Any])
  
  @JSImport("snappy/snappy", "uncompress")
  @js.native
  def uncompress(
    compressed: Buffer,
    opts: js.Any,
    callback: js.Function2[/* err */ Error, /* uncompressed */ js.UndefOr[String | Buffer], Unit]
  ): Unit = js.native
  
  @JSImport("snappy/snappy", "uncompressSync")
  @js.native
  def uncompressSync(compressed: Buffer, opts: js.Any): String | Buffer = js.native
}
