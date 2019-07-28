package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccessesGrantee extends js.Object {
  var accesses: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  var grantee: js.UndefOr[Input[String]] = js.undefined
  var granteeType: js.UndefOr[Input[String]] = js.undefined
}

object Anon_AccessesGrantee {
  @scala.inline
  def apply(
    accesses: Input[js.Array[Input[String]]] = null,
    grantee: Input[String] = null,
    granteeType: Input[String] = null
  ): Anon_AccessesGrantee = {
    val __obj = js.Dynamic.literal()
    if (accesses != null) __obj.updateDynamic("accesses")(accesses.asInstanceOf[js.Any])
    if (grantee != null) __obj.updateDynamic("grantee")(grantee.asInstanceOf[js.Any])
    if (granteeType != null) __obj.updateDynamic("granteeType")(granteeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AccessesGrantee]
  }
}

