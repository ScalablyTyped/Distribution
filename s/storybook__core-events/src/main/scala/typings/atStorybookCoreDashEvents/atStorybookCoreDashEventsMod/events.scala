package typings.atStorybookCoreDashEvents.atStorybookCoreDashEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait events extends js.Object

@JSImport("@storybook/core-events", "events")
@js.native
object events extends js.Object {
  @js.native
  sealed trait CHANNEL_CREATED extends events
  
  @js.native
  sealed trait DOCS_RENDERED extends events
  
  @js.native
  sealed trait FORCE_RE_RENDER extends events
  
  @js.native
  sealed trait GET_CURRENT_STORY extends events
  
  @js.native
  sealed trait GET_STORIES extends events
  
  @js.native
  sealed trait PREVIEW_KEYDOWN extends events
  
  @js.native
  sealed trait REGISTER_SUBSCRIPTION extends events
  
  @js.native
  sealed trait SELECT_STORY extends events
  
  @js.native
  sealed trait SET_CURRENT_STORY extends events
  
  @js.native
  sealed trait SET_STORIES extends events
  
  @js.native
  sealed trait STORIES_CONFIGURED extends events
  
  @js.native
  sealed trait STORY_ADDED extends events
  
  @js.native
  sealed trait STORY_CHANGED extends events
  
  @js.native
  sealed trait STORY_ERRORED extends events
  
  @js.native
  sealed trait STORY_INIT extends events
  
  @js.native
  sealed trait STORY_MISSING extends events
  
  @js.native
  sealed trait STORY_RENDER extends events
  
  @js.native
  sealed trait STORY_RENDERED extends events
  
  @js.native
  sealed trait STORY_THREW_EXCEPTION extends events
  
  @js.native
  sealed trait STORY_UNCHANGED extends events
  
}

