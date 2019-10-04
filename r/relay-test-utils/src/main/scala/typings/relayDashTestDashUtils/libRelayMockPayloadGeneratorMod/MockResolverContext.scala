package typings.relayDashTestDashUtils.libRelayMockPayloadGeneratorMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockResolverContext extends js.Object {
  var alias: js.UndefOr[String] = js.undefined
  var args: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var parentType: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[js.Array[String]] = js.undefined
}

object MockResolverContext {
  @scala.inline
  def apply(
    alias: String = null,
    args: StringDictionary[js.Any] = null,
    name: String = null,
    parentType: String = null,
    path: js.Array[String] = null
  ): MockResolverContext = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (args != null) __obj.updateDynamic("args")(args)
    if (name != null) __obj.updateDynamic("name")(name)
    if (parentType != null) __obj.updateDynamic("parentType")(parentType)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[MockResolverContext]
  }
}

