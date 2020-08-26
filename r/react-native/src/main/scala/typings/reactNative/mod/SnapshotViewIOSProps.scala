package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotViewIOSProps extends ViewProps {
  // A name to identify the individual instance to the SnapshotView
  var testIdentifier: String = js.native
  // A callback when the Snapshot view is ready to be compared
  def onSnapshotReady(): js.Any = js.native
}

object SnapshotViewIOSProps {
  @scala.inline
  def apply(onSnapshotReady: () => js.Any, testIdentifier: String): SnapshotViewIOSProps = {
    val __obj = js.Dynamic.literal(onSnapshotReady = js.Any.fromFunction0(onSnapshotReady), testIdentifier = testIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotViewIOSProps]
  }
  @scala.inline
  implicit class SnapshotViewIOSPropsOps[Self <: SnapshotViewIOSProps] (val x: Self) extends AnyVal {
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
    def setOnSnapshotReady(value: () => js.Any): Self = this.set("onSnapshotReady", js.Any.fromFunction0(value))
    @scala.inline
    def setTestIdentifier(value: String): Self = this.set("testIdentifier", value.asInstanceOf[js.Any])
  }
  
}

