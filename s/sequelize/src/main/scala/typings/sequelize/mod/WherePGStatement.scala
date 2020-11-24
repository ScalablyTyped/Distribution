package typings.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Nested where Postgre Statement
  */
@js.native
trait WherePGStatement extends js.Object {
  
  @JSName("$all")
  var $all: js.Array[String | Double] = js.native
  
  @JSName("$any")
  var $any: js.Array[String | Double] = js.native
}
object WherePGStatement {
  
  @scala.inline
  def apply($all: js.Array[String | Double], $any: js.Array[String | Double]): WherePGStatement = {
    val __obj = js.Dynamic.literal($all = $all.asInstanceOf[js.Any], $any = $any.asInstanceOf[js.Any])
    __obj.asInstanceOf[WherePGStatement]
  }
  
  @scala.inline
  implicit class WherePGStatementOps[Self <: WherePGStatement] (val x: Self) extends AnyVal {
    
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
    def set$allVarargs(value: (String | Double)*): Self = this.set("$all", js.Array(value :_*))
    
    @scala.inline
    def set$all(value: js.Array[String | Double]): Self = this.set("$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$anyVarargs(value: (String | Double)*): Self = this.set("$any", js.Array(value :_*))
    
    @scala.inline
    def set$any(value: js.Array[String | Double]): Self = this.set("$any", value.asInstanceOf[js.Any])
  }
}
