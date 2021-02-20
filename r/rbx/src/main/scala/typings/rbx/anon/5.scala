package typings.rbx.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `5` extends StObject {
  
  var `data-tooltip`: js.UndefOr[String | Double] = js.native
}
object `5` {
  
  @scala.inline
  def apply(): `5` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`5`]
  }
  
  @scala.inline
  implicit class `5MutableBuilder`[Self <: `5`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setData-tooltip`(value: String | Double): Self = StObject.set(x, "data-tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setData-tooltipUndefined`: Self = StObject.set(x, "data-tooltip", js.undefined)
  }
}
