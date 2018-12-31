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

