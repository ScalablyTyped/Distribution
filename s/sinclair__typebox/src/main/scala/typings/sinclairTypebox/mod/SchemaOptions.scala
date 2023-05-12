package typings.sinclairTypebox.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOptions
  extends StObject
     with /* prop */ StringDictionary[Any] {
  
  /** Default value for this schema */
  var default: js.UndefOr[Any] = js.undefined
  
  /** Id for this schema */
  @JSName("$id")
  var $id: js.UndefOr[String] = js.undefined
  
  @JSName("$schema")
  var $schema: js.UndefOr[String] = js.undefined
  
  /** Description of this schema */
  var description: js.UndefOr[String] = js.undefined
  
  /** Example values matching this schema */
  var examples: js.UndefOr[Any] = js.undefined
  
  /** Title of this schema */
  var title: js.UndefOr[String] = js.undefined
}
object SchemaOptions {
  
  inline def apply(): SchemaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SchemaOptions] (val x: Self) extends AnyVal {
    
    inline def set$id(value: String): Self = StObject.set(x, "$id", value.asInstanceOf[js.Any])
    
    inline def set$idUndefined: Self = StObject.set(x, "$id", js.undefined)
    
    inline def set$schema(value: String): Self = StObject.set(x, "$schema", value.asInstanceOf[js.Any])
    
    inline def set$schemaUndefined: Self = StObject.set(x, "$schema", js.undefined)
    
    inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExamples(value: Any): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
    
    inline def setExamplesUndefined: Self = StObject.set(x, "examples", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
