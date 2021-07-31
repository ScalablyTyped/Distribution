package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("sequelize", "InvalidConnectionError")
@js.native
class InvalidConnectionErrorCls protected ()
  extends StObject
     with InvalidConnectionError {
  /**
    * Thrown when a connection to a database has invalid values for any of the connection parameters
    */
  def this(parent: typings.std.Error) = this()
  
  /* CompleteClass */
  var message: String = js.native
  
  /* CompleteClass */
  var name: String = js.native
}
