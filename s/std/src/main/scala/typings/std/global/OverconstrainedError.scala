package typings.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("OverconstrainedError")
@js.native
open class OverconstrainedError protected ()
  extends StObject
     with typings.std.OverconstrainedError {
  /* standard dom */
  def this(constraint: java.lang.String) = this()
  def this(constraint: java.lang.String, message: java.lang.String) = this()
  
  /* standard dom */
  /* CompleteClass */
  override val constraint: java.lang.String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: java.lang.String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: java.lang.String = js.native
}
