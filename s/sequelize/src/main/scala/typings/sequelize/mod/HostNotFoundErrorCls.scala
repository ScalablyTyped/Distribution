package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("sequelize", "HostNotFoundError")
@js.native
class HostNotFoundErrorCls protected ()
  extends StObject
     with HostNotFoundError {
  /**
    * Thrown when a connection to a database has a hostname that was not found
    */
  def this(parent: typings.std.Error) = this()
  
  /* CompleteClass */
  var message: String = js.native
  
  /* CompleteClass */
  var name: String = js.native
}
