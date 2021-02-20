package typings.sequelize.mod

import typings.sequelize.sequelizeStrings.check
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddCheckConstraintOptions extends AddConstraintOptions {
  
  var name: js.UndefOr[String] = js.native
  
  var `type`: check = js.native
  
  var where: js.UndefOr[AnyWhereOptions] = js.native
}
object AddCheckConstraintOptions {
  
  @scala.inline
  def apply(`type`: check): AddCheckConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCheckConstraintOptions]
  }
  
  @scala.inline
  implicit class AddCheckConstraintOptionsMutableBuilder[Self <: AddCheckConstraintOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: check): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhere(value: AnyWhereOptions): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
  }
}
