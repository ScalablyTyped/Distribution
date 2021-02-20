package typings.shelljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchOptionsArray extends StObject {
  
  var `-d`: js.UndefOr[String] = js.native
  
  var `-r`: js.UndefOr[String] = js.native
}
object TouchOptionsArray {
  
  @scala.inline
  def apply(): TouchOptionsArray = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchOptionsArray]
  }
  
  @scala.inline
  implicit class TouchOptionsArrayMutableBuilder[Self <: TouchOptionsArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `set-d`(value: String): Self = StObject.set(x, "-d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-dUndefined`: Self = StObject.set(x, "-d", js.undefined)
    
    @scala.inline
    def `set-r`(value: String): Self = StObject.set(x, "-r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-rUndefined`: Self = StObject.set(x, "-r", js.undefined)
  }
}
