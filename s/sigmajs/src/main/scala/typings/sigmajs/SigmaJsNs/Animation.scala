package typings.sigmajs.SigmaJsNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animation extends js.Object {
  def camera(camera: Camera, target: StringDictionary[js.Any], options: StringDictionary[js.Any]): Double
}

object Animation {
  @scala.inline
  def apply(camera: (Camera, StringDictionary[js.Any], StringDictionary[js.Any]) => Double): Animation = {
    val __obj = js.Dynamic.literal(camera = js.Any.fromFunction3(camera))
  
    __obj.asInstanceOf[Animation]
  }
}

