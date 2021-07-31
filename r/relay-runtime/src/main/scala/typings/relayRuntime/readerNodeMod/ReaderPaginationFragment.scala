package typings.relayRuntime.readerNodeMod

import typings.relayRuntime.anon.ConnectionRefetch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReaderPaginationFragment
  extends StObject
     with ReaderFragment {
  
  @JSName("metadata")
  val metadata_ReaderPaginationFragment: ConnectionRefetch
}
object ReaderPaginationFragment {
  
  @scala.inline
  def apply(
    argumentDefinitions: js.Array[ReaderArgumentDefinition],
    kind: String,
    metadata: ConnectionRefetch,
    name: String,
    selections: js.Array[ReaderSelection],
    `type`: String
  ): ReaderPaginationFragment = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderPaginationFragment]
  }
  
  @scala.inline
  implicit class ReaderPaginationFragmentMutableBuilder[Self <: ReaderPaginationFragment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(value: ConnectionRefetch): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
  }
}
