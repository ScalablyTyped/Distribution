package typings.rfc4648.codecMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  var loose: js.UndefOr[Boolean] = js.undefined
  var out: js.UndefOr[Instantiable1[/* size */ Double, NumberDictionary[Double]]] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(
    loose: js.UndefOr[Boolean] = js.undefined,
    out: Instantiable1[/* size */ Double, NumberDictionary[Double]] = null
  ): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(loose)) __obj.updateDynamic("loose")(loose.asInstanceOf[js.Any])
    if (out != null) __obj.updateDynamic("out")(out.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseOptions]
  }
}

