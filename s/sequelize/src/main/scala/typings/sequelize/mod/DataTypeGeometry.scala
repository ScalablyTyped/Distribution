package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataTypeGeometry
  extends StObject
     with DataTypeAbstract {
  
  /**
    * Geometry field for Postgres
    */
  def apply(`type`: String): DataTypeGeometry = js.native
  def apply(`type`: String, srid: Double): DataTypeGeometry = js.native
}
