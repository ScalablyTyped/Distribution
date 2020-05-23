package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AggregateErrorConstructor
  extends Instantiable1[/* errors */ Iterable[js.Any], AggregateError]
     with Instantiable2[/* errors */ Iterable[js.Any], /* message */ java.lang.String, AggregateError] {
  def apply(errors: Iterable[_]): AggregateError = js.native
  def apply(errors: Iterable[_], message: java.lang.String): AggregateError = js.native
}

