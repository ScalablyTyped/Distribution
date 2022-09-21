package typings.schematicsAngular.typescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JsxEmit extends StObject
@JSImport("@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript", "JsxEmit")
@js.native
object JsxEmit extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[JsxEmit & Double] = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with JsxEmit
  /* 0 */ val None: typings.schematicsAngular.typescriptMod.JsxEmit.None & Double = js.native
  
  @js.native
  sealed trait Preserve
    extends StObject
       with JsxEmit
  /* 1 */ val Preserve: typings.schematicsAngular.typescriptMod.JsxEmit.Preserve & Double = js.native
  
  @js.native
  sealed trait React
    extends StObject
       with JsxEmit
  /* 2 */ val React: typings.schematicsAngular.typescriptMod.JsxEmit.React & Double = js.native
  
  @js.native
  sealed trait ReactJSX
    extends StObject
       with JsxEmit
  /* 4 */ val ReactJSX: typings.schematicsAngular.typescriptMod.JsxEmit.ReactJSX & Double = js.native
  
  @js.native
  sealed trait ReactJSXDev
    extends StObject
       with JsxEmit
  /* 5 */ val ReactJSXDev: typings.schematicsAngular.typescriptMod.JsxEmit.ReactJSXDev & Double = js.native
  
  @js.native
  sealed trait ReactNative
    extends StObject
       with JsxEmit
  /* 3 */ val ReactNative: typings.schematicsAngular.typescriptMod.JsxEmit.ReactNative & Double = js.native
}
