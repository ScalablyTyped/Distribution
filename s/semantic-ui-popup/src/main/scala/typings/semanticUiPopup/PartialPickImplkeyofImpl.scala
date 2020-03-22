package typings.semanticUiPopup

import typings.semanticUiPopup.SemanticUI.Popup.ClassNameSettings
import typings.semanticUiPopup.SemanticUI.Popup.DelaySettings
import typings.semanticUiPopup.SemanticUI.Popup.ErrorSettings
import typings.semanticUiPopup.SemanticUI.Popup.MetadataSettings
import typings.semanticUiPopup.SemanticUI.Popup.SelectorSettings
import typings.semanticUiPopup.semanticUiPopupBooleans.`false`
import typings.semanticUiPopup.semanticUiPopupStrings.adjacent
import typings.semanticUiPopup.semanticUiPopupStrings.auto
import typings.semanticUiPopup.semanticUiPopupStrings.click
import typings.semanticUiPopup.semanticUiPopupStrings.focus
import typings.semanticUiPopup.semanticUiPopupStrings.hover
import typings.semanticUiPopup.semanticUiPopupStrings.manual
import typings.semanticUiPopup.semanticUiPopupStrings.opposite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, keyof semantic-ui-popup.SemanticUI.PopupSettings._Impl>> */
trait PartialPickImplkeyofImpl extends js.Object {
  var addTouchEvents: js.UndefOr[Boolean] = js.undefined
  var boundary: js.UndefOr[String | JQuery] = js.undefined
  var className: js.UndefOr[ClassNameSettings] = js.undefined
  var closable: js.UndefOr[Boolean] = js.undefined
  var content: js.UndefOr[String] = js.undefined
  var context: js.UndefOr[String | JQuery] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var delay: js.UndefOr[DelaySettings] = js.undefined
  var distanceAway: js.UndefOr[Double] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var error: js.UndefOr[ErrorSettings] = js.undefined
  var exclusive: js.UndefOr[Boolean] = js.undefined
  var hideOnScroll: js.UndefOr[auto | `false`] = js.undefined
  var hoverable: js.UndefOr[Boolean] = js.undefined
  var html: js.UndefOr[String | JQuery] = js.undefined
  var `inline`: js.UndefOr[Boolean] = js.undefined
  var jitter: js.UndefOr[Double] = js.undefined
  var lastResort: js.UndefOr[Boolean | String] = js.undefined
  var maxSearchDepth: js.UndefOr[Double] = js.undefined
  var metadata: js.UndefOr[MetadataSettings] = js.undefined
  var movePopup: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var namespace: js.UndefOr[String] = js.undefined
  var observeChanges: js.UndefOr[Boolean] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var on: js.UndefOr[focus | click | hover | manual] = js.undefined
  var onCreate: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]] = js.undefined
  var onHidden: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]] = js.undefined
  var onHide: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, `false` | Unit]] = js.undefined
  var onRemove: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]] = js.undefined
  var onShow: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, `false` | Unit]] = js.undefined
  var onUnplaceable: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]] = js.undefined
  var onVisible: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]] = js.undefined
  var performance: js.UndefOr[Boolean] = js.undefined
  var popup: js.UndefOr[`false` | String | JQuery] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var prefer: js.UndefOr[adjacent | opposite] = js.undefined
  var preserve: js.UndefOr[Boolean] = js.undefined
  var scrollContext: js.UndefOr[String | JQuery] = js.undefined
  var selector: js.UndefOr[SelectorSettings] = js.undefined
  var setFluidWidth: js.UndefOr[Boolean] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var target: js.UndefOr[`false` | String | JQuery] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var transition: js.UndefOr[String] = js.undefined
  var variation: js.UndefOr[String] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object PartialPickImplkeyofImpl {
  @scala.inline
  def apply(
    addTouchEvents: js.UndefOr[Boolean] = js.undefined,
    boundary: String | JQuery = null,
    className: ClassNameSettings = null,
    closable: js.UndefOr[Boolean] = js.undefined,
    content: String = null,
    context: String | JQuery = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    delay: DelaySettings = null,
    distanceAway: Int | Double = null,
    duration: Int | Double = null,
    error: ErrorSettings = null,
    exclusive: js.UndefOr[Boolean] = js.undefined,
    hideOnScroll: auto | `false` = null,
    hoverable: js.UndefOr[Boolean] = js.undefined,
    html: String | JQuery = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    jitter: Int | Double = null,
    lastResort: Boolean | String = null,
    maxSearchDepth: Int | Double = null,
    metadata: MetadataSettings = null,
    movePopup: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    namespace: String = null,
    observeChanges: js.UndefOr[Boolean] = js.undefined,
    offset: Int | Double = null,
    on: focus | click | hover | manual = null,
    onCreate: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit] = null,
    onHidden: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit] = null,
    onHide: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, `false` | Unit] = null,
    onRemove: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit] = null,
    onShow: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, `false` | Unit] = null,
    onUnplaceable: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit] = null,
    onVisible: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit] = null,
    performance: js.UndefOr[Boolean] = js.undefined,
    popup: `false` | String | JQuery = null,
    position: String = null,
    prefer: adjacent | opposite = null,
    preserve: js.UndefOr[Boolean] = js.undefined,
    scrollContext: String | JQuery = null,
    selector: SelectorSettings = null,
    setFluidWidth: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined,
    target: `false` | String | JQuery = null,
    title: String = null,
    transition: String = null,
    variation: String = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): PartialPickImplkeyofImpl = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addTouchEvents)) __obj.updateDynamic("addTouchEvents")(addTouchEvents.asInstanceOf[js.Any])
    if (boundary != null) __obj.updateDynamic("boundary")(boundary.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (distanceAway != null) __obj.updateDynamic("distanceAway")(distanceAway.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive.asInstanceOf[js.Any])
    if (hideOnScroll != null) __obj.updateDynamic("hideOnScroll")(hideOnScroll.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverable)) __obj.updateDynamic("hoverable")(hoverable.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (jitter != null) __obj.updateDynamic("jitter")(jitter.asInstanceOf[js.Any])
    if (lastResort != null) __obj.updateDynamic("lastResort")(lastResort.asInstanceOf[js.Any])
    if (maxSearchDepth != null) __obj.updateDynamic("maxSearchDepth")(maxSearchDepth.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (!js.isUndefined(movePopup)) __obj.updateDynamic("movePopup")(movePopup.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (!js.isUndefined(observeChanges)) __obj.updateDynamic("observeChanges")(observeChanges.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (onCreate != null) __obj.updateDynamic("onCreate")(onCreate.asInstanceOf[js.Any])
    if (onHidden != null) __obj.updateDynamic("onHidden")(onHidden.asInstanceOf[js.Any])
    if (onHide != null) __obj.updateDynamic("onHide")(onHide.asInstanceOf[js.Any])
    if (onRemove != null) __obj.updateDynamic("onRemove")(onRemove.asInstanceOf[js.Any])
    if (onShow != null) __obj.updateDynamic("onShow")(onShow.asInstanceOf[js.Any])
    if (onUnplaceable != null) __obj.updateDynamic("onUnplaceable")(onUnplaceable.asInstanceOf[js.Any])
    if (onVisible != null) __obj.updateDynamic("onVisible")(onVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(performance)) __obj.updateDynamic("performance")(performance.asInstanceOf[js.Any])
    if (popup != null) __obj.updateDynamic("popup")(popup.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (prefer != null) __obj.updateDynamic("prefer")(prefer.asInstanceOf[js.Any])
    if (!js.isUndefined(preserve)) __obj.updateDynamic("preserve")(preserve.asInstanceOf[js.Any])
    if (scrollContext != null) __obj.updateDynamic("scrollContext")(scrollContext.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (!js.isUndefined(setFluidWidth)) __obj.updateDynamic("setFluidWidth")(setFluidWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (variation != null) __obj.updateDynamic("variation")(variation.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImpl]
  }
}

