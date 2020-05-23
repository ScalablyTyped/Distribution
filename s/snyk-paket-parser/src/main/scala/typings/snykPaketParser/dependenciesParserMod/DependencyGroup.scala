package typings.snykPaketParser.dependenciesParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DependencyGroup extends js.Object {
  var dependencies: js.Array[Dependency]
  var name: String | Null
  var options: Options
  var sources: js.Array[Source]
}

object DependencyGroup {
  @scala.inline
  def apply(
    dependencies: js.Array[Dependency],
    options: Options,
    sources: js.Array[Source],
    name: String = null
  ): DependencyGroup = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependencyGroup]
  }
}

