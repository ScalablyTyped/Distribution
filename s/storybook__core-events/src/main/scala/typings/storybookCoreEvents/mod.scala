package typings.storybookCoreEvents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/core-events", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[events & String] = js.native
    
    /* "channelCreated" */ val CHANNEL_CREATED: typings.storybookCoreEvents.mod.events.CHANNEL_CREATED & String = js.native
    
    /* "currentStoryWasSet" */ val CURRENT_STORY_WAS_SET: typings.storybookCoreEvents.mod.events.CURRENT_STORY_WAS_SET & String = js.native
    
    /* "docsRendered" */ val DOCS_RENDERED: typings.storybookCoreEvents.mod.events.DOCS_RENDERED & String = js.native
    
    /* "forceReRender" */ val FORCE_RE_RENDER: typings.storybookCoreEvents.mod.events.FORCE_RE_RENDER & String = js.native
    
    /* "globalsUpdated" */ val GLOBALS_UPDATED: typings.storybookCoreEvents.mod.events.GLOBALS_UPDATED & String = js.native
    
    /* "navigateUrl" */ val NAVIGATE_URL: typings.storybookCoreEvents.mod.events.NAVIGATE_URL & String = js.native
    
    /* "previewKeydown" */ val PREVIEW_KEYDOWN: typings.storybookCoreEvents.mod.events.PREVIEW_KEYDOWN & String = js.native
    
    /* "registerSubscription" */ val REGISTER_SUBSCRIPTION: typings.storybookCoreEvents.mod.events.REGISTER_SUBSCRIPTION & String = js.native
    
    /* "resetStoryArgs" */ val RESET_STORY_ARGS: typings.storybookCoreEvents.mod.events.RESET_STORY_ARGS & String = js.native
    
    /* "selectStory" */ val SELECT_STORY: typings.storybookCoreEvents.mod.events.SELECT_STORY & String = js.native
    
    /* "setCurrentStory" */ val SET_CURRENT_STORY: typings.storybookCoreEvents.mod.events.SET_CURRENT_STORY & String = js.native
    
    /* "setStories" */ val SET_STORIES: typings.storybookCoreEvents.mod.events.SET_STORIES & String = js.native
    
    /* "sharedStateChanged" */ val SHARED_STATE_CHANGED: typings.storybookCoreEvents.mod.events.SHARED_STATE_CHANGED & String = js.native
    
    /* "sharedStateSet" */ val SHARED_STATE_SET: typings.storybookCoreEvents.mod.events.SHARED_STATE_SET & String = js.native
    
    /* "storiesCollapseAll" */ val STORIES_COLLAPSE_ALL: typings.storybookCoreEvents.mod.events.STORIES_COLLAPSE_ALL & String = js.native
    
    /* "storiesExpandAll" */ val STORIES_EXPAND_ALL: typings.storybookCoreEvents.mod.events.STORIES_EXPAND_ALL & String = js.native
    
    /* "storyArgsUpdated" */ val STORY_ARGS_UPDATED: typings.storybookCoreEvents.mod.events.STORY_ARGS_UPDATED & String = js.native
    
    /* "storyChanged" */ val STORY_CHANGED: typings.storybookCoreEvents.mod.events.STORY_CHANGED & String = js.native
    
    /* "storyErrored" */ val STORY_ERRORED: typings.storybookCoreEvents.mod.events.STORY_ERRORED & String = js.native
    
    /* "storyMissing" */ val STORY_MISSING: typings.storybookCoreEvents.mod.events.STORY_MISSING & String = js.native
    
    /* "storyRendered" */ val STORY_RENDERED: typings.storybookCoreEvents.mod.events.STORY_RENDERED & String = js.native
    
    /* "storySpecified" */ val STORY_SPECIFIED: typings.storybookCoreEvents.mod.events.STORY_SPECIFIED & String = js.native
    
    /* "storyThrewException" */ val STORY_THREW_EXCEPTION: typings.storybookCoreEvents.mod.events.STORY_THREW_EXCEPTION & String = js.native
    
    /* "storyUnchanged" */ val STORY_UNCHANGED: typings.storybookCoreEvents.mod.events.STORY_UNCHANGED & String = js.native
    
    /* "updateGlobals" */ val UPDATE_GLOBALS: typings.storybookCoreEvents.mod.events.UPDATE_GLOBALS & String = js.native
    
    /* "updateStoryArgs" */ val UPDATE_STORY_ARGS: typings.storybookCoreEvents.mod.events.UPDATE_STORY_ARGS & String = js.native
  }
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(STORY_SPECIFIED, SET_STORIES, SET_CURRENT_STORY, CURRENT_STORY_WAS_SET, FORCE_RE_RENDER, STORY_CHANGED, STORY_UNCHANGED, STORY_RENDERED, STORY_MISSING, STORY_ERRORED, STORY_THREW_EXCEPTION, UPDATE_STORY_ARGS, STORY_ARGS_UPDATED, RESET_STORY_ARGS, UPDATE_GLOBALS, GLOBALS_UPDATED, REGISTER_SUBSCRIPTION, PREVIEW_KEYDOWN, SELECT_STORY, STORIES_COLLAPSE_ALL, STORIES_EXPAND_ALL, DOCS_RENDERED, SHARED_STATE_CHANGED, SHARED_STATE_SET, NAVIGATE_URL) */ @JSImport("@storybook/core-events", "CHANNEL_CREATED")
  @js.native
  val CHANNEL_CREATED: events = js.native
  
  @js.native
  sealed trait events extends StObject
  @JSImport("@storybook/core-events", "events")
  @js.native
  object events extends StObject {
    
    @js.native
    sealed trait CHANNEL_CREATED
      extends StObject
         with events
    
    @js.native
    sealed trait CURRENT_STORY_WAS_SET
      extends StObject
         with events
    
    @js.native
    sealed trait DOCS_RENDERED
      extends StObject
         with events
    
    @js.native
    sealed trait FORCE_RE_RENDER
      extends StObject
         with events
    
    @js.native
    sealed trait GLOBALS_UPDATED
      extends StObject
         with events
    
    @js.native
    sealed trait NAVIGATE_URL
      extends StObject
         with events
    
    @js.native
    sealed trait PREVIEW_KEYDOWN
      extends StObject
         with events
    
    @js.native
    sealed trait REGISTER_SUBSCRIPTION
      extends StObject
         with events
    
    @js.native
    sealed trait RESET_STORY_ARGS
      extends StObject
         with events
    
    @js.native
    sealed trait SELECT_STORY
      extends StObject
         with events
    
    @js.native
    sealed trait SET_CURRENT_STORY
      extends StObject
         with events
    
    @js.native
    sealed trait SET_STORIES
      extends StObject
         with events
    
    @js.native
    sealed trait SHARED_STATE_CHANGED
      extends StObject
         with events
    
    @js.native
    sealed trait SHARED_STATE_SET
      extends StObject
         with events
    
    @js.native
    sealed trait STORIES_COLLAPSE_ALL
      extends StObject
         with events
    
    @js.native
    sealed trait STORIES_EXPAND_ALL
      extends StObject
         with events
    
    @js.native
    sealed trait STORY_ARGS_UPDATED
      extends StObject
         with events
    
    @js.native
    sealed trait STORY_CHANGED
      extends StObject
         with events
    
    @js.native
    sealed trait STORY_ERRORED
      extends StObject
         with events
    
    @js.native
    sealed trait STORY_MISSING
      extends StObject
         with events
    
    @js.native
    sealed trait STORY_RENDERED
      extends StObject
         with events
    
    @js.native
    sealed trait STORY_SPECIFIED
      extends StObject
         with events
    
    @js.native
    sealed trait STORY_THREW_EXCEPTION
      extends StObject
         with events
    
    @js.native
    sealed trait STORY_UNCHANGED
      extends StObject
         with events
    
    @js.native
    sealed trait UPDATE_GLOBALS
      extends StObject
         with events
    
    @js.native
    sealed trait UPDATE_STORY_ARGS
      extends StObject
         with events
  }
}
