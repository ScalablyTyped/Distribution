package typings
package atStorybookCoreDashEventsLib.atStorybookCoreDashEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait events extends js.Object

@JSImport("@storybook/core-events", "events")
@js.native
object events extends js.Object {
  @js.native
  sealed trait CHANNEL_CREATED
    extends atStorybookCoreDashEventsLib.atStorybookCoreDashEventsMod.events
  
  @js.native
  sealed trait FORCE_RE_RENDER
    extends atStorybookCoreDashEventsLib.atStorybookCoreDashEventsMod.events
  
  @js.native
  sealed trait GET_CURRENT_STORY
    extends atStorybookCoreDashEventsLib.atStorybookCoreDashEventsMod.events
  
  @js.native
  sealed trait GET_STORIES
    extends atStorybookCoreDashEventsLib.atStorybookCoreDashEventsMod.events
  
  @js.native
  sealed trait PREVIEW_KEYDOWN
    extends atStorybookCoreDashEventsLib.atStorybookCoreDashEventsMod.events
  
  @js.native
  sealed trait REGISTER_SUBSCRIPTION
    extends atStorybookCoreDashEventsLib.atStorybookCoreDashEventsMod.events
  
  @js.native
  sealed trait SELECT_STORY
    extends atStorybookCoreDashEventsLib.atStorybookCoreDashEventsMod.events
  
  @js.native
  sealed trait SET_CURRENT_STORY
    extends atStorybookCoreDashEventsLib.atStorybookCoreDashEventsMod.events
  
  @js.native
  sealed trait SET_STORIES
    extends atStorybookCoreDashEventsLib.atStorybookCoreDashEventsMod.events
  
  @js.native
  sealed trait STORIES_CONFIGURED
    extends atStorybookCoreDashEventsLib.atStorybookCoreDashEventsMod.events
  
  @js.native
  sealed trait STORY_ADDED
    extends atStorybookCoreDashEventsLib.atStorybookCoreDashEventsMod.events
  
  @js.native
  sealed trait STORY_CHANGED
    extends atStorybookCoreDashEventsLib.atStorybookCoreDashEventsMod.events
  
  @js.native
  sealed trait STORY_ERRORED
    extends atStorybookCoreDashEventsLib.atStorybookCoreDashEventsMod.events
  
  @js.native
  sealed trait STORY_INIT
    extends atStorybookCoreDashEventsLib.atStorybookCoreDashEventsMod.events
  
  @js.native
  sealed trait STORY_MISSING
    extends atStorybookCoreDashEventsLib.atStorybookCoreDashEventsMod.events
  
  @js.native
  sealed trait STORY_RENDER
    extends atStorybookCoreDashEventsLib.atStorybookCoreDashEventsMod.events
  
  @js.native
  sealed trait STORY_RENDERED
    extends atStorybookCoreDashEventsLib.atStorybookCoreDashEventsMod.events
  
  @js.native
  sealed trait STORY_THREW_EXCEPTION
    extends atStorybookCoreDashEventsLib.atStorybookCoreDashEventsMod.events
  
  @js.native
  sealed trait STORY_UNCHANGED
    extends atStorybookCoreDashEventsLib.atStorybookCoreDashEventsMod.events
  
}

