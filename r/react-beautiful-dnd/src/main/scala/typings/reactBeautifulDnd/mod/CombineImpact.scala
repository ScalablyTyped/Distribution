package typings.reactBeautifulDnd.mod

import typings.reactBeautifulDnd.reactBeautifulDndStrings.COMBINE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CombineImpact
  extends StObject
     with ImpactLocation {
  
  var combine: Combine
  
  var `type`: COMBINE
}
object CombineImpact {
  
  @scala.inline
  def apply(combine: Combine): CombineImpact = {
    val __obj = js.Dynamic.literal(combine = combine.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("COMBINE")
    __obj.asInstanceOf[CombineImpact]
  }
  
  @scala.inline
  implicit class CombineImpactMutableBuilder[Self <: CombineImpact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCombine(value: Combine): Self = StObject.set(x, "combine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: COMBINE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
