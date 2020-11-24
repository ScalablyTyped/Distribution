package typings.pulumiAws.inputMod.iot

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThingTypeProperties extends js.Object {
  
  /**
    * The description of the thing type.
    */
  var description: js.UndefOr[Input[String]] = js.native
  
  /**
    * A list of searchable thing attribute names.
    */
  var searchableAttributes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}
object ThingTypeProperties {
  
  @scala.inline
  def apply(): ThingTypeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThingTypeProperties]
  }
  
  @scala.inline
  implicit class ThingTypePropertiesOps[Self <: ThingTypeProperties] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setSearchableAttributesVarargs(value: Input[String]*): Self = this.set("searchableAttributes", js.Array(value :_*))
    
    @scala.inline
    def setSearchableAttributes(value: Input[js.Array[Input[String]]]): Self = this.set("searchableAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchableAttributes: Self = this.set("searchableAttributes", js.undefined)
  }
}
