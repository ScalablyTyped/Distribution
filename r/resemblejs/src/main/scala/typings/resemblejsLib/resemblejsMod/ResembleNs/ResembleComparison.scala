package typings
package resemblejsLib.resemblejsMod.ResembleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResembleComparison extends js.Object {
  def ignoreAntialiasing(): ResembleComparison
  def ignoreColors(): ResembleComparison
  def ignoreNothing(): ResembleComparison
  /**
    * Run the analysis and get the comparison result
    */
  def onComplete(callback: js.Function1[/* result */ ResembleComparisonResult, scala.Unit]): scala.Unit
  def repaint(): ResembleComparison
}

object ResembleComparison {
  @scala.inline
  def apply(
    ignoreAntialiasing: js.Function0[ResembleComparison],
    ignoreColors: js.Function0[ResembleComparison],
    ignoreNothing: js.Function0[ResembleComparison],
    onComplete: js.Function1[js.Function1[/* result */ ResembleComparisonResult, scala.Unit], scala.Unit],
    repaint: js.Function0[ResembleComparison]
  ): ResembleComparison = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ignoreAntialiasing")(ignoreAntialiasing)
    __obj.updateDynamic("ignoreColors")(ignoreColors)
    __obj.updateDynamic("ignoreNothing")(ignoreNothing)
    __obj.updateDynamic("onComplete")(onComplete)
    __obj.updateDynamic("repaint")(repaint)
    __obj.asInstanceOf[ResembleComparison]
  }
}

