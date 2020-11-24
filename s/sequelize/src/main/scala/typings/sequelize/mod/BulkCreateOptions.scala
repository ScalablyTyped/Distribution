package typings.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for Model.bulkCreate method
  */
@js.native
trait BulkCreateOptions
  extends FieldsOptions
     with LoggingOptions
     with SearchPathOptions
     with ReturningOptions {
  
  /**
    * Run before / after bulk create hooks?
    */
  var hooks: js.UndefOr[Boolean] = js.native
  
  /**
    * Ignore duplicate values for primary keys? (not supported by postgres)
    *
    * Defaults to false
    */
  var ignoreDuplicates: js.UndefOr[Boolean] = js.native
  
  /**
    * Run before / after create hooks for each individual Instance? BulkCreate hooks will still be run if
    * options.hooks is true.
    */
  var individualHooks: js.UndefOr[Boolean] = js.native
  
  /**
    * Fields to update if row key already exists (on duplicate key update)? (only supported by mysql &
    * mariadb). By default, all fields are updated.
    */
  var updateOnDuplicate: js.UndefOr[js.Array[String]] = js.native
}
object BulkCreateOptions {
  
  @scala.inline
  def apply(): BulkCreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkCreateOptions]
  }
  
  @scala.inline
  implicit class BulkCreateOptionsOps[Self <: BulkCreateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHooks(value: Boolean): Self = this.set("hooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHooks: Self = this.set("hooks", js.undefined)
    
    @scala.inline
    def setIgnoreDuplicates(value: Boolean): Self = this.set("ignoreDuplicates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreDuplicates: Self = this.set("ignoreDuplicates", js.undefined)
    
    @scala.inline
    def setIndividualHooks(value: Boolean): Self = this.set("individualHooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndividualHooks: Self = this.set("individualHooks", js.undefined)
    
    @scala.inline
    def setUpdateOnDuplicateVarargs(value: String*): Self = this.set("updateOnDuplicate", js.Array(value :_*))
    
    @scala.inline
    def setUpdateOnDuplicate(value: js.Array[String]): Self = this.set("updateOnDuplicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateOnDuplicate: Self = this.set("updateOnDuplicate", js.undefined)
  }
}
