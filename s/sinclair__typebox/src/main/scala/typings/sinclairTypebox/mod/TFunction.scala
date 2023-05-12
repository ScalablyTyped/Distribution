package typings.sinclairTypebox.mod

import typings.sinclairTypebox.sinclairTypeboxStrings.Function
import typings.sinclairTypebox.sinclairTypeboxStrings.`object`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TFunction[T /* <: js.Array[TSchema] */, U /* <: TSchema */]
  extends StObject
     with TSchema {
  
  var instanceOf: Function = js.native
  
  var parameters: T = js.native
  
  var returns: U = js.native
  
  @JSName("static")
  def static_params(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param param because its type TFunctionParameters<T, this['params']> is not an array type */ param: TFunctionParameters[
      T, 
      /* import warning: importer.ImportType#apply Failed type conversion: this['params'] */ js.Any
    ]
  ): Static[
    U, 
    /* import warning: importer.ImportType#apply Failed type conversion: this['params'] */ js.Any
  ] = js.native
  
  var `type`: `object` = js.native
}
