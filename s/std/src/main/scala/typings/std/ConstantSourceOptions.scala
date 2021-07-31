package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConstantSourceOptions extends StObject {
  
  var offset: js.UndefOr[Double] = js.undefined
}
object ConstantSourceOptions {
  
  @scala.inline
  def apply(): ConstantSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstantSourceOptions]
  }
  
  @scala.inline
  implicit class ConstantSourceOptionsMutableBuilder[Self <: ConstantSourceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
