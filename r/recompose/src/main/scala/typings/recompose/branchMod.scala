package typings.recompose

import typings.recompose.mod.ComponentEnhancer
import typings.recompose.mod.InferableComponentEnhancer
import typings.recompose.mod.predicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#branch
object branchMod {
  
  @JSImport("recompose/branch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TOutter](
    test: predicate[TOutter],
    trueEnhancer: (ComponentEnhancer[Any, Any]) | InferableComponentEnhancer[js.Object]
  ): ComponentEnhancer[Any, TOutter] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(test.asInstanceOf[js.Any], trueEnhancer.asInstanceOf[js.Any])).asInstanceOf[ComponentEnhancer[Any, TOutter]]
  inline def default[TOutter](
    test: predicate[TOutter],
    trueEnhancer: (ComponentEnhancer[Any, Any]) | InferableComponentEnhancer[js.Object],
    falseEnhancer: (ComponentEnhancer[Any, Any]) | InferableComponentEnhancer[js.Object]
  ): ComponentEnhancer[Any, TOutter] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(test.asInstanceOf[js.Any], trueEnhancer.asInstanceOf[js.Any], falseEnhancer.asInstanceOf[js.Any])).asInstanceOf[ComponentEnhancer[Any, TOutter]]
}
