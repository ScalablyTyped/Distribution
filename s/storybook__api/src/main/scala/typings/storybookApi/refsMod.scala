package typings.storybookApi

import typings.std.Record
import typings.storybookApi.mod.ModuleFn
import typings.storybookApi.storiesMod.StoriesHash
import typings.storybookApi.storiesMod.StoriesRaw
import typings.storybookApi.storiesMod.StoryInput
import typings.storybookApi.storybookApiStrings.`auto-inject`
import typings.storybookApi.storybookApiStrings.`lazy`
import typings.storybookApi.storybookApiStrings.`server-checked`
import typings.storybookApi.storybookApiStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refsMod {
  
  @JSImport("@storybook/api/dist/modules/refs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/api/dist/modules/refs", "defaultStoryMapper")
  @js.native
  val defaultStoryMapper: StoryMapper = js.native
  
  inline def getSourceType(source: String, refId: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSourceType")(source.asInstanceOf[js.Any], refId.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @JSImport("@storybook/api/dist/modules/refs", "init")
  @js.native
  val init: ModuleFn = js.native
  
  trait ComposedRef extends StObject {
    
    var error: js.UndefOr[js.Any] = js.undefined
    
    var id: String
    
    var loginUrl: js.UndefOr[String] = js.undefined
    
    var ready: js.UndefOr[Boolean] = js.undefined
    
    var stories: StoriesHash
    
    var title: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[`auto-inject` | unknown | `lazy` | `server-checked`] = js.undefined
    
    var url: String
    
    var version: js.UndefOr[String] = js.undefined
    
    var versions: js.UndefOr[Versions] = js.undefined
  }
  object ComposedRef {
    
    inline def apply(id: String, stories: StoriesHash, url: String): ComposedRef = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], stories = stories.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComposedRef]
    }
    
    extension [Self <: ComposedRef](x: Self) {
      
      inline def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLoginUrl(value: String): Self = StObject.set(x, "loginUrl", value.asInstanceOf[js.Any])
      
      inline def setLoginUrlUndefined: Self = StObject.set(x, "loginUrl", js.undefined)
      
      inline def setReady(value: Boolean): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
      
      inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
      
      inline def setStories(value: StoriesHash): Self = StObject.set(x, "stories", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: `auto-inject` | unknown | `lazy` | `server-checked`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      inline def setVersions(value: Versions): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
      
      inline def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    }
  }
  
  /* Inlined std.Partial<std.Pick<@storybook/api.@storybook/api/dist/modules/refs.ComposedRef, 'title' | 'type' | 'stories' | 'versions' | 'loginUrl' | 'version' | 'ready' | 'error'>> */
  trait ComposedRefUpdate extends StObject {
    
    var error: js.UndefOr[js.Any] = js.undefined
    
    var loginUrl: js.UndefOr[String] = js.undefined
    
    var ready: js.UndefOr[Boolean] = js.undefined
    
    var stories: js.UndefOr[StoriesHash] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[`auto-inject` | unknown | `lazy` | `server-checked`] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
    
    var versions: js.UndefOr[Versions] = js.undefined
  }
  object ComposedRefUpdate {
    
    inline def apply(): ComposedRefUpdate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComposedRefUpdate]
    }
    
    extension [Self <: ComposedRefUpdate](x: Self) {
      
      inline def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setLoginUrl(value: String): Self = StObject.set(x, "loginUrl", value.asInstanceOf[js.Any])
      
      inline def setLoginUrlUndefined: Self = StObject.set(x, "loginUrl", js.undefined)
      
      inline def setReady(value: Boolean): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
      
      inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
      
      inline def setStories(value: StoriesHash): Self = StObject.set(x, "stories", value.asInstanceOf[js.Any])
      
      inline def setStoriesUndefined: Self = StObject.set(x, "stories", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: `auto-inject` | unknown | `lazy` | `server-checked`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      inline def setVersions(value: Versions): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
      
      inline def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    }
  }
  
  type RefId = String
  
  type RefUrl = String
  
  type Refs = Record[String, ComposedRef]
  
  /* Inlined std.Partial<std.Omit<@storybook/api.@storybook/api/dist/modules/refs.ComposedRef, 'stories'> & {  stories :@storybook/api.@storybook/api/dist/lib/stories.StoriesRaw | undefined}> */
  trait SetRefData extends StObject {
    
    var error: js.UndefOr[js.Any] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var loginUrl: js.UndefOr[String] = js.undefined
    
    var ready: js.UndefOr[Boolean] = js.undefined
    
    var stories: js.UndefOr[StoriesRaw] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[`auto-inject` | unknown | `lazy` | `server-checked`] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
    
    var versions: js.UndefOr[Versions] = js.undefined
  }
  object SetRefData {
    
    inline def apply(): SetRefData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetRefData]
    }
    
    extension [Self <: SetRefData](x: Self) {
      
      inline def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLoginUrl(value: String): Self = StObject.set(x, "loginUrl", value.asInstanceOf[js.Any])
      
      inline def setLoginUrlUndefined: Self = StObject.set(x, "loginUrl", js.undefined)
      
      inline def setReady(value: Boolean): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
      
      inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
      
      inline def setStories(value: StoriesRaw): Self = StObject.set(x, "stories", value.asInstanceOf[js.Any])
      
      inline def setStoriesUndefined: Self = StObject.set(x, "stories", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: `auto-inject` | unknown | `lazy` | `server-checked`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      inline def setVersions(value: Versions): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
      
      inline def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    }
  }
  
  type StoryMapper = js.Function2[/* ref */ ComposedRef, /* story */ StoryInput, StoryInput]
  
  @js.native
  trait SubAPI extends StObject {
    
    def changeRefState(id: String, ready: Boolean): Unit = js.native
    
    def changeRefVersion(id: String, url: String): Unit = js.native
    
    def checkRef(ref: SetRefData): js.Promise[Unit] = js.native
    
    def findRef(source: String): ComposedRef = js.native
    
    def getRefs(): Refs = js.native
    
    def setRef(id: String, data: SetRefData): Unit = js.native
    def setRef(id: String, data: SetRefData, ready: Boolean): Unit = js.native
    
    def updateRef(id: String, ref: ComposedRefUpdate): Unit = js.native
  }
  
  trait SubState extends StObject {
    
    var refs: Refs
  }
  object SubState {
    
    inline def apply(refs: Refs): SubState = {
      val __obj = js.Dynamic.literal(refs = refs.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubState]
    }
    
    extension [Self <: SubState](x: Self) {
      
      inline def setRefs(value: Refs): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
    }
  }
  
  type Versions = Record[String, String]
}
