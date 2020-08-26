package typings.resemblejs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResembleComparison extends js.Object {
  def ignoreAntialiasing(): ResembleComparison = js.native
  def ignoreColors(): ResembleComparison = js.native
  def ignoreNothing(): ResembleComparison = js.native
  /**
    * Run the analysis and get the comparison result
    */
  def onComplete(callback: js.Function1[/* result */ ResembleComparisonResult, Unit]): Unit = js.native
  def repaint(): ResembleComparison = js.native
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
  @scala.inline
  implicit class ResembleComparisonOps[Self <: ResembleComparison] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIgnoreAntialiasing(value: () => ResembleComparison): Self = this.set("ignoreAntialiasing", js.Any.fromFunction0(value))
    @scala.inline
    def setIgnoreColors(value: () => ResembleComparison): Self = this.set("ignoreColors", js.Any.fromFunction0(value))
    @scala.inline
    def setIgnoreNothing(value: () => ResembleComparison): Self = this.set("ignoreNothing", js.Any.fromFunction0(value))
    @scala.inline
    def setOnComplete(value: js.Function1[/* result */ ResembleComparisonResult, Unit] => Unit): Self = this.set("onComplete", js.Any.fromFunction1(value))
    @scala.inline
    def setRepaint(value: () => ResembleComparison): Self = this.set("repaint", js.Any.fromFunction0(value))
  }
  
}

