package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("sequelize", "TimeoutError")
@js.native
class TimeoutErrorCls protected ()
  extends StObject
     with TimeoutError {
  /**
    * Thrown when a database query times out because of a deadlock
    */
  def this(parent: typings.std.Error) = this()
  
  /* CompleteClass */
  var message: String = js.native
  
  /* CompleteClass */
  var name: String = js.native
}
