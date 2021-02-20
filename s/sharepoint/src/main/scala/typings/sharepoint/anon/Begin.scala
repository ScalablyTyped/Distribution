package typings.sharepoint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Begin extends StObject {
  
  var begin: js.Any = js.native
  
  var end: js.Any = js.native
  
  var keys: js.Any = js.native
}
object Begin {
  
  @scala.inline
  def apply(begin: js.Any, end: js.Any, keys: js.Any): Begin = {
    val __obj = js.Dynamic.literal(begin = begin.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Begin]
  }
  
  @scala.inline
  implicit class BeginMutableBuilder[Self <: Begin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBegin(value: js.Any): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: js.Any): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeys(value: js.Any): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
  }
}
