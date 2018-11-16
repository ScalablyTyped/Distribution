package typings
package atStorybookAddonDashStoryshotsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object addonDashStoryshotsMod {
  type RenderTree = js.Function3[
    /* story */ atStorybookReactLib.reactMod.StoryObject, 
    /* context */ StoryContext, 
    /* options */ js.UndefOr[SnapshotOptions], 
    js.UndefOr[scala.Unit | stdLib.Promise[scala.Unit]]
  ]
  type Test = js.Function1[
    /* options */ atStorybookAddonDashStoryshotsLib.Anon_RenderShallowTree, 
    js.UndefOr[scala.Unit | stdLib.Promise[scala.Unit]]
  ]
}
