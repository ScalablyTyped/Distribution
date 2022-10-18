package typings.relayRuntime.libUtilReaderNodeMod

import typings.relayRuntime.anon.FragmentRefs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.libUtilReaderNodeMod.ReaderScalarField
  - typings.relayRuntime.libUtilReaderNodeMod.ReaderLinkedField
  - typings.relayRuntime.libUtilReaderNodeMod.ReaderRelayResolver
*/
trait ReaderField
  extends StObject
     with ReaderSelection
object ReaderField {
  
  inline def ReaderLinkedField(kind: String, name: String, plural: Boolean, selections: js.Array[ReaderSelection]): typings.relayRuntime.libUtilReaderNodeMod.ReaderLinkedField = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.libUtilReaderNodeMod.ReaderLinkedField]
  }
  
  inline def ReaderRelayResolver(fragment: ReaderFragmentSpread, kind: String, name: String, resolverModule: FragmentRefs => Any): typings.relayRuntime.libUtilReaderNodeMod.ReaderRelayResolver = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resolverModule = js.Any.fromFunction1(resolverModule))
    __obj.asInstanceOf[typings.relayRuntime.libUtilReaderNodeMod.ReaderRelayResolver]
  }
  
  inline def ReaderScalarField(kind: String, name: String): typings.relayRuntime.libUtilReaderNodeMod.ReaderScalarField = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.libUtilReaderNodeMod.ReaderScalarField]
  }
}
