package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionsConditions extends js.Object {
  var actions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var conditions: js.UndefOr[js.Array[Anon_Test]] = js.undefined
  var effect: js.UndefOr[java.lang.String] = js.undefined
  var notActions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var notPrincipals: js.UndefOr[js.Array[Anon_Identifiers]] = js.undefined
  var notResources: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var principals: js.UndefOr[js.Array[Anon_Identifiers]] = js.undefined
  var resources: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var sid: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ActionsConditions {
  @scala.inline
  def apply(
    actions: js.Array[java.lang.String] = null,
    conditions: js.Array[Anon_Test] = null,
    effect: java.lang.String = null,
    notActions: js.Array[java.lang.String] = null,
    notPrincipals: js.Array[Anon_Identifiers] = null,
    notResources: js.Array[java.lang.String] = null,
    principals: js.Array[Anon_Identifiers] = null,
    resources: js.Array[java.lang.String] = null,
    sid: java.lang.String = null
  ): Anon_ActionsConditions = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (conditions != null) __obj.updateDynamic("conditions")(conditions)
    if (effect != null) __obj.updateDynamic("effect")(effect)
    if (notActions != null) __obj.updateDynamic("notActions")(notActions)
    if (notPrincipals != null) __obj.updateDynamic("notPrincipals")(notPrincipals)
    if (notResources != null) __obj.updateDynamic("notResources")(notResources)
    if (principals != null) __obj.updateDynamic("principals")(principals)
    if (resources != null) __obj.updateDynamic("resources")(resources)
    if (sid != null) __obj.updateDynamic("sid")(sid)
    __obj.asInstanceOf[Anon_ActionsConditions]
  }
}

