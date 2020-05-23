package typings.reactNativeRssParser.anon

import typings.reactNativeRssParser.mod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Block extends js.Object {
  var authors: js.Array[Name]
  var block: Maybe[String]
  var categories: js.Array[SubCategories]
  var complete: Maybe[String]
  var explicit: String
  var image: String
  var newFeedUrl: Maybe[String]
  var owner: Email
  var subtitle: Maybe[String]
  var summary: String
}

object Block {
  @scala.inline
  def apply(
    authors: js.Array[Name],
    categories: js.Array[SubCategories],
    explicit: String,
    image: String,
    owner: Email,
    summary: String,
    block: Maybe[String] = null,
    complete: Maybe[String] = null,
    newFeedUrl: Maybe[String] = null,
    subtitle: Maybe[String] = null
  ): Block = {
    val __obj = js.Dynamic.literal(authors = authors.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], explicit = explicit.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    if (block != null) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(complete.asInstanceOf[js.Any])
    if (newFeedUrl != null) __obj.updateDynamic("newFeedUrl")(newFeedUrl.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
}

