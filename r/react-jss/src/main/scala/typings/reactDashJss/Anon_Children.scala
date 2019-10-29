package typings.reactDashJss

import typings.jss.jssMod.SheetsRegistry
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: ReactNode
  var classNamePrefix: js.UndefOr[String] = js.undefined
  var disableStylesGeneration: js.UndefOr[Boolean] = js.undefined
  var generateId: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GenerateId */ js.Any
  ] = js.undefined
  var id: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CreateGenerateIdOptions */ js.Any
  ] = js.undefined
  var jss: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Jss */ js.Any
  ] = js.undefined
  var registry: js.UndefOr[SheetsRegistry] = js.undefined
}

object Anon_Children {
  @scala.inline
  def apply(
    children: ReactNode = null,
    classNamePrefix: String = null,
    disableStylesGeneration: js.UndefOr[Boolean] = js.undefined,
    generateId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GenerateId */ js.Any = null,
    id: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CreateGenerateIdOptions */ js.Any = null,
    jss: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Jss */ js.Any = null,
    registry: SheetsRegistry = null
  ): Anon_Children = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (classNamePrefix != null) __obj.updateDynamic("classNamePrefix")(classNamePrefix)
    if (!js.isUndefined(disableStylesGeneration)) __obj.updateDynamic("disableStylesGeneration")(disableStylesGeneration)
    if (generateId != null) __obj.updateDynamic("generateId")(generateId)
    if (id != null) __obj.updateDynamic("id")(id)
    if (jss != null) __obj.updateDynamic("jss")(jss)
    if (registry != null) __obj.updateDynamic("registry")(registry)
    __obj.asInstanceOf[Anon_Children]
  }
}

