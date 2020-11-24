package typings.prompts.mod

import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromptObject[T /* <: String */] extends js.Object {
  
  var active: js.UndefOr[String] = js.native
  
  var choices: js.UndefOr[js.Array[Choice]] = js.native
  
  var float: js.UndefOr[Boolean] = js.native
  
  var format: js.UndefOr[PrevCaller[T, Unit]] = js.native
  
  var hint: js.UndefOr[String] = js.native
  
  var inactive: js.UndefOr[String] = js.native
  
  var increment: js.UndefOr[Double] = js.native
  
  var initial: js.UndefOr[String | Double | Boolean | Date] = js.native
  
  var instructions: js.UndefOr[String | Boolean] = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
  var mask: js.UndefOr[String] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var message: js.UndefOr[ValueOrFunc[String]] = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  var name: ValueOrFunc[T] = js.native
  
  var onState: js.UndefOr[PrevCaller[T, Unit]] = js.native
  
  var round: js.UndefOr[Double] = js.native
  
  var separator: js.UndefOr[String] = js.native
  
  var stdin: js.UndefOr[Readable] = js.native
  
  var stdout: js.UndefOr[Writable] = js.native
  
  var style: js.UndefOr[String] = js.native
  
  var suggest: js.UndefOr[js.Function2[/* input */ js.Any, /* choices */ js.Array[Choice], js.Promise[_]]] = js.native
  
  var `type`: PromptType | Falsy | (PrevCaller[T, PromptType | Falsy]) = js.native
  
  var validate: js.UndefOr[PrevCaller[T, Boolean | String | (js.Promise[Boolean | String])]] = js.native
}
object PromptObject {
  
  @scala.inline
  def apply[T /* <: String */](name: ValueOrFunc[T]): PromptObject[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptObject[T]]
  }
  
  @scala.inline
  implicit class PromptObjectOps[Self <: PromptObject[_], T /* <: String */] (val x: Self with PromptObject[T]) extends AnyVal {
    
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
    def setNameFunction3(value: (/* prev */ js.Any, /* values */ Answers[T], /* prompt */ PromptObject[String]) => T): Self = this.set("name", js.Any.fromFunction3(value))
    
    @scala.inline
    def setName(value: ValueOrFunc[T]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActive(value: String): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setChoicesVarargs(value: Choice*): Self = this.set("choices", js.Array(value :_*))
    
    @scala.inline
    def setChoices(value: js.Array[Choice]): Self = this.set("choices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChoices: Self = this.set("choices", js.undefined)
    
    @scala.inline
    def setFloat(value: Boolean): Self = this.set("float", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloat: Self = this.set("float", js.undefined)
    
    @scala.inline
    def setFormat(value: (/* prev */ js.Any, /* values */ Answers[T], /* prompt */ PromptObject[String]) => Unit): Self = this.set("format", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setHint(value: String): Self = this.set("hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHint: Self = this.set("hint", js.undefined)
    
    @scala.inline
    def setInactive(value: String): Self = this.set("inactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInactive: Self = this.set("inactive", js.undefined)
    
    @scala.inline
    def setIncrement(value: Double): Self = this.set("increment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncrement: Self = this.set("increment", js.undefined)
    
    @scala.inline
    def setInitial(value: String | Double | Boolean | Date): Self = this.set("initial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitial: Self = this.set("initial", js.undefined)
    
    @scala.inline
    def setInstructions(value: String | Boolean): Self = this.set("instructions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstructions: Self = this.set("instructions", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setMask(value: String): Self = this.set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMessageFunction3(
      value: (/* prev */ js.Any, /* values */ Answers[String], /* prompt */ PromptObject[String]) => String
    ): Self = this.set("message", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMessage(value: ValueOrFunc[String]): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setOnState(value: (/* prev */ js.Any, /* values */ Answers[T], /* prompt */ PromptObject[String]) => Unit): Self = this.set("onState", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnState: Self = this.set("onState", js.undefined)
    
    @scala.inline
    def setRound(value: Double): Self = this.set("round", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRound: Self = this.set("round", js.undefined)
    
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    
    @scala.inline
    def setStdin(value: Readable): Self = this.set("stdin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStdin: Self = this.set("stdin", js.undefined)
    
    @scala.inline
    def setStdout(value: Writable): Self = this.set("stdout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStdout: Self = this.set("stdout", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setSuggest(value: (/* input */ js.Any, /* choices */ js.Array[Choice]) => js.Promise[_]): Self = this.set("suggest", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSuggest: Self = this.set("suggest", js.undefined)
    
    @scala.inline
    def setTypeFunction3(
      value: (/* prev */ js.Any, /* values */ Answers[T], /* prompt */ PromptObject[String]) => PromptType | Falsy
    ): Self = this.set("type", js.Any.fromFunction3(value))
    
    @scala.inline
    def setType(value: PromptType | Falsy | (PrevCaller[T, PromptType | Falsy])): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setTypeNull: Self = this.set("type", null)
    
    @scala.inline
    def setValidate(
      value: (/* prev */ js.Any, /* values */ Answers[T], /* prompt */ PromptObject[String]) => Boolean | String | (js.Promise[Boolean | String])
    ): Self = this.set("validate", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
  }
}
