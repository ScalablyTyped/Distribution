package typings
package semanticDashUiDashSidebarLib.SemanticUINs.SidebarNs.ErrorSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'The method you called is not defined.'
    */
  var method: java.lang.String
  /**
    * @default 'Had to move sidebar. For optimal performance make sure sidebar and pusher are direct children of your body tag'
    */
  var movedSidebar: java.lang.String
  /**
    * @default 'There were no elements that matched the specified selector'
    */
  var notFound: java.lang.String
  /**
    * @default 'The overlay setting is no longer supported, use animation: overlay'
    */
  var overlay: java.lang.String
  /**
    * @default 'Had to add pusher element. For optimal performance make sure body content is inside a pusher element'
    */
  var pusher: java.lang.String
}

object _Impl {
  @scala.inline
  def apply(
    method: java.lang.String,
    movedSidebar: java.lang.String,
    notFound: java.lang.String,
    overlay: java.lang.String,
    pusher: java.lang.String
  ): _Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("movedSidebar")(movedSidebar)
    __obj.updateDynamic("notFound")(notFound)
    __obj.updateDynamic("overlay")(overlay)
    __obj.updateDynamic("pusher")(pusher)
    __obj.asInstanceOf[_Impl]
  }
}

