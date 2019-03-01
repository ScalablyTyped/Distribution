package typings
package ssriLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Algo1Algo2 extends js.Object {
  var pickAlgorithm: js.UndefOr[
    js.Function2[/* algo1 */ java.lang.String, /* algo2 */ java.lang.String, java.lang.String]
  ] = js.undefined
}

object Anon_Algo1Algo2 {
  @scala.inline
  def apply(
    pickAlgorithm: js.Function2[/* algo1 */ java.lang.String, /* algo2 */ java.lang.String, java.lang.String] = null
  ): Anon_Algo1Algo2 = {
    val __obj = js.Dynamic.literal()
    if (pickAlgorithm != null) __obj.updateDynamic("pickAlgorithm")(pickAlgorithm)
    __obj.asInstanceOf[Anon_Algo1Algo2]
  }
}

