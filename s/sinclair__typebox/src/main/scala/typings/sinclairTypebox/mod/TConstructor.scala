package typings.sinclairTypebox.mod

import org.scalablytyped.runtime.Instantiable1
import typings.sinclairTypebox.sinclairTypeboxStrings.Constructor
import typings.sinclairTypebox.sinclairTypeboxStrings.`object`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TConstructor[T /* <: js.Array[TSchema] */, U /* <: TSchema */]
  extends StObject
     with TSchema {
  
  var instanceOf: Constructor = js.native
  
  var parameters: T = js.native
  
  var returns: U = js.native
  
  @JSName("static")
  var static_TConstructor: Instantiable1[/* param */ TConstructorParameterArray[T, js.Array[Any]], Static[U, js.Array[Any]]] = js.native
  
  var `type`: `object` = js.native
}
