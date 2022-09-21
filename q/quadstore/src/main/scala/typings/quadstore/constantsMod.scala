package typings.quadstore

import typings.abstractLevel.abstractChainedBatchMod.AbstractChainedBatchDelOptions
import typings.abstractLevel.abstractChainedBatchMod.AbstractChainedBatchPutOptions
import typings.quadstore.typesMod.TermName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantsMod {
  
  @JSImport("quadstore/dist/cjs/utils/constants", "boundary")
  @js.native
  val boundary: /* "\\uDBFF\\uDFFF" */ String = js.native
  
  @JSImport("quadstore/dist/cjs/utils/constants", "defaultIndexes")
  @js.native
  val defaultIndexes: js.Array[js.Array[TermName]] = js.native
  
  @JSImport("quadstore/dist/cjs/utils/constants", "levelDelOpts")
  @js.native
  val levelDelOpts: AbstractChainedBatchDelOptions[Any, Any] = js.native
  
  @JSImport("quadstore/dist/cjs/utils/constants", "levelPutOpts")
  @js.native
  val levelPutOpts: AbstractChainedBatchPutOptions[Any, Any, Any] = js.native
  
  @JSImport("quadstore/dist/cjs/utils/constants", "separator")
  @js.native
  val separator: /* "\\u0000\\u0000" */ String = js.native
  
  @JSImport("quadstore/dist/cjs/utils/constants", "termNames")
  @js.native
  val termNames: js.Array[TermName] = js.native
}
