package typings.schematicsAngular.typescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineAndCharacter extends StObject {
  
  var character: Double
  
  /** 0-based. */
  var line: Double
}
object LineAndCharacter {
  
  inline def apply(character: Double, line: Double): LineAndCharacter = {
    val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineAndCharacter]
  }
  
  extension [Self <: LineAndCharacter](x: Self) {
    
    inline def setCharacter(value: Double): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
  }
}
