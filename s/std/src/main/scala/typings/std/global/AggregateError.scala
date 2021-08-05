package typings.std.global

import typings.std.AggregateErrorConstructor
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("AggregateError")
@js.native
class AggregateError protected ()
  extends StObject
     with typings.std.AggregateError {
  def this(errors: Iterable[js.Any]) = this()
  def this(errors: Iterable[js.Any], message: java.lang.String) = this()
  
  /* CompleteClass */
  var errors: js.Array[js.Any] = js.native
  
  /* CompleteClass */
  var message: java.lang.String = js.native
  
  /* CompleteClass */
  var name: java.lang.String = js.native
}
object AggregateError {
  
  inline def apply: AggregateErrorConstructor = js.Dynamic.global.selectDynamic("AggregateError").asInstanceOf[AggregateErrorConstructor]
}
