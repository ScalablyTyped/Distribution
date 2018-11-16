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

