package typings.atPulumiAws.accessanalyzerAnalyzerMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyzerArgs extends js.Object {
  /**
    * Name of the Analyzer.
    */
  val analyzerName: Input[String] = js.native
  /**
    * Key-value mapping of resource tags.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Type of Analyzer. Valid value is currently only `ACCOUNT`. Defaults to `ACCOUNT`.
    */
  val `type`: js.UndefOr[Input[String]] = js.native
}

object AnalyzerArgs {
  @scala.inline
  def apply(analyzerName: Input[String], tags: Input[StringDictionary[_]] = null, `type`: Input[String] = null): AnalyzerArgs = {
    val __obj = js.Dynamic.literal(analyzerName = analyzerName.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyzerArgs]
  }
}

