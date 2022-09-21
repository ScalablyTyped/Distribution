package typings.shakacodeRecompose

import typings.react.mod.ComponentType
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/shakacode/recompose/blob/master/docs/API.md#setproptypes
object setPropTypesMod {
  
  @JSImport("@shakacode/recompose/setPropTypes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P](propTypes: ValidationMap[P]): js.Function1[/* component */ ComponentType[P], ComponentType[P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(propTypes.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* component */ ComponentType[P], ComponentType[P]]]
}
