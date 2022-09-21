package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataViewConstructor
  extends StObject
     with /* standard es5 */
Instantiable1[/* buffer */ ArrayBufferLike, js.typedarray.DataView]
     with Instantiable2[/* buffer */ ArrayBufferLike, /* byteOffset */ Double, js.typedarray.DataView]
     with Instantiable3[
      /* buffer */ ArrayBufferLike, 
      (/* byteOffset */ Double) | (/* byteOffset */ Unit), 
      /* byteLength */ Double, 
      js.typedarray.DataView
    ]
