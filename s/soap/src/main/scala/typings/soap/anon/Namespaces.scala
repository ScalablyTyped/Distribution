package typings.soap.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Namespaces extends js.Object {
  var namespaces: js.UndefOr[js.Array[String]] = js.undefined
  var `override`: js.UndefOr[Boolean] = js.undefined
}

object Namespaces {
  @scala.inline
  def apply(namespaces: js.Array[String] = null, `override`: js.UndefOr[Boolean] = js.undefined): Namespaces = {
    val __obj = js.Dynamic.literal()
    if (namespaces != null) __obj.updateDynamic("namespaces")(namespaces.asInstanceOf[js.Any])
    if (!js.isUndefined(`override`)) __obj.updateDynamic("override")(`override`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Namespaces]
  }
}

