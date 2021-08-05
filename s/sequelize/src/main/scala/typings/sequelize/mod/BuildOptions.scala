package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for Model.build method
  */
trait BuildOptions
  extends StObject
     with ReturningOptions {
  
  /**
    * an array of include options - Used to build prefetched/included model instances. See `set`
    *
    * TODO: See set
    */
  var include: js.UndefOr[js.Array[(Model[js.Any, js.Any, js.Any]) | IncludeOptions]] = js.undefined
  
  /**
    * Is this record new
    */
  var isNewRecord: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set to true, values will ignore field and virtual setters.
    */
  var raw: js.UndefOr[Boolean] = js.undefined
}
object BuildOptions {
  
  inline def apply(): BuildOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildOptions]
  }
  
  extension [Self <: BuildOptions](x: Self) {
    
    inline def setInclude(value: js.Array[(Model[js.Any, js.Any, js.Any]) | IncludeOptions]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(value: ((Model[js.Any, js.Any, js.Any]) | IncludeOptions)*): Self = StObject.set(x, "include", js.Array(value :_*))
    
    inline def setIsNewRecord(value: Boolean): Self = StObject.set(x, "isNewRecord", value.asInstanceOf[js.Any])
    
    inline def setIsNewRecordUndefined: Self = StObject.set(x, "isNewRecord", js.undefined)
    
    inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
  }
}
