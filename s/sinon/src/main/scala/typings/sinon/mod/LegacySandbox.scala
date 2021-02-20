package typings.sinon.mod

import typings.sinon.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LegacySandbox extends StObject {
  
  var sandbox: `0` = js.native
}
object LegacySandbox {
  
  @scala.inline
  def apply(sandbox: `0`): LegacySandbox = {
    val __obj = js.Dynamic.literal(sandbox = sandbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegacySandbox]
  }
  
  @scala.inline
  implicit class LegacySandboxMutableBuilder[Self <: LegacySandbox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSandbox(value: `0`): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
  }
}
