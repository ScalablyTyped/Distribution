package typings.seamless

import typings.seamless.Seamless.Static
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStatic extends StObject {
  
  var seamless: Static = js.native
}
object JQueryStatic {
  
  @scala.inline
  def apply(seamless: Static): JQueryStatic = {
    val __obj = js.Dynamic.literal(seamless = seamless.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit class JQueryStaticMutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSeamless(value: Static): Self = StObject.set(x, "seamless", value.asInstanceOf[js.Any])
  }
}
