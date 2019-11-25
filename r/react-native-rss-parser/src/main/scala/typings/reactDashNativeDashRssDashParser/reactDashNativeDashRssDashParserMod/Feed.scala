package typings.reactDashNativeDashRssDashParser.reactDashNativeDashRssDashParserMod

import typings.reactDashNativeDashRssDashParser.Anon_AuthorsBlock
import typings.reactDashNativeDashRssDashParser.Anon_Description
import typings.reactDashNativeDashRssDashParser.Anon_Name
import typings.reactDashNativeDashRssDashParser.Anon_Rel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Feed extends js.Object {
  var authors: js.Array[Maybe[Anon_Name]]
  var categories: js.Array[Maybe[Anon_Name]]
  var copyright: Maybe[String]
  var description: String
  var image: Anon_Description
  var items: js.Array[FeedItem]
  var itunes: Anon_AuthorsBlock
  var language: String
  var lastPublished: String
  var lastUpdated: String
  var links: js.Array[Anon_Rel]
  var title: String
  var `type`: String
}

object Feed {
  @scala.inline
  def apply(
    authors: js.Array[Maybe[Anon_Name]],
    categories: js.Array[Maybe[Anon_Name]],
    description: String,
    image: Anon_Description,
    items: js.Array[FeedItem],
    itunes: Anon_AuthorsBlock,
    language: String,
    lastPublished: String,
    lastUpdated: String,
    links: js.Array[Anon_Rel],
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

