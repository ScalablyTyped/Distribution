package typings.stremioAddonSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaLink extends js.Object {
  /**
    * Any unique category name, links are grouped based on their category.
    *
    * Some recommended categories are: actor, director, writer,
    * while the following categories are reserved and should not be used: imdb, share, similar.
    */
  var category: String
  /**
    * Human readable name for the link.
    */
  var name: String
  /**
    * An external URL or Meta Link.
    */
  var url: String
}

object MetaLink {
  @scala.inline
  def apply(category: String, name: String, url: String): MetaLink = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MetaLink]
  }
}

