package typings.relayRuntime.readerNodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.anon.FragmentName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.readerNodeMod.ReaderScalarField
  - typings.relayRuntime.readerNodeMod.ReaderLinkedField
  - typings.relayRuntime.readerNodeMod.ReaderMatchField
*/
trait ReaderField
  extends StObject
     with ReaderSelection
object ReaderField {
  
  inline def ReaderLinkedField(
    args: js.Array[ReaderArgument],
    kind: String,
    name: String,
    plural: Boolean,
    selections: js.Array[ReaderSelection]
  ): typings.relayRuntime.readerNodeMod.ReaderLinkedField = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.readerNodeMod.ReaderLinkedField]
  }
  
  inline def ReaderMatchField(kind: String, matchesByType: StringDictionary[FragmentName], name: String): typings.relayRuntime.readerNodeMod.ReaderMatchField = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], matchesByType = matchesByType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.readerNodeMod.ReaderMatchField]
  }
  
  inline def ReaderScalarField(kind: String, name: String): typings.relayRuntime.readerNodeMod.ReaderScalarField = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.readerNodeMod.ReaderScalarField]
  }
}
