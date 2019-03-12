package typings
package sigmajsLib.SigmaJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animation extends js.Object {
  def camera(
    camera: Camera,
    target: org.scalablytyped.runtime.StringDictionary[js.Any],
    options: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Double
}

object Animation {
  @scala.inline
  def apply(
    camera: (Camera, org.scalablytyped.runtime.StringDictionary[js.Any], org.scalablytyped.runtime.StringDictionary[js.Any]) => scala.Double
  ): Animation = {
    val __obj = js.Dynamic.literal(camera = js.Any.fromFunction3(camera))
  
    __obj.asInstanceOf[Animation]
  }
}

