package typings.reactVis.anon

import typings.reactVis.reactVisStrings.horizontal
import typings.reactVis.reactVisStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HORIZONTAL_ extends StObject {
  
  var HORIZONTAL: horizontal
  
  var VERTICAL: vertical
}
object HORIZONTAL_ {
  
  inline def apply(): HORIZONTAL_ = {
    val __obj = js.Dynamic.literal(HORIZONTAL = "horizontal", VERTICAL = "vertical")
    __obj.asInstanceOf[HORIZONTAL_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HORIZONTAL_] (val x: Self) extends AnyVal {
    
    inline def setHORIZONTAL(value: horizontal): Self = StObject.set(x, "HORIZONTAL", value.asInstanceOf[js.Any])
    
    inline def setVERTICAL(value: vertical): Self = StObject.set(x, "VERTICAL", value.asInstanceOf[js.Any])
  }
}
