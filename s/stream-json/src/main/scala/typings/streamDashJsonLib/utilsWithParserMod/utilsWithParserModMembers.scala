package typings
package streamDashJsonLib.utilsWithParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-json/utils/withParser", JSImport.Namespace)
@js.native
object utilsWithParserModMembers extends js.Object {
  def apply(
    fn: js.Function1[
      (/* options */ js.UndefOr[
        nodeLib.streamMod.internalNs.TransformOptions | streamDashJsonLib.streamersStreamBaseMod.StreamBaseNs.StreamOptions
      ]) | (/* options */ streamDashJsonLib.filtersFilterBaseMod.FilterBaseNs.FilterOptions), 
      nodeLib.streamMod.Transform | streamDashJsonLib.filtersFilterBaseMod.namespaced | streamDashJsonLib.streamersStreamBaseMod.namespaced
    ]
  ): streamDashChainLib.streamDashChainMod.namespaced = js.native
  def apply(
    fn: js.Function1[
      /* options */ js.UndefOr[nodeLib.streamMod.internalNs.TransformOptions], 
      nodeLib.streamMod.Transform
    ],
    options: streamDashJsonLib.parserMod.ParserNs.ParserOptions
  ): streamDashChainLib.streamDashChainMod.namespaced = js.native
  def apply(
    fn: js.Function1[
      /* options */ streamDashJsonLib.filtersFilterBaseMod.FilterBaseNs.FilterOptions, 
      streamDashJsonLib.filtersFilterBaseMod.namespaced
    ],
    options: streamDashJsonLib.utilsWithParserMod.withParserNs.FilterOptions
  ): streamDashChainLib.streamDashChainMod.namespaced = js.native
  def apply(
    fn: js.Function1[
      /* options */ js.UndefOr[streamDashJsonLib.streamersStreamBaseMod.StreamBaseNs.StreamOptions], 
      streamDashJsonLib.streamersStreamBaseMod.namespaced
    ],
    options: streamDashJsonLib.utilsWithParserMod.withParserNs.StreamOptions
  ): streamDashChainLib.streamDashChainMod.namespaced = js.native
}

