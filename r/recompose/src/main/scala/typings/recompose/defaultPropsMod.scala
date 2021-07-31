package typings.recompose

import typings.recompose.mod.DefaultingInferableComponentEnhancer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#defaultprops
object defaultPropsMod {
  
  @JSImport("recompose/defaultProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T](props: T): DefaultingInferableComponentEnhancer[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[DefaultingInferableComponentEnhancer[T]]
}
