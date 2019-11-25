package typings.resemblejs.resemblejsMod

import typings.resemblejs.Anon_Blue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputSettings extends js.Object {
  var errorColor: Anon_Blue
  var errorType: String
  var largeImageThreshold: Double
  var transparency: Double
}

object OutputSettings {
  @scala.inline
  def apply(errorColor: Anon_Blue, errorType: String, largeImageThreshold: Double, transparency: Double): OutputSettings = {
    val __obj = js.Dynamic.literal(errorColor = errorColor.asInstanceOf[js.Any], errorType = errorType.asInstanceOf[js.Any], largeImageThreshold = largeImageThreshold.asInstanceOf[js.Any], transparency = transparency.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OutputSettings]
  }
}

@JSImport("resemblejs", "outputSettings")
@js.native
object outputSettings extends js.Object {
  /**
    * Set the resemblance image output style
    */
  def apply(settings: OutputSettings): js.Any = js.native
}

