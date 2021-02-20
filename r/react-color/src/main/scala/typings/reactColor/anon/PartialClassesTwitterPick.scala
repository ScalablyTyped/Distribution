package typings.reactColor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<reactcss.reactcss.Classes<react-color.react-color/lib/components/twitter/Twitter.TwitterPickerStylesProps>> */
@js.native
trait PartialClassesTwitterPick extends StObject {
  
  var default: js.UndefOr[PartialTwitterPickerStyle] = js.native
}
object PartialClassesTwitterPick {
  
  @scala.inline
  def apply(): PartialClassesTwitterPick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassesTwitterPick]
  }
  
  @scala.inline
  implicit class PartialClassesTwitterPickMutableBuilder[Self <: PartialClassesTwitterPick] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: PartialTwitterPickerStyle): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
  }
}
