package typings.std

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about files and allows JavaScript in a web page to access their content. */
@js.native
trait File extends Blob {
  val lastModified: Double = js.native
  val name: java.lang.String = js.native
}

@JSGlobal("File")
@js.native
object File
  extends Instantiable2[/* fileBits */ js.Array[BlobPart], /* fileName */ java.lang.String, File]
     with Instantiable3[
      /* fileBits */ js.Array[BlobPart], 
      /* fileName */ java.lang.String, 
      /* options */ FilePropertyBag, 
      File
    ]

