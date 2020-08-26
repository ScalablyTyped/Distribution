package typings.reactFlipMove.mod.FlipMove

import typings.react.mod.ReactElement
import typings.std.ClientRect
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlipMoveProps extends js.Object {
  /**
    * Control the appear animation that runs when the component mounts. Works identically to enterAnimation below, but
    * only fires on the initial children.
    */
  var appearAnimation: js.UndefOr[AnimationProp] = js.native
  var className: js.UndefOr[String] = js.native
  /**
    * The length, in milliseconds, to wait before the animation begins.
    *
    * @default 0
    */
  var delay: js.UndefOr[Double | String] = js.native
  /**
    * Sometimes, you may wish to temporarily disable the animations and have the normal behaviour resumed. Setting this
    * flag to true skips all animations.
    *
    * @default false
    */
  var disableAllAnimations: js.UndefOr[Boolean] = js.native
  /**
    * The length, in milliseconds, that the transition ought to take.
    *
    * @default 350
    */
  var duration: js.UndefOr[Double | String] = js.native
  /**
    * Any valid CSS3 timing function (eg. "linear", "ease-in", "cubic-bezier(1, 0, 0, 1)").
    *
    * @default "ease-in-out"
    */
  var easing: js.UndefOr[String] = js.native
  /**
    * Control the onEnter animation that runs when new items are added to the DOM.
    *
    * Accepts several types:
    *
    * **String:** You can enter one of the following presets to select that as your enter animation:
    *
    *   - `elevator` (default)
    *   - `fade`
    *   - `accordionVertical`
    *   - `accordionHorizontal`
    *   - `none`
    *
    * **Boolean:** You can enter `false` to disable the enter animation, or `true` to select the default enter animation (elevator).
    *
    * **Object:** For fully granular control, you can pass in an object that contains the styles you'd like to animate.
    *
    * It requires two keys: `from` and `to`. Each key holds an object of CSS properties. You can supply any valid
    * camelCase CSS properties, and flip-move will transition between the two, over the course of the specified
    * `duration`.
    *
    * Example:
    *
    *     const customEnterAnimation = {
    *       from: { transform: 'scale(0.5, 1)' },
    *       to:   { transform: 'scale(1, 1)' }
    *     };
    *
    *     <FlipMove enterAnimation={customEnterAnimation}>
    *          {renderChildren()}
    *     </FlipMove>
    *
    * @default "elevator"
    */
  var enterAnimation: js.UndefOr[AnimationProp] = js.native
  /**
    * This function is called with a DOM node as the only argument. It should return an object as specified by the
    * getBoundingClientRect() spec.
    *
    * For normal usage of FlipMove you won't need this. An example of usage is when FlipMove is used in a container
    * that is scaled using CSS. You can correct the values from getBoundingClientRect by using this prop.
    */
  var getPosition: js.UndefOr[js.Function1[/* node */ HTMLElement, ClientRect]] = js.native
  /**
    * Control the onLeave animation that runs when new items are removed from the DOM.
    *
    * This property functions identically to `enterAnimation`.
    *
    * @default "elevator"
    */
  var leaveAnimation: js.UndefOr[AnimationProp] = js.native
  /**
    * Do not collapse container height until after leaving animations complete.
    *
    * When false, children are immediately removed from the DOM flow as they animate away. Setting this value to true
    * will maintain the height of the container until after their leaving animation completes.
    *
    * @default false
    */
  var maintainContainerHeight: js.UndefOr[Boolean] = js.native
  /**
    * A callback to be invoked **once per child element** at the end of the animation.
    *
    * In general, it is advisable to ignore the `domNode` argument and work with the `childElement`. The `domNode` is
    * just an escape hatch for doing complex things not otherwise possible.
    *
    * @param childElement  A reference to the React Element being animated.
    * @param domNode       A reference to the unadulterated DOM node being animated.
    */
  var onFinish: js.UndefOr[js.Function2[/* childElement */ ReactElement, /* domNode */ HTMLElement, Unit]] = js.native
  /**
    * A callback to be invoked **once per group** at the end of the animation.
    *
    * The callback arguments are similar to the ones provided for onFinish, except we provide an array of the elements
    * and nodes. The order of both arguments is guaranteed; this means you can use a zipping function like lodash's
    * .zip to get pairs of element/node, if needed.
    *
    * In general, it is advisable to ignore the `domNodes` argument and work with the `childElements` The `domNodes`
    * are just an escape hatch for doing complex things not otherwise possible.
    *
    * @param childElements An array of the references to the React Element(s) being animated.
    * @param domNodes      An array of the references to the unadulterated DOM node(s) being animated.
    */
  var onFinishAll: js.UndefOr[
    js.Function2[
      /* childElements */ js.Array[ReactElement], 
      /* domNodes */ js.Array[HTMLElement], 
      Unit
    ]
  ] = js.native
  /**
    * A callback to be invoked **once per child element** at the start of the animation.
    *
    * In general, it is advisable to ignore the domNode argument and work with the childElement. The domNode is just
    * an escape hatch for doing complex things not otherwise possible.
    *
    * @param childElement  A reference to the React Element being animated.
    * @param domNode       A reference to the unadulterated DOM node being animated.
    */
  var onStart: js.UndefOr[js.Function2[/* childElement */ ReactElement, /* domNode */ HTMLElement, Unit]] = js.native
  /**
    * A callback to be invoked **once per group** at the start of the animation.
    *
    * The callback arguments are similar to the ones provided for onStart, except we provide an array of the elements
    * and nodes. The order of both arguments is guaranteed; this means you can use a zipping function like lodash's
    * .zip to get pairs of element/node, if needed.
    *
    * In general, it is advisable to ignore the `domNodes` argument and work with the `childElements` The `domNodes`
    *
    * are just an escape hatch for doing complex things not otherwise possible.
    *
    * @param childElements An array of the references to the React Element(s) being animated.
    * @param domNodes      An array of the references to the unadulterated DOM node(s) being animated.
    */
  var onStartAll: js.UndefOr[
    js.Function2[
      /* childElements */ js.Array[ReactElement], 
      /* domNodes */ js.Array[HTMLElement], 
      Unit
    ]
  ] = js.native
  /**
    * The length, in milliseconds, to be added to the delay of each subsequent element.
    *
    * For example, if you are animating 4 elements with a `delay` of 0 and a `staggerDelayBy` of 20:
    *
    * - The first element will start transitioning immediately.
    * - The second element will start transitioning after 20ms.
    * - The third element will start transitioning after 40ms.
    * - The fourth element will start transitioning after 60ms.
    *
    * Similarly to staggerDurationBy, This effect is great for "humanizing" transitions and making them feel less
    * robotic.
    *
    * **Protip**: You can make elements animate one-at-a-time by using an identical duration and staggerDelayBy.
    *
    * @default 0
    */
  var staggerDelayBy: js.UndefOr[Double | String] = js.native
  /**
    * The length, in milliseconds, to be added to the duration of each subsequent element.
    *
    * For example, if you are animating 4 elements with a `duration` of 200 and a `staggerDurationBy` of 20:
    *
    * - The first element will take 200ms to transition.
    * - The second element will take 220ms to transition.
    * - The third element will take 240ms to transition.
    * - The fourth element will take 260ms to transition.
    *
    * This effect is great for "humanizing" transitions and making them feel less robotic.
    *
    * @default 0
    */
  var staggerDurationBy: js.UndefOr[Double | String] = js.native
  var style: js.UndefOr[Styles] = js.native
  /**
    * Flip Move wraps your children in a container element. By default, this element is a div, but you may wish to
    * provide a custom HTML element (for example, if your children are list items, you may wish to set this to ul).
    *
    * Any valid HTML element type is accepted, but peculiar things may happen if you use an unconventional element.
    *
    * @default "div"
    */
  var typeName: js.UndefOr[String | Null] = js.native
  /**
    * @default "top"
    */
  var verticalAlignment: js.UndefOr[String] = js.native
}

object FlipMoveProps {
  @scala.inline
  def apply(): FlipMoveProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlipMoveProps]
  }
  @scala.inline
  implicit class FlipMovePropsOps[Self <: FlipMoveProps] (val x: Self) extends AnyVal {
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
    def setAppearAnimation(value: AnimationProp): Self = this.set("appearAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppearAnimation: Self = this.set("appearAnimation", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDelay(value: Double | String): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setDisableAllAnimations(value: Boolean): Self = this.set("disableAllAnimations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableAllAnimations: Self = this.set("disableAllAnimations", js.undefined)
    @scala.inline
    def setDuration(value: Double | String): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    @scala.inline
    def setEnterAnimation(value: AnimationProp): Self = this.set("enterAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnterAnimation: Self = this.set("enterAnimation", js.undefined)
    @scala.inline
    def setGetPosition(value: /* node */ HTMLElement => ClientRect): Self = this.set("getPosition", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetPosition: Self = this.set("getPosition", js.undefined)
    @scala.inline
    def setLeaveAnimation(value: AnimationProp): Self = this.set("leaveAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeaveAnimation: Self = this.set("leaveAnimation", js.undefined)
    @scala.inline
    def setMaintainContainerHeight(value: Boolean): Self = this.set("maintainContainerHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaintainContainerHeight: Self = this.set("maintainContainerHeight", js.undefined)
    @scala.inline
    def setOnFinish(value: (/* childElement */ ReactElement, /* domNode */ HTMLElement) => Unit): Self = this.set("onFinish", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnFinish: Self = this.set("onFinish", js.undefined)
    @scala.inline
    def setOnFinishAll(value: (/* childElements */ js.Array[ReactElement], /* domNodes */ js.Array[HTMLElement]) => Unit): Self = this.set("onFinishAll", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnFinishAll: Self = this.set("onFinishAll", js.undefined)
    @scala.inline
    def setOnStart(value: (/* childElement */ ReactElement, /* domNode */ HTMLElement) => Unit): Self = this.set("onStart", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnStart: Self = this.set("onStart", js.undefined)
    @scala.inline
    def setOnStartAll(value: (/* childElements */ js.Array[ReactElement], /* domNodes */ js.Array[HTMLElement]) => Unit): Self = this.set("onStartAll", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnStartAll: Self = this.set("onStartAll", js.undefined)
    @scala.inline
    def setStaggerDelayBy(value: Double | String): Self = this.set("staggerDelayBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStaggerDelayBy: Self = this.set("staggerDelayBy", js.undefined)
    @scala.inline
    def setStaggerDurationBy(value: Double | String): Self = this.set("staggerDurationBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStaggerDurationBy: Self = this.set("staggerDurationBy", js.undefined)
    @scala.inline
    def setStyle(value: Styles): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTypeName(value: String): Self = this.set("typeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeName: Self = this.set("typeName", js.undefined)
    @scala.inline
    def setTypeNameNull: Self = this.set("typeName", null)
    @scala.inline
    def setVerticalAlignment(value: String): Self = this.set("verticalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlignment: Self = this.set("verticalAlignment", js.undefined)
  }
  
}

