package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadLinkResult extends StObject {
  
  /** The keypath of the source in the host instance. */
  var keypath: String = js.native
  
  /** The Ractive instance that hosts the source keypath. */
  var ractive: Ractive[Ractive[_]] = js.native
}
object ReadLinkResult {
  
  @scala.inline
  def apply(keypath: String, ractive: Ractive[Ractive[_]]): ReadLinkResult = {
    val __obj = js.Dynamic.literal(keypath = keypath.asInstanceOf[js.Any], ractive = ractive.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadLinkResult]
  }
  
  @scala.inline
  implicit class ReadLinkResultMutableBuilder[Self <: ReadLinkResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeypath(value: String): Self = StObject.set(x, "keypath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRactive(value: Ractive[Ractive[_]]): Self = StObject.set(x, "ractive", value.asInstanceOf[js.Any])
  }
}
