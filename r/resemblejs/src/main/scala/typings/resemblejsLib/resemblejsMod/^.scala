package typings
package resemblejsLib.resemblejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("resemblejs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Retrieve basic analysis for a single image (add compareTo to compare with another).
    */
  def apply(image: java.lang.String | stdLib.ImageData): ResembleAnalysis = js.native
  /**
    * Set the resemblance image output style
    */
  def outputSettings(settings: OutputSettings): js.Function1[/* image */ java.lang.String | stdLib.ImageData, ResembleAnalysis] = js.native
}

