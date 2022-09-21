package typings.reactSpringZdog

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.zdog.mod.IllustrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object primitivesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactSpringZdog.reactSpringZdogStrings.Polygon
    - typings.reactSpringZdog.reactSpringZdogStrings.easeInOut
    - typings.reactSpringZdog.reactSpringZdogStrings.Anchor
    - typings.reactSpringZdog.reactSpringZdogStrings.Box
    - typings.reactSpringZdog.reactSpringZdogStrings.Group
    - typings.reactSpringZdog.reactSpringZdogStrings.TAU
    - typings.reactSpringZdog.reactSpringZdogStrings.Cylinder
    - typings.reactSpringZdog.reactSpringZdogStrings.Hemisphere
    - typings.reactSpringZdog.reactSpringZdogStrings.RoundedRect
    - typings.reactSpringZdog.reactSpringZdogStrings.modulo
    - typings.reactSpringZdog.reactSpringZdogStrings.Rect
    - typings.reactSpringZdog.reactSpringZdogStrings.Dragger
    - typings.reactSpringZdog.reactSpringZdogStrings.lerp
    - typings.reactSpringZdog.reactSpringZdogStrings.Shape
    - typings.reactSpringZdog.reactSpringZdogStrings.Cone
    - typings.reactSpringZdog.reactSpringZdogStrings.extend
    - typings.reactSpringZdog.reactSpringZdogStrings.Ellipse
    - typings.reactSpringZdog.reactSpringZdogStrings.Illustration
    - typings.reactSpringZdog.reactSpringZdogStrings.Vector
  */
  trait ZdogElements extends StObject
  
  @js.native
  trait ZdogExports extends StObject {
    
    var Anchor: Instantiable0[typings.zdog.mod.Anchor] = js.native
    
    var Box: Instantiable0[typings.zdog.mod.Box] = js.native
    
    var Cone: Instantiable0[typings.zdog.mod.Cone] = js.native
    
    var Cylinder: Instantiable0[typings.zdog.mod.Cylinder] = js.native
    
    var Dragger: Instantiable0[typings.zdog.mod.Dragger] = js.native
    
    var Ellipse: Instantiable0[typings.zdog.mod.Ellipse] = js.native
    
    var Group: Instantiable0[typings.zdog.mod.Group] = js.native
    
    var Hemisphere: Instantiable0[typings.zdog.mod.Hemisphere] = js.native
    
    var Illustration: Instantiable1[/* options */ IllustrationOptions, typings.zdog.mod.Illustration] = js.native
    
    var Polygon: Instantiable0[typings.zdog.mod.Polygon] = js.native
    
    var Rect: Instantiable0[typings.zdog.mod.Rect] = js.native
    
    var RoundedRect: Instantiable0[typings.zdog.mod.RoundedRect] = js.native
    
    var Shape: Instantiable0[typings.zdog.mod.Shape] = js.native
    
    val TAU: Double = js.native
    
    var Vector: Instantiable0[typings.zdog.mod.Vector] = js.native
    
    def easeInOut(alpha: Double): Double = js.native
    def easeInOut(alpha: Double, power: Double): Double = js.native
    
    def extend[T](a: T): T = js.native
    def extend[T](a: T, b: T): T = js.native
    
    def lerp(a: Double, b: Double, alpha: Double): Double = js.native
    
    def modulo(a: Double, b: Double): Double = js.native
  }
}
