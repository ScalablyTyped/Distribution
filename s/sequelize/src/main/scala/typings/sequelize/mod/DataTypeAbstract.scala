package typings.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
//  DataTypes
// ~~~~~~~~~~~
//
//  https://github.com/sequelize/sequelize/blob/v3.4.1/lib/data-types.js
//
/**
  * Abstract DataType interface. Use this if you want to create an interface that has a value any of the
  * DataTypes that Sequelize supports.
  */
@js.native
trait DataTypeAbstract extends js.Object {
  
  /**
    * Although this is not needed for the definitions itself, we want to make sure that DataTypeAbstract is not
    * something than can be evaluated to an empty object.
    */
  var dialectTypes: String = js.native
}
object DataTypeAbstract {
  
  @scala.inline
  def apply(dialectTypes: String): DataTypeAbstract = {
    val __obj = js.Dynamic.literal(dialectTypes = dialectTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTypeAbstract]
  }
  
  @scala.inline
  implicit class DataTypeAbstractOps[Self <: DataTypeAbstract] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDialectTypes(value: String): Self = this.set("dialectTypes", value.asInstanceOf[js.Any])
  }
}
