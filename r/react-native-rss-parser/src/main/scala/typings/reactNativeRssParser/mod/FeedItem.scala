package typings.reactNativeRssParser.mod

import typings.reactNativeRssParser.anon.Authors
import typings.reactNativeRssParser.anon.Length
import typings.reactNativeRssParser.anon.Name
import typings.reactNativeRssParser.anon.Rel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeedItem extends js.Object {
  var authors: js.Array[Maybe[Name]]
  var categories: js.Array[Maybe[Name]]
  var content: String
  var description: String
  var enclosures: js.Array[Length]
  var id: String
  var itunes: Authors
  var links: js.Array[Rel]
  var published: String
  var title: String
}

object FeedItem {
  @scala.inline
  def apply(
    authors: js.Array[Maybe[Name]],
    categories: js.Array[Maybe[Name]],
    content: String,
    description: String,
    enclosures: js.Array[Length],
    id: String,
    itunes: Authors,
    links: js.Array[Rel],
    published: String,
    title: String
  ): FeedItem = {
    val __obj = js.Dynamic.literal(authors = authors.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enclosures = enclosures.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itunes = itunes.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], published = published.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeedItem]
  }
}

