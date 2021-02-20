package typings.rethinkdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NoReplyWait extends StObject {
  
  var noreplyWait: Boolean = js.native
}
object NoReplyWait {
  
  @scala.inline
  def apply(noreplyWait: Boolean): NoReplyWait = {
    val __obj = js.Dynamic.literal(noreplyWait = noreplyWait.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoReplyWait]
  }
  
  @scala.inline
  implicit class NoReplyWaitMutableBuilder[Self <: NoReplyWait] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNoreplyWait(value: Boolean): Self = StObject.set(x, "noreplyWait", value.asInstanceOf[js.Any])
  }
}
