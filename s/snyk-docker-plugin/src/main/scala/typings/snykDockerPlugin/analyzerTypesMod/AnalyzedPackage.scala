package typings.snykDockerPlugin.analyzerTypesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyzedPackage extends js.Object {
  var AutoInstalled: js.UndefOr[Boolean] = js.undefined
  var Deps: StringDictionary[js.Any]
  var Name: String
  var Provides: js.Array[String]
  var Source: js.UndefOr[String] = js.undefined
  var Version: js.UndefOr[String] = js.undefined
}

object AnalyzedPackage {
  @scala.inline
  def apply(
    Deps: StringDictionary[js.Any],
    Name: String,
    Provides: js.Array[String],
    AutoInstalled: js.UndefOr[Boolean] = js.undefined,
    Source: String = null,
    Version: String = null
  ): AnalyzedPackage = {
    val __obj = js.Dynamic.literal(Deps = Deps.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Provides = Provides.asInstanceOf[js.Any])
    if (!js.isUndefined(AutoInstalled)) __obj.updateDynamic("AutoInstalled")(AutoInstalled.get.asInstanceOf[js.Any])
    if (Source != null) __obj.updateDynamic("Source")(Source.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyzedPackage]
  }
}

