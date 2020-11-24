package typings.snappy

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("snappy/snappy", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def compress(input: String, callback: js.Function2[/* err */ Error, /* buffer */ js.UndefOr[Buffer], Unit]): Unit = js.native
  def compress(input: Buffer, callback: js.Function2[/* err */ Error, /* buffer */ js.UndefOr[Buffer], Unit]): Unit = js.native
  
  def compressSync(input: String): Buffer = js.native
  def compressSync(input: Buffer): Buffer = js.native
  
  var isValidCompressed: js.Function2[
    /* buffer */ Buffer, 
    /* callback */ js.Function2[/* err */ Error | Null, /* isValid */ js.UndefOr[Boolean], Unit], 
    Unit
  ] = js.native
  
  var isValidCompressedSync: js.Function1[/* buffer */ Buffer, Boolean] = js.native
  
  def uncompress(
    compressed: Buffer,
    opts: js.Any,
    callback: js.Function2[/* err */ Error, /* uncompressed */ js.UndefOr[String | Buffer], Unit]
  ): Unit = js.native
  
  def uncompressSync(compressed: Buffer, opts: js.Any): String | Buffer = js.native
}
