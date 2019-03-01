package typings
package semanticDashUiDashTabLib.SemanticUINs.TabNs.ErrorSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'You attempted to load content without API module'
    */
  var api: java.lang.String
  /**
    * @default 'The method you called is not defined'
    */
  var method: java.lang.String
  /**
    * @default 'Activated tab cannot be found for this context.'
    */
  var missingTab: java.lang.String
  /**
    * @default 'The tab you specified is missing a content url.'
    */
  var noContent: java.lang.String
  /**
    * @default 'History enabled, but no path was specified'
    */
  var path: java.lang.String
  /**
    * @default 'Max recursive depth reached'
    */
  var recursion: java.lang.String
  /**
    * @default 'The state library has not been initialized'
    */
  var state: java.lang.String
}

object _Impl {
  @scala.inline
  def apply(
    api: java.lang.String,
    method: java.lang.String,
    missingTab: java.lang.String,
    noContent: java.lang.String,
    path: java.lang.String,
    recursion: java.lang.String,
    state: java.lang.String
  ): _Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("api")(api)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("missingTab")(missingTab)
    __obj.updateDynamic("noContent")(noContent)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("recursion")(recursion)
    __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[_Impl]
  }
}

