package typings.realm.anon

import typings.realm.Realm.Services.MongoDB.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ids[T /* <: Document[_] */] extends js.Object {
  
  /** List of ids to watch */
  var ids: js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T['_id'] */ js.Any
  ] = js.native
}
object Ids {
  
  @scala.inline
  def apply[T /* <: Document[_] */](
    ids: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T['_id'] */ js.Any
    ]
  ): Ids[T] = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ids[T]]
  }
  
  @scala.inline
  implicit class IdsOps[Self <: Ids[_], T /* <: Document[_] */] (val x: Self with Ids[T]) extends AnyVal {
    
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
    def setIdsVarargs(value: (/* import warning: importer.ImportType#apply Failed type conversion: T['_id'] */ js.Any)*): Self = this.set("ids", js.Array(value :_*))
    
    @scala.inline
    def setIds(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['_id'] */ js.Any
        ]
    ): Self = this.set("ids", value.asInstanceOf[js.Any])
  }
}
