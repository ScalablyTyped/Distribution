package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProgressEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var lengthComputable: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var loaded: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var total: js.UndefOr[Double] = js.undefined
}
object ProgressEventInit {
  
  inline def apply(): ProgressEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressEventInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProgressEventInit] (val x: Self) extends AnyVal {
    
    inline def setLengthComputable(value: scala.Boolean): Self = StObject.set(x, "lengthComputable", value.asInstanceOf[js.Any])
    
    inline def setLengthComputableUndefined: Self = StObject.set(x, "lengthComputable", js.undefined)
    
    inline def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    inline def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
