package typings.ramlTypesystem.typesystemInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkerObject extends StObject {
  
  /**
    * Column number, starting from zero
    */
  var column: Double
  
  /**
    * Line number, starting from zero
    */
  var line: Double
  
  /**
    * Position, starting from zero
    */
  var position: Double
}
object MarkerObject {
  
  inline def apply(column: Double, line: Double, position: Double): MarkerObject = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerObject]
  }
  
  extension [Self <: MarkerObject](x: Self) {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
