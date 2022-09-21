package typings.stablelibWipe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@stablelib/wipe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def wipe(array: NumericArray): NumericArray = ^.asInstanceOf[js.Dynamic].applyDynamic("wipe")(array.asInstanceOf[js.Any]).asInstanceOf[NumericArray]
  
  type NumericArray = js.Array[Double] | js.typedarray.Uint8Array | js.typedarray.Int8Array | js.typedarray.Uint16Array | js.typedarray.Int16Array | js.typedarray.Uint32Array | js.typedarray.Int32Array | js.typedarray.Float32Array | js.typedarray.Float64Array
}
