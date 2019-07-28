package typings.reactDashElemental

import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccentColor extends js.Object {
  val accentColor: js.UndefOr[String] = js.undefined
  val idleColor: js.UndefOr[String] = js.undefined
  val onChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  val options: js.UndefOr[js.Array[Anon_Disabled]] = js.undefined
  val radioRenderer: js.UndefOr[
    js.Function3[
      /* option */ ReactElement, 
      /* idx */ Double, 
      /* options */ js.Array[ReactElement], 
      ReactElement
    ]
  ] = js.undefined
  val value: js.UndefOr[String] = js.undefined
}

object Anon_AccentColor {
  @scala.inline
  def apply(
    accentColor: String = null,
    idleColor: String = null,
    onChange: /* value */ String => Unit = null,
    options: js.Array[Anon_Disabled] = null,
    radioRenderer: (/* option */ ReactElement, /* idx */ Double, /* options */ js.Array[ReactElement]) => ReactElement = null,
    value: String = null
  ): Anon_AccentColor = {
    val __obj = js.Dynamic.literal()
    if (accentColor != null) __obj.updateDynamic("accentColor")(accentColor)
    if (idleColor != null) __obj.updateDynamic("idleColor")(idleColor)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (options != null) __obj.updateDynamic("options")(options)
    if (radioRenderer != null) __obj.updateDynamic("radioRenderer")(js.Any.fromFunction3(radioRenderer))
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_AccentColor]
  }
}

