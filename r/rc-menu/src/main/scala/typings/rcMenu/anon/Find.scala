package typings.rcMenu.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Find extends StObject {
  
  var find: Boolean
}
object Find {
  
  @scala.inline
  def apply(find: Boolean): Find = {
    val __obj = js.Dynamic.literal(find = find.asInstanceOf[js.Any])
    __obj.asInstanceOf[Find]
  }
  
  @scala.inline
  implicit class FindMutableBuilder[Self <: Find] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFind(value: Boolean): Self = StObject.set(x, "find", value.asInstanceOf[js.Any])
  }
}
