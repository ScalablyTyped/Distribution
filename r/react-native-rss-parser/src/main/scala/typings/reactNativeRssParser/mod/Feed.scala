package typings.reactNativeRssParser.mod

import typings.reactNativeRssParser.AnonBlock
import typings.reactNativeRssParser.AnonDescription
import typings.reactNativeRssParser.AnonName
import typings.reactNativeRssParser.AnonRel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Feed extends js.Object {
  var authors: js.Array[Maybe[AnonName]]
  var categories: js.Array[Maybe[AnonName]]
  var copyright: Maybe[String]
  var description: String
  var image: AnonDescription
  var items: js.Array[FeedItem]
  var itunes: AnonBlock
  var language: String
  var lastPublished: String
  var lastUpdated: String
  var links: js.Array[AnonRel]
  var title: String
  var `type`: String
}

object Feed {
  @scala.inline
  def apply(
    authors: js.Array[Maybe[AnonName]],
    categories: js.Array[Maybe[AnonName]],
    description: String,
    image: AnonDescription,
    items: js.Array[FeedItem],
    itunes: AnonBlock,
    language: String,
    lastPublished: String,
    lastUpdated: String,
    links: js.Array[AnonRel],
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

