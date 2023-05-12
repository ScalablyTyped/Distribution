package typings.sinclairTypebox.mod

import typings.sinclairTypebox.sinclairTypeboxStrings.Date
import typings.sinclairTypebox.sinclairTypeboxStrings.`object`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- org.scalablytyped.runtime.StObject because Already inherited
- org.scalablytyped.runtime.StringDictionary because Already inherited
- typings.sinclairTypebox.mod.SchemaOptions because Already inherited
- typings.sinclairTypebox.mod._TAnySchema because Already inherited
- typings.sinclairTypebox.mod.DateOptions because var conflicts: $id, $schema, default, description, examples, title. Inlined exclusiveMaximumTimestamp, exclusiveMinimumTimestamp, maximumTimestamp, minimumTimestamp */ @js.native
trait TDate
  extends StObject
     with TSchema {
  
  var exclusiveMaximumTimestamp: js.UndefOr[Double] = js.native
  
  var exclusiveMinimumTimestamp: js.UndefOr[Double] = js.native
  
  var instanceOf: Date = js.native
  
  var maximumTimestamp: js.UndefOr[Double] = js.native
  
  var minimumTimestamp: js.UndefOr[Double] = js.native
  
  @JSName("static")
  var static_TDate: js.Date = js.native
  
  var `type`: `object` = js.native
}
