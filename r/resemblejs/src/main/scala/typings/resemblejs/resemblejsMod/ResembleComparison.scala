package typings.resemblejs.resemblejsMod

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
  def onComplete(callback: js.Function1[/* result */ ResembleComparisonResult, Unit]): Unit
  def repaint(): ResembleComparison
}

object ResembleComparison {
  @scala.inline
  def apply(
    ignoreAntialiasing: () => ResembleComparison,
    ignoreColors: () => ResembleComparison,
    ignoreNothing: () => ResembleComparison,
    onComplete: js.Function1[/* result */ ResembleComparisonResult, Unit] => Unit,
    repaint: () => ResembleComparison
  ): ResembleComparison = {
    val __obj = js.Dynamic.literal(ignoreAntialiasing = js.Any.fromFunction0(ignoreAntialiasing), ignoreColors = js.Any.fromFunction0(ignoreColors), ignoreNothing = js.Any.fromFunction0(ignoreNothing), onComplete = js.Any.fromFunction1(onComplete), repaint = js.Any.fromFunction0(repaint))
  
    __obj.asInstanceOf[ResembleComparison]
  }
}

