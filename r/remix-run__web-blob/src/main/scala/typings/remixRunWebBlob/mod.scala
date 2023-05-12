package typings.remixRunWebBlob

import typings.std.BlobPart
import typings.std.BlobPropertyBag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@remix-run/web-blob", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@remix-run/web-blob", "Blob")
  @js.native
  open class Blob ()
    extends StObject
       with typings.std.Blob {
    def this(blobParts: js.Array[BlobPart]) = this()
    def this(blobParts: js.Array[BlobPart], options: BlobPropertyBag) = this()
    def this(blobParts: Unit, options: BlobPropertyBag) = this()
  }
  
  @JSImport("@remix-run/web-blob", "TextDecoder")
  @js.native
  def TextDecoder: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof self.TextDecoder */ Any = js.native
  inline def TextDecoder_=(
    x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof self.TextDecoder */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TextDecoder")(x.asInstanceOf[js.Any])
  
  @JSImport("@remix-run/web-blob", "TextEncoder")
  @js.native
  def TextEncoder: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof self.TextEncoder */ Any = js.native
  inline def TextEncoder_=(
    x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof self.TextEncoder */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TextEncoder")(x.asInstanceOf[js.Any])
}
