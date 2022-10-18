package typings.relayRuntime.libUtilReaderNodeMod

import typings.relayRuntime.anon.Refetch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReaderPaginationFragment
  extends StObject
     with ReaderFragment {
  
  @JSName("metadata")
  val metadata_ReaderPaginationFragment: Refetch
}
object ReaderPaginationFragment {
  
  inline def apply(
    argumentDefinitions: js.Array[ReaderArgumentDefinition],
    kind: String,
    metadata: Refetch,
    name: String,
    selections: js.Array[ReaderSelection],
    `type`: String
  ): ReaderPaginationFragment = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderPaginationFragment]
  }
  
  extension [Self <: ReaderPaginationFragment](x: Self) {
    
    inline def setMetadata(value: Refetch): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
  }
}
