package typings.storybookApi.refsMod

import typings.storybookApi.storiesMod.StoriesRaw
import typings.storybookApi.storybookApiStrings.`auto-inject`
import typings.storybookApi.storybookApiStrings.`lazy`
import typings.storybookApi.storybookApiStrings.`server-checked`
import typings.storybookApi.storybookApiStrings.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Omit<@storybook/api.@storybook/api/dist/modules/refs.ComposedRef, 'stories'> & {  stories :@storybook/api.@storybook/api/dist/lib/stories.StoriesRaw | undefined}> */
@js.native
trait SetRefData extends js.Object {
  
  var error: js.UndefOr[js.Any] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var loginUrl: js.UndefOr[String] = js.native
  
  var ready: js.UndefOr[Boolean] = js.native
  
  var stories: js.UndefOr[StoriesRaw] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[`auto-inject` | unknown | `lazy` | `server-checked`] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var version: js.UndefOr[String] = js.native
  
  var versions: js.UndefOr[Versions] = js.native
}
object SetRefData {
  
  @scala.inline
  def apply(): SetRefData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetRefData]
  }
  
  @scala.inline
  implicit class SetRefDataOps[Self <: SetRefData] (val x: Self) extends AnyVal {
    
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
    def setError(value: js.Any): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLoginUrl(value: String): Self = this.set("loginUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoginUrl: Self = this.set("loginUrl", js.undefined)
    
    @scala.inline
    def setReady(value: Boolean): Self = this.set("ready", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReady: Self = this.set("ready", js.undefined)
    
    @scala.inline
    def setStories(value: StoriesRaw): Self = this.set("stories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStories: Self = this.set("stories", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setType(value: `auto-inject` | unknown | `lazy` | `server-checked`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
    @scala.inline
    def setVersions(value: Versions): Self = this.set("versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersions: Self = this.set("versions", js.undefined)
  }
}
