package typings.seleniumWebdriver.anon

import typings.seleniumWebdriver.libByMod.ByHash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Css
  extends StObject
     with ByHash {
  
  var css: String
}
object Css {
  
  inline def apply(css: String): Css = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any])
    __obj.asInstanceOf[Css]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Css] (val x: Self) extends AnyVal {
    
    inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
  }
}
