package typings.sharp.mod

import typings.sharp.sharpStrings.contain
import typings.sharp.sharpStrings.cover
import typings.sharp.sharpStrings.fill
import typings.sharp.sharpStrings.inside
import typings.sharp.sharpStrings.outside
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FitEnum extends StObject {
  
  var contain: typings.sharp.sharpStrings.contain
  
  var cover: typings.sharp.sharpStrings.cover
  
  var fill: typings.sharp.sharpStrings.fill
  
  var inside: typings.sharp.sharpStrings.inside
  
  var outside: typings.sharp.sharpStrings.outside
}
object FitEnum {
  
  inline def apply(): FitEnum = {
    val __obj = js.Dynamic.literal(contain = "contain", cover = "cover", fill = "fill", inside = "inside", outside = "outside")
    __obj.asInstanceOf[FitEnum]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FitEnum] (val x: Self) extends AnyVal {
    
    inline def setContain(value: contain): Self = StObject.set(x, "contain", value.asInstanceOf[js.Any])
    
    inline def setCover(value: cover): Self = StObject.set(x, "cover", value.asInstanceOf[js.Any])
    
    inline def setFill(value: fill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setInside(value: inside): Self = StObject.set(x, "inside", value.asInstanceOf[js.Any])
    
    inline def setOutside(value: outside): Self = StObject.set(x, "outside", value.asInstanceOf[js.Any])
  }
}
