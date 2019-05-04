package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rules extends js.Object {
  var data: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[js.Function1[/* v */ js.Any, scala.Boolean]]
  ] = js.undefined
  var first: js.UndefOr[ObjectAndType | js.Array[ObjectAndType]] = js.undefined
  var isVoid: js.UndefOr[scala.Boolean] = js.undefined
  var last: js.UndefOr[ObjectAndType | js.Array[ObjectAndType]] = js.undefined
  var marks: js.UndefOr[js.Array[slateLib.Anon_Type]] = js.undefined
  var nodes: js.UndefOr[js.Array[slateLib.Anon_Match]] = js.undefined
  var normalize: js.UndefOr[js.Function2[/* editor */ Editor, /* error */ SlateError, scala.Unit]] = js.undefined
  var parent: js.UndefOr[ObjectAndType | js.Array[ObjectAndType]] = js.undefined
  var text: js.UndefOr[stdLib.RegExp] = js.undefined
}

object Rules {
  @scala.inline
  def apply(
    data: org.scalablytyped.runtime.StringDictionary[js.Function1[/* v */ js.Any, scala.Boolean]] = null,
    first: ObjectAndType | js.Array[ObjectAndType] = null,
    isVoid: js.UndefOr[scala.Boolean] = js.undefined,
    last: ObjectAndType | js.Array[ObjectAndType] = null,
    marks: js.Array[slateLib.Anon_Type] = null,
    nodes: js.Array[slateLib.Anon_Match] = null,
    normalize: (/* editor */ Editor, /* error */ SlateError) => scala.Unit = null,
    parent: ObjectAndType | js.Array[ObjectAndType] = null,
    text: stdLib.RegExp = null
  ): Rules = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (first != null) __obj.updateDynamic("first")(first.asInstanceOf[js.Any])
    if (!js.isUndefined(isVoid)) __obj.updateDynamic("isVoid")(isVoid)
    if (last != null) __obj.updateDynamic("last")(last.asInstanceOf[js.Any])
    if (marks != null) __obj.updateDynamic("marks")(marks)
    if (nodes != null) __obj.updateDynamic("nodes")(nodes)
    if (normalize != null) __obj.updateDynamic("normalize")(js.Any.fromFunction2(normalize))
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Rules]
  }
}

