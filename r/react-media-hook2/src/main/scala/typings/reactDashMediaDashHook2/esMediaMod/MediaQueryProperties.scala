package typings.reactDashMediaDashHook2.esMediaMod

import typings.reactDashMediaDashHook2.reactDashMediaDashHook2Numbers.`0`
import typings.reactDashMediaDashHook2.reactDashMediaDashHook2Numbers.`1`
import typings.reactDashMediaDashHook2.reactDashMediaDashHook2Strings.`initial-only`
import typings.reactDashMediaDashHook2.reactDashMediaDashHook2Strings.`minimal-ui`
import typings.reactDashMediaDashHook2.reactDashMediaDashHook2Strings.`no-preference`
import typings.reactDashMediaDashHook2.reactDashMediaDashHook2Strings.`optional-paged`
import typings.reactDashMediaDashHook2.reactDashMediaDashHook2Strings.browser
import typings.reactDashMediaDashHook2.reactDashMediaDashHook2Strings.coarse
import typings.reactDashMediaDashHook2.reactDashMediaDashHook2Strings.dark
import typings.reactDashMediaDashHook2.reactDashMediaDashHook2Strings.dim
import typings.reactDashMediaDashHook2.reactDashMediaDashHook2Strings.enabled
import typings.reactDashMediaDashHook2.reactDashMediaDashHook2Strings.fast
import typings.reactDashMediaDashHook2.reactDashMediaDashHook2Strings.fine
import typings.reactDashMediaDashHook2.reactDashMediaDashHook2Strings.fullscreen
import typings.reactDashMediaDashHook2.reactDashMediaDashHook2Strings.hover
import typings.reactDashMediaDashHook2.reactDashMediaDashHook2Strings.inverted
import typings.reactDashMediaDashHook2.reactDashMediaDashHook2Strings.landscape
import typings.reactDashMediaDashHook2.reactDashMediaDashHook2Strings.light
import typings.reactDashMediaDashHook2.reactDashMediaDashHook2Strings.none
import typings.reactDashMediaDashHook2.reactDashMediaDashHook2Strings.normal
import typings.reactDashMediaDashHook2.reactDashMediaDashHook2Strings.p3
import typings.reactDashMediaDashHook2.reactDashMediaDashHook2Strings.paged
import typings.reactDashMediaDashHook2.reactDashMediaDashHook2Strings.portrait
import typings.reactDashMediaDashHook2.reactDashMediaDashHook2Strings.rec2020
import typings.reactDashMediaDashHook2.reactDashMediaDashHook2Strings.reduce
import typings.reactDashMediaDashHook2.reactDashMediaDashHook2Strings.scroll
import typings.reactDashMediaDashHook2.reactDashMediaDashHook2Strings.slow
import typings.reactDashMediaDashHook2.reactDashMediaDashHook2Strings.srgb
import typings.reactDashMediaDashHook2.reactDashMediaDashHook2Strings.standalone
import typings.reactDashMediaDashHook2.reactDashMediaDashHook2Strings.washed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaQueryProperties extends js.Object {
  var all: js.UndefOr[Boolean] = js.undefined
  /**
    * Media Queries Level 4
    */
  var anyHover: js.UndefOr[none | hover] = js.undefined
  var anyPointer: js.UndefOr[none | coarse | fine] = js.undefined
  var aspectRatio: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[Double | String] = js.undefined
  var colorGamut: js.UndefOr[srgb | p3 | rec2020] = js.undefined
  var colorIndex: js.UndefOr[Double | String] = js.undefined
  /**
    * Web App Manifest spec.
    * http://w3c.github.io/manifest/#the-display-mode-media-feature
    */
  var displayMode: js.UndefOr[fullscreen | standalone | `minimal-ui` | browser] = js.undefined
  var grid: js.UndefOr[`0` | `1`] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var hover: js.UndefOr[none | typings.reactDashMediaDashHook2.reactDashMediaDashHook2Strings.hover] = js.undefined
  /**
    * Media Queries Level 5
    */
  var invertedColors: js.UndefOr[inverted | none] = js.undefined
  var lightLevel: js.UndefOr[dim | normal | washed] = js.undefined
  var maxWidth: js.UndefOr[Double | String] = js.undefined
  var minWidth: js.UndefOr[Double | String] = js.undefined
  var monochrome: js.UndefOr[Double | String] = js.undefined
  var orientation: js.UndefOr[portrait | landscape] = js.undefined
  var overflowBlock: js.UndefOr[none | scroll | `optional-paged` | paged] = js.undefined
  var overflowInline: js.UndefOr[none | scroll] = js.undefined
  var pointer: js.UndefOr[none | coarse | fine] = js.undefined
  var prefersColorScheme: js.UndefOr[`no-preference` | light | dark] = js.undefined
  var prefersReducedMotion: js.UndefOr[`no-preference` | reduce] = js.undefined
  var print: js.UndefOr[Boolean] = js.undefined
  var resolution: js.UndefOr[String] = js.undefined
  var scan: js.UndefOr[portrait | landscape] = js.undefined
  var screen: js.UndefOr[Boolean] = js.undefined
  var scripting: js.UndefOr[none | `initial-only` | enabled] = js.undefined
  var speech: js.UndefOr[Boolean] = js.undefined
  var update: js.UndefOr[none | slow | fast] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object MediaQueryProperties {
  @scala.inline
  def apply(
    all: js.UndefOr[Boolean] = js.undefined,
    anyHover: none | hover = null,
    anyPointer: none | coarse | fine = null,
    aspectRatio: String = null,
    color: Double | String = null,
    colorGamut: srgb | p3 | rec2020 = null,
    colorIndex: Double | String = null,
    displayMode: fullscreen | standalone | `minimal-ui` | browser = null,
    grid: `0` | `1` = null,
    height: Double | String = null,
    hover: none | hover = null,
    invertedColors: inverted | none = null,
    lightLevel: dim | normal | washed = null,
    maxWidth: Double | String = null,
    minWidth: Double | String = null,
    monochrome: Double | String = null,
    orientation: portrait | landscape = null,
    overflowBlock: none | scroll | `optional-paged` | paged = null,
    overflowInline: none | scroll = null,
    pointer: none | coarse | fine = null,
    prefersColorScheme: `no-preference` | light | dark = null,
    prefersReducedMotion: `no-preference` | reduce = null,
    print: js.UndefOr[Boolean] = js.undefined,
    resolution: String = null,
    scan: portrait | landscape = null,
    screen: js.UndefOr[Boolean] = js.undefined,
    scripting: none | `initial-only` | enabled = null,
    speech: js.UndefOr[Boolean] = js.undefined,
    update: none | slow | fast = null,
    width: Double | String = null
  ): MediaQueryProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all)
    if (anyHover != null) __obj.updateDynamic("anyHover")(anyHover.asInstanceOf[js.Any])
    if (anyPointer != null) __obj.updateDynamic("anyPointer")(anyPointer.asInstanceOf[js.Any])
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorGamut != null) __obj.updateDynamic("colorGamut")(colorGamut.asInstanceOf[js.Any])
    if (colorIndex != null) __obj.updateDynamic("colorIndex")(colorIndex.asInstanceOf[js.Any])
    if (displayMode != null) __obj.updateDynamic("displayMode")(displayMode.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (invertedColors != null) __obj.updateDynamic("invertedColors")(invertedColors.asInstanceOf[js.Any])
    if (lightLevel != null) __obj.updateDynamic("lightLevel")(lightLevel.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (monochrome != null) __obj.updateDynamic("monochrome")(monochrome.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (overflowBlock != null) __obj.updateDynamic("overflowBlock")(overflowBlock.asInstanceOf[js.Any])
    if (overflowInline != null) __obj.updateDynamic("overflowInline")(overflowInline.asInstanceOf[js.Any])
    if (pointer != null) __obj.updateDynamic("pointer")(pointer.asInstanceOf[js.Any])
    if (prefersColorScheme != null) __obj.updateDynamic("prefersColorScheme")(prefersColorScheme.asInstanceOf[js.Any])
    if (prefersReducedMotion != null) __obj.updateDynamic("prefersReducedMotion")(prefersReducedMotion.asInstanceOf[js.Any])
    if (!js.isUndefined(print)) __obj.updateDynamic("print")(print)
    if (resolution != null) __obj.updateDynamic("resolution")(resolution)
    if (scan != null) __obj.updateDynamic("scan")(scan.asInstanceOf[js.Any])
    if (!js.isUndefined(screen)) __obj.updateDynamic("screen")(screen)
    if (scripting != null) __obj.updateDynamic("scripting")(scripting.asInstanceOf[js.Any])
    if (!js.isUndefined(speech)) __obj.updateDynamic("speech")(speech)
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaQueryProperties]
  }
}

