package typings
package streamDashJsonLib.utilsWithParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-json/utils/withParser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(
    fn: js.Function1[
      js.UndefOr[
        (/* options */ streamDashJsonLib.filtersFilterBaseMod.FilterOptions) | streamDashJsonLib.streamersStreamBaseMod.StreamOptions | nodeLib.streamMod.TransformOptions
      ], 
      nodeLib.streamMod.Transform | streamDashJsonLib.filtersFilterBaseMod.^  | streamDashJsonLib.streamersStreamBaseMod.^ 
    ]
  ): streamDashChainLib.streamDashChainMod.^ = js.native
  def apply(
    fn: js.Function1[
      /* options */ js.UndefOr[nodeLib.streamMod.TransformOptions], 
      nodeLib.streamMod.Transform
    ],
    options: streamDashJsonLib.parserMod.ParserOptions
  ): streamDashChainLib.streamDashChainMod.^ = js.native
  def apply(
    fn: js.Function1[
      /* options */ streamDashJsonLib.filtersFilterBaseMod.FilterOptions, 
      streamDashJsonLib.filtersFilterBaseMod.^
    ],
    options: FilterOptions
  ): streamDashChainLib.streamDashChainMod.^ = js.native
  def apply(
    fn: js.Function1[
      /* options */ js.UndefOr[streamDashJsonLib.streamersStreamBaseMod.StreamOptions], 
      streamDashJsonLib.streamersStreamBaseMod.^
    ],
    options: StreamOptions
  ): streamDashChainLib.streamDashChainMod.^ = js.native
}

