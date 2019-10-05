package typings.streamDashJson.utilsWithParserMod

import typings.node.streamMod.Transform
import typings.node.streamMod.TransformOptions
import typings.streamDashJson.parserMod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-json/utils/withParser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(
    fn: js.Function1[
      js.UndefOr[
        (/* options */ typings.streamDashJson.filtersFilterBaseMod.FilterOptions) | typings.streamDashJson.streamersStreamBaseMod.StreamOptions | TransformOptions
      ], 
      Transform | typings.streamDashJson.streamersStreamBaseMod.^  | typings.streamDashJson.filtersFilterBaseMod.^ 
    ]
  ): typings.streamDashChain.streamDashChainMod.^ = js.native
  def apply(fn: js.Function1[/* options */ js.UndefOr[TransformOptions], Transform], options: ParserOptions): typings.streamDashChain.streamDashChainMod.^ = js.native
  def apply(
    fn: js.Function1[
      /* options */ typings.streamDashJson.filtersFilterBaseMod.FilterOptions, 
      typings.streamDashJson.filtersFilterBaseMod.^
    ],
    options: FilterOptions
  ): typings.streamDashChain.streamDashChainMod.^ = js.native
  def apply(
    fn: js.Function1[
      /* options */ js.UndefOr[typings.streamDashJson.streamersStreamBaseMod.StreamOptions], 
      typings.streamDashJson.streamersStreamBaseMod.^
    ],
    options: StreamOptions
  ): typings.streamDashChain.streamDashChainMod.^ = js.native
}

