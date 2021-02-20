package typings.relayRuntime

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.anon.Filters
import typings.relayRuntime.anon.Key
import typings.relayRuntime.anon.OptimisticUpdater
import typings.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typings.relayRuntime.relayRuntimeStrings.NODE_DELETE
import typings.relayRuntime.relayRuntimeStrings.RANGE_ADD
import typings.relayRuntime.relayRuntimeStrings.RANGE_DELETE
import typings.relayRuntime.relayStoreTypesMod.SelectorStoreUpdater
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayDeclarativeMutationConfigMod {
  
  @JSImport("relay-runtime/lib/mutations/RelayDeclarativeMutationConfig", "convert")
  @js.native
  def convert(configs: js.Array[DeclarativeMutationConfig], request: ConcreteRequest): OptimisticUpdater = js.native
  @JSImport("relay-runtime/lib/mutations/RelayDeclarativeMutationConfig", "convert")
  @js.native
  def convert(
    configs: js.Array[DeclarativeMutationConfig],
    request: ConcreteRequest,
    optimisticUpdater: js.UndefOr[scala.Nothing],
    updater: SelectorStoreUpdater[js.Object]
  ): OptimisticUpdater = js.native
  @JSImport("relay-runtime/lib/mutations/RelayDeclarativeMutationConfig", "convert")
  @js.native
  def convert(
    configs: js.Array[DeclarativeMutationConfig],
    request: ConcreteRequest,
    optimisticUpdater: SelectorStoreUpdater[js.Object]
  ): OptimisticUpdater = js.native
  @JSImport("relay-runtime/lib/mutations/RelayDeclarativeMutationConfig", "convert")
  @js.native
  def convert(
    configs: js.Array[DeclarativeMutationConfig],
    request: ConcreteRequest,
    optimisticUpdater: SelectorStoreUpdater[js.Object],
    updater: SelectorStoreUpdater[js.Object]
  ): OptimisticUpdater = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.relayRuntime.relayDeclarativeMutationConfigMod.RangeAddConfig
    - typings.relayRuntime.relayDeclarativeMutationConfigMod.RangeDeleteConfig
    - typings.relayRuntime.relayDeclarativeMutationConfigMod.NodeDeleteConfig
  */
  trait DeclarativeMutationConfig extends StObject
  object DeclarativeMutationConfig {
    
    @scala.inline
    def NodeDeleteConfig(deletedIDFieldName: String, `type`: NODE_DELETE): typings.relayRuntime.relayDeclarativeMutationConfigMod.NodeDeleteConfig = {
      val __obj = js.Dynamic.literal(deletedIDFieldName = deletedIDFieldName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.relayRuntime.relayDeclarativeMutationConfigMod.NodeDeleteConfig]
    }
    
    @scala.inline
    def RangeAddConfig(edgeName: String, `type`: RANGE_ADD): typings.relayRuntime.relayDeclarativeMutationConfigMod.RangeAddConfig = {
      val __obj = js.Dynamic.literal(edgeName = edgeName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.relayRuntime.relayDeclarativeMutationConfigMod.RangeAddConfig]
    }
    
    @scala.inline
    def RangeDeleteConfig(
      deletedIDFieldName: String | js.Array[String],
      pathToConnection: js.Array[String],
      `type`: RANGE_DELETE
    ): typings.relayRuntime.relayDeclarativeMutationConfigMod.RangeDeleteConfig = {
      val __obj = js.Dynamic.literal(deletedIDFieldName = deletedIDFieldName.asInstanceOf[js.Any], pathToConnection = pathToConnection.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.relayRuntime.relayDeclarativeMutationConfigMod.RangeDeleteConfig]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.relayRuntime.relayRuntimeStrings.RANGE_ADD
    - typings.relayRuntime.relayRuntimeStrings.RANGE_DELETE
    - typings.relayRuntime.relayRuntimeStrings.NODE_DELETE
  */
  trait MutationTypes extends StObject
  object MutationTypes {
    
    @scala.inline
    def NODE_DELETE: typings.relayRuntime.relayRuntimeStrings.NODE_DELETE = "NODE_DELETE".asInstanceOf[typings.relayRuntime.relayRuntimeStrings.NODE_DELETE]
    
    @scala.inline
    def RANGE_ADD: typings.relayRuntime.relayRuntimeStrings.RANGE_ADD = "RANGE_ADD".asInstanceOf[typings.relayRuntime.relayRuntimeStrings.RANGE_ADD]
    
    @scala.inline
    def RANGE_DELETE: typings.relayRuntime.relayRuntimeStrings.RANGE_DELETE = "RANGE_DELETE".asInstanceOf[typings.relayRuntime.relayRuntimeStrings.RANGE_DELETE]
  }
  
  @js.native
  trait NodeDeleteConfig extends DeclarativeMutationConfig {
    
    var connectionName: js.UndefOr[String] = js.native
    
    var deletedIDFieldName: String = js.native
    
    var parentID: js.UndefOr[String] = js.native
    
    var parentName: js.UndefOr[String] = js.native
    
    var `type`: NODE_DELETE = js.native
  }
  object NodeDeleteConfig {
    
    @scala.inline
    def apply(deletedIDFieldName: String, `type`: NODE_DELETE): NodeDeleteConfig = {
      val __obj = js.Dynamic.literal(deletedIDFieldName = deletedIDFieldName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeDeleteConfig]
    }
    
    @scala.inline
    implicit class NodeDeleteConfigMutableBuilder[Self <: NodeDeleteConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnectionName(value: String): Self = StObject.set(x, "connectionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionNameUndefined: Self = StObject.set(x, "connectionName", js.undefined)
      
      @scala.inline
      def setDeletedIDFieldName(value: String): Self = StObject.set(x, "deletedIDFieldName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentID(value: String): Self = StObject.set(x, "parentID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentIDUndefined: Self = StObject.set(x, "parentID", js.undefined)
      
      @scala.inline
      def setParentName(value: String): Self = StObject.set(x, "parentName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentNameUndefined: Self = StObject.set(x, "parentName", js.undefined)
      
      @scala.inline
      def setType(value: NODE_DELETE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RangeAddConfig extends DeclarativeMutationConfig {
    
    var connectionInfo: js.UndefOr[js.Array[Filters]] = js.native
    
    var connectionName: js.UndefOr[String] = js.native
    
    var edgeName: String = js.native
    
    var parentID: js.UndefOr[String] = js.native
    
    var parentName: js.UndefOr[String] = js.native
    
    var rangeBehaviors: js.UndefOr[RangeBehaviors] = js.native
    
    var `type`: RANGE_ADD = js.native
  }
  object RangeAddConfig {
    
    @scala.inline
    def apply(edgeName: String, `type`: RANGE_ADD): RangeAddConfig = {
      val __obj = js.Dynamic.literal(edgeName = edgeName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangeAddConfig]
    }
    
    @scala.inline
    implicit class RangeAddConfigMutableBuilder[Self <: RangeAddConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnectionInfo(value: js.Array[Filters]): Self = StObject.set(x, "connectionInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionInfoUndefined: Self = StObject.set(x, "connectionInfo", js.undefined)
      
      @scala.inline
      def setConnectionInfoVarargs(value: Filters*): Self = StObject.set(x, "connectionInfo", js.Array(value :_*))
      
      @scala.inline
      def setConnectionName(value: String): Self = StObject.set(x, "connectionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionNameUndefined: Self = StObject.set(x, "connectionName", js.undefined)
      
      @scala.inline
      def setEdgeName(value: String): Self = StObject.set(x, "edgeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentID(value: String): Self = StObject.set(x, "parentID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentIDUndefined: Self = StObject.set(x, "parentID", js.undefined)
      
      @scala.inline
      def setParentName(value: String): Self = StObject.set(x, "parentName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentNameUndefined: Self = StObject.set(x, "parentName", js.undefined)
      
      @scala.inline
      def setRangeBehaviors(value: RangeBehaviors): Self = StObject.set(x, "rangeBehaviors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeBehaviorsFunction1(value: /* connectionArgs */ StringDictionary[js.Any] => RangeOperations): Self = StObject.set(x, "rangeBehaviors", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRangeBehaviorsUndefined: Self = StObject.set(x, "rangeBehaviors", js.undefined)
      
      @scala.inline
      def setType(value: RANGE_ADD): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type RangeBehaviors = RangeBehaviorsFunction | RangeBehaviorsObject
  
  type RangeBehaviorsFunction = js.Function1[/* connectionArgs */ StringDictionary[js.Any], RangeOperations]
  
  type RangeBehaviorsObject = StringDictionary[RangeOperations]
  
  @js.native
  trait RangeDeleteConfig extends DeclarativeMutationConfig {
    
    var connectionKeys: js.UndefOr[js.Array[Key]] = js.native
    
    var connectionName: js.UndefOr[String] = js.native
    
    var deletedIDFieldName: String | js.Array[String] = js.native
    
    var parentID: js.UndefOr[String] = js.native
    
    var parentName: js.UndefOr[String] = js.native
    
    var pathToConnection: js.Array[String] = js.native
    
    var `type`: RANGE_DELETE = js.native
  }
  object RangeDeleteConfig {
    
    @scala.inline
    def apply(
      deletedIDFieldName: String | js.Array[String],
      pathToConnection: js.Array[String],
      `type`: RANGE_DELETE
    ): RangeDeleteConfig = {
      val __obj = js.Dynamic.literal(deletedIDFieldName = deletedIDFieldName.asInstanceOf[js.Any], pathToConnection = pathToConnection.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangeDeleteConfig]
    }
    
    @scala.inline
    implicit class RangeDeleteConfigMutableBuilder[Self <: RangeDeleteConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnectionKeys(value: js.Array[Key]): Self = StObject.set(x, "connectionKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionKeysUndefined: Self = StObject.set(x, "connectionKeys", js.undefined)
      
      @scala.inline
      def setConnectionKeysVarargs(value: Key*): Self = StObject.set(x, "connectionKeys", js.Array(value :_*))
      
      @scala.inline
      def setConnectionName(value: String): Self = StObject.set(x, "connectionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionNameUndefined: Self = StObject.set(x, "connectionName", js.undefined)
      
      @scala.inline
      def setDeletedIDFieldName(value: String | js.Array[String]): Self = StObject.set(x, "deletedIDFieldName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeletedIDFieldNameVarargs(value: String*): Self = StObject.set(x, "deletedIDFieldName", js.Array(value :_*))
      
      @scala.inline
      def setParentID(value: String): Self = StObject.set(x, "parentID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentIDUndefined: Self = StObject.set(x, "parentID", js.undefined)
      
      @scala.inline
      def setParentName(value: String): Self = StObject.set(x, "parentName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentNameUndefined: Self = StObject.set(x, "parentName", js.undefined)
      
      @scala.inline
      def setPathToConnection(value: js.Array[String]): Self = StObject.set(x, "pathToConnection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathToConnectionVarargs(value: String*): Self = StObject.set(x, "pathToConnection", js.Array(value :_*))
      
      @scala.inline
      def setType(value: RANGE_DELETE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.relayRuntime.relayRuntimeStrings.append
    - typings.relayRuntime.relayRuntimeStrings.prepend
  */
  trait RangeOperations extends StObject
  object RangeOperations {
    
    @scala.inline
    def append: typings.relayRuntime.relayRuntimeStrings.append = "append".asInstanceOf[typings.relayRuntime.relayRuntimeStrings.append]
    
    @scala.inline
    def prepend: typings.relayRuntime.relayRuntimeStrings.prepend = "prepend".asInstanceOf[typings.relayRuntime.relayRuntimeStrings.prepend]
  }
}
