package typings.atStorybookApi.atStorybookApiMod

import typings.atStorybookApi.distStoreMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/api", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def useAddonState[S](addonId: String): js.Tuple2[
    S, 
    js.Function2[
      /* newStateOrMerger */ S | StateMerger[S], 
      /* options */ js.UndefOr[Options], 
      js.Promise[S]
    ]
  ] = js.native
  def useAddonState[S](addonId: String, defaultState: S): js.Tuple2[
    S, 
    js.Function2[
      /* newStateOrMerger */ S | StateMerger[S], 
      /* options */ js.UndefOr[Options], 
      js.Promise[S]
    ]
  ] = js.native
  def useChannel(eventMap: EventMap): js.Function2[/* type */ String, /* repeated */ js.Any, Unit] = js.native
  def useParameter[S](parameterKey: String): S = js.native
  def useParameter[S](parameterKey: String, defaultValue: S): S = js.native
  def useStorybookApi(): API = js.native
  def useStorybookState(): State = js.native
}

