package typings
package atStorybookAddonDashStoryshotsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atStorybookAddonDashStoryshotsMod {
  type RenderTree = js.Function3[
    /* story */ atStorybookReactLib.atStorybookReactMod.StoryObject, 
    /* context */ StoryContext, 
    /* options */ js.UndefOr[SnapshotOptions], 
    js.UndefOr[scala.Unit | js.Promise[scala.Unit]]
  ]
  type SnapshotOptions = SnapshotOptionsObject | SnapshotOptionsFn
  type SnapshotOptionsFn = js.Function1[
    /* story */ atStorybookReactLib.atStorybookReactMod.StoryObject, 
    SnapshotOptionsObject
  ]
  type Test = js.Function1[
    /* options */ atStorybookAddonDashStoryshotsLib.Anon_Context, 
    js.UndefOr[scala.Unit | js.Promise[scala.Unit]]
  ]
}
