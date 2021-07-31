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
  
  @scala.inline
  def apply(): DefineNameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefineNameOptions]
  }
  
  @scala.inline
  implicit class DefineNameOptionsMutableBuilder[Self <: DefineNameOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlural(value: String): Self = StObject.set(x, "plural", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluralUndefined: Self = StObject.set(x, "plural", js.undefined)
    
    @scala.inline
    def setSingular(value: String): Self = StObject.set(x, "singular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingularUndefined: Self = StObject.set(x, "singular", js.undefined)
  }
}
