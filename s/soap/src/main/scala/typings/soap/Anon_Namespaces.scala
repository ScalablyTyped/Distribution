package typings.soap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Namespaces extends js.Object {
  var namespaces: js.UndefOr[js.Array[String]] = js.undefined
  var `override`: js.UndefOr[Boolean] = js.undefined
}

object Anon_Namespaces {
  @scala.inline
  def apply(namespaces: js.Array[String] = null, `override`: js.UndefOr[Boolean] = js.undefined): Anon_Namespaces = {
    val __obj = js.Dynamic.literal()
    if (namespaces != null) __obj.updateDynamic("namespaces")(namespaces)
    if (!js.isUndefined(`override`)) __obj.updateDynamic("override")(`override`)
    __obj.asInstanceOf[Anon_Namespaces]
  }
}

