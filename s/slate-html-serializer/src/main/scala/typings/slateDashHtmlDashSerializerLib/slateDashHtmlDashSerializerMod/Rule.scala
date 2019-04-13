package typings
package slateDashHtmlDashSerializerLib.slateDashHtmlDashSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rule extends js.Object {
  var deserialize: js.UndefOr[
    js.Function2[
      /* el */ stdLib.Element, 
      /* next */ js.Function1[
        /* elements */ js.Array[stdLib.Element] | stdLib.NodeList | (js.Array[stdLib.Node with stdLib.ChildNode]), 
        _
      ], 
      _
    ]
  ] = js.undefined
  var serialize: js.UndefOr[
    js.Function2[/* obj */ js.Any, /* children */ java.lang.String, reactLib.reactMod.ReactNode]
  ] = js.undefined
}

object Rule {
  @scala.inline
  def apply(
    deserialize: (/* el */ stdLib.Element, /* next */ js.Function1[
      /* elements */ js.Array[stdLib.Element] | stdLib.NodeList | (js.Array[stdLib.Node with stdLib.ChildNode]), 
      _
    ]) => _ = null,
    serialize: (/* obj */ js.Any, /* children */ java.lang.String) => reactLib.reactMod.ReactNode = null
  ): Rule = {
    val __obj = js.Dynamic.literal()
    if (deserialize != null) __obj.updateDynamic("deserialize")(js.Any.fromFunction2(deserialize))
    if (serialize != null) __obj.updateDynamic("serialize")(js.Any.fromFunction2(serialize))
    __obj.asInstanceOf[Rule]
  }
}

