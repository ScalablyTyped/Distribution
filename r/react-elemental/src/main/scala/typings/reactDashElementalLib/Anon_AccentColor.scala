package typings
package reactDashElementalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccentColor extends js.Object {
  val accentColor: js.UndefOr[java.lang.String] = js.undefined
  val idleColor: js.UndefOr[java.lang.String] = js.undefined
  val onChange: js.UndefOr[js.Function1[/* value */ java.lang.String, scala.Unit]] = js.undefined
  val options: js.UndefOr[js.Array[Anon_Disabled]] = js.undefined
  val radioRenderer: js.UndefOr[
    js.Function3[
      /* option */ reactLib.reactMod.ReactElement, 
      /* idx */ scala.Double, 
      /* options */ js.Array[reactLib.reactMod.ReactElement], 
      reactLib.reactMod.ReactElement
    ]
  ] = js.undefined
  val value: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AccentColor {
  @scala.inline
  def apply(
    accentColor: java.lang.String = null,
    idleColor: java.lang.String = null,
    onChange: /* value */ java.lang.String => scala.Unit = null,
    options: js.Array[Anon_Disabled] = null,
    radioRenderer: (/* option */ reactLib.reactMod.ReactElement, /* idx */ scala.Double, /* options */ js.Array[reactLib.reactMod.ReactElement]) => reactLib.reactMod.ReactElement = null,
    value: java.lang.String = null
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

