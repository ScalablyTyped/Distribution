package typings.realm.Realm.Services.MongoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options passed when finding a signle document
  */
@js.native
trait FindOneOptions extends js.Object {
  
  /**
    * Limits the fields to return for all matching documents.
    * See [Tutorial: Project Fields to Return from Query](https://docs.mongodb.com/manual/tutorial/project-fields-from-query-results/).
    */
  val projection: js.UndefOr[js.Object] = js.native
  
  /**
    * The order in which to return matching documents.
    */
  val sort: js.UndefOr[js.Object] = js.native
}
object FindOneOptions {
  
  @scala.inline
  def apply(): FindOneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindOneOptions]
  }
  
  @scala.inline
  implicit class FindOneOptionsOps[Self <: FindOneOptions] (val x: Self) extends AnyVal {
    
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
    def setProjection(value: js.Object): Self = this.set("projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    
    @scala.inline
    def setSort(value: js.Object): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
}
