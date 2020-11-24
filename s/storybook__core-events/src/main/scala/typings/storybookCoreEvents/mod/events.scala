package typings.storybookCoreEvents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait events extends js.Object
@JSImport("@storybook/core-events", "events")
@js.native
object events extends js.Object {
  
  @js.native
  sealed trait CHANNEL_CREATED extends events
  
  @js.native
  sealed trait CURRENT_STORY_WAS_SET extends events
  
  @js.native
  sealed trait DOCS_RENDERED extends events
  
  @js.native
  sealed trait FORCE_RE_RENDER extends events
  
  @js.native
  sealed trait GLOBALS_UPDATED extends events
  
  @js.native
  sealed trait NAVIGATE_URL extends events
  
  @js.native
  sealed trait PREVIEW_KEYDOWN extends events
  
  @js.native
  sealed trait REGISTER_SUBSCRIPTION extends events
  
  @js.native
  sealed trait RESET_STORY_ARGS extends events
  
  @js.native
  sealed trait SELECT_STORY extends events
  
  @js.native
  sealed trait SET_CURRENT_STORY extends events
  
  @js.native
  sealed trait SET_STORIES extends events
  
  @js.native
  sealed trait SHARED_STATE_CHANGED extends events
  
  @js.native
  sealed trait SHARED_STATE_SET extends events
  
  @js.native
  sealed trait STORIES_COLLAPSE_ALL extends events
  
  @js.native
  sealed trait STORIES_EXPAND_ALL extends events
  
  @js.native
  sealed trait STORY_ARGS_UPDATED extends events
  
  @js.native
  sealed trait STORY_CHANGED extends events
  
  @js.native
  sealed trait STORY_ERRORED extends events
  
  @js.native
  sealed trait STORY_MISSING extends events
  
  @js.native
  sealed trait STORY_RENDERED extends events
  
  @js.native
  sealed trait STORY_SPECIFIED extends events
  
  @js.native
  sealed trait STORY_THREW_EXCEPTION extends events
  
  @js.native
  sealed trait STORY_UNCHANGED extends events
  
  @js.native
  sealed trait UPDATE_GLOBALS extends events
  
  @js.native
  sealed trait UPDATE_STORY_ARGS extends events
}
