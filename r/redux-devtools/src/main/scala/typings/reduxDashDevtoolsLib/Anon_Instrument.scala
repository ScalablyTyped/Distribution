package typings
package reduxDashDevtoolsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Instrument extends js.Object {
  def instrument(): js.Function1[/* opts */ js.Any, _]
}

object Anon_Instrument {
  @scala.inline
  def apply(instrument: () => js.Function1[/* opts */ js.Any, _]): Anon_Instrument = {
    val __obj = js.Dynamic.literal(instrument = js.Any.fromFunction0(instrument))
  
    __obj.asInstanceOf[Anon_Instrument]
  }
}

