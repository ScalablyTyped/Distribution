package typings.steelseries.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("steelseries", "LedColor")
@js.native
open class LedColor protected () extends StObject {
  def this(
    innerColor1_ON: String,
    innerColor2_ON: String,
    outerColor_ON: String,
    coronaColor: String,
    innerColor1_OFF: String,
    innerColor2_OFF: String,
    outerColor_OFF: String
  ) = this()
  
  var coronaColor: String = js.native
  
  var innerColor1_OFF: String = js.native
  
  var innerColor1_ON: String = js.native
  
  var innerColor2_OFF: String = js.native
  
  var innerColor2_ON: String = js.native
  
  var outerColor_OFF: String = js.native
  
  var outerColor_ON: String = js.native
}
object LedColor {
  
  @JSImport("steelseries", "LedColor.BLUE_LED")
  @js.native
  val BLUE_LED: LedColor = js.native
  
  @JSImport("steelseries", "LedColor.CYAN_LED")
  @js.native
  val CYAN_LED: LedColor = js.native
  
  @JSImport("steelseries", "LedColor.GREEN_LED")
  @js.native
  val GREEN_LED: LedColor = js.native
  
  @JSImport("steelseries", "LedColor.MAGENTA_LED")
  @js.native
  val MAGENTA_LED: LedColor = js.native
  
  @JSImport("steelseries", "LedColor.ORANGE_LED")
  @js.native
  val ORANGE_LED: LedColor = js.native
  
  @JSImport("steelseries", "LedColor.RED_LED")
  @js.native
  val RED_LED: LedColor = js.native
  
  @JSImport("steelseries", "LedColor.YELLOW_LED")
  @js.native
  val YELLOW_LED: LedColor = js.native
}
