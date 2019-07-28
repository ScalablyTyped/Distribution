package typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod

import typings.reactDashNativeDashNavigation.reactDashNativeDashNavigationNumbers.`100`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsPreview extends js.Object {
  /**
    * List of actions that will appear underneath the preview window.
    * They can be nested for sub actions.
    */
  var actions: js.UndefOr[js.Array[OptionsPreviewAction]] = js.undefined
  /**
    * You can control if the users gesture will result in pushing
    * the preview screen into the stack.
    */
  var commit: js.UndefOr[Boolean] = js.undefined
  /**
    * Height of the preview
    */
  var height: js.UndefOr[`100`] = js.undefined
  /**
    * Pass a react node tag to mark a SourceRect for a specific
    * peek and pop preview element.
    */
  var reactTag: js.UndefOr[Double] = js.undefined
  /**
    * You can set this property specify the width of the preview.
    * If the width is greater than the device width, it will be zoomed in.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object OptionsPreview {
  @scala.inline
  def apply(
    actions: js.Array[OptionsPreviewAction] = null,
    commit: js.UndefOr[Boolean] = js.undefined,
    height: `100` = null,
    reactTag: Int | Double = null,
    width: Int | Double = null
  ): OptionsPreview = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (!js.isUndefined(commit)) __obj.updateDynamic("commit")(commit)
    if (height != null) __obj.updateDynamic("height")(height)
    if (reactTag != null) __obj.updateDynamic("reactTag")(reactTag.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsPreview]
  }
}

