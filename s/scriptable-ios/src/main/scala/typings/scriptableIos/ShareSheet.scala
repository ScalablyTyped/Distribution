package typings.scriptableIos

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _Offers standard activities to perform on items._
  * @see https://docs.scriptable.app/sharesheet
  */
@JSGlobal("ShareSheet")
@js.native
object ShareSheet extends js.Object {
  /**
    * _Presents the activity picker._
    *
    * Presents a share sheet with an array of items to share. The activities included in the presented sheet will vary based on the type of item.
    * @param activityItems - Items to perform activity on.
    * @see https://docs.scriptable.app/sharesheet/#present
    */
  def present(activityItems: js.Array[_]): js.Promise[_] = js.native
}

