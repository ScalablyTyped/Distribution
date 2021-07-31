package typings.sequelize.mod

import typings.sequelize.sequelizeStrings.`primary key`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddPrimaryKeyConstraintOptions
  extends StObject
     with AddConstraintOptions {
  
  var name: js.UndefOr[String] = js.undefined
  
  var `type`: `primary key`
}
object AddPrimaryKeyConstraintOptions {
  
  @scala.inline
  def apply(): AddPrimaryKeyConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("primary key")
    __obj.asInstanceOf[AddPrimaryKeyConstraintOptions]
  }
  
  @scala.inline
  implicit class AddPrimaryKeyConstraintOptionsMutableBuilder[Self <: AddPrimaryKeyConstraintOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: `primary key`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
