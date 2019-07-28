package typings.slateDashHtmlDashSerializer.slateDashHtmlDashSerializerMod

import typings.react.reactMod.ReactNode
import typings.std.ChildNode
import typings.std.Element
import typings.std.Node
import typings.std.NodeList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rule extends js.Object {
  var deserialize: js.UndefOr[
    js.Function2[
      /* el */ Element, 
      /* next */ js.Function1[/* elements */ (js.Array[(Node with ChildNode) | Element]) | NodeList, _], 
      _
    ]
  ] = js.undefined
  var serialize: js.UndefOr[js.Function2[/* obj */ js.Any, /* children */ String, ReactNode]] = js.undefined
}

object Rule {
  @scala.inline
  def apply(
    deserialize: (/* el */ Element, /* next */ js.Function1[/* elements */ (js.Array[(Node with ChildNode) | Element]) | NodeList, _]) => _ = null,
    serialize: (/* obj */ js.Any, /* children */ String) => ReactNode = null
  ): Rule = {
    val __obj = js.Dynamic.literal()
    if (deserialize != null) __obj.updateDynamic("deserialize")(js.Any.fromFunction2(deserialize))
    if (serialize != null) __obj.updateDynamic("serialize")(js.Any.fromFunction2(serialize))
    __obj.asInstanceOf[Rule]
  }
}

