package typings.sequelize.mod

import typings.sequelize.anon.Precision
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataTypeDecimal extends DataTypeAbstractNumber[DataTypeDecimal] {
  
  /**
    * Precision and scale for the decimal number
    */
  def apply(): DataTypeDecimal = js.native
  def apply(options: Precision): DataTypeDecimal = js.native
  def apply(precision: Double): DataTypeDecimal = js.native
  def apply(precision: Double, scale: Double): DataTypeDecimal = js.native
}
