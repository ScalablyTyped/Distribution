package typings.storybookUi.anon

import typings.react.mod.Ref
import typings.std.HTMLElement
import typings.std.ReturnType
import typings.storybookApi.refsMod.Versions
import typings.storybookApi.storiesMod.StoriesHash
import typings.storybookUi.storybookUiStrings.`auto-inject`
import typings.storybookUi.storybookUiStrings.`lazy`
import typings.storybookUi.storybookUiStrings.`server-checked`
import typings.storybookUi.storybookUiStrings.auth
import typings.storybookUi.storybookUiStrings.empty
import typings.storybookUi.storybookUiStrings.error
import typings.storybookUi.storybookUiStrings.loading
import typings.storybookUi.storybookUiStrings.ready
import typings.storybookUi.storybookUiStrings.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @storybook/api.@storybook/api/dist/modules/refs.ComposedRef & {  state :std.ReturnType<(isLoading : boolean, isAuthRequired : boolean, isError : boolean, isEmpty : boolean): 'auth' | 'error' | 'loading' | 'empty' | 'ready'>} & react.react.RefAttributes<std.HTMLElement> */
@js.native
trait ComposedRefstateReturnTyp extends js.Object {
  
  var error: js.UndefOr[js.Any] = js.native
  
  var id: String = js.native
  
  var key: js.UndefOr[typings.react.mod.Key | Null] = js.native
  
  var loginUrl: js.UndefOr[String] = js.native
  
  var ready: js.UndefOr[Boolean] = js.native
  
  var ref: js.UndefOr[Ref[HTMLElement]] = js.native
  
  var state: ReturnType[
    js.Function4[
      /* isLoading */ Boolean, 
      /* isAuthRequired */ Boolean, 
      /* isError */ Boolean, 
      /* isEmpty */ Boolean, 
      auth | error | loading | empty | ready
    ]
  ] = js.native
  
  var stories: StoriesHash = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[`auto-inject` | unknown | `lazy` | `server-checked`] = js.native
  
  var url: String = js.native
  
  var version: js.UndefOr[String] = js.native
  
  var versions: js.UndefOr[Versions] = js.native
}
object ComposedRefstateReturnTyp {
  
  @scala.inline
  def apply(
    id: String,
    state: ReturnType[
      js.Function4[
        /* isLoading */ Boolean, 
        /* isAuthRequired */ Boolean, 
        /* isError */ Boolean, 
        /* isEmpty */ Boolean, 
        auth | error | loading | empty | ready
      ]
    ],
    stories: StoriesHash,
    url: String
  ): ComposedRefstateReturnTyp = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], stories = stories.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposedRefstateReturnTyp]
  }
  
  @scala.inline
  implicit class ComposedRefstateReturnTypOps[Self <: ComposedRefstateReturnTyp] (val x: Self) extends AnyVal {
    
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
    def setState(
      value: ReturnType[
          js.Function4[
            /* isLoading */ Boolean, 
            /* isAuthRequired */ Boolean, 
            /* isError */ Boolean, 
            /* isEmpty */ Boolean, 
            auth | error | loading | empty | ready
          ]
        ]
    ): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStories(value: StoriesHash): Self = this.set("stories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: js.Any): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setKey(value: typings.react.mod.Key): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setKeyNull: Self = this.set("key", null)
    
    @scala.inline
    def setLoginUrl(value: String): Self = this.set("loginUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoginUrl: Self = this.set("loginUrl", js.undefined)
    
    @scala.inline
    def setReady(value: Boolean): Self = this.set("ready", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReady: Self = this.set("ready", js.undefined)
    
    @scala.inline
    def setRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRef(value: Ref[HTMLElement]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setType(value: `auto-inject` | unknown | `lazy` | `server-checked`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
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
