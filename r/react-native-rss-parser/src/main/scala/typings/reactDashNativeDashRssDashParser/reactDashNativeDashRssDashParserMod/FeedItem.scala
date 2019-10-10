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
    val __obj = js.Dynamic.literal(authors = authors, categories = categories, content = content, description = description, enclosures = enclosures, id = id, itunes = itunes, links = links, published = published, title = title)
  
    __obj.asInstanceOf[FeedItem]
  }
}

