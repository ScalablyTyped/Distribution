package typings
package rssLib.rssMod.NodeRSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemOptions extends js.Object {
  /**
    * If included it is the name of the item's creator. If not
    * provided the item author will be the same as the feed author.
    * This is typical except on multi-author blogs.
    */
  var author: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If provided, each array item will be added as a category
    * element.
    */
  var categories: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Put additional elements in the item (node-xml syntax).
    */
  var custom_elements: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * The date and time of when the item was created. Feed
    * readers use this to determine the sort order. Some readers
    * will also use it to determine if the content should be
    * presented as unread.
    * Accepts Date object or string with any format
    * JS Date can parse.
    */
  var date: stdLib.Date | java.lang.String
  /**
    * Content for the item. Can contain HTML but link and image
    * URLs must be absolute path including hostname.
    */
  var description: java.lang.String
  /**
    * An enclosure object.
    */
  var enclosure: js.UndefOr[EnclosureObject] = js.undefined
  /**
    * A unique string feed readers use to know if an item is
    * new or has already been seen. If you use a guid never
    * change it. If you don't provide a guid then your item
    * urls must be unique.
    * Defaults to url.
    */
  var guid: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The latitude coordinate of the item for GeoRSS.
    */
  var lat: js.UndefOr[scala.Double] = js.undefined
  /**
    * The longitude coordinate of the item for GeoRSS.
    */
  var long: js.UndefOr[scala.Double] = js.undefined
  /**
    * Title of this particular item.
    */
  var title: java.lang.String
  /**
    * URL to the item. This could be a blog entry.
    */
  var url: java.lang.String
}

object ItemOptions {
  @scala.inline
  def apply(
    date: stdLib.Date | java.lang.String,
    description: java.lang.String,
    title: java.lang.String,
    url: java.lang.String,
    author: java.lang.String = null,
    categories: js.Array[java.lang.String] = null,
    custom_elements: js.Array[_] = null,
    enclosure: EnclosureObject = null,
    guid: java.lang.String = null,
    lat: scala.Int | scala.Double = null,
    long: scala.Int | scala.Double = null
  ): ItemOptions = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], description = description, title = title, url = url)
    if (author != null) __obj.updateDynamic("author")(author)
    if (categories != null) __obj.updateDynamic("categories")(categories)
    if (custom_elements != null) __obj.updateDynamic("custom_elements")(custom_elements)
    if (enclosure != null) __obj.updateDynamic("enclosure")(enclosure)
    if (guid != null) __obj.updateDynamic("guid")(guid)
    if (lat != null) __obj.updateDynamic("lat")(lat.asInstanceOf[js.Any])
    if (long != null) __obj.updateDynamic("long")(long.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemOptions]
  }
}

