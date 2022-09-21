package typings.sinclairTypebox.mod

import org.scalablytyped.runtime.Instantiable1
import typings.sinclairTypebox.sinclairTypeboxStrings.constructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TConstructor[T /* <: js.Array[TSchema] */, U /* <: TSchema */]
  extends StObject
     with TSchema {
  
  var parameters: T = js.native
  
  var returns: U = js.native
  
  @JSName("static")
  var static_TConstructor: Instantiable1[/* param */ StaticContructorParameters[T, js.Array[Any]], Static[U, js.Array[Any]]] = js.native
  
  var `type`: constructor = js.native
}
