package typings.reactSpringZdog

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.zdog.mod.IllustrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcPrimitivesMod {
  
  type ZdogElements = /* import warning: importer.ImportType#apply Failed type conversion: 'Polygon' extends 'Illustration' ? never : new (): zdog.zdog.Polygon extends react.react.ElementType<any> ? 'Polygon' : never */ js.Any
  
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
