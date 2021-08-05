package typings.storybookUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShouldScale extends StObject {
  
  var shouldScale: Boolean
}
object ShouldScale {
  
  inline def apply(shouldScale: Boolean): ShouldScale = {
    val __obj = js.Dynamic.literal(shouldScale = shouldScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShouldScale]
  }
  
  extension [Self <: ShouldScale](x: Self) {
    
    inline def setShouldScale(value: Boolean): Self = StObject.set(x, "shouldScale", value.asInstanceOf[js.Any])
  }
}
