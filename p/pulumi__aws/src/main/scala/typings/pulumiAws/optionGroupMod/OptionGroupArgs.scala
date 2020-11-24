package typings.pulumiAws.optionGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.rds.OptionGroupOption
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionGroupArgs extends js.Object {
  
  /**
    * Specifies the name of the engine that this option group should be associated with.
    */
  val engineName: Input[String] = js.native
  
  /**
    * Specifies the major version of the engine that this option group should be associated with.
    */
  val majorEngineVersion: Input[String] = js.native
  
  /**
    * The Name of the setting.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`. Must be lowercase, to match as it is stored in AWS.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.native
  
  /**
    * The description of the option group. Defaults to "Managed by Pulumi".
    */
  val optionGroupDescription: js.UndefOr[Input[String]] = js.native
  
  /**
    * A list of Options to apply.
    */
  val options: js.UndefOr[Input[js.Array[Input[OptionGroupOption]]]] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object OptionGroupArgs {
  
  @scala.inline
  def apply(engineName: Input[String], majorEngineVersion: Input[String]): OptionGroupArgs = {
    val __obj = js.Dynamic.literal(engineName = engineName.asInstanceOf[js.Any], majorEngineVersion = majorEngineVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionGroupArgs]
  }
  
  @scala.inline
  implicit class OptionGroupArgsOps[Self <: OptionGroupArgs] (val x: Self) extends AnyVal {
    
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
    def setEngineName(value: Input[String]): Self = this.set("engineName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorEngineVersion(value: Input[String]): Self = this.set("majorEngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNamePrefix(value: Input[String]): Self = this.set("namePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamePrefix: Self = this.set("namePrefix", js.undefined)
    
    @scala.inline
    def setOptionGroupDescription(value: Input[String]): Self = this.set("optionGroupDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionGroupDescription: Self = this.set("optionGroupDescription", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: Input[OptionGroupOption]*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: Input[js.Array[Input[OptionGroupOption]]]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
