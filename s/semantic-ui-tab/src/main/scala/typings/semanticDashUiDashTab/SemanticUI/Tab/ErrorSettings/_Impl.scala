package typings.semanticDashUiDashTab.SemanticUI.Tab.ErrorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'You attempted to load content without API module'
    */
  var api: String
  /**
    * @default 'The method you called is not defined'
    */
  var method: String
  /**
    * @default 'Activated tab cannot be found for this context.'
    */
  var missingTab: String
  /**
    * @default 'The tab you specified is missing a content url.'
    */
  var noContent: String
  /**
    * @default 'History enabled, but no path was specified'
    */
  var path: String
  /**
    * @default 'Max recursive depth reached'
    */
  var recursion: String
  /**
    * @default 'The state library has not been initialized'
    */
  var state: String
}

object _Impl {
  @scala.inline
  def apply(
    api: String,
    method: String,
    missingTab: String,
    noContent: String,
    path: String,
    recursion: String,
    state: String
  ): _Impl = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], missingTab = missingTab.asInstanceOf[js.Any], noContent = noContent.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], recursion = recursion.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Impl]
  }
}

