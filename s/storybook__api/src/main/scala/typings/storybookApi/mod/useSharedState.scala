package typings.storybookApi.mod

import typings.storybookApi.storeMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/api", "useSharedState")
@js.native
object useSharedState extends js.Object {
  
  def apply[S](stateId: String): js.Tuple2[
    S, 
    js.Function2[/* newStateOrMerger */ S | StateMerger[S], /* options */ js.UndefOr[Options], Unit]
  ] = js.native
  def apply[S](stateId: String, defaultState: S): js.Tuple2[
    S, 
    js.Function2[/* newStateOrMerger */ S | StateMerger[S], /* options */ js.UndefOr[Options], Unit]
  ] = js.native
}
