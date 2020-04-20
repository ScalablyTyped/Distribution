package typings.reactNativeRssParser.mod

import typings.reactNativeRssParser.AnonAuthors
import typings.reactNativeRssParser.AnonLength
import typings.reactNativeRssParser.AnonName
import typings.reactNativeRssParser.AnonRel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeedItem extends js.Object {
  var authors: js.Array[Maybe[AnonName]]
  var categories: js.Array[Maybe[AnonName]]
  var content: String
  var description: String
  var enclosures: js.Array[AnonLength]
  var id: String
  var itunes: AnonAuthors
  var links: js.Array[AnonRel]
  var published: String
  var title: String
}

object FeedItem {
  @scala.inline
  def apply(
    authors: js.Array[Maybe[AnonName]],
    categories: js.Array[Maybe[AnonName]],
    content: String,
    description: String,
    enclosures: js.Array[AnonLength],
    id: String,
    itunes: AnonAuthors,
    links: js.Array[AnonRel],
    published: String,
    title: String
  ): FeedItem = {
    val __obj = js.Dynamic.literal(authors = authors.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enclosures = enclosures.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itunes = itunes.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], published = published.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeedItem]
  }
}

