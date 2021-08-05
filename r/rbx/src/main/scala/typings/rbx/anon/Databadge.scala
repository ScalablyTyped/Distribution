package typings.rbx.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Databadge extends StObject {
  
  var `data-badge`: js.UndefOr[String | Double] = js.undefined
}
object Databadge {
  
  inline def apply(): Databadge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Databadge]
  }
  
  extension [Self <: Databadge](x: Self) {
    
    inline def `setData-badge`(value: String | Double): Self = StObject.set(x, "data-badge", value.asInstanceOf[js.Any])
    
    inline def `setData-badgeUndefined`: Self = StObject.set(x, "data-badge", js.undefined)
  }
}
