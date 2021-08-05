package typings.relayRuntime

import typings.relayRuntime.readerNodeMod.ReaderFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getFragmentIdentifierMod {
  
  @JSImport("relay-runtime/lib/util/getFragmentIdentifier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(fragmentNode: ReaderFragment, fragmentRef: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fragmentNode.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[String]
}
