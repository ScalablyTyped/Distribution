package typings.snykPaketParser.dependenciesParserMod

import typings.snykPaketParser.snykPaketParserStrings.nuget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NugetDependency extends Dependency {
  var name: String
  var options: Options
  @JSName("source")
  var source_NugetDependency: nuget
  var versionRange: String
}

object NugetDependency {
  @scala.inline
  def apply(name: String, options: Options, source: nuget, versionRange: String): NugetDependency = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], versionRange = versionRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[NugetDependency]
  }
}

