package typings.reactNativeReanimated.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ColorSpace extends StObject
@JSImport("react-native-reanimated", "ColorSpace")
@js.native
object ColorSpace extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ColorSpace & Double] = js.native
  
  @js.native
  sealed trait HSV
    extends StObject
       with ColorSpace
  /* 1 */ val HSV: typings.reactNativeReanimated.mod.ColorSpace.HSV & Double = js.native
  
  @js.native
  sealed trait RGB
    extends StObject
       with ColorSpace
  /* 0 */ val RGB: typings.reactNativeReanimated.mod.ColorSpace.RGB & Double = js.native
}
