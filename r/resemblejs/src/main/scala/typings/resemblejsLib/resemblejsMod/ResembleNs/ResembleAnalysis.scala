package typings
package resemblejsLib.resemblejsMod.ResembleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResembleAnalysis extends js.Object {
  /**
    * Compare this image to another image, to get resemblance data
    */
  def compareTo(fileData: java.lang.String): ResembleComparison = js.native
  def compareTo(fileData: stdLib.ImageData): ResembleComparison = js.native
  /**
    * Run the analysis on this image and get the result
    */
  def onComplete(callback: js.Function1[/* result */ ResembleAnalysisResult, scala.Unit]): scala.Unit = js.native
}

