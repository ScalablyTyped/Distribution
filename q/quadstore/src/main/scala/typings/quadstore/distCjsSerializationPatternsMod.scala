package typings.quadstore

import typings.quadstore.distCjsTypesMod.IndexQuery
import typings.quadstore.distCjsTypesMod.InternalIndex
import typings.quadstore.distCjsTypesMod.Pattern
import typings.quadstore.distCjsTypesMod.Prefixes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsSerializationPatternsMod {
  
  @JSImport("quadstore/dist/cjs/serialization/patterns", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def writePattern(pattern: Pattern, index: InternalIndex, prefixes: Prefixes): IndexQuery | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("writePattern")(pattern.asInstanceOf[js.Any], index.asInstanceOf[js.Any], prefixes.asInstanceOf[js.Any])).asInstanceOf[IndexQuery | Null]
}
