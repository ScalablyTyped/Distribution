package typings.sinclairTypebox.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TRef[T /* <: TSchema */]
  extends StObject
     with TSchema {
  
  @JSName("$ref")
  var $ref: String = js.native
  
  @JSName("static")
  var static_TRef: Static[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: this['params'] */ js.Any
  ] = js.native
}
