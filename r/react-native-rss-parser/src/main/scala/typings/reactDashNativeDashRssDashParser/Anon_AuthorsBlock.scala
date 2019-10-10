package typings.reactDashNativeDashRssDashParser

import typings.reactDashNativeDashRssDashParser.reactDashNativeDashRssDashParserMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthorsBlock extends js.Object {
  var authors: js.Array[Anon_Name]
  var block: Maybe[String]
  var categories: js.Array[Anon_NameSubCategories]
  var complete: Maybe[String]
  var explicit: String
  var image: String
  var newFeedUrl: Maybe[String]
  var owner: Anon_Email
  var subtitle: Maybe[String]
  var summary: String
}

object Anon_AuthorsBlock {
  @scala.inline
  def apply(
    authors: js.Array[Anon_Name],
    categories: js.Array[Anon_NameSubCategories],
    explicit: String,
    image: String,
    owner: Anon_Email,
    summary: String,
    block: Maybe[String] = null,
    complete: Maybe[String] = null,
    newFeedUrl: Maybe[String] = null,
    subtitle: Maybe[String] = null
  ): Anon_AuthorsBlock = {
    val __obj = js.Dynamic.literal(authors = authors, categories = categories, explicit = explicit, image = image, owner = owner, summary = summary)
    if (block != null) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(complete.asInstanceOf[js.Any])
    if (newFeedUrl != null) __obj.updateDynamic("newFeedUrl")(newFeedUrl.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AuthorsBlock]
  }
}

