package typings.rbx.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transparent extends StObject {
  
  var transparent: Boolean = js.native
}
object Transparent {
  
  @scala.inline
  def apply(transparent: Boolean): Transparent = {
    val __obj = js.Dynamic.literal(transparent = transparent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transparent]
  }
  
  @scala.inline
  implicit class TransparentMutableBuilder[Self <: Transparent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
  }
}
