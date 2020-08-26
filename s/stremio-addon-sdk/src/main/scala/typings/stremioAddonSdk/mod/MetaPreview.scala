package typings.stremioAddonSdk.mod

import typings.stremioAddonSdk.stremioAddonSdkStrings.landscape
import typings.stremioAddonSdk.stremioAddonSdkStrings.regular
import typings.stremioAddonSdk.stremioAddonSdkStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Summarized collection of meta items.
  *
  * Catalogs are displayed on the Stremio's Board, Discover and Search.
  */
@js.native
trait MetaPreview extends js.Object {
  /**
    * The background shown on the stremio detail page.
    *
    * Heavily encouraged if you want your content to look good.
    *
    * URL to PNG, max file size 500kb.
    */
  var background: js.UndefOr[String] = js.native
  /**
    * A few sentences describing your content.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Universal identifier.
    * You may use a prefix unique to your addon.
    *
    * Example: 'yt_id:UCrDkAvwZum-UTjHmzDI2iIw'
    */
  var id: String = js.native
  /**
    * The logo shown on the stremio detail page.
    *
    * Encouraged if you want your content to look good.
    *
    * URL to PNG.
    */
  var logo: js.UndefOr[String] = js.native
  /**
    * Name of the content.
    */
  var name: String = js.native
  /**
    * URL to PNG of poster.
    *
    * Accepted aspect ratios: 1:0.675 (IMDb poster type) or 1:1 (square).
    *
    * You can use any resolution, as long as the file size is below 100kb.
    * Below 50kb is recommended
    */
  var poster: js.UndefOr[String] = js.native
  /**
    * Poster can be square (1:1 aspect) or regular (1:0.675) or landscape (1:1.77).
    *
    * Defaults to 'regular'.
    */
  var posterShape: js.UndefOr[square | regular | landscape] = js.native
  /**
    * Type of the content.
    */
  var `type`: ContentType = js.native
}

object MetaPreview {
  @scala.inline
  def apply(id: String, name: String, `type`: ContentType): MetaPreview = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaPreview]
  }
  @scala.inline
  implicit class MetaPreviewOps[Self <: MetaPreview] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ContentType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setLogo(value: String): Self = this.set("logo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogo: Self = this.set("logo", js.undefined)
    @scala.inline
    def setPoster(value: String): Self = this.set("poster", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoster: Self = this.set("poster", js.undefined)
    @scala.inline
    def setPosterShape(value: square | regular | landscape): Self = this.set("posterShape", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosterShape: Self = this.set("posterShape", js.undefined)
  }
  
}

