package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for name property in DefineOptions
  *
  * @see DefineOptions
  */
trait DefineNameOptions extends StObject {
  
  /**
    * Plural model name
    */
  var plural: js.UndefOr[String] = js.undefined
  
  /**
    * Singular model name
    */
  var singular: js.UndefOr[String] = js.undefined
}
object DefineNameOptions {
  
  inline def apply(): DefineNameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefineNameOptions]
  }
  
  extension [Self <: DefineNameOptions](x: Self) {
    
    inline def setPlural(value: String): Self = StObject.set(x, "plural", value.asInstanceOf[js.Any])
    
    inline def setPluralUndefined: Self = StObject.set(x, "plural", js.undefined)
    
    inline def setSingular(value: String): Self = StObject.set(x, "singular", value.asInstanceOf[js.Any])
    
    inline def setSingularUndefined: Self = StObject.set(x, "singular", js.undefined)
  }
}
