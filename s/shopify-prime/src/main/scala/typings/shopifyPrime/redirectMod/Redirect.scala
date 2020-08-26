package typings.shopifyPrime.redirectMod

import typings.shopifyPrime.baseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Redirect extends ShopifyObject {
  /**
    * The "before" path to be redirected. When the user this path, s/he will be redirected to the path specified by target.
    */
  var path: String = js.native
  /**
    * The "after" path or URL to be redirected to. When the user visits the path specified by path, s/he will be redirected to this path or URL. This property can be set to any path on the shop's site, or any URL, even one on a completely different domain.
    */
  var target: String = js.native
}

object Redirect {
  @scala.inline
  def apply(path: String, target: String): Redirect = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Redirect]
  }
  @scala.inline
  implicit class RedirectOps[Self <: Redirect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

