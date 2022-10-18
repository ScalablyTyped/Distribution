package typings.reactNavigationCore

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcFromEntriesMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/fromEntries", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[K /* <: String */, V](entries: js.Array[js.Tuple2[K, V]]): Record[K, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(entries.asInstanceOf[js.Any]).asInstanceOf[Record[K, V]]
}
