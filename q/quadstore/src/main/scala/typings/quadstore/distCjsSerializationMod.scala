package typings.quadstore

import typings.quadstore.distCjsSerializationQuadsMod.QuadReader_
import typings.quadstore.distCjsSerializationQuadsMod.TwoStepsQuadWriter_
import typings.quadstore.distCjsTypesMod.IndexQuery
import typings.quadstore.distCjsTypesMod.InternalIndex
import typings.quadstore.distCjsTypesMod.Pattern
import typings.quadstore.distCjsTypesMod.Prefixes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsSerializationMod {
  
  @JSImport("quadstore/dist/cjs/serialization", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("quadstore/dist/cjs/serialization", "quadReader")
  @js.native
  val quadReader: QuadReader_ = js.native
  
  @JSImport("quadstore/dist/cjs/serialization", "twoStepsQuadWriter")
  @js.native
  val twoStepsQuadWriter: TwoStepsQuadWriter_ = js.native
  
  inline def writePattern(pattern: Pattern, index: InternalIndex, prefixes: Prefixes): IndexQuery | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("writePattern")(pattern.asInstanceOf[js.Any], index.asInstanceOf[js.Any], prefixes.asInstanceOf[js.Any])).asInstanceOf[IndexQuery | Null]
}
