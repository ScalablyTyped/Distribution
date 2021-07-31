package typings.shallowequal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply[TCtx](objA: js.Any, objB: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].apply(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def apply[TCtx](objA: js.Any, objB: js.Any, customizer: Unit, compareContext: TCtx): Boolean = (^.asInstanceOf[js.Dynamic].apply(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], customizer.asInstanceOf[js.Any], compareContext.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def apply[TCtx](objA: js.Any, objB: js.Any, customizer: Customizer[TCtx]): Boolean = (^.asInstanceOf[js.Dynamic].apply(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], customizer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def apply[TCtx](objA: js.Any, objB: js.Any, customizer: Customizer[TCtx], compareContext: TCtx): Boolean = (^.asInstanceOf[js.Dynamic].apply(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], customizer.asInstanceOf[js.Any], compareContext.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("shallowequal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Customizer[T] = js.ThisFunction3[
    /* this */ T, 
    /* objA */ js.Any, 
    /* objB */ js.Any, 
    /* indexOrKey */ js.UndefOr[Double | String], 
    Boolean | Unit
  ]
}
