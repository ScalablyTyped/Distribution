package typings.sequelize.mod

import typings.sequelize.anon.Length
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataTypeTinyInt
  extends StObject
     with DataTypeAbstractNumber[DataTypeTinyInt] {
  
  /**
    * Length of the number field.
    */
  def apply(): DataTypeTinyInt = js.native
  def apply(length: Double): DataTypeTinyInt = js.native
  def apply(options: Length): DataTypeTinyInt = js.native
}
