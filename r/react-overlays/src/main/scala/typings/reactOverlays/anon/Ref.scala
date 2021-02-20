package typings.reactOverlays.anon

import typings.react.mod.CSSProperties
import typings.react.mod.RefCallback
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ref extends StObject {
  
  var ref: RefCallback[HTMLElement] = js.native
  
  var style: CSSProperties = js.native
}
object Ref {
  
  @scala.inline
  def apply(ref: /* instance */ HTMLElement | Null => Unit, style: CSSProperties): Ref = {
    val __obj = js.Dynamic.literal(ref = js.Any.fromFunction1(ref), style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ref]
  }
  
  @scala.inline
  implicit class RefMutableBuilder[Self <: Ref] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRef(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
