package typings.sequelize.mod

import typings.sequelize.anon.Decimals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataTypeDouble extends DataTypeAbstractNumber[DataTypeDouble] {
  
  /**
    * Length of the number field and decimals of the real
    */
  def apply(): DataTypeDouble = js.native
  def apply(length: Double): DataTypeDouble = js.native
  def apply(length: Double, decimals: Double): DataTypeDouble = js.native
  def apply(options: Decimals): DataTypeDouble = js.native
}
