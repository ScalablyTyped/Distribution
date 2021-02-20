package typings.pulumiAws

import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  type Diff[T /* <: String | Double | js.Symbol */, U /* <: String | Double | js.Symbol */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in T ]: P} & {[ P in U ]: never} & {[x: string] : never}[T] */ js.Any
  
  type Overwrite[T, U] = (Pick[T, Diff[/* keyof T */ String, /* keyof U */ String]]) with U
}
