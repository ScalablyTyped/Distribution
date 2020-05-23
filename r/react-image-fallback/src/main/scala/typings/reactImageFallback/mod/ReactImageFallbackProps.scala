package typings.reactImageFallback.mod

import typings.react.mod.ReactElement
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactImageFallbackProps extends js.Object {
  var fallbackImage: String | ReactElement | (js.Array[ReactElement | String])
  var initialImage: js.UndefOr[String | ReactElement] = js.undefined
  var initialTimeout: js.UndefOr[Double] = js.undefined
  var onError: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLImageElement, Event], Unit]] = js.undefined
  var onLoad: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLImageElement, Event], Unit]] = js.undefined
  var src: String
}

object ReactImageFallbackProps {
  @scala.inline
  def apply(
    fallbackImage: String | ReactElement | (js.Array[ReactElement | String]),
    src: String,
    initialImage: String | ReactElement = null,
    initialTimeout: js.UndefOr[Double] = js.undefined,
    onError: /* event */ SyntheticEvent[HTMLImageElement, Event] => Unit = null,
    onLoad: /* event */ SyntheticEvent[HTMLImageElement, Event] => Unit = null
  ): ReactImageFallbackProps = {
    val __obj = js.Dynamic.literal(fallbackImage = fallbackImage.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    if (initialImage != null) __obj.updateDynamic("initialImage")(initialImage.asInstanceOf[js.Any])
    if (!js.isUndefined(initialTimeout)) __obj.updateDynamic("initialTimeout")(initialTimeout.get.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    __obj.asInstanceOf[ReactImageFallbackProps]
  }
}

