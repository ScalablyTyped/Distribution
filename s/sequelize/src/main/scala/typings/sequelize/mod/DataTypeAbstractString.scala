package typings.sequelize.mod

import typings.sequelize.anon.Length
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataTypeAbstractString[T] extends DataTypeAbstract {
  
  /**
    * A variable length string. Default length 255
    */
  def apply(): T = js.native
  def apply(length: Double): T = js.native
  def apply(options: Length): T = js.native
  
  /**
    * Property BINARY for the type
    */
  var BINARY: T = js.native
}
