package typings.relayRuntime.libStoreRelayStoreTypesMod

import typings.relayRuntime.libUtilReaderNodeMod.ReaderFragment
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.DataID
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.Variables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SingularReaderSelector
  extends StObject
     with ReaderSelector {
  
  val dataID: DataID
  
  val isWithinUnmatchedTypeRefinement: Boolean
  
  val kind: String
  
  val node: ReaderFragment
  
  val owner: RequestDescriptor
  
  val variables: Variables
}
object SingularReaderSelector {
  
  inline def apply(
    dataID: DataID,
    isWithinUnmatchedTypeRefinement: Boolean,
    kind: String,
    node: ReaderFragment,
    owner: RequestDescriptor,
    variables: Variables
  ): SingularReaderSelector = {
    val __obj = js.Dynamic.literal(dataID = dataID.asInstanceOf[js.Any], isWithinUnmatchedTypeRefinement = isWithinUnmatchedTypeRefinement.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingularReaderSelector]
  }
  
  extension [Self <: SingularReaderSelector](x: Self) {
    
    inline def setDataID(value: DataID): Self = StObject.set(x, "dataID", value.asInstanceOf[js.Any])
    
    inline def setIsWithinUnmatchedTypeRefinement(value: Boolean): Self = StObject.set(x, "isWithinUnmatchedTypeRefinement", value.asInstanceOf[js.Any])
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setNode(value: ReaderFragment): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: RequestDescriptor): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setVariables(value: Variables): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
  }
}
