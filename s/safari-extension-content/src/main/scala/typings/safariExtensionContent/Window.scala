package typings.safariExtensionContent

import typings.safariExtensionContent.anon.Typeofsafari
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var safari: Typeofsafari
}
object Window {
  
  inline def apply(safari: Typeofsafari): Window = {
    val __obj = js.Dynamic.literal(safari = safari.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    inline def setSafari(value: Typeofsafari): Self = StObject.set(x, "safari", value.asInstanceOf[js.Any])
  }
}
