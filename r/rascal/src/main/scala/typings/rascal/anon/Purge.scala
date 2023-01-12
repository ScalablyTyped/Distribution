package typings.rascal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Purge extends StObject {
  
  var assert: Boolean
  
  var options: Durable
  
  var purge: Boolean
}
object Purge {
  
  inline def apply(assert: Boolean, options: Durable, purge: Boolean): Purge = {
    val __obj = js.Dynamic.literal(assert = assert.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], purge = purge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Purge]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Purge] (val x: Self) extends AnyVal {
    
    inline def setAssert(value: Boolean): Self = StObject.set(x, "assert", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: Durable): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setPurge(value: Boolean): Self = StObject.set(x, "purge", value.asInstanceOf[js.Any])
  }
}
