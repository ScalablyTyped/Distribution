package typings.stormReactDiagrams

import typings.stormReactDiagrams.linkModelMod.LinkModel
import typings.stormReactDiagrams.linkModelMod.LinkModelListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsCreatedLink extends js.Object {
  var isCreated: Boolean
  var link: LinkModel[LinkModelListener]
}

object AnonIsCreatedLink {
  @scala.inline
  def apply(isCreated: Boolean, link: LinkModel[LinkModelListener]): AnonIsCreatedLink = {
    val __obj = js.Dynamic.literal(isCreated = isCreated.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIsCreatedLink]
  }
}

