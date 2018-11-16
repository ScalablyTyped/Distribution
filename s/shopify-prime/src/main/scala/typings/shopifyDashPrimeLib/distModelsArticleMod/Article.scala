package typings
package shopifyDashPrimeLib.distModelsArticleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Article
  extends shopifyDashPrimeLib.distModelsBaseMod.ShopifyObject {
  /**
       * The name of the author of this article
       */
  var author: js.UndefOr[java.lang.String] = js.undefined
  /**
       * A unique numeric identifier for the blog containing the article.
       */
  var blog_id: js.UndefOr[scala.Double] = js.undefined
  /**
       * The text of the body of the article, complete with HTML markup.
       */
  var body_html: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The date and time when the article was created.
       */
  var created_at: js.UndefOr[java.lang.String] = js.undefined
  /**
       * A human-friendly unique string for an article automatically generated from its title. It is used in the article's URL.
       */
  var handle: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The article image.
       */
  var image: js.UndefOr[shopifyDashPrimeLib.distModelsArticleUnderscoreImageMod.ArticleImage] = js.undefined
  /**
       * States whether or not the article is visible.
       */
  var published: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The date and time when the article was published.
       */
  var published_at: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The text of the summary of the article, complete with HTML markup.
       */
  var summary_html: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Tags are additional short descriptors formatted as a string of comma-separated values. For example, if an article has three tags: tag1, tag2, tag3.
       */
  var tags: js.UndefOr[java.lang.String] = js.undefined
  /**
       * States the name of the template an article is using if it is using an alternate template. If an article is using the default article.liquid template, the value returned is null.
       */
  var template_suffix: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The title of the article.
       */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The date and time when the article was last updated.
       */
  var updated_at: js.UndefOr[java.lang.String] = js.undefined
  /**
       * A unique numeric identifier for the author of the article.
       */
  var user_id: js.UndefOr[scala.Double] = js.undefined
}

