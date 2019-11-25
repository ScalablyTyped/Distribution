package typings.reactDashNativeDashRssDashParser.reactDashNativeDashRssDashParserMod

import typings.reactDashNativeDashRssDashParser.Anon_Authors
import typings.reactDashNativeDashRssDashParser.Anon_Length
import typings.reactDashNativeDashRssDashParser.Anon_Name
import typings.reactDashNativeDashRssDashParser.Anon_Rel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeedItem extends js.Object {
  var authors: js.Array[Maybe[Anon_Name]]
  var categories: js.Array[Maybe[Anon_Name]]
  var content: String
  var description: String
  var enclosures: js.Array[Anon_Length]
  var id: String
  var itunes: Anon_Authors
  var links: js.Array[Anon_Rel]
  var published: String
  var title: String
}

object FeedItem {
  @scala.inline
  def apply(
    authors: js.Array[Maybe[Anon_Name]],
    categories: js.Array[Maybe[Anon_Name]],
    content: String,
    description: String,
    enclosures: js.Array[Anon_Length],
    id: String,
    itunes: Anon_Authors,
    links: js.Array[Anon_Rel],
    published: String,
    title: String
  ): FeedItem = {
    val __obj = js.Dynamic.literal(authors = authors.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enclosures = enclosures.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itunes = itunes.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], published = published.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FeedItem]
  }
}

