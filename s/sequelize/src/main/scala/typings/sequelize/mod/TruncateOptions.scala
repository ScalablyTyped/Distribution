package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options passed to Model.destroy in addition to truncate
  */
trait TruncateOptions
  extends StObject
     with LoggingOptions
     with SearchPathOptions {
  
  /**
    * Only used in conjuction with TRUNCATE. Truncates  all tables that have foreign-key references to the
    * named table, or to any tables added to the group due to CASCADE.
    *
    * Defaults to false;
    */
  var cascade: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Delete instead of setting deletedAt to current timestamp (only applicable if paranoid is enabled)
    *
    * Defaults to false;
    */
  var force: js.UndefOr[Boolean] = js.undefined
}
object TruncateOptions {
  
  @scala.inline
  def apply(): TruncateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TruncateOptions]
  }
  
  @scala.inline
  implicit class TruncateOptionsMutableBuilder[Self <: TruncateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCascade(value: Boolean): Self = StObject.set(x, "cascade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCascadeUndefined: Self = StObject.set(x, "cascade", js.undefined)
    
    @scala.inline
    def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
  }
}
