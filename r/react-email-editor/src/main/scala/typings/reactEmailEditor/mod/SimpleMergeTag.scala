package typings.reactEmailEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleMergeTag extends MergeTag {
  
  val name: String = js.native
  
  val value: String = js.native
}
object SimpleMergeTag {
  
  @scala.inline
  def apply(name: String, value: String): SimpleMergeTag = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleMergeTag]
  }
  
  @scala.inline
  implicit class SimpleMergeTagMutableBuilder[Self <: SimpleMergeTag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
