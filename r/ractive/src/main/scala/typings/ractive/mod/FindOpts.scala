package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindOpts extends StObject {
  
  /**
  	 * Whether or not to include attached children when searching.j
  	 */
  var remote: js.UndefOr[Boolean] = js.native
}
object FindOpts {
  
  @scala.inline
  def apply(): FindOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindOpts]
  }
  
  @scala.inline
  implicit class FindOptsMutableBuilder[Self <: FindOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemote(value: Boolean): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteUndefined: Self = StObject.set(x, "remote", js.undefined)
  }
}
