package typings
package reactDashNativeDashElementsLib.reactDashNativeDashElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementObject extends js.Object {
  var element: reactLib.reactMod.ReactNs.ReactElement[js.Object] | reactLib.reactMod.ReactNs.ReactType[_]
}

object ElementObject {
  @scala.inline
  def apply(
    element: reactLib.reactMod.ReactNs.ReactElement[js.Object] | reactLib.reactMod.ReactNs.ReactType[_]
  ): ElementObject = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ElementObject]
  }
}

