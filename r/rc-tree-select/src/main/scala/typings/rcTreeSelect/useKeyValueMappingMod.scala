package typings.rcTreeSelect

import typings.rcTreeSelect.interfaceMod.FlattenDataNode
import typings.rcTreeSelect.interfaceMod.Key
import typings.rcTreeSelect.interfaceMod.RawValueType
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useKeyValueMappingMod {
  
  @JSImport("rc-tree-select/es/hooks/useKeyValueMapping", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(cacheKeyMap: Map[Key, FlattenDataNode], cacheValueMap: Map[RawValueType, FlattenDataNode]): js.Tuple2[
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
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(cacheKeyMap.asInstanceOf[js.Any], cacheValueMap.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
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
  ]]
  
  inline def isDisabled(dataNode: FlattenDataNode, skipType: SkipType): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDisabled")(dataNode.asInstanceOf[js.Any], skipType.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - typings.rcTreeSelect.rcTreeSelectStrings.select
    - typings.rcTreeSelect.rcTreeSelectStrings.checkbox
  */
  type SkipType = _SkipType | Null
  
  trait _SkipType extends StObject
}
