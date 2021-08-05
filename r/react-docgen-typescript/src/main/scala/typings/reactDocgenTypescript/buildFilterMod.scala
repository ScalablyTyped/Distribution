package typings.reactDocgenTypescript

import typings.reactDocgenTypescript.parserMod.ParserOptions
import typings.reactDocgenTypescript.parserMod.PropFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildFilterMod {
  
  @JSImport("react-docgen-typescript/lib/buildFilter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildFilter(opts: ParserOptions): PropFilter = ^.asInstanceOf[js.Dynamic].applyDynamic("buildFilter")(opts.asInstanceOf[js.Any]).asInstanceOf[PropFilter]
}
