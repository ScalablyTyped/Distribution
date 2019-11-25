package typings.rss.rssMod.NodeRSS

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeedOptions extends js.Object {
  /**
    * One or more categories this feed belongs to.
    */
  var categories: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Copyright information for this feed.
    */
  var copyright: js.UndefOr[String] = js.undefined
  /**
    * Put additional elements in the feed (node-xml syntax).
    */
  var custom_elements: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Put additional namespaces in element
    * (without 'xmlns:' prefix).
    */
  var custom_namespaces: js.UndefOr[js.Object] = js.undefined
  /**
    * A short description of the feed.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * URL to documentation on this feed.
    */
  var docs: js.UndefOr[String] = js.undefined
  /**
    * URL to the rss feed.
    */
  var feed_url: String
  /**
    * Feed generator.
    */
  var generator: js.UndefOr[String] = js.undefined
  /**
    * Where is the PubSubHub hub located.
    */
  var hub: js.UndefOr[String] = js.undefined
  /**
    * Small image for feed readers to use.
    */
  var image_url: js.UndefOr[String] = js.undefined
  /**
    * The language of the content of this feed.
    */
  var language: js.UndefOr[String] = js.undefined
  /**
    * Who manages content in this feed.
    */
  var managingEditor: js.UndefOr[String] = js.undefined
  /**
    * The publication date for content in the feed.
    * Accepts Date object or string with any format
    * JS Date can parse.
    */
  var pubDate: js.UndefOr[Date | String] = js.undefined
  /**
    * URL to the site that the feed is for.
    */
  var site_url: String
  /**
    * Title of your site or feed.
    */
  var title: String
  /**
    * Number of minutes feed can be cached before refreshing
    * from source.
    */
  var ttl: js.UndefOr[Double] = js.undefined
  /**
    * Who manages feed availability and technical support.
    */
  var webMaster: js.UndefOr[String] = js.undefined
}

object FeedOptions {
  @scala.inline
  def apply(
    feed_url: String,
    site_url: String,
    title: String,
    categories: js.Array[String] = null,
    copyright: String = null,
    custom_elements: js.Array[_] = null,
    custom_namespaces: js.Object = null,
    description: String = null,
    docs: String = null,
    generator: String = null,
    hub: String = null,
    image_url: String = null,
    language: String = null,
    managingEditor: String = null,
    pubDate: Date | String = null,
    ttl: Int | Double = null,
    webMaster: String = null
  ): FeedOptions = {
    val __obj = js.Dynamic.literal(feed_url = feed_url.asInstanceOf[js.Any], site_url = site_url.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (custom_elements != null) __obj.updateDynamic("custom_elements")(custom_elements.asInstanceOf[js.Any])
    if (custom_namespaces != null) __obj.updateDynamic("custom_namespaces")(custom_namespaces.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (docs != null) __obj.updateDynamic("docs")(docs.asInstanceOf[js.Any])
    if (generator != null) __obj.updateDynamic("generator")(generator.asInstanceOf[js.Any])
    if (hub != null) __obj.updateDynamic("hub")(hub.asInstanceOf[js.Any])
    if (image_url != null) __obj.updateDynamic("image_url")(image_url.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (managingEditor != null) __obj.updateDynamic("managingEditor")(managingEditor.asInstanceOf[js.Any])
    if (pubDate != null) __obj.updateDynamic("pubDate")(pubDate.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    if (webMaster != null) __obj.updateDynamic("webMaster")(webMaster.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeedOptions]
  }
}

