package typings.reactPose.transitionTypesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props
  extends /* key */ StringDictionary[js.Any] {
  var animateOnMount: js.UndefOr[Boolean] = js.native
  var children: TransitionChildren[_] = js.native
  var enterAfterExit: js.UndefOr[Boolean] = js.native
  var enterPose: js.UndefOr[String] = js.native
  var exitPose: js.UndefOr[String] = js.native
  var flipMove: js.UndefOr[Boolean] = js.native
  var onRest: js.UndefOr[js.Function0[Unit]] = js.native
  var preEnterPose: js.UndefOr[String] = js.native
}

object Props {
  @scala.inline
  def apply(children: TransitionChildren[_]): Props = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: TransitionChild[js.Any]*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: TransitionChildren[_]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimateOnMount(value: Boolean): Self = this.set("animateOnMount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimateOnMount: Self = this.set("animateOnMount", js.undefined)
    @scala.inline
    def setEnterAfterExit(value: Boolean): Self = this.set("enterAfterExit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnterAfterExit: Self = this.set("enterAfterExit", js.undefined)
    @scala.inline
    def setEnterPose(value: String): Self = this.set("enterPose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnterPose: Self = this.set("enterPose", js.undefined)
    @scala.inline
    def setExitPose(value: String): Self = this.set("exitPose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExitPose: Self = this.set("exitPose", js.undefined)
    @scala.inline
    def setFlipMove(value: Boolean): Self = this.set("flipMove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlipMove: Self = this.set("flipMove", js.undefined)
    @scala.inline
    def setOnRest(value: () => Unit): Self = this.set("onRest", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnRest: Self = this.set("onRest", js.undefined)
    @scala.inline
    def setPreEnterPose(value: String): Self = this.set("preEnterPose", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreEnterPose: Self = this.set("preEnterPose", js.undefined)
  }
  
}

