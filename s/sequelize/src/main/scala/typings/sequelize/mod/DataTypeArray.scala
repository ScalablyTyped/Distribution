package typings.sequelize.mod

import typings.sequelize.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataTypeArray
  extends StObject
     with DataTypeAbstract {
  
  /**
    * Array field for Postgre
    *
    * Accepts type any of the DataTypes
    */
  def apply(options: Type): DataTypeArray = js.native
  def apply(`type`: DataTypeAbstract): DataTypeArray = js.native
}
