package typings.sequelize.anon

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Constraint extends StObject {
  
  var constraint: js.UndefOr[String] = js.native
  
  var fields: js.UndefOr[js.Array[String]] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var parent: js.UndefOr[Error] = js.native
  
  var table: js.UndefOr[String] = js.native
}
object Constraint {
  
  @scala.inline
  def apply(): Constraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Constraint]
  }
  
  @scala.inline
  implicit class ConstraintMutableBuilder[Self <: Constraint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConstraint(value: String): Self = StObject.set(x, "constraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstraintUndefined: Self = StObject.set(x, "constraint", js.undefined)
    
    @scala.inline
    def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setParent(value: Error): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
  }
}
