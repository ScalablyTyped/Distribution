package typings.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Association Object for Include Options
  */
@js.native
trait IncludeAssociation extends js.Object {
  
  var identifier: String = js.native
  
  var source: Model[_, _, _] = js.native
  
  var target: Model[_, _, _] = js.native
}
object IncludeAssociation {
  
  @scala.inline
  def apply(identifier: String, source: Model[_, _, _], target: Model[_, _, _]): IncludeAssociation = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeAssociation]
  }
  
  @scala.inline
  implicit class IncludeAssociationOps[Self <: IncludeAssociation] (val x: Self) extends AnyVal {
    
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
    def setIdentifier(value: String): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: Model[_, _, _]): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Model[_, _, _]): Self = this.set("target", value.asInstanceOf[js.Any])
  }
}
