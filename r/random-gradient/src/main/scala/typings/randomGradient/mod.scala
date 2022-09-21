package typings.randomGradient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(uuid: String): String = ^.asInstanceOf[js.Dynamic].apply(uuid.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(uuid: String, `type`: GradientDirection): String = (^.asInstanceOf[js.Dynamic].apply(uuid.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("random-gradient", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.randomGradient.randomGradientStrings.diagonal
    - typings.randomGradient.randomGradientStrings.radial
    - typings.randomGradient.randomGradientStrings.horizontal
    - typings.randomGradient.randomGradientStrings.vertical
  */
  trait GradientDirection extends StObject
  object GradientDirection {
    
    inline def diagonal: typings.randomGradient.randomGradientStrings.diagonal = "diagonal".asInstanceOf[typings.randomGradient.randomGradientStrings.diagonal]
    
    inline def horizontal: typings.randomGradient.randomGradientStrings.horizontal = "horizontal".asInstanceOf[typings.randomGradient.randomGradientStrings.horizontal]
    
    inline def radial: typings.randomGradient.randomGradientStrings.radial = "radial".asInstanceOf[typings.randomGradient.randomGradientStrings.radial]
    
    inline def vertical: typings.randomGradient.randomGradientStrings.vertical = "vertical".asInstanceOf[typings.randomGradient.randomGradientStrings.vertical]
  }
}
