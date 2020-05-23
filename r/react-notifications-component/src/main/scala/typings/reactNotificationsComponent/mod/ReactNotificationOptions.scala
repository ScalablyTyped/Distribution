package typings.reactNotificationsComponent.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.`bottom-center`
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.`bottom-left`
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.`bottom-right`
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.`top-center`
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.`top-left`
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.`top-right`
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.bottom
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.center
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.danger
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.info
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.success
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.top
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactNotificationOptions extends js.Object {
  var animationIn: js.UndefOr[js.Array[String]] = js.undefined
  var animationOut: js.UndefOr[js.Array[String]] = js.undefined
  var container: `top-left` | `top-right` | `top-center` | center | `bottom-left` | `bottom-right` | `bottom-center`
  var content: js.UndefOr[
    (ComponentClass[js.Object, ComponentState]) | FunctionComponent[js.Object] | ReactNode
  ] = js.undefined
  var dismiss: js.UndefOr[DismissOptions] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var insert: js.UndefOr[top | bottom] = js.undefined
  var message: js.UndefOr[String | ReactNode | FunctionComponent[js.Object]] = js.undefined
  var onRemoval: js.UndefOr[js.Function2[/* id */ String, /* removedBy */ js.Any, Unit]] = js.undefined
  var slidingEnter: js.UndefOr[TransitionOptions] = js.undefined
  var slidingExit: js.UndefOr[TransitionOptions] = js.undefined
  var title: js.UndefOr[String | ReactNode | FunctionComponent[js.Object]] = js.undefined
  var touchRevert: js.UndefOr[TransitionOptions] = js.undefined
  var touchSlidingExit: js.UndefOr[TransitionOptions] = js.undefined
  var `type`: js.UndefOr[
    success | danger | info | typings.reactNotificationsComponent.reactNotificationsComponentStrings.default | warning
  ] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object ReactNotificationOptions {
  @scala.inline
  def apply(
    container: `top-left` | `top-right` | `top-center` | center | `bottom-left` | `bottom-right` | `bottom-center`,
    animationIn: js.Array[String] = null,
    animationOut: js.Array[String] = null,
    content: (ComponentClass[js.Object, ComponentState]) | FunctionComponent[js.Object] | ReactNode = null,
    dismiss: DismissOptions = null,
    id: String = null,
    insert: top | bottom = null,
    message: String | ReactNode | FunctionComponent[js.Object] = null,
    onRemoval: (/* id */ String, /* removedBy */ js.Any) => Unit = null,
    slidingEnter: TransitionOptions = null,
    slidingExit: TransitionOptions = null,
    title: String | ReactNode | FunctionComponent[js.Object] = null,
    touchRevert: TransitionOptions = null,
    touchSlidingExit: TransitionOptions = null,
    `type`: success | danger | info | typings.reactNotificationsComponent.reactNotificationsComponentStrings.default | warning = null,
    width: js.UndefOr[Double] = js.undefined
  ): ReactNotificationOptions = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    if (animationIn != null) __obj.updateDynamic("animationIn")(animationIn.asInstanceOf[js.Any])
    if (animationOut != null) __obj.updateDynamic("animationOut")(animationOut.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (dismiss != null) __obj.updateDynamic("dismiss")(dismiss.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (insert != null) __obj.updateDynamic("insert")(insert.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (onRemoval != null) __obj.updateDynamic("onRemoval")(js.Any.fromFunction2(onRemoval))
    if (slidingEnter != null) __obj.updateDynamic("slidingEnter")(slidingEnter.asInstanceOf[js.Any])
    if (slidingExit != null) __obj.updateDynamic("slidingExit")(slidingExit.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (touchRevert != null) __obj.updateDynamic("touchRevert")(touchRevert.asInstanceOf[js.Any])
    if (touchSlidingExit != null) __obj.updateDynamic("touchSlidingExit")(touchSlidingExit.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactNotificationOptions]
  }
}

