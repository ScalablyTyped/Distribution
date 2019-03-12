package typings
package reactDashCustomDashScrollbarsLib.reactDashCustomDashScrollbarsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollbarProps
  extends reactLib.reactMod.ReactNs.HTMLProps[Scrollbars] {
  var autoHeight: js.UndefOr[scala.Boolean] = js.undefined
  var autoHeightMax: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var autoHeightMin: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var autoHide: js.UndefOr[scala.Boolean] = js.undefined
  var autoHideDuration: js.UndefOr[scala.Double] = js.undefined
  var autoHideTimeout: js.UndefOr[scala.Double] = js.undefined
  var hideTracksWhenNotNeeded: js.UndefOr[scala.Boolean] = js.undefined
  var onScrollFrame: js.UndefOr[js.Function1[/* values */ positionValues, scala.Unit]] = js.undefined
  var onScrollStart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onScrollStop: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  @JSName("onScroll")
  var onScroll_ScrollbarProps: js.UndefOr[reactLib.reactMod.ReactNs.UIEventHandler[_]] = js.undefined
  var onUpdate: js.UndefOr[js.Function1[/* values */ positionValues, scala.Unit]] = js.undefined
  var renderThumbHorizontal: js.UndefOr[reactLib.reactMod.ReactNs.StatelessComponent[_]] = js.undefined
  var renderThumbVertical: js.UndefOr[reactLib.reactMod.ReactNs.StatelessComponent[_]] = js.undefined
  var renderTrackHorizontal: js.UndefOr[reactLib.reactMod.ReactNs.StatelessComponent[_]] = js.undefined
  var renderTrackVertical: js.UndefOr[reactLib.reactMod.ReactNs.StatelessComponent[_]] = js.undefined
  var renderView: js.UndefOr[reactLib.reactMod.ReactNs.StatelessComponent[_]] = js.undefined
  var tagName: js.UndefOr[java.lang.String] = js.undefined
  var thumbMinSize: js.UndefOr[scala.Double] = js.undefined
  var thumbSize: js.UndefOr[scala.Double] = js.undefined
  var universal: js.UndefOr[scala.Boolean] = js.undefined
}

object ScrollbarProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[Scrollbars] = null,
    autoHeight: js.UndefOr[scala.Boolean] = js.undefined,
    autoHeightMax: scala.Double | java.lang.String = null,
    autoHeightMin: scala.Double | java.lang.String = null,
    autoHide: js.UndefOr[scala.Boolean] = js.undefined,
    autoHideDuration: scala.Int | scala.Double = null,
    autoHideTimeout: scala.Int | scala.Double = null,
    hideTracksWhenNotNeeded: js.UndefOr[scala.Boolean] = js.undefined,
    onScroll: reactLib.reactMod.ReactNs.UIEventHandler[_] = null,
    onScrollFrame: /* values */ positionValues => scala.Unit = null,
    onScrollStart: () => scala.Unit = null,
    onScrollStop: () => scala.Unit = null,
    onUpdate: /* values */ positionValues => scala.Unit = null,
    renderThumbHorizontal: reactLib.reactMod.ReactNs.StatelessComponent[_] = null,
    renderThumbVertical: reactLib.reactMod.ReactNs.StatelessComponent[_] = null,
    renderTrackHorizontal: reactLib.reactMod.ReactNs.StatelessComponent[_] = null,
    renderTrackVertical: reactLib.reactMod.ReactNs.StatelessComponent[_] = null,
    renderView: reactLib.reactMod.ReactNs.StatelessComponent[_] = null,
    tagName: java.lang.String = null,
    thumbMinSize: scala.Int | scala.Double = null,
    thumbSize: scala.Int | scala.Double = null,
    universal: js.UndefOr[scala.Boolean] = js.undefined
  ): ScrollbarProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight)
    if (autoHeightMax != null) __obj.updateDynamic("autoHeightMax")(autoHeightMax.asInstanceOf[js.Any])
    if (autoHeightMin != null) __obj.updateDynamic("autoHeightMin")(autoHeightMin.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHide)) __obj.updateDynamic("autoHide")(autoHide)
    if (autoHideDuration != null) __obj.updateDynamic("autoHideDuration")(autoHideDuration.asInstanceOf[js.Any])
    if (autoHideTimeout != null) __obj.updateDynamic("autoHideTimeout")(autoHideTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(hideTracksWhenNotNeeded)) __obj.updateDynamic("hideTracksWhenNotNeeded")(hideTracksWhenNotNeeded)
    if (onScroll != null) __obj.updateDynamic("onScroll")(onScroll)
    if (onScrollFrame != null) __obj.updateDynamic("onScrollFrame")(js.Any.fromFunction1(onScrollFrame))
    if (onScrollStart != null) __obj.updateDynamic("onScrollStart")(js.Any.fromFunction0(onScrollStart))
    if (onScrollStop != null) __obj.updateDynamic("onScrollStop")(js.Any.fromFunction0(onScrollStop))
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction1(onUpdate))
    if (renderThumbHorizontal != null) __obj.updateDynamic("renderThumbHorizontal")(renderThumbHorizontal)
    if (renderThumbVertical != null) __obj.updateDynamic("renderThumbVertical")(renderThumbVertical)
    if (renderTrackHorizontal != null) __obj.updateDynamic("renderTrackHorizontal")(renderTrackHorizontal)
    if (renderTrackVertical != null) __obj.updateDynamic("renderTrackVertical")(renderTrackVertical)
    if (renderView != null) __obj.updateDynamic("renderView")(renderView)
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    if (thumbMinSize != null) __obj.updateDynamic("thumbMinSize")(thumbMinSize.asInstanceOf[js.Any])
    if (thumbSize != null) __obj.updateDynamic("thumbSize")(thumbSize.asInstanceOf[js.Any])
    if (!js.isUndefined(universal)) __obj.updateDynamic("universal")(universal)
    __obj.asInstanceOf[ScrollbarProps]
  }
}

