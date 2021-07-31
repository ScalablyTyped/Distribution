package typings.rethinkdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Index extends StObject {
  
  var index: String
  
  var left_bound: js.UndefOr[String] = js.undefined
  
  // 'closed'
  var right_bound: js.UndefOr[String] = js.undefined
}
object Index {
  
  @scala.inline
  def apply(index: String): Index = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
  
  @scala.inline
  implicit class IndexMutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft_bound(value: String): Self = StObject.set(x, "left_bound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft_boundUndefined: Self = StObject.set(x, "left_bound", js.undefined)
    
    @scala.inline
    def setRight_bound(value: String): Self = StObject.set(x, "right_bound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight_boundUndefined: Self = StObject.set(x, "right_bound", js.undefined)
  }
}
