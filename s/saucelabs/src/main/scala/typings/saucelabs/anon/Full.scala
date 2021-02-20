package typings.saucelabs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Full extends StObject {
  
  var full: js.UndefOr[Boolean] = js.native
}
object Full {
  
  @scala.inline
  def apply(): Full = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Full]
  }
  
  @scala.inline
  implicit class FullMutableBuilder[Self <: Full] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFull(value: Boolean): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
  }
}
