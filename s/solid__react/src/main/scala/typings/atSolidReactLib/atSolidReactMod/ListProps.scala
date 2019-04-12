package typings
package atSolidReactLib.atSolidReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProps extends js.Object {
  var children: js.UndefOr[
    js.Function2[
      /* listItem */ LDflexValue, 
      /* index */ scala.Double, 
      reactLib.reactMod.Global.JSXNs.Element
    ]
  ] = js.undefined
  var container: js.UndefOr[
    js.Function1[
      /* items */ reactLib.reactMod.Global.JSXNs.Element, 
      reactLib.reactMod.Global.JSXNs.Element
    ]
  ] = js.undefined
  // dtslint does not appear to understand that `T` is used in the type guard.
  // See https://github.com/Microsoft/dtslint/issues/228
  // tslint:disable-next-line no-unnecessary-generics
  var filter: js.UndefOr[
    js.Function3[
      /* item */ LDflexValue, 
      /* index */ scala.Double, 
      /* array */ js.Array[LDflexValue], 
      /* is @solid/react.@solid/react.LDflexValue */ scala.Boolean
    ]
  ] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var src: java.lang.String
}

object ListProps {
  @scala.inline
  def apply(
    src: java.lang.String,
    children: (/* listItem */ LDflexValue, /* index */ scala.Double) => reactLib.reactMod.Global.JSXNs.Element = null,
    container: /* items */ reactLib.reactMod.Global.JSXNs.Element => reactLib.reactMod.Global.JSXNs.Element = null,
    filter: (/* item */ LDflexValue, /* index */ scala.Double, /* array */ js.Array[LDflexValue]) => /* is @solid/react.@solid/react.LDflexValue */ scala.Boolean = null,
    limit: scala.Int | scala.Double = null,
    offset: scala.Int | scala.Double = null
  ): ListProps = {
    val __obj = js.Dynamic.literal(src = src)
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction2(children))
    if (container != null) __obj.updateDynamic("container")(js.Any.fromFunction1(container))
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction3(filter))
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProps]
  }
}

