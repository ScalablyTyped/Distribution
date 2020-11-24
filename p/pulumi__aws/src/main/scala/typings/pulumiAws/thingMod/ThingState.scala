package typings.pulumiAws.thingMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThingState extends js.Object {
  
  /**
    * The ARN of the thing.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Map of attributes of the thing.
    */
  val attributes: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The default client ID.
    */
  val defaultClientId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the thing.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The thing type name.
    */
  val thingTypeName: js.UndefOr[Input[String]] = js.native
  
  /**
    * The current version of the thing record in the registry.
    */
  val version: js.UndefOr[Input[Double]] = js.native
}
object ThingState {
  
  @scala.inline
  def apply(): ThingState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThingState]
  }
  
  @scala.inline
  implicit class ThingStateOps[Self <: ThingState] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setAttributes(value: Input[StringDictionary[Input[String]]]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setDefaultClientId(value: Input[String]): Self = this.set("defaultClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultClientId: Self = this.set("defaultClientId", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setThingTypeName(value: Input[String]): Self = this.set("thingTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThingTypeName: Self = this.set("thingTypeName", js.undefined)
    
    @scala.inline
    def setVersion(value: Input[Double]): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
