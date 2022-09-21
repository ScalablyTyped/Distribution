package typings.sinclairTypebox.mod

import typings.sinclairTypebox.sinclairTypeboxStrings.promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TPromise[T /* <: TSchema */]
  extends StObject
     with TSchema {
  
  var item: TSchema = js.native
  
  @JSName("static")
  var static_TPromise: js.Promise[
    Static[
      T, 
      /* import warning: importer.ImportType#apply Failed type conversion: this['params'] */ js.Any
    ]
  ] = js.native
  
  var `type`: promise = js.native
}
