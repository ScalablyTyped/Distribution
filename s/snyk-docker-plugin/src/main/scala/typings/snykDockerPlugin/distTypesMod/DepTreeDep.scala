package typings.snykDockerPlugin.distTypesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DepTreeDep extends js.Object {
  var dependencies: StringDictionary[DepTreeDep]
  var labels: js.UndefOr[StringDictionary[String]] = js.undefined
  var name: String
  var version: String
}

object DepTreeDep {
  @scala.inline
  def apply(
    dependencies: StringDictionary[DepTreeDep],
    name: String,
    version: String,
    labels: StringDictionary[String] = null
  ): DepTreeDep = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepTreeDep]
  }
}

