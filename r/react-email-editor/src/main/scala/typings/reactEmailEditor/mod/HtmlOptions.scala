package typings.reactEmailEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HtmlOptions extends StObject {
  
  val cleanup: Boolean
  
  val minify: Boolean
}
object HtmlOptions {
  
  inline def apply(cleanup: Boolean, minify: Boolean): HtmlOptions = {
    val __obj = js.Dynamic.literal(cleanup = cleanup.asInstanceOf[js.Any], minify = minify.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlOptions]
  }
  
  extension [Self <: HtmlOptions](x: Self) {
    
    inline def setCleanup(value: Boolean): Self = StObject.set(x, "cleanup", value.asInstanceOf[js.Any])
    
    inline def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
  }
}
