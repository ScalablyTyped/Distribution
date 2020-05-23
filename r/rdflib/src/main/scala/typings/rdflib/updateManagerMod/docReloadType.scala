package typings.rdflib.updateManagerMod

import typings.rdflib.tfTypesMod.NamedNode
import typings.rdflib.tfTypesMod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait docReloadType extends NamedNode {
  var reloadTimeCount: js.UndefOr[Double] = js.undefined
  var reloadTimeTotal: js.UndefOr[Double] = js.undefined
}

object docReloadType {
  @scala.inline
  def apply(
    equals: Term => Boolean,
    termType: typings.rdflib.rdflibStrings.NamedNode,
    value: String,
    reloadTimeCount: js.UndefOr[Double] = js.undefined,
    reloadTimeTotal: js.UndefOr[Double] = js.undefined
  ): docReloadType = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(reloadTimeCount)) __obj.updateDynamic("reloadTimeCount")(reloadTimeCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reloadTimeTotal)) __obj.updateDynamic("reloadTimeTotal")(reloadTimeTotal.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[docReloadType]
  }
}

