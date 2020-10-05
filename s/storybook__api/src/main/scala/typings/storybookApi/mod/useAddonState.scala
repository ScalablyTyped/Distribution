package typings.storybookApi.mod

import typings.storybookApi.storeMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/api", "useAddonState")
@js.native
object useAddonState extends js.Object {
  def apply[S](addonId: String): js.Tuple2[
    S, 
    js.Function2[
      /* newStateOrMerger */ S | StateMerger[S], 
      /* options */ js.UndefOr[Options], 
      js.Promise[S]
    ]
  ] = js.native
  def apply[S](addonId: String, defaultState: S): js.Tuple2[
    S, 
    js.Function2[
      /* newStateOrMerger */ S | StateMerger[S], 
      /* options */ js.UndefOr[Options], 
      js.Promise[S]
    ]
  ] = js.native
}

