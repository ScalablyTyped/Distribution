package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait File extends Blob {
  val lastModified: scala.Double = js.native
  val name: java.lang.String = js.native
}

@JSGlobal("File")
@js.native
object File
  extends org.scalablytyped.runtime.Instantiable2[/* fileBits */ Array[BlobPart], /* fileName */ java.lang.String, File]
     with org.scalablytyped.runtime.Instantiable3[
      /* fileBits */ Array[BlobPart], 
      /* fileName */ java.lang.String, 
      /* options */ FilePropertyBag, 
      File
    ]

