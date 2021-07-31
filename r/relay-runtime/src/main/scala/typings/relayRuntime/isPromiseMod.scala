package typings.relayRuntime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isPromiseMod {
  
  @JSImport("relay-runtime/lib/util/isPromise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(p: js.Any): /* is std.Promise<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(p.asInstanceOf[js.Any]).asInstanceOf[/* is std.Promise<any> */ Boolean]
}
