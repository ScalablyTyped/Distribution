package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait DataTypeAbstract extends StObject {
  
  /**
    * Although this is not needed for the definitions itself, we want to make sure that DataTypeAbstract is not
    * something than can be evaluated to an empty object.
    */
  var dialectTypes: String
}
object DataTypeAbstract {
  
  @scala.inline
  def apply(dialectTypes: String): DataTypeAbstract = {
    val __obj = js.Dynamic.literal(dialectTypes = dialectTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTypeAbstract]
  }
  
  @scala.inline
  implicit class DataTypeAbstractMutableBuilder[Self <: DataTypeAbstract] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialectTypes(value: String): Self = StObject.set(x, "dialectTypes", value.asInstanceOf[js.Any])
  }
}
