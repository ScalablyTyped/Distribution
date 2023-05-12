package typings.remixRunWebBlob

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.Blob
import typings.std.BlobPart
import typings.std.BlobPropertyBag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable0[Blob]
       with Instantiable1[/* blobParts */ js.Array[BlobPart], Blob]
       with Instantiable2[
          (/* blobParts */ js.Array[BlobPart]) | (/* blobParts */ Unit), 
          /* options */ BlobPropertyBag, 
          Blob
        ]
}
