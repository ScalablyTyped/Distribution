package typings.rbx.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Databadge extends StObject {
  
  var `data-badge`: js.UndefOr[String | Double] = js.undefined
}
object Databadge {
  
  @scala.inline
  def apply(): Databadge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Databadge]
  }
  
  @scala.inline
  implicit class DatabadgeMutableBuilder[Self <: Databadge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setData-badge`(value: String | Double): Self = StObject.set(x, "data-badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setData-badgeUndefined`: Self = StObject.set(x, "data-badge", js.undefined)
  }
}
