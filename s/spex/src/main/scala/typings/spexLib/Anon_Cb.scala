package typings
package spexLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cb extends js.Object {
  var cb: js.UndefOr[
    js.Function4[
      /* index */ scala.Double, 
      /* success */ scala.Boolean, 
      /* result */ js.Any, 
      /* delay */ scala.Double, 
      _
    ]
  ] = js.undefined
}

object Anon_Cb {
  @scala.inline
  def apply(
    cb: js.Function4[
      /* index */ scala.Double, 
      /* success */ scala.Boolean, 
      /* result */ js.Any, 
      /* delay */ scala.Double, 
      _
    ] = null
  ): Anon_Cb = {
    val __obj = js.Dynamic.literal()
    if (cb != null) __obj.updateDynamic("cb")(cb)
    __obj.asInstanceOf[Anon_Cb]
  }
}

