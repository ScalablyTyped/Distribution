package typings
package reactDashApolloLib.getDataFromTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMarkupFromTreeOptions extends js.Object {
  var context: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var renderFunction: js.UndefOr[
    js.Function1[/* tree */ reactLib.reactMod.ReactNs.ReactElement[_], java.lang.String]
  ] = js.undefined
  var tree: reactLib.reactMod.ReactNs.ReactNode
}

object GetMarkupFromTreeOptions {
  @scala.inline
  def apply(
    tree: reactLib.reactMod.ReactNs.ReactNode,
    context: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    renderFunction: /* tree */ reactLib.reactMod.ReactNs.ReactElement[_] => java.lang.String = null
  ): GetMarkupFromTreeOptions = {
    val __obj = js.Dynamic.literal(tree = tree.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context)
    if (renderFunction != null) __obj.updateDynamic("renderFunction")(js.Any.fromFunction1(renderFunction))
    __obj.asInstanceOf[GetMarkupFromTreeOptions]
  }
}

