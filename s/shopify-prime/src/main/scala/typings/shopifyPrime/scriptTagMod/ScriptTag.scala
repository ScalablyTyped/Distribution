package typings.shopifyPrime.scriptTagMod

import typings.shopifyPrime.baseMod.ShopifyObject
import typings.shopifyPrime.scriptTagDisplayScopeMod.ScriptTagDisplayScope
import typings.shopifyPrime.shopifyPrimeStrings.onload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScriptTag extends ShopifyObject {
  /**
    * The date and time the script tag was created.
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * Where the script tag should be included on the store. Known values are 'online_store', 'order_status' or 'all'. Defaults to 'all'.
    */
  var display_scope: js.UndefOr[ScriptTagDisplayScope] = js.native
  /**
    * DOM event which triggers the loading of the script. Currently, 'onload' is the only accepted value.
    */
  var event: js.UndefOr[onload] = js.native
  /**
    * Specifies the src of the script tag, i.e. which URL to load it from.
    */
  var src: String = js.native
  /**
    * The date and time the script tag was updated.
    */
  var updated_at: js.UndefOr[String] = js.native
}

object ScriptTag {
  @scala.inline
  def apply(src: String): ScriptTag = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptTag]
  }
  @scala.inline
  implicit class ScriptTagOps[Self <: ScriptTag] (val x: Self) extends AnyVal {
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
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated_at: Self = this.set("created_at", js.undefined)
    @scala.inline
    def setDisplay_scope(value: ScriptTagDisplayScope): Self = this.set("display_scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay_scope: Self = this.set("display_scope", js.undefined)
    @scala.inline
    def setEvent(value: onload): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    @scala.inline
    def setUpdated_at(value: String): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated_at: Self = this.set("updated_at", js.undefined)
  }
  
}

