package typings.semanticUiSidebar.SemanticUI.Sidebar.ErrorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * @default 'The method you called is not defined.'
    */
  var method: String
  /**
    * @default 'Had to move sidebar. For optimal performance make sure sidebar and pusher are direct children of your body tag'
    */
  var movedSidebar: String
  /**
    * @default 'There were no elements that matched the specified selector'
    */
  var notFound: String
  /**
    * @default 'The overlay setting is no longer supported, use animation: overlay'
    */
  var overlay: String
  /**
    * @default 'Had to add pusher element. For optimal performance make sure body content is inside a pusher element'
    */
  var pusher: String
}

object Impl {
  @scala.inline
  def apply(method: String, movedSidebar: String, notFound: String, overlay: String, pusher: String): Impl = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], movedSidebar = movedSidebar.asInstanceOf[js.Any], notFound = notFound.asInstanceOf[js.Any], overlay = overlay.asInstanceOf[js.Any], pusher = pusher.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
}

