package typings.reactFloater.anon

import typings.popperjsCore.anon.Partialxnumberynumbercent
import typings.popperjsCore.libModifiersComputeStylesMod.RoundOffsets
import typings.popperjsCore.libTypesMod.Offsets
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@popperjs/core.@popperjs/core/lib/modifiers/computeStyles.Options> */
trait PartialOptionsAdaptive extends StObject {
  
  var adaptive: js.UndefOr[Boolean] = js.undefined
  
  var gpuAcceleration: js.UndefOr[Boolean] = js.undefined
  
  var roundOffsets: js.UndefOr[Boolean | RoundOffsets] = js.undefined
}
object PartialOptionsAdaptive {
  
  inline def apply(): PartialOptionsAdaptive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptionsAdaptive]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialOptionsAdaptive] (val x: Self) extends AnyVal {
    
    inline def setAdaptive(value: Boolean): Self = StObject.set(x, "adaptive", value.asInstanceOf[js.Any])
    
    inline def setAdaptiveUndefined: Self = StObject.set(x, "adaptive", js.undefined)
    
    inline def setGpuAcceleration(value: Boolean): Self = StObject.set(x, "gpuAcceleration", value.asInstanceOf[js.Any])
    
    inline def setGpuAccelerationUndefined: Self = StObject.set(x, "gpuAcceleration", js.undefined)
    
    inline def setRoundOffsets(value: Boolean | RoundOffsets): Self = StObject.set(x, "roundOffsets", value.asInstanceOf[js.Any])
    
    inline def setRoundOffsetsFunction1(value: /* offsets */ Partialxnumberynumbercent => Offsets): Self = StObject.set(x, "roundOffsets", js.Any.fromFunction1(value))
    
    inline def setRoundOffsetsUndefined: Self = StObject.set(x, "roundOffsets", js.undefined)
  }
}
