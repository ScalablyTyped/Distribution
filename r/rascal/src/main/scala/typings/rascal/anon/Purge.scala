package typings.rascal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Purge extends StObject {
  
  var assert: Boolean = js.native
  
  var options: Durable = js.native
  
  var purge: Boolean = js.native
}
object Purge {
  
  @scala.inline
  def apply(assert: Boolean, options: Durable, purge: Boolean): Purge = {
    val __obj = js.Dynamic.literal(assert = assert.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], purge = purge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Purge]
  }
  
  @scala.inline
  implicit class PurgeMutableBuilder[Self <: Purge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssert(value: Boolean): Self = StObject.set(x, "assert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: Durable): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurge(value: Boolean): Self = StObject.set(x, "purge", value.asInstanceOf[js.Any])
  }
}
