package typings.atPulumiAws.wafregionalXssMatchSetMod

import typings.atPulumiAws.typesInputMod.wafregional.XssMatchSetXssMatchTuple
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XssMatchSetState extends js.Object {
  /**
    * The name of the set
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The parts of web requests that you want to inspect for cross-site scripting attacks.
    */
  val xssMatchTuples: js.UndefOr[Input[js.Array[Input[XssMatchSetXssMatchTuple]]]] = js.native
}

object XssMatchSetState {
  @scala.inline
  def apply(
    name: Input[String] = null,
    xssMatchTuples: Input[js.Array[Input[XssMatchSetXssMatchTuple]]] = null
  ): XssMatchSetState = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (xssMatchTuples != null) __obj.updateDynamic("xssMatchTuples")(xssMatchTuples.asInstanceOf[js.Any])
    __obj.asInstanceOf[XssMatchSetState]
  }
}

