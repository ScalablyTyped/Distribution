package typings.relayRuntime

import typings.relayRuntime.relayConcreteNodeMod.ProvidedVariablesType
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withProvidedVariablesMod {
  
  @JSImport("relay-runtime/lib/util/withProvidedVariables", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(userSuppliedVariables: Variables): Variables = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(userSuppliedVariables.asInstanceOf[js.Any]).asInstanceOf[Variables]
  inline def default(userSuppliedVariables: Variables, providedVariables: ProvidedVariablesType): Variables = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(userSuppliedVariables.asInstanceOf[js.Any], providedVariables.asInstanceOf[js.Any])).asInstanceOf[Variables]
}
