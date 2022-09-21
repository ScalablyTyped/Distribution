package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for Model.bulkCreate method
  */
trait BulkCreateOptions
  extends StObject
     with FieldsOptions
     with LoggingOptions
     with SearchPathOptions
     with ReturningOptions {
  
  /**
    * Run before / after bulk create hooks?
    */
  var hooks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Ignore duplicate values for primary keys? (not supported by postgres)
    *
    * Defaults to false
    */
  var ignoreDuplicates: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Run before / after create hooks for each individual Instance? BulkCreate hooks will still be run if
    * options.hooks is true.
    */
  var individualHooks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Fields to update if row key already exists (on duplicate key update)? (only supported by mysql &
    * mariadb). By default, all fields are updated.
    */
  var updateOnDuplicate: js.UndefOr[js.Array[String]] = js.undefined
}
object BulkCreateOptions {
  
  inline def apply(): BulkCreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkCreateOptions]
  }
  
  extension [Self <: BulkCreateOptions](x: Self) {
    
    inline def setHooks(value: Boolean): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
    
    inline def setIgnoreDuplicates(value: Boolean): Self = StObject.set(x, "ignoreDuplicates", value.asInstanceOf[js.Any])
    
    inline def setIgnoreDuplicatesUndefined: Self = StObject.set(x, "ignoreDuplicates", js.undefined)
    
    inline def setIndividualHooks(value: Boolean): Self = StObject.set(x, "individualHooks", value.asInstanceOf[js.Any])
    
    inline def setIndividualHooksUndefined: Self = StObject.set(x, "individualHooks", js.undefined)
    
    inline def setUpdateOnDuplicate(value: js.Array[String]): Self = StObject.set(x, "updateOnDuplicate", value.asInstanceOf[js.Any])
    
    inline def setUpdateOnDuplicateUndefined: Self = StObject.set(x, "updateOnDuplicate", js.undefined)
    
    inline def setUpdateOnDuplicateVarargs(value: String*): Self = StObject.set(x, "updateOnDuplicate", js.Array(value*))
  }
}
