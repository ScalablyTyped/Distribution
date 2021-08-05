package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for Model.create method
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.sequelize.mod.ReturningOptions because Already inherited
- typings.sequelize.mod.InstanceSaveOptions because var conflicts: returning. Inlined silent, hooks */ trait CreateOptions
  extends StObject
     with BuildOptions
     with FieldsOptions
     with LoggingOptions
     with SearchPathOptions {
  
  var hooks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * On Duplicate
    */
  var onDuplicate: js.UndefOr[String] = js.undefined
  
  /**
    * If true, the updatedAt timestamp will not be updated.
    *
    * Defaults to false
    */
  var silent: js.UndefOr[Boolean] = js.undefined
}
object CreateOptions {
  
  inline def apply(): CreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOptions]
  }
  
  extension [Self <: CreateOptions](x: Self) {
    
    inline def setHooks(value: Boolean): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
    
    inline def setOnDuplicate(value: String): Self = StObject.set(x, "onDuplicate", value.asInstanceOf[js.Any])
    
    inline def setOnDuplicateUndefined: Self = StObject.set(x, "onDuplicate", js.undefined)
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
  }
}
