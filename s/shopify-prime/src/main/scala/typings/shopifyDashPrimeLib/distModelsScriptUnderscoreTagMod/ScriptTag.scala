package typings
package shopifyDashPrimeLib.distModelsScriptUnderscoreTagMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScriptTag
  extends shopifyDashPrimeLib.distModelsBaseMod.ShopifyObject {
  /**
    * The date and time the script tag was created.
    */
  var created_at: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Where the script tag should be included on the store. Known values are 'online_store', 'order_status' or 'all'. Defaults to 'all'.
    */
  var display_scope: js.UndefOr[
    shopifyDashPrimeLib.distEnumsScriptUnderscoreTagUnderscoreDisplayUnderscoreScopeMod.ScriptTagDisplayScope
  ] = js.undefined
  /**
    * DOM event which triggers the loading of the script. Currently, 'onload' is the only accepted value.
    */
  var event: js.UndefOr[shopifyDashPrimeLib.shopifyDashPrimeLibStrings.onload] = js.undefined
  /**
    * Specifies the src of the script tag, i.e. which URL to load it from.
    */
  var src: java.lang.String
  /**
    * The date and time the script tag was updated.
    */
  var updated_at: js.UndefOr[java.lang.String] = js.undefined
}

object ScriptTag {
  @scala.inline
  def apply(
    src: java.lang.String,
    admin_graphql_api_id: java.lang.String = null,
    created_at: java.lang.String = null,
    display_scope: shopifyDashPrimeLib.distEnumsScriptUnderscoreTagUnderscoreDisplayUnderscoreScopeMod.ScriptTagDisplayScope = null,
    event: shopifyDashPrimeLib.shopifyDashPrimeLibStrings.onload = null,
    id: scala.Int | scala.Double = null,
    updated_at: java.lang.String = null
  ): ScriptTag = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("src")(src)
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id)
    if (created_at != null) __obj.updateDynamic("created_at")(created_at)
    if (display_scope != null) __obj.updateDynamic("display_scope")(display_scope.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at)
    __obj.asInstanceOf[ScriptTag]
  }
}

