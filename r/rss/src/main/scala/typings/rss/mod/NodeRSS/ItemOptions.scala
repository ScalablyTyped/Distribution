package typings.rss.mod.NodeRSS

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemOptions extends js.Object {
  /**
    * If included it is the name of the item's creator. If not
    * provided the item author will be the same as the feed author.
    * This is typical except on multi-author blogs.
    */
  var author: js.UndefOr[String] = js.native
  /**
    * If provided, each array item will be added as a category
    * element.
    */
  var categories: js.UndefOr[js.Array[String]] = js.native
  /**
    * Put additional elements in the item (node-xml syntax).
    */
  var custom_elements: js.UndefOr[js.Array[_]] = js.native
  /**
    * The date and time of when the item was created. Feed
    * readers use this to determine the sort order. Some readers
    * will also use it to determine if the content should be
    * presented as unread.
    * Accepts Date object or string with any format
    * JS Date can parse.
    */
  var date: Date | String = js.native
  /**
    * Content for the item. Can contain HTML but link and image
    * URLs must be absolute path including hostname.
    */
  var description: String = js.native
  /**
    * An enclosure object.
    */
  var enclosure: js.UndefOr[EnclosureObject] = js.native
  /**
    * A unique string feed readers use to know if an item is
    * new or has already been seen. If you use a guid never
    * change it. If you don't provide a guid then your item
    * urls must be unique.
    * Defaults to url.
    */
  var guid: js.UndefOr[String] = js.native
  /**
    * The latitude coordinate of the item for GeoRSS.
    */
  var lat: js.UndefOr[Double] = js.native
  /**
    * The longitude coordinate of the item for GeoRSS.
    */
  var long: js.UndefOr[Double] = js.native
  /**
    * Title of this particular item.
    */
  var title: String = js.native
  /**
    * URL to the item. This could be a blog entry.
    */
  var url: String = js.native
}

object ItemOptions {
  @scala.inline
  def apply(date: Date | String, description: String, title: String, url: String): ItemOptions = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemOptions]
  }
  @scala.inline
  implicit class ItemOptionsOps[Self <: ItemOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDate(value: Date | String): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthor(value: String): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = this.set("categories", js.Array(value :_*))
    @scala.inline
    def setCategories(value: js.Array[String]): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    @scala.inline
    def setCustom_elementsVarargs(value: js.Any*): Self = this.set("custom_elements", js.Array(value :_*))
    @scala.inline
    def setCustom_elements(value: js.Array[_]): Self = this.set("custom_elements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustom_elements: Self = this.set("custom_elements", js.undefined)
    @scala.inline
    def setEnclosure(value: EnclosureObject): Self = this.set("enclosure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnclosure: Self = this.set("enclosure", js.undefined)
    @scala.inline
    def setGuid(value: String): Self = this.set("guid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuid: Self = this.set("guid", js.undefined)
    @scala.inline
    def setLat(value: Double): Self = this.set("lat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLat: Self = this.set("lat", js.undefined)
    @scala.inline
    def setLong(value: Double): Self = this.set("long", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLong: Self = this.set("long", js.undefined)
  }
  
}

