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

