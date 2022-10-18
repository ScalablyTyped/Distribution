package typings.saucelabs.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lowerboundary
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var lower_boundary: js.UndefOr[Double] = js.undefined
  
  var upper_boundary: js.UndefOr[Double] = js.undefined
}
object Lowerboundary {
  
  inline def apply(): Lowerboundary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lowerboundary]
  }
  
  extension [Self <: Lowerboundary](x: Self) {
    
    inline def setLower_boundary(value: Double): Self = StObject.set(x, "lower_boundary", value.asInstanceOf[js.Any])
    
    inline def setLower_boundaryUndefined: Self = StObject.set(x, "lower_boundary", js.undefined)
    
    inline def setUpper_boundary(value: Double): Self = StObject.set(x, "upper_boundary", value.asInstanceOf[js.Any])
    
    inline def setUpper_boundaryUndefined: Self = StObject.set(x, "upper_boundary", js.undefined)
  }
}
