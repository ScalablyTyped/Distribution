package typings.reactDashOnsenui

import typings.react.reactMod.CSSProperties
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  modifier ? :string,   onChange ? :(e : std.Event): void,   value ? :number,   disabled ? :boolean} */
trait HTMLAttributesidclassNamestylemodifierstringonChan extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var modifier: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object HTMLAttributesidclassNamestylemodifierstringonChan {
  @scala.inline
  def apply(
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    modifier: String = null,
    onChange: /* e */ Event => Unit = null,
    style: CSSProperties = null,
    value: Int | Double = null
  ): HTMLAttributesidclassNamestylemodifierstringonChan = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (style != null) __obj.updateDynamic("style")(style)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLAttributesidclassNamestylemodifierstringonChan]
  }
}

