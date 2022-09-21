package typings.relayRuntime

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.readerNodeMod.ReaderPaginationMetadata
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getPaginationVariablesMod {
  
  @JSImport("relay-runtime/lib/util/getPaginationVariables", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    direction: Direction,
    count: Double,
    cursor: String,
    baseVariables: Variables,
    extraVariables: Variables,
    paginationMetadata: ReaderPaginationMetadata
  ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(direction.asInstanceOf[js.Any], count.asInstanceOf[js.Any], cursor.asInstanceOf[js.Any], baseVariables.asInstanceOf[js.Any], extraVariables.asInstanceOf[js.Any], paginationMetadata.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  inline def default(
    direction: Direction,
    count: Double,
    cursor: Null,
    baseVariables: Variables,
    extraVariables: Variables,
    paginationMetadata: ReaderPaginationMetadata
  ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(direction.asInstanceOf[js.Any], count.asInstanceOf[js.Any], cursor.asInstanceOf[js.Any], baseVariables.asInstanceOf[js.Any], extraVariables.asInstanceOf[js.Any], paginationMetadata.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  inline def default(
    direction: Direction,
    count: Double,
    cursor: Unit,
    baseVariables: Variables,
    extraVariables: Variables,
    paginationMetadata: ReaderPaginationMetadata
  ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(direction.asInstanceOf[js.Any], count.asInstanceOf[js.Any], cursor.asInstanceOf[js.Any], baseVariables.asInstanceOf[js.Any], extraVariables.asInstanceOf[js.Any], paginationMetadata.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.relayRuntime.relayRuntimeStrings.forward
    - typings.relayRuntime.relayRuntimeStrings.backward
  */
  trait Direction extends StObject
  object Direction {
    
    inline def backward: typings.relayRuntime.relayRuntimeStrings.backward = "backward".asInstanceOf[typings.relayRuntime.relayRuntimeStrings.backward]
    
    inline def forward: typings.relayRuntime.relayRuntimeStrings.forward = "forward".asInstanceOf[typings.relayRuntime.relayRuntimeStrings.forward]
  }
}
