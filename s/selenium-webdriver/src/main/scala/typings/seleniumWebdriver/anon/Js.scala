package typings.seleniumWebdriver.anon

import typings.seleniumWebdriver.byMod.ByHash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Js extends ByHash {
  
  @JSName("js")
  var js_ : String = js.native
}
object Js {
  
  @scala.inline
  def apply(js_ : String): Js = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Js]
  }
  
  @scala.inline
  implicit class JsMutableBuilder[Self <: Js] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJs_(value: String): Self = StObject.set(x, "js", value.asInstanceOf[js.Any])
  }
}
