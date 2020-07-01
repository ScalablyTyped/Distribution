package typings.rcTreeSelect

import typings.rcTreeSelect.interfaceMod.FlattenDataNode
import typings.rcTreeSelect.interfaceMod.Key
import typings.rcTreeSelect.interfaceMod.RawValueType
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-tree-select/lib/hooks/useKeyValueMapping", JSImport.Namespace)
@js.native
object useKeyValueMappingMod extends js.Object {
  trait _SkipType extends js.Object
  
  def default(cacheKeyMap: Map[Key, FlattenDataNode], cacheValueMap: Map[RawValueType, FlattenDataNode]): js.Tuple2[
    js.Function3[
      /* key */ Key, 
      /* skipType */ js.UndefOr[SkipType], 
      /* ignoreDisabledCheck */ js.UndefOr[Boolean], 
      FlattenDataNode
    ], 
    js.Function3[
      /* value */ RawValueType, 
      /* skipType */ js.UndefOr[SkipType], 
      /* ignoreDisabledCheck */ js.UndefOr[Boolean], 
      FlattenDataNode
    ]
  ] = js.native
  def isDisabled(dataNode: FlattenDataNode, skipType: SkipType): Boolean = js.native
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - typings.rcTreeSelect.rcTreeSelectStrings.select
    - typings.rcTreeSelect.rcTreeSelectStrings.checkbox
  */
  type SkipType = _SkipType | Null
}

