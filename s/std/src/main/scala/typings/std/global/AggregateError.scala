package typings.std.global

import typings.std.AggregateErrorConstructor
import typings.std.ErrorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("AggregateError")
@js.native
open class AggregateError protected ()
  extends StObject
     with typings.std.AggregateError {
  /* standard es2021.promise */
  def this(errors: js.Iterable[Any]) = this()
  def this(errors: js.Iterable[Any], message: java.lang.String) = this()
  def this(errors: js.Iterable[Any], message: java.lang.String, options: ErrorOptions) = this()
  def this(errors: js.Iterable[Any], message: Unit, options: ErrorOptions) = this()
  
  /* standard es2021.promise */
  /* CompleteClass */
  var errors: js.Array[Any] = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: java.lang.String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: java.lang.String = js.native
}
object AggregateError {
  
  inline def apply: AggregateErrorConstructor = js.Dynamic.global.selectDynamic("AggregateError").asInstanceOf[AggregateErrorConstructor]
}
