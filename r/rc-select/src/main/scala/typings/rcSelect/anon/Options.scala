package typings.rcSelect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options[OptionsType /* <: js.Array[js.Object] */] extends StObject {
  
  var options: OptionsType = js.native
}
object Options {
  
  @scala.inline
  def apply[OptionsType /* <: js.Array[js.Object] */](options: OptionsType): Options[OptionsType] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[OptionsType]]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options[_], OptionsType /* <: js.Array[js.Object] */] (val x: Self with Options[OptionsType]) extends AnyVal {
    
    @scala.inline
    def setOptions(value: OptionsType): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
