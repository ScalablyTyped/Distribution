package typings.spotifyWebApiNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AfterOptions
  extends StObject
     with LimitOptions {
  
  var after: js.UndefOr[Double] = js.undefined
}
object AfterOptions {
  
  inline def apply(): AfterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AfterOptions]
  }
  
  extension [Self <: AfterOptions](x: Self) {
    
    inline def setAfter(value: Double): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
  }
}
