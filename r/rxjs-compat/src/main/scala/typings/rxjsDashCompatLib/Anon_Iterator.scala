package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Iterator extends js.Object {
  var iterator: js.Symbol
  var observable: java.lang.String | js.Symbol
  var rxSubscriber: java.lang.String | js.Symbol
}

object Anon_Iterator {
  @scala.inline
  def apply(
    iterator: js.Symbol,
    observable: java.lang.String | js.Symbol,
    rxSubscriber: java.lang.String | js.Symbol
  ): Anon_Iterator = {
    val __obj = js.Dynamic.literal(iterator = iterator, observable = observable.asInstanceOf[js.Any], rxSubscriber = rxSubscriber.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Iterator]
  }
}

