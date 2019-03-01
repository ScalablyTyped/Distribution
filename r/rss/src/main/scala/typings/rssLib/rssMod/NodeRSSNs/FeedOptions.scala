package typings
package rssLib.rssMod.NodeRSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeedOptions extends js.Object {
  /**
    * One or more categories this feed belongs to.
    */
  var categories: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Copyright information for this feed.
    */
  var copyright: js.UndefOr[java.lang.String] = js.undefined
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
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * URL to documentation on this feed.
    */
  var docs: js.UndefOr[java.lang.String] = js.undefined
  /**
    * URL to the rss feed.
    */
  var feed_url: java.lang.String
  /**
    * Feed generator.
    */
  var generator: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Where is the PubSubHub hub located.
    */
  var hub: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Small image for feed readers to use.
    */
  var image_url: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The language of the content of this feed.
    */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Who manages content in this feed.
    */
  var managingEditor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The publication date for content in the feed.
    * Accepts Date object or string with any format
    * JS Date can parse.
    */
  var pubDate: js.UndefOr[stdLib.Date | java.lang.String] = js.undefined
  /**
    * URL to the site that the feed is for.
    */
  var site_url: java.lang.String
  /**
    * Title of your site or feed.
    */
  var title: java.lang.String
  /**
    * Number of minutes feed can be cached before refreshing
    * from source.
    */
  var ttl: js.UndefOr[scala.Double] = js.undefined
  /**
    * Who manages feed availability and technical support.
    */
  var webMaster: js.UndefOr[java.lang.String] = js.undefined
}

object FeedOptions {
  @scala.inline
  def apply(
    feed_url: java.lang.String,
    site_url: java.lang.String,
    title: java.lang.String,
    categories: js.Array[java.lang.String] = null,
    copyright: java.lang.String = null,
    custom_elements: js.Array[_] = null,
    custom_namespaces: js.Object = null,
    description: java.lang.String = null,
    docs: java.lang.String = null,
    generator: java.lang.String = null,
    hub: java.lang.String = null,
    image_url: java.lang.String = null,
    language: java.lang.String = null,
    managingEditor: java.lang.String = null,
    pubDate: stdLib.Date | java.lang.String = null,
    ttl: scala.Int | scala.Double = null,
    webMaster: java.lang.String = null
  ): FeedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("feed_url")(feed_url)
    __obj.updateDynamic("site_url")(site_url)
    __obj.updateDynamic("title")(title)
    if (categories != null) __obj.updateDynamic("categories")(categories)
    if (copyright != null) __obj.updateDynamic("copyright")(copyright)
    if (custom_elements != null) __obj.updateDynamic("custom_elements")(custom_elements)
    if (custom_namespaces != null) __obj.updateDynamic("custom_namespaces")(custom_namespaces)
    if (description != null) __obj.updateDynamic("description")(description)
    if (docs != null) __obj.updateDynamic("docs")(docs)
    if (generator != null) __obj.updateDynamic("generator")(generator)
    if (hub != null) __obj.updateDynamic("hub")(hub)
    if (image_url != null) __obj.updateDynamic("image_url")(image_url)
    if (language != null) __obj.updateDynamic("language")(language)
    if (managingEditor != null) __obj.updateDynamic("managingEditor")(managingEditor)
    if (pubDate != null) __obj.updateDynamic("pubDate")(pubDate.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    if (webMaster != null) __obj.updateDynamic("webMaster")(webMaster)
    __obj.asInstanceOf[FeedOptions]
  }
}

