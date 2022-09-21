package typings.sinclairTypebox.mod

import typings.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TRequired[T /* <: TObject[TProperties] | TRef[TObject[TProperties]] */]
  extends StObject
     with TObject[TProperties] {
  
  @JSName("static")
  var static_TRequired: Required[
    Static[
      T, 
      /* import warning: importer.ImportType#apply Failed type conversion: this['params'] */ js.Any
    ]
  ] = js.native
}
