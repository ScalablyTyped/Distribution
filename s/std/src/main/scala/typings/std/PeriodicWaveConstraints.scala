package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeriodicWaveConstraints extends StObject {
  
  /* standard dom */
  var disableNormalization: js.UndefOr[scala.Boolean] = js.undefined
}
object PeriodicWaveConstraints {
  
  inline def apply(): PeriodicWaveConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PeriodicWaveConstraints]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PeriodicWaveConstraints] (val x: Self) extends AnyVal {
    
    inline def setDisableNormalization(value: scala.Boolean): Self = StObject.set(x, "disableNormalization", value.asInstanceOf[js.Any])
    
    inline def setDisableNormalizationUndefined: Self = StObject.set(x, "disableNormalization", js.undefined)
  }
}
