package typings.sinclairTypebox.mod

import typings.sinclairTypebox.sinclairTypeboxStrings.`object`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- org.scalablytyped.runtime.StObject because Already inherited
- org.scalablytyped.runtime.StringDictionary because Already inherited
- typings.sinclairTypebox.mod.SchemaOptions because Already inherited
- typings.sinclairTypebox.mod.ObjectOptions because var conflicts: $id, $schema, default, description, examples, title. Inlined additionalProperties, minProperties, maxProperties */ @js.native
trait TObject[T /* <: TProperties */]
  extends StObject
     with TSchema {
  
  var additionalProperties: js.UndefOr[Boolean] = js.native
  
  var maxProperties: js.UndefOr[Double] = js.native
  
  var minProperties: js.UndefOr[Double] = js.native
  
  var properties: T = js.native
  
  var required: js.UndefOr[js.Array[String]] = js.native
  
  @JSName("static")
  var static_TObject: PropertiesReduce[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: this['params'] */ js.Any
  ] = js.native
  
  var `type`: `object` = js.native
}
