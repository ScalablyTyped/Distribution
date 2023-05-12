package typings.sentryInternalTracing.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  _reportAllChanges :boolean}> */
trait PartialreportAllChangesbo extends StObject {
  
  var _reportAllChanges: js.UndefOr[Boolean] = js.undefined
}
object PartialreportAllChangesbo {
  
  inline def apply(): PartialreportAllChangesbo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialreportAllChangesbo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialreportAllChangesbo] (val x: Self) extends AnyVal {
    
    inline def set_reportAllChanges(value: Boolean): Self = StObject.set(x, "_reportAllChanges", value.asInstanceOf[js.Any])
    
    inline def set_reportAllChangesUndefined: Self = StObject.set(x, "_reportAllChanges", js.undefined)
  }
}
