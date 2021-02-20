package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.readerNodeMod.ReaderFragment
import typings.relayRuntime.relayRuntimeTypesMod.DataID
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SingularReaderSelector extends ReaderSelector {
  
  val dataID: DataID = js.native
  
  val isWithinUnmatchedTypeRefinement: Boolean = js.native
  
  val kind: String = js.native
  
  val node: ReaderFragment = js.native
  
  val owner: RequestDescriptor = js.native
  
  val variables: Variables = js.native
}
object SingularReaderSelector {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class SingularReaderSelectorMutableBuilder[Self <: SingularReaderSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataID(value: DataID): Self = StObject.set(x, "dataID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsWithinUnmatchedTypeRefinement(value: Boolean): Self = StObject.set(x, "isWithinUnmatchedTypeRefinement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: ReaderFragment): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: RequestDescriptor): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariables(value: Variables): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
  }
}
