package typings.prosemirrorView.anon

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mount extends StObject {
  
  var mount: HTMLElement
}
object Mount {
  
  inline def apply(mount: HTMLElement): Mount = {
    val __obj = js.Dynamic.literal(mount = mount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Mount] (val x: Self) extends AnyVal {
    
    inline def setMount(value: HTMLElement): Self = StObject.set(x, "mount", value.asInstanceOf[js.Any])
  }
}
