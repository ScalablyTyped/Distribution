package typings.storybookCoreEvents.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  sealed trait CONFIG_ERROR
    extends StObject
       with events
  
  @js.native
  sealed trait CURRENT_STORY_WAS_SET
    extends StObject
       with events
  
  @js.native
  sealed trait DOCS_PREPARED
    extends StObject
       with events
  
  @js.native
  sealed trait DOCS_RENDERED
    extends StObject
       with events
  
  @js.native
  sealed trait FORCE_REMOUNT
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
  sealed trait PLAY_FUNCTION_THREW_EXCEPTION
    extends StObject
       with events
  
  @js.native
  sealed trait PRELOAD_ENTRIES
    extends StObject
       with events
  
  @js.native
  sealed trait PREVIEW_BUILDER_PROGRESS
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
  sealed trait SET_CONFIG
    extends StObject
       with events
  
  @js.native
  sealed trait SET_CURRENT_STORY
    extends StObject
       with events
  
  @js.native
  sealed trait SET_GLOBALS
    extends StObject
       with events
  
  @js.native
  sealed trait SET_INDEX
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
  sealed trait STORY_INDEX_INVALIDATED
    extends StObject
       with events
  
  @js.native
  sealed trait STORY_MISSING
    extends StObject
       with events
  
  @js.native
  sealed trait STORY_PREPARED
    extends StObject
       with events
  
  @js.native
  sealed trait STORY_RENDERED
    extends StObject
       with events
  
  @js.native
  sealed trait STORY_RENDER_PHASE_CHANGED
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
  sealed trait UPDATE_QUERY_PARAMS
    extends StObject
       with events
  
  @js.native
  sealed trait UPDATE_STORY_ARGS
    extends StObject
       with events
}
