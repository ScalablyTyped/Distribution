package typings.reactColor.anon

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<reactcss.reactcss.Classes<any>> */
@js.native
trait PartialClassesany extends StObject {
  
  var default: js.UndefOr[Partial[_]] = js.native
}
object PartialClassesany {
  
  @scala.inline
  def apply(): PartialClassesany = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassesany]
  }
  
  @scala.inline
  implicit class PartialClassesanyMutableBuilder[Self <: PartialClassesany] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: Partial[_]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
  }
}
