package typings.reactColor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<reactcss.reactcss.Classes<react-color.react-color/lib/components/circle/Circle.CirclePickerStylesProps>> */
trait PartialClassesCirclePicke extends StObject {
  
  var default: js.UndefOr[PartialCirclePickerStyles] = js.undefined
}
object PartialClassesCirclePicke {
  
  @scala.inline
  def apply(): PartialClassesCirclePicke = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassesCirclePicke]
  }
  
  @scala.inline
  implicit class PartialClassesCirclePickeMutableBuilder[Self <: PartialClassesCirclePicke] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: PartialCirclePickerStyles): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
  }
}
