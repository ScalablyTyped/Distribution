package typings.quadstore.distCjsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DelStreamOpts extends StObject {
  
  var batchSize: js.UndefOr[Double] = js.undefined
}
object DelStreamOpts {
  
  inline def apply(): DelStreamOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DelStreamOpts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DelStreamOpts] (val x: Self) extends AnyVal {
    
    inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
  }
}
