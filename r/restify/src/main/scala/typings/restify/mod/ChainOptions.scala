package typings.restify.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChainOptions extends StObject {
  
  var onceNext: js.UndefOr[Boolean] = js.native
  
  var strictNext: js.UndefOr[Boolean] = js.native
}
object ChainOptions {
  
  @scala.inline
  def apply(): ChainOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChainOptions]
  }
  
  @scala.inline
  implicit class ChainOptionsMutableBuilder[Self <: ChainOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnceNext(value: Boolean): Self = StObject.set(x, "onceNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnceNextUndefined: Self = StObject.set(x, "onceNext", js.undefined)
    
    @scala.inline
    def setStrictNext(value: Boolean): Self = StObject.set(x, "strictNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictNextUndefined: Self = StObject.set(x, "strictNext", js.undefined)
  }
}
