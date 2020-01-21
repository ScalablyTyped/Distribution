package typings.storybookReactNative.storyListViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var data: js.Array[_]
  var originalData: js.Array[_]
}

object State {
  @scala.inline
  def apply(data: js.Array[_], originalData: js.Array[_]): State = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], originalData = originalData.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[State]
  }
}

