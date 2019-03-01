package typings
package stormDashReactDashDiagramsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsCreatedLink extends js.Object {
  var isCreated: scala.Boolean
  var link: stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModel[stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModelListener]
}

object Anon_IsCreatedLink {
  @scala.inline
  def apply(
    isCreated: scala.Boolean,
    link: stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModel[stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModelListener]
  ): Anon_IsCreatedLink = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isCreated")(isCreated)
    __obj.updateDynamic("link")(link)
    __obj.asInstanceOf[Anon_IsCreatedLink]
  }
}

