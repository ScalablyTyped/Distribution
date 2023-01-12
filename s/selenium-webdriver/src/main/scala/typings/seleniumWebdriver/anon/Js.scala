package typings.seleniumWebdriver.anon

import typings.seleniumWebdriver.libByMod.ByHash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Js
  extends StObject
     with ByHash {
  
  @JSName("js")
  var js_ : String
}
object Js {
  
  inline def apply(js_ : String): Js = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Js]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Js] (val x: Self) extends AnyVal {
    
    inline def setJs_(value: String): Self = StObject.set(x, "js", value.asInstanceOf[js.Any])
  }
}
