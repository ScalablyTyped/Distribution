package typings.rss

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.rss.mod.NodeRSS.FeedOptions
import typings.rss.mod.NodeRSS.RSS
import typings.rss.mod.NodeRSS.RSSFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rss", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with RSS {
    /**
      * Create an RSS feed with options.
      * @param {FeedOptions} feedOptions - Options for the RSS feed.
      * @returns {RSS}
      */
    def this(feedOptions: FeedOptions) = this()
  }
  @JSImport("rss", JSImport.Namespace)
  @js.native
  val ^ : RSSFactory = js.native
  
  object NodeRSS {
    
    trait EnclosureObject extends StObject {
      
      /**
        * Path to binary file (or URL).
        */
      var file: js.UndefOr[String] = js.undefined
      
      /**
        * Size of the file.
        */
      var size: js.UndefOr[Double] = js.undefined
      
      /**
        * If not provided, the MIME Type will be guessed based
        * on the extension of the file or URL, passing type to
        * the enclosure will override the guessed type.
        */
      var `type`: js.UndefOr[String] = js.undefined
      
      /**
        * URL to file object (or file).
        */
      var url: String
    }
    object EnclosureObject {
      
      inline def apply(url: String): EnclosureObject = {
        val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[EnclosureObject]
      }
      
      extension [Self <: EnclosureObject](x: Self) {
        
        inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
        
        inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
        
        inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
    
    trait FeedOptions extends StObject {
      
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
      var custom_elements: js.UndefOr[js.Array[Any]] = js.undefined
      
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
      var pubDate: js.UndefOr[js.Date | String] = js.undefined
      
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
      
      inline def apply(feed_url: String, site_url: String, title: String): FeedOptions = {
        val __obj = js.Dynamic.literal(feed_url = feed_url.asInstanceOf[js.Any], site_url = site_url.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[FeedOptions]
      }
      
      extension [Self <: FeedOptions](x: Self) {
        
        inline def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
        
        inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
        
        inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value*))
        
        inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
        
        inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
        
        inline def setCustom_elements(value: js.Array[Any]): Self = StObject.set(x, "custom_elements", value.asInstanceOf[js.Any])
        
        inline def setCustom_elementsUndefined: Self = StObject.set(x, "custom_elements", js.undefined)
        
        inline def setCustom_elementsVarargs(value: Any*): Self = StObject.set(x, "custom_elements", js.Array(value*))
        
        inline def setCustom_namespaces(value: js.Object): Self = StObject.set(x, "custom_namespaces", value.asInstanceOf[js.Any])
        
        inline def setCustom_namespacesUndefined: Self = StObject.set(x, "custom_namespaces", js.undefined)
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setDocs(value: String): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
        
        inline def setDocsUndefined: Self = StObject.set(x, "docs", js.undefined)
        
        inline def setFeed_url(value: String): Self = StObject.set(x, "feed_url", value.asInstanceOf[js.Any])
        
        inline def setGenerator(value: String): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
        
        inline def setGeneratorUndefined: Self = StObject.set(x, "generator", js.undefined)
        
        inline def setHub(value: String): Self = StObject.set(x, "hub", value.asInstanceOf[js.Any])
        
        inline def setHubUndefined: Self = StObject.set(x, "hub", js.undefined)
        
        inline def setImage_url(value: String): Self = StObject.set(x, "image_url", value.asInstanceOf[js.Any])
        
        inline def setImage_urlUndefined: Self = StObject.set(x, "image_url", js.undefined)
        
        inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
        
        inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
        
        inline def setManagingEditor(value: String): Self = StObject.set(x, "managingEditor", value.asInstanceOf[js.Any])
        
        inline def setManagingEditorUndefined: Self = StObject.set(x, "managingEditor", js.undefined)
        
        inline def setPubDate(value: js.Date | String): Self = StObject.set(x, "pubDate", value.asInstanceOf[js.Any])
        
        inline def setPubDateUndefined: Self = StObject.set(x, "pubDate", js.undefined)
        
        inline def setSite_url(value: String): Self = StObject.set(x, "site_url", value.asInstanceOf[js.Any])
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
        
        inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
        
        inline def setWebMaster(value: String): Self = StObject.set(x, "webMaster", value.asInstanceOf[js.Any])
        
        inline def setWebMasterUndefined: Self = StObject.set(x, "webMaster", js.undefined)
      }
    }
    
    trait ItemOptions extends StObject {
      
      /**
        * If included it is the name of the item's creator. If not
        * provided the item author will be the same as the feed author.
        * This is typical except on multi-author blogs.
        */
      var author: js.UndefOr[String] = js.undefined
      
      /**
        * If provided, each array item will be added as a category
        * element.
        */
      var categories: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * Put additional elements in the item (node-xml syntax).
        */
      var custom_elements: js.UndefOr[js.Array[Any]] = js.undefined
      
      /**
        * The date and time of when the item was created. Feed
        * readers use this to determine the sort order. Some readers
        * will also use it to determine if the content should be
        * presented as unread.
        * Accepts Date object or string with any format
        * JS Date can parse.
        */
      var date: js.Date | String
      
      /**
        * Content for the item. Can contain HTML but link and image
        * URLs must be absolute path including hostname.
        */
      var description: String
      
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
      var guid: js.UndefOr[String] = js.undefined
      
      /**
        * The latitude coordinate of the item for GeoRSS.
        */
      var lat: js.UndefOr[Double] = js.undefined
      
      /**
        * The longitude coordinate of the item for GeoRSS.
        */
      var long: js.UndefOr[Double] = js.undefined
      
      /**
        * Title of this particular item.
        */
      var title: String
      
      /**
        * URL to the item. This could be a blog entry.
        */
      var url: String
    }
    object ItemOptions {
      
      inline def apply(date: js.Date | String, description: String, title: String, url: String): ItemOptions = {
        val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[ItemOptions]
      }
      
      extension [Self <: ItemOptions](x: Self) {
        
        inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
        
        inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
        
        inline def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
        
        inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
        
        inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value*))
        
        inline def setCustom_elements(value: js.Array[Any]): Self = StObject.set(x, "custom_elements", value.asInstanceOf[js.Any])
        
        inline def setCustom_elementsUndefined: Self = StObject.set(x, "custom_elements", js.undefined)
        
        inline def setCustom_elementsVarargs(value: Any*): Self = StObject.set(x, "custom_elements", js.Array(value*))
        
        inline def setDate(value: js.Date | String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setEnclosure(value: EnclosureObject): Self = StObject.set(x, "enclosure", value.asInstanceOf[js.Any])
        
        inline def setEnclosureUndefined: Self = StObject.set(x, "enclosure", js.undefined)
        
        inline def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
        
        inline def setGuidUndefined: Self = StObject.set(x, "guid", js.undefined)
        
        inline def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
        
        inline def setLatUndefined: Self = StObject.set(x, "lat", js.undefined)
        
        inline def setLong(value: Double): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
        
        inline def setLongUndefined: Self = StObject.set(x, "long", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait RSS extends StObject {
      
      /**
        * Add an item to a feed. An item can be used for a blog
        * entry, project update, log entry, etc.
        * @param {ItemOptions} itemOptions
        * @returns {RSS}
        */
      def item(itemOptions: ItemOptions): RSS = js.native
      
      /**
        * Generate XML and return as a string for this feed.
        * @returns {string}
        */
      def xml(): String = js.native
      /**
        * Generate XML and return as a string for this feed.
        *
        * @param {XmlOptions} xmlOptions - You can use indent
        * option to specify the tab character to use.
        * @returns {string}
        */
      def xml(xmlOptions: XmlOptions): String = js.native
    }
    
    @js.native
    trait RSSFactory
      extends StObject
         with /**
      * Create an RSS feed with options.
      * @param {FeedOptions} feedOptions - Options for the RSS feed.
      * @returns {RSS}
      */
    Instantiable1[/* feedOptions */ FeedOptions, RSS]
    
    trait XmlOptions extends StObject {
      
      /**
        * What to use as a tab. Defaults to no tabs (compressed).
        * For example you can use '\t' for tab character, or ' '
        * for two-space tabs. If you set it to true it will use
        * four spaces.
        */
      var indent: js.UndefOr[Boolean | String] = js.undefined
    }
    object XmlOptions {
      
      inline def apply(): XmlOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[XmlOptions]
      }
      
      extension [Self <: XmlOptions](x: Self) {
        
        inline def setIndent(value: Boolean | String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
        
        inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      }
    }
  }
  
  type _To = RSSFactory
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: RSSFactory = ^
}
