package typings.stormDashReactDashDiagrams

import typings.stormDashReactDashDiagrams.distSrcModelsLinkModelMod.LinkModel
import typings.stormDashReactDashDiagrams.distSrcModelsLinkModelMod.LinkModelListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsCreatedLink extends js.Object {
  var isCreated: Boolean
  var link: LinkModel[LinkModelListener]
}

object Anon_IsCreatedLink {
  @scala.inline
  def apply(isCreated: Boolean, link: LinkModel[LinkModelListener]): Anon_IsCreatedLink = {
    val __obj = js.Dynamic.literal(isCreated = isCreated, link = link)
  
    __obj.asInstanceOf[Anon_IsCreatedLink]
  }
}

