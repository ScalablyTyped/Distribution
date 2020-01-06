package typings.atPulumiAws.accessanalyzerAnalyzerMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyzerState extends js.Object {
  /**
    * Name of the Analyzer.
    */
  val analyzerName: js.UndefOr[Input[String]] = js.native
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value mapping of resource tags.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Type of Analyzer. Valid value is currently only `ACCOUNT`. Defaults to `ACCOUNT`.
    */
  val `type`: js.UndefOr[Input[String]] = js.native
}

object AnalyzerState {
  @scala.inline
  def apply(
    analyzerName: Input[String] = null,
    arn: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    `type`: Input[String] = null
  ): AnalyzerState = {
    val __obj = js.Dynamic.literal()
    if (analyzerName != null) __obj.updateDynamic("analyzerName")(analyzerName.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyzerState]
  }
}

