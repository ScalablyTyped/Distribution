package typings.schematicsAngular.typescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JsxFlags extends StObject
@JSImport("@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript", "JsxFlags")
@js.native
object JsxFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[JsxFlags & Double] = js.native
  
  @js.native
  sealed trait IntrinsicElement
    extends StObject
       with JsxFlags
  /* 3 */ val IntrinsicElement: typings.schematicsAngular.typescriptMod.JsxFlags.IntrinsicElement & Double = js.native
  
  /** An element inferred from the string index signature of the JSX.IntrinsicElements interface */
  @js.native
  sealed trait IntrinsicIndexedElement
    extends StObject
       with JsxFlags
  /* 2 */ val IntrinsicIndexedElement: typings.schematicsAngular.typescriptMod.JsxFlags.IntrinsicIndexedElement & Double = js.native
  
  /** An element from a named property of the JSX.IntrinsicElements interface */
  @js.native
  sealed trait IntrinsicNamedElement
    extends StObject
       with JsxFlags
  /* 1 */ val IntrinsicNamedElement: typings.schematicsAngular.typescriptMod.JsxFlags.IntrinsicNamedElement & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with JsxFlags
  /* 0 */ val None: typings.schematicsAngular.typescriptMod.JsxFlags.None & Double = js.native
}
