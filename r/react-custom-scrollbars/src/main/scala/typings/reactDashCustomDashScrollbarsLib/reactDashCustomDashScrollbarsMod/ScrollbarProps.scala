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

