package typings.atStorybookAddonDashStoryshots

import typings.atStorybookAddonDashStoryshots.Anon_Context
import typings.atStorybookReact.atStorybookReactMod.StoryObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atStorybookAddonDashStoryshotsMod {
  type RenderTree = js.Function3[
    /* story */ StoryObject, 
    /* context */ StoryContext, 
    /* options */ js.UndefOr[SnapshotOptions], 
    js.UndefOr[Unit | js.Promise[Unit]]
  ]
  type SnapshotOptions = SnapshotOptionsObject | SnapshotOptionsFn
  type SnapshotOptionsFn = js.Function1[/* story */ StoryObject, SnapshotOptionsObject]
  type Test = js.Function1[/* options */ Anon_Context, js.UndefOr[Unit | js.Promise[Unit]]]
}
