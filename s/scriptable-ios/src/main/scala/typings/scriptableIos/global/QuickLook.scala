package typings.scriptableIos.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Presents an item._
  * @see https://docs.scriptable.app/quicklook
  */
@JSGlobal("QuickLook")
@js.native
object QuickLook extends js.Object {
  
  /**
    * _Presents the item._
    *
    * Chooses the best suited presentation of the item and performs the presentation if possible.
    * @param item - Item to be present.
    * @param fullscreen - Optional. Set to true to present the item in fullscreen. This only has an effect when used within the app. Defaults to false.
    * @see https://docs.scriptable.app/quicklook/#present
    */
  def present(item: js.Any): js.Promise[Unit] = js.native
  def present(item: js.Any, fullscreen: Boolean): js.Promise[Unit] = js.native
}
