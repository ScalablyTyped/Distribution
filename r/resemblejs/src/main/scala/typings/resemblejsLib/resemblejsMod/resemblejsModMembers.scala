package typings
package resemblejsLib.resemblejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("resemblejs", JSImport.Namespace)
@js.native
object resemblejsModMembers extends js.Object {
  /**
    * Retrieve basic analysis for a single image (add compareTo to compare with another).
    */
  def apply(image: java.lang.String | stdLib.ImageData): resemblejsLib.resemblejsMod.ResembleNs.ResembleAnalysis = js.native
  /**
    * Set the resemblance image output style
    */
  def outputSettings(settings: resemblejsLib.resemblejsMod.ResembleNs.OutputSettings): (js.Function1[
    /* image */ java.lang.String | stdLib.ImageData, 
    resemblejsLib.resemblejsMod.ResembleNs.ResembleAnalysis
  ]) with resemblejsLib.Anon_OutputSettings = js.native
}

