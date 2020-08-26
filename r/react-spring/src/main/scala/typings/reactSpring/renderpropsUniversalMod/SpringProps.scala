package typings.reactSpring.renderpropsUniversalMod

import typings.react.mod.ReactNode
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpringProps[DS /* <: js.Object */] extends SpringBaseProps {
  /**
    * Inject props after animation is ended
    */
  var after: js.UndefOr[Partial[DS]] = js.native
  /**
    * Takes a function that receives interpolated styles
    */
  var children: js.UndefOr[SpringRendererFunc[DS]] = js.native
  /**
    * Escape hatch to force the spring to render
    */
  var force: js.UndefOr[Boolean] = js.native
  /**
    * Base styles
    * @default {}
    */
  var from: js.UndefOr[Partial[DS]] = js.native
  /**
    * Inject props
    * @default undefined
    */
  var inject: js.UndefOr[js.Any] = js.native
  /**
    * Frame by frame callback, first argument passed is the animated value
    */
  var onFrame: js.UndefOr[js.Function1[/* ds */ DS, Unit]] = js.native
  /**
    * Callback when the animation comes to a still-stand
    */
  var onRest: js.UndefOr[js.Function1[/* ds */ DS, Unit]] = js.native
  /**
    * Animates to...
    * @default {}
    */
  var to: js.UndefOr[DS] = js.native
}

object SpringProps {
  @scala.inline
  def apply[/* <: js.Object */ DS](): SpringProps[DS] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpringProps[DS]]
  }
  @scala.inline
  implicit class SpringPropsOps[Self <: SpringProps[_], /* <: js.Object */ DS] (val x: Self with SpringProps[DS]) extends AnyVal {
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
    def setAfter(value: Partial[DS]): Self = this.set("after", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    @scala.inline
    def setChildren(value: DS => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    @scala.inline
    def setFrom(value: Partial[DS]): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setInject(value: js.Any): Self = this.set("inject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInject: Self = this.set("inject", js.undefined)
    @scala.inline
    def setOnFrame(value: /* ds */ DS => Unit): Self = this.set("onFrame", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFrame: Self = this.set("onFrame", js.undefined)
    @scala.inline
    def setOnRest(value: /* ds */ DS => Unit): Self = this.set("onRest", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRest: Self = this.set("onRest", js.undefined)
    @scala.inline
    def setTo(value: DS): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
  
}

