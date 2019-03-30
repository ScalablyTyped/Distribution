package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The File interface provides information about files and allows JavaScript in a web page to access their content. */
@js.native
trait File extends Blob {
  val lastModified: scala.Double = js.native
  val name: java.lang.String = js.native
}

@JSGlobal("File")
@js.native
class FileCls protected () extends File {
  def this(fileBits: js.Array[BlobPart], fileName: java.lang.String) = this()
  def this(fileBits: js.Array[BlobPart], fileName: java.lang.String, options: FilePropertyBag) = this()
}

@JSGlobal("File")
@js.native
object File
  extends org.scalablytyped.runtime.Instantiable2[/* fileBits */ js.Array[BlobPart], /* fileName */ java.lang.String, File]
     with org.scalablytyped.runtime.Instantiable3[
      /* fileBits */ js.Array[BlobPart], 
      /* fileName */ java.lang.String, 
      /* options */ FilePropertyBag, 
      File
    ]

