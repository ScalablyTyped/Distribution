package typings.snykCliInterface.commonMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DepTreeDep extends js.Object {
  var dependencies: js.UndefOr[StringDictionary[DepTreeDep]] = js.undefined
  var labels: js.UndefOr[StringDictionary[String]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object DepTreeDep {
  @scala.inline
  def apply(
    dependencies: StringDictionary[DepTreeDep] = null,
    labels: StringDictionary[String] = null,
    name: String = null,
    version: String = null
  ): DepTreeDep = {
    val __obj = js.Dynamic.literal()
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepTreeDep]
  }
}

