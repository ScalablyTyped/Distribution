package typings.atStorybookAddonDashCentered

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NgModuleMetadata extends js.Object {
  var declarations: js.UndefOr[js.Array[_]] = js.undefined
  var entryComponents: js.UndefOr[js.Array[_]] = js.undefined
  var imports: js.UndefOr[js.Array[_]] = js.undefined
  var providers: js.UndefOr[js.Array[_]] = js.undefined
  var schemas: js.UndefOr[js.Array[_]] = js.undefined
}

object NgModuleMetadata {
  @scala.inline
  def apply(
    declarations: js.Array[_] = null,
    entryComponents: js.Array[_] = null,
    imports: js.Array[_] = null,
    providers: js.Array[_] = null,
    schemas: js.Array[_] = null
  ): NgModuleMetadata = {
    val __obj = js.Dynamic.literal()
    if (declarations != null) __obj.updateDynamic("declarations")(declarations)
    if (entryComponents != null) __obj.updateDynamic("entryComponents")(entryComponents)
    if (imports != null) __obj.updateDynamic("imports")(imports)
    if (providers != null) __obj.updateDynamic("providers")(providers)
    if (schemas != null) __obj.updateDynamic("schemas")(schemas)
    __obj.asInstanceOf[NgModuleMetadata]
  }
}

