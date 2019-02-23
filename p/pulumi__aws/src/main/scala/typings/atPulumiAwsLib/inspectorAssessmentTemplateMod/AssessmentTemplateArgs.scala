package typings
package atPulumiAwsLib.inspectorAssessmentTemplateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssessmentTemplateArgs extends js.Object {
  /**
    * The duration of the inspector run.
    */
  val duration: atPulumiPulumiLib.outputMod.Input[scala.Double]
  /**
    * The name of the assessment template.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The rules to be used during the run.
    */
  val rulesPackageArns: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  /**
    * The assessment target ARN to attach the template to.
    */
  val targetArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

