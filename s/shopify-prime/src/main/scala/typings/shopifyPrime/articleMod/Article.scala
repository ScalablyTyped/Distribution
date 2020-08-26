package typings.shopifyPrime.articleMod

import typings.shopifyPrime.articleImageMod.ArticleImage
import typings.shopifyPrime.baseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Article extends ShopifyObject {
  /**
    * The name of the author of this article
    */
  var author: js.UndefOr[String] = js.native
  /**
    * A unique numeric identifier for the blog containing the article.
    */
  var blog_id: js.UndefOr[Double] = js.native
  /**
    * The text of the body of the article, complete with HTML markup.
    */
  var body_html: js.UndefOr[String] = js.native
  /**
    * The date and time when the article was created.
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * A human-friendly unique string for an article automatically generated from its title. It is used in the article's URL.
    */
  var handle: js.UndefOr[String] = js.native
  /**
    * The article image.
    */
  var image: js.UndefOr[ArticleImage] = js.native
  /**
    * States whether or not the article is visible.
    */
  var published: js.UndefOr[Boolean] = js.native
  /**
    * The date and time when the article was published.
    */
  var published_at: js.UndefOr[String] = js.native
  /**
    * The text of the summary of the article, complete with HTML markup.
    */
  var summary_html: js.UndefOr[String] = js.native
  /**
    * Tags are additional short descriptors formatted as a string of comma-separated values. For example, if an article has three tags: tag1, tag2, tag3.
    */
  var tags: js.UndefOr[String] = js.native
  /**
    * States the name of the template an article is using if it is using an alternate template. If an article is using the default article.liquid template, the value returned is null.
    */
  var template_suffix: js.UndefOr[String] = js.native
  /**
    * The title of the article.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The date and time when the article was last updated.
    */
  var updated_at: js.UndefOr[String] = js.native
  /**
    * A unique numeric identifier for the author of the article.
    */
  var user_id: js.UndefOr[Double] = js.native
}

object Article {
  @scala.inline
  def apply(): Article = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Article]
  }
  @scala.inline
  implicit class ArticleOps[Self <: Article] (val x: Self) extends AnyVal {
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
    def setAuthor(value: String): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    @scala.inline
    def setBlog_id(value: Double): Self = this.set("blog_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlog_id: Self = this.set("blog_id", js.undefined)
    @scala.inline
    def setBody_html(value: String): Self = this.set("body_html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody_html: Self = this.set("body_html", js.undefined)
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated_at: Self = this.set("created_at", js.undefined)
    @scala.inline
    def setHandle(value: String): Self = this.set("handle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandle: Self = this.set("handle", js.undefined)
    @scala.inline
    def setImage(value: ArticleImage): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setPublished(value: Boolean): Self = this.set("published", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublished: Self = this.set("published", js.undefined)
    @scala.inline
    def setPublished_at(value: String): Self = this.set("published_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublished_at: Self = this.set("published_at", js.undefined)
    @scala.inline
    def setSummary_html(value: String): Self = this.set("summary_html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummary_html: Self = this.set("summary_html", js.undefined)
    @scala.inline
    def setTags(value: String): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTemplate_suffix(value: String): Self = this.set("template_suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate_suffix: Self = this.set("template_suffix", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUpdated_at(value: String): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated_at: Self = this.set("updated_at", js.undefined)
    @scala.inline
    def setUser_id(value: Double): Self = this.set("user_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser_id: Self = this.set("user_id", js.undefined)
  }
  
}

