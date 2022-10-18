package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Expression names used with FaceRenderObjectProvider.getExpressionWeightByName() and returned by FaceRenderObjectProvider.getExpressionNames().
  * ```
  * // @input Asset.RenderMesh faceMesh
  * var mouthCloseWeight = script.faceMesh.control.getExpressionWeightByName(Expressions.MouthClose);
  * ```
  */
/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  {[ E in / * template literal string: Brows${Down${Left|Right}|Up${Center|Left|Right}} * / string | 'Puff' ]: E}
  }}}
  */
@js.native
trait Expressions extends StObject
