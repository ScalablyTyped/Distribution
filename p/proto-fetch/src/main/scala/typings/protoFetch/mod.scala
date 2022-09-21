package typings.protoFetch

import typings.protoFetch.anon.FnCall
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(protocols: Record[String, js.Function2[/* url */ Any, /* options */ js.UndefOr[Any], Any]]): FnCall = ^.asInstanceOf[js.Dynamic].apply(protocols.asInstanceOf[js.Any]).asInstanceOf[FnCall]
  
  @JSImport("proto-fetch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
