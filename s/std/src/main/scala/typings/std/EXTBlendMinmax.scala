package typings.std

import typings.std.stdInts.`0x8007`
import typings.std.stdInts.`0x8008`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/EXT_blend_minmax) */
trait EXTBlendMinmax extends StObject {
  
  /* standard dom */
  val MAX_EXT: `0x8008`
  
  /* standard dom */
  val MIN_EXT: `0x8007`
}
object EXTBlendMinmax {
  
  inline def apply(): EXTBlendMinmax = {
    val __obj = js.Dynamic.literal(MAX_EXT = 0x8008, MIN_EXT = 0x8007)
    __obj.asInstanceOf[EXTBlendMinmax]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EXTBlendMinmax] (val x: Self) extends AnyVal {
    
    inline def setMAX_EXT(value: `0x8008`): Self = StObject.set(x, "MAX_EXT", value.asInstanceOf[js.Any])
    
    inline def setMIN_EXT(value: `0x8007`): Self = StObject.set(x, "MIN_EXT", value.asInstanceOf[js.Any])
  }
}
