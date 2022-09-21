package typings.sinclairTypebox.mod

import typings.sinclairTypebox.sinclairTypeboxStrings.array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- org.scalablytyped.runtime.StObject because Already inherited
- org.scalablytyped.runtime.StringDictionary because Already inherited
- typings.sinclairTypebox.mod.SchemaOptions because Already inherited
- typings.sinclairTypebox.mod.ArrayOptions because var conflicts: $id, $schema, default, description, examples, title. Inlined uniqueItems, minItems, maxItems */ @js.native
trait TArray[T /* <: TSchema */]
  extends StObject
     with TSchema {
  
  var items: T = js.native
  
  var maxItems: js.UndefOr[Double] = js.native
  
  var minItems: js.UndefOr[Double] = js.native
  
  @JSName("static")
  var static_TArray: js.Array[
    Static[
      T, 
      /* import warning: importer.ImportType#apply Failed type conversion: this['params'] */ js.Any
    ]
  ] = js.native
  
  var `type`: array = js.native
  
  var uniqueItems: js.UndefOr[Boolean] = js.native
}
