package typings.spotifyWebApiNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AfterOptions[T /* <: Double | String */]
  extends StObject
     with LimitOptions {
  
  var after: js.UndefOr[T] = js.undefined
}
object AfterOptions {
  
  inline def apply[T /* <: Double | String */](): AfterOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AfterOptions[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AfterOptions[?], T /* <: Double | String */] (val x: Self & AfterOptions[T]) extends AnyVal {
    
    inline def setAfter(value: T): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
  }
}
