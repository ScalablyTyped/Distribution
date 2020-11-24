package typings.storybookReadme.mod

import typings.react.mod.ReactNode
import typings.storybookReadme.anon.Children
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigureReadmeConfig extends js.Object {
  
  var DocPreview: js.UndefOr[js.Function1[/* props */ Children, ReactNode]] = js.native
  
  var FooterPreview: js.UndefOr[js.Function1[/* props */ Children, ReactNode]] = js.native
  
  var HeaderPreview: js.UndefOr[js.Function1[/* props */ Children, ReactNode]] = js.native
  
  var StoryPreview: js.UndefOr[js.Function1[/* props */ Children, ReactNode]] = js.native
  
  var footer: js.UndefOr[String] = js.native
  
  var header: js.UndefOr[String] = js.native
}
object ConfigureReadmeConfig {
  
  @scala.inline
  def apply(): ConfigureReadmeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigureReadmeConfig]
  }
  
  @scala.inline
  implicit class ConfigureReadmeConfigOps[Self <: ConfigureReadmeConfig] (val x: Self) extends AnyVal {
    
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
    def setDocPreview(value: /* props */ Children => ReactNode): Self = this.set("DocPreview", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDocPreview: Self = this.set("DocPreview", js.undefined)
    
    @scala.inline
    def setFooterPreview(value: /* props */ Children => ReactNode): Self = this.set("FooterPreview", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFooterPreview: Self = this.set("FooterPreview", js.undefined)
    
    @scala.inline
    def setHeaderPreview(value: /* props */ Children => ReactNode): Self = this.set("HeaderPreview", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHeaderPreview: Self = this.set("HeaderPreview", js.undefined)
    
    @scala.inline
    def setStoryPreview(value: /* props */ Children => ReactNode): Self = this.set("StoryPreview", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStoryPreview: Self = this.set("StoryPreview", js.undefined)
    
    @scala.inline
    def setFooter(value: String): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    
    @scala.inline
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
  }
}
