package typings.sinclairTypebox.mod

import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TOmit[T /* <: TObject[TProperties] */, Properties /* <: js.Array[ObjectPropertyKeys[T]] */]
  extends StObject
     with TObject[TProperties] {
  
  @JSName("properties")
  var properties_TOmit: /* import warning: importer.ImportType#apply Failed type conversion: T extends @sinclair/typebox.@sinclair/typebox.TObject<@sinclair/typebox.@sinclair/typebox.TProperties> ? std.Omit<T['properties'], Properties[number]> : never */ js.Any = js.native
  
  @JSName("static")
  var static_TOmit: Omit[
    Static[
      T, 
      /* import warning: importer.ImportType#apply Failed type conversion: this['params'] */ js.Any
    ], 
    /* import warning: importer.ImportType#apply Failed type conversion: Properties[number] */ js.Any
  ] = js.native
}
