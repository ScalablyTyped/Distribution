package typings.rcSelect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options[OptionsType /* <: js.Array[js.Object] */] extends StObject {
  
  var options: OptionsType
}
object Options {
  
  inline def apply[OptionsType /* <: js.Array[js.Object] */](options: OptionsType): Options[OptionsType] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[OptionsType]]
  }
  
  extension [Self <: Options[?], OptionsType /* <: js.Array[js.Object] */](x: Self & Options[OptionsType]) {
    
    inline def setOptions(value: OptionsType): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
