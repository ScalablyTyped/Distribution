package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColdStorageAfterDeleteAfter extends js.Object {
  var coldStorageAfter: js.UndefOr[Input[Double]] = js.undefined
  var deleteAfter: js.UndefOr[Input[Double]] = js.undefined
}

object Anon_ColdStorageAfterDeleteAfter {
  @scala.inline
  def apply(coldStorageAfter: Input[Double] = null, deleteAfter: Input[Double] = null): Anon_ColdStorageAfterDeleteAfter = {
    val __obj = js.Dynamic.literal()
    if (coldStorageAfter != null) __obj.updateDynamic("coldStorageAfter")(coldStorageAfter.asInstanceOf[js.Any])
    if (deleteAfter != null) __obj.updateDynamic("deleteAfter")(deleteAfter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColdStorageAfterDeleteAfter]
  }
}

