package typings.sqltoolsFormatter.indentationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Indentation extends js.Object {
  
  def decreaseBlockLevel(): Unit = js.native
  
  def decreaseTopLevel(): Unit = js.native
  
  def getIndent(): String = js.native
  
  def increaseBlockLevel(): Unit = js.native
  
  def increaseTopLevel(): Unit = js.native
  
  var indent: js.UndefOr[String] = js.native
  
  var indentTypes: js.Array[_] = js.native
  
  def resetIndentation(): Unit = js.native
}
object Indentation {
  
  @scala.inline
  def apply(
    decreaseBlockLevel: () => Unit,
    decreaseTopLevel: () => Unit,
    getIndent: () => String,
    increaseBlockLevel: () => Unit,
    increaseTopLevel: () => Unit,
    indentTypes: js.Array[_],
    resetIndentation: () => Unit
  ): Indentation = {
    val __obj = js.Dynamic.literal(decreaseBlockLevel = js.Any.fromFunction0(decreaseBlockLevel), decreaseTopLevel = js.Any.fromFunction0(decreaseTopLevel), getIndent = js.Any.fromFunction0(getIndent), increaseBlockLevel = js.Any.fromFunction0(increaseBlockLevel), increaseTopLevel = js.Any.fromFunction0(increaseTopLevel), indentTypes = indentTypes.asInstanceOf[js.Any], resetIndentation = js.Any.fromFunction0(resetIndentation))
    __obj.asInstanceOf[Indentation]
  }
  
  @scala.inline
  implicit class IndentationOps[Self <: Indentation] (val x: Self) extends AnyVal {
    
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
    def setDecreaseBlockLevel(value: () => Unit): Self = this.set("decreaseBlockLevel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDecreaseTopLevel(value: () => Unit): Self = this.set("decreaseTopLevel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIndent(value: () => String): Self = this.set("getIndent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIncreaseBlockLevel(value: () => Unit): Self = this.set("increaseBlockLevel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIncreaseTopLevel(value: () => Unit): Self = this.set("increaseTopLevel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIndentTypesVarargs(value: js.Any*): Self = this.set("indentTypes", js.Array(value :_*))
    
    @scala.inline
    def setIndentTypes(value: js.Array[_]): Self = this.set("indentTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetIndentation(value: () => Unit): Self = this.set("resetIndentation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIndent(value: String): Self = this.set("indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
  }
}
