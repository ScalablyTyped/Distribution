package typings.reactMic.mod

import typings.reactMic.reactMicStrings.frequencyBars
import typings.reactMic.reactMicStrings.sinewave
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactMicProps extends js.Object {
  /** Background color */
  var backgroundColor: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  /** Callback that is executed when chunk of audio is available */
  var onData: js.UndefOr[js.Function1[/* recordedData */ Blob, Unit]] = js.undefined
  /** Callback that is executed when audio stops recording */
  var onStop: js.UndefOr[js.Function1[/* recordedData */ Blob, Unit]] = js.undefined
  /** Available in React-Mic-Plus upgrade only */
  var pause: js.UndefOr[Boolean] = js.undefined
  /** Set to true to begin recording */
  var record: js.UndefOr[Boolean] = js.undefined
  /** Sound wave color */
  var strokeColor: js.UndefOr[String] = js.undefined
  var visualSetting: js.UndefOr[sinewave | frequencyBars] = js.undefined
}

object ReactMicProps {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    className: String = null,
    onData: /* recordedData */ Blob => Unit = null,
    onStop: /* recordedData */ Blob => Unit = null,
    pause: js.UndefOr[Boolean] = js.undefined,
    record: js.UndefOr[Boolean] = js.undefined,
    strokeColor: String = null,
    visualSetting: sinewave | frequencyBars = null
  ): ReactMicProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onData != null) __obj.updateDynamic("onData")(js.Any.fromFunction1(onData))
    if (onStop != null) __obj.updateDynamic("onStop")(js.Any.fromFunction1(onStop))
    if (!js.isUndefined(pause)) __obj.updateDynamic("pause")(pause.asInstanceOf[js.Any])
    if (!js.isUndefined(record)) __obj.updateDynamic("record")(record.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (visualSetting != null) __obj.updateDynamic("visualSetting")(visualSetting.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactMicProps]
  }
}

