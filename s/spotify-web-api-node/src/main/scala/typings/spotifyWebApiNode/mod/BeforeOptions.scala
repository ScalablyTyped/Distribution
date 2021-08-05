package typings.spotifyWebApiNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BeforeOptions
  extends StObject
     with LimitOptions {
  
  var before: js.UndefOr[Double] = js.undefined
}
object BeforeOptions {
  
  inline def apply(): BeforeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeforeOptions]
  }
  
  extension [Self <: BeforeOptions](x: Self) {
    
    inline def setBefore(value: Double): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
  }
}
