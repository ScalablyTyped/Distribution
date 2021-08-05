package typings.rfc6902

import typings.rfc6902.diffMod.Operation
import typings.rfc6902.diffMod.TestOperation
import typings.rfc6902.diffMod.VoidableDiff
import typings.rfc6902.patchMod.InvalidOperationError
import typings.rfc6902.patchMod.MissingError
import typings.rfc6902.patchMod.TestError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rfc6902", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyPatch(`object`: js.Any, patch: js.Array[Operation]): js.Array[MissingError | TestError | InvalidOperationError] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPatch")(`object`.asInstanceOf[js.Any], patch.asInstanceOf[js.Any])).asInstanceOf[js.Array[MissingError | TestError | InvalidOperationError]]
  
  inline def createPatch(input: js.Any, output: js.Any): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPatch")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
  inline def createPatch(input: js.Any, output: js.Any, diff: VoidableDiff): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPatch")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], diff.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
  
  inline def createTests(input: js.Any, patch: js.Array[Operation]): js.Array[TestOperation] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTests")(input.asInstanceOf[js.Any], patch.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestOperation]]
  
  type Patch = js.Array[Operation]
}
