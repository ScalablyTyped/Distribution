package typings
package atPulumiAwsLib.glueClassifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassifierArgs extends js.Object {
  /**
    * A classifier that uses grok patterns. Defined below.
    */
  val grokClassifier: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ClassificationCustomPatterns]
  ] = js.undefined
  /**
    * A classifier for JSON content. Defined below.
    */
  val jsonClassifier: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_JsonPathInput]] = js.undefined
  /**
    * The name of the classifier.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A classifier for XML content. Defined below.
    */
  val xmlClassifier: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ClassificationRowTagInput]] = js.undefined
}

