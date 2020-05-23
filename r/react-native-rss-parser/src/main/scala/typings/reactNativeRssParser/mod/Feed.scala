package typings.reactNativeRssParser.mod

import typings.reactNativeRssParser.anon.Block
import typings.reactNativeRssParser.anon.Description
import typings.reactNativeRssParser.anon.Name
import typings.reactNativeRssParser.anon.Rel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Feed extends js.Object {
  var authors: js.Array[Maybe[Name]]
  var categories: js.Array[Maybe[Name]]
  var copyright: Maybe[String]
  var description: String
  var image: Description
  var items: js.Array[FeedItem]
  var itunes: Block
  var language: String
  var lastPublished: String
  var lastUpdated: String
  var links: js.Array[Rel]
  var title: String
  var `type`: String
}

object Feed {
  @scala.inline
  def apply(
    authors: js.Array[Maybe[Name]],
    categories: js.Array[Maybe[Name]],
    description: String,
    image: Description,
    items: js.Array[FeedItem],
    itunes: Block,
    language: String,
    lastPublished: String,
    lastUpdated: String,
    links: js.Array[Rel],
    title: String,
    `type`: String,
    copyright: Maybe[String] = null
  ): Feed = {
    val __obj = js.Dynamic.literal(authors = authors.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], itunes = itunes.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], lastPublished = lastPublished.asInstanceOf[js.Any], lastUpdated = lastUpdated.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    __obj.asInstanceOf[Feed]
  }
}

