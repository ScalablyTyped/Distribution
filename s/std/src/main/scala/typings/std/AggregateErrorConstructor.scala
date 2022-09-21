package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggregateErrorConstructor
  extends StObject
     with /* standard es2021.promise */
/* standard es2022.error */
Instantiable1[/* errors */ js.Iterable[Any], AggregateError]
     with Instantiable2[/* errors */ js.Iterable[Any], /* message */ java.lang.String, AggregateError]
     with Instantiable3[
      /* errors */ js.Iterable[Any], 
      (/* message */ java.lang.String) | (/* message */ Unit), 
      /* options */ ErrorOptions, 
      AggregateError
    ] {
  
  /* standard es2021.promise */
  def apply(errors: js.Iterable[Any]): AggregateError = js.native
  def apply(errors: js.Iterable[Any], message: java.lang.String): AggregateError = js.native
  def apply(errors: js.Iterable[Any], message: java.lang.String, options: ErrorOptions): AggregateError = js.native
  def apply(errors: js.Iterable[Any], message: Unit, options: ErrorOptions): AggregateError = js.native
}
