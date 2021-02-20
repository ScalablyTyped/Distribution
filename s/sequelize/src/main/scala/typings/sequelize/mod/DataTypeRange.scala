package typings.sequelize.mod

import typings.sequelize.anon.Subtype
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataTypeRange extends DataTypeAbstract {
  
  /**
    * Range field for Postgre
    *
    * Accepts subtype any of the ranges
    */
  def apply(): DataTypeRange = js.native
  def apply(options: Subtype): DataTypeRange = js.native
  def apply(subtype: DataTypeAbstract): DataTypeRange = js.native
}
