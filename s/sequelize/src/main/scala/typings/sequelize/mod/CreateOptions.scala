package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for Model.create method
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.sequelize.mod.ReturningOptions because Already inherited
- typings.sequelize.mod.BuildOptions because var conflicts: returning. Inlined raw, isNewRecord, include */ @js.native
trait CreateOptions extends InstanceSaveOptions {
  
  /**
    * an array of include options - Used to build prefetched/included model instances. See `set`
    *
    * TODO: See set
    */
  var include: js.UndefOr[js.Array[(Model[_, _, _]) | IncludeOptions]] = js.native
  
  /**
    * Is this record new
    */
  var isNewRecord: js.UndefOr[Boolean] = js.native
  
  /**
    * On Duplicate
    */
  var onDuplicate: js.UndefOr[String] = js.native
  
  /**
    * If set to true, values will ignore field and virtual setters.
    */
  var raw: js.UndefOr[Boolean] = js.native
}
object CreateOptions {
  
  @scala.inline
  def apply(): CreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOptions]
  }
  
  @scala.inline
  implicit class CreateOptionsMutableBuilder[Self <: CreateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInclude(value: js.Array[(Model[_, _, _]) | IncludeOptions]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: ((Model[js.Any, js.Any, js.Any]) | IncludeOptions)*): Self = StObject.set(x, "include", js.Array(value :_*))
    
    @scala.inline
    def setIsNewRecord(value: Boolean): Self = StObject.set(x, "isNewRecord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNewRecordUndefined: Self = StObject.set(x, "isNewRecord", js.undefined)
    
    @scala.inline
    def setOnDuplicate(value: String): Self = StObject.set(x, "onDuplicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDuplicateUndefined: Self = StObject.set(x, "onDuplicate", js.undefined)
    
    @scala.inline
    def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
  }
}
