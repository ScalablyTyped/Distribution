package typings.reactNativeReanimated.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Extrapolation
  extends StObject
     with _ExtrapolationType
@JSImport("react-native-reanimated", "Extrapolation")
@js.native
object Extrapolation extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Extrapolation & String] = js.native
  
  @js.native
  sealed trait CLAMP
    extends StObject
       with Extrapolation
  /* "clamp" */ val CLAMP: typings.reactNativeReanimated.mod.Extrapolation.CLAMP & String = js.native
  
  @js.native
  sealed trait EXTEND
    extends StObject
       with Extrapolation
  /* "extend" */ val EXTEND: typings.reactNativeReanimated.mod.Extrapolation.EXTEND & String = js.native
  
  @js.native
  sealed trait IDENTITY
    extends StObject
       with Extrapolation
  /* "identity" */ val IDENTITY: typings.reactNativeReanimated.mod.Extrapolation.IDENTITY & String = js.native
}
