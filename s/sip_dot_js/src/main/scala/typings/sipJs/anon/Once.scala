package typings.sipJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Once extends StObject {
  
  var once: js.UndefOr[Boolean] = js.undefined
}
object Once {
  
  @scala.inline
  def apply(): Once = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Once]
  }
  
  @scala.inline
  implicit class OnceMutableBuilder[Self <: Once] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
  }
}
