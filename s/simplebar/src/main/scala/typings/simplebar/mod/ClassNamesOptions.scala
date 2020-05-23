package typings.simplebar.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined simplebar.simplebar.KnownClassNamesOptions & {[className: string] : string} */
trait ClassNamesOptions extends /* className */ StringDictionary[String] {
  var contentEl: js.UndefOr[String] = js.undefined
  var contentWrapper: js.UndefOr[String] = js.undefined
  var dragging: js.UndefOr[String] = js.undefined
  var heightAutoObserverEl: js.UndefOr[String] = js.undefined
  var heightAutoObserverWrapperEl: js.UndefOr[String] = js.undefined
  var horizontal: js.UndefOr[String] = js.undefined
  var hover: js.UndefOr[String] = js.undefined
  var mask: js.UndefOr[String] = js.undefined
  var offset: js.UndefOr[String] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var scrollbar: js.UndefOr[String] = js.undefined
  var track: js.UndefOr[String] = js.undefined
  var vertical: js.UndefOr[String] = js.undefined
  var visible: js.UndefOr[String] = js.undefined
  var wrapper: js.UndefOr[String] = js.undefined
}

object ClassNamesOptions {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[String] = null,
    contentEl: String = null,
    contentWrapper: String = null,
    dragging: String = null,
    heightAutoObserverEl: String = null,
    heightAutoObserverWrapperEl: String = null,
    horizontal: String = null,
    hover: String = null,
    mask: String = null,
    offset: String = null,
    placeholder: String = null,
    scrollbar: String = null,
    track: String = null,
    vertical: String = null,
    visible: String = null,
    wrapper: String = null
  ): ClassNamesOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (contentEl != null) __obj.updateDynamic("contentEl")(contentEl.asInstanceOf[js.Any])
    if (contentWrapper != null) __obj.updateDynamic("contentWrapper")(contentWrapper.asInstanceOf[js.Any])
    if (dragging != null) __obj.updateDynamic("dragging")(dragging.asInstanceOf[js.Any])
    if (heightAutoObserverEl != null) __obj.updateDynamic("heightAutoObserverEl")(heightAutoObserverEl.asInstanceOf[js.Any])
    if (heightAutoObserverWrapperEl != null) __obj.updateDynamic("heightAutoObserverWrapperEl")(heightAutoObserverWrapperEl.asInstanceOf[js.Any])
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (scrollbar != null) __obj.updateDynamic("scrollbar")(scrollbar.asInstanceOf[js.Any])
    if (track != null) __obj.updateDynamic("track")(track.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    if (visible != null) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassNamesOptions]
  }
}

