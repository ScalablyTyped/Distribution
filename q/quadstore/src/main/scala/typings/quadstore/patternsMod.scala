package typings.quadstore

import typings.quadstore.typesMod.IndexQuery
import typings.quadstore.typesMod.InternalIndex
import typings.quadstore.typesMod.Pattern
import typings.quadstore.typesMod.Prefixes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object patternsMod {
  
  @JSImport("quadstore/dist/cjs/serialization/patterns", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def writePattern(pattern: Pattern, index: InternalIndex, prefixes: Prefixes): IndexQuery | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("writePattern")(pattern.asInstanceOf[js.Any], index.asInstanceOf[js.Any], prefixes.asInstanceOf[js.Any])).asInstanceOf[IndexQuery | Null]
}
