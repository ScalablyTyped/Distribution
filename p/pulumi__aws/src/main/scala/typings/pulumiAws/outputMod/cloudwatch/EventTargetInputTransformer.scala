package typings.pulumiAws.outputMod.cloudwatch

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventTargetInputTransformer extends js.Object {
  
  /**
    * Key value pairs specified in the form of JSONPath (for example, time = $.time)
    * * You can have as many as 10 key-value pairs.
    * * You must use JSON dot notation, not bracket notation.
    * * The keys can't start with "AWS".
    */
  var inputPaths: js.UndefOr[StringDictionary[String]] = js.native
  
  var inputTemplate: String = js.native
}
object EventTargetInputTransformer {
  
  @scala.inline
  def apply(inputTemplate: String): EventTargetInputTransformer = {
    val __obj = js.Dynamic.literal(inputTemplate = inputTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTargetInputTransformer]
  }
  
  @scala.inline
  implicit class EventTargetInputTransformerOps[Self <: EventTargetInputTransformer] (val x: Self) extends AnyVal {
    
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
    def setInputTemplate(value: String): Self = this.set("inputTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputPaths(value: StringDictionary[String]): Self = this.set("inputPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputPaths: Self = this.set("inputPaths", js.undefined)
  }
}
