package typings.reactJss.anon

import typings.jss.mod.CreateGenerateIdOptions
import typings.jss.mod.GenerateId
import typings.jss.mod.Jss
import typings.jss.mod.Rule
import typings.jss.mod.SheetsRegistry
import typings.jss.mod.StyleSheet
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Children extends js.Object {
  var children: ReactNode
  var classNamePrefix: js.UndefOr[String] = js.undefined
  var disableStylesGeneration: js.UndefOr[Boolean] = js.undefined
  var generateId: js.UndefOr[GenerateId] = js.undefined
  var id: js.UndefOr[CreateGenerateIdOptions] = js.undefined
  var jss: js.UndefOr[Jss] = js.undefined
  var registry: js.UndefOr[SheetsRegistry] = js.undefined
}

object Children {
  @scala.inline
  def apply(
    children: ReactNode = null,
    classNamePrefix: String = null,
    disableStylesGeneration: js.UndefOr[Boolean] = js.undefined,
    generateId: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => String = null,
    id: CreateGenerateIdOptions = null,
    jss: Jss = null,
    registry: SheetsRegistry = null
  ): Children = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (classNamePrefix != null) __obj.updateDynamic("classNamePrefix")(classNamePrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStylesGeneration)) __obj.updateDynamic("disableStylesGeneration")(disableStylesGeneration.get.asInstanceOf[js.Any])
    if (generateId != null) __obj.updateDynamic("generateId")(js.Any.fromFunction2(generateId))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (jss != null) __obj.updateDynamic("jss")(jss.asInstanceOf[js.Any])
    if (registry != null) __obj.updateDynamic("registry")(registry.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
}

