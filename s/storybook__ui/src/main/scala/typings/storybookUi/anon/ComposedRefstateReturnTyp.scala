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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @storybook/api.@storybook/api/dist/modules/refs.ComposedRef & {  state :std.ReturnType<(isLoading : boolean, isAuthRequired : boolean, isError : boolean, isEmpty : boolean): 'auth' | 'error' | 'loading' | 'empty' | 'ready'>} & react.react.RefAttributes<std.HTMLElement> */
@js.native
trait ComposedRefstateReturnTyp extends StObject {
  
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
  implicit class ComposedRefstateReturnTypMutableBuilder[Self <: ComposedRefstateReturnTyp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: typings.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyNull: Self = StObject.set(x, "key", null)
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setLoginUrl(value: String): Self = StObject.set(x, "loginUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoginUrlUndefined: Self = StObject.set(x, "loginUrl", js.undefined)
    
    @scala.inline
    def setReady(value: Boolean): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
    
    @scala.inline
    def setRef(value: Ref[HTMLElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
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
    ): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStories(value: StoriesHash): Self = StObject.set(x, "stories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: `auto-inject` | unknown | `lazy` | `server-checked`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def setVersions(value: Versions): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
  }
}
