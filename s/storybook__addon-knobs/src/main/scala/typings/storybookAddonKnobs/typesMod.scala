package typings.storybookAddonKnobs

import typings.react.mod.ComponentType
import typings.storybookAddonKnobs.anon.Deserialize
import typings.storybookAddonKnobs.anon.FunctionComponentBooleanT
import typings.storybookAddonKnobs.anon.FunctionComponentButtonTy
import typings.storybookAddonKnobs.anon.FunctionComponentFilesTyp
import typings.storybookAddonKnobs.anon.FunctionComponentOptionsT
import typings.storybookAddonKnobs.anon.FunctionComponentSelectTy
import typings.storybookAddonKnobs.anon.TypeofArrayType
import typings.storybookAddonKnobs.anon.TypeofColorType
import typings.storybookAddonKnobs.anon.TypeofDateType
import typings.storybookAddonKnobs.anon.TypeofNumberType
import typings.storybookAddonKnobs.anon.TypeofObjectType
import typings.storybookAddonKnobs.anon.TypeofRadiosType
import typings.storybookAddonKnobs.anon.TypeofTextType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/addon-knobs/dist/components/types", JSImport.Namespace)
@js.native
object typesMod extends js.Object {
  
  def getKnobControl(`type`: KnobType): KnobControlType = js.native
  
  /* keyof @storybook/addon-knobs.anon.Array */ /* Rewritten from type alias, can be one of: 
    - typings.storybookAddonKnobs.storybookAddonKnobsStrings.text
    - typings.storybookAddonKnobs.storybookAddonKnobsStrings.number
    - typings.storybookAddonKnobs.storybookAddonKnobsStrings.color
    - typings.storybookAddonKnobs.storybookAddonKnobsStrings.boolean
    - typings.storybookAddonKnobs.storybookAddonKnobsStrings.`object`
    - typings.storybookAddonKnobs.storybookAddonKnobsStrings.select
    - typings.storybookAddonKnobs.storybookAddonKnobsStrings.radios
    - typings.storybookAddonKnobs.storybookAddonKnobsStrings.array
    - typings.storybookAddonKnobs.storybookAddonKnobsStrings.date
    - typings.storybookAddonKnobs.storybookAddonKnobsStrings.button
    - typings.storybookAddonKnobs.storybookAddonKnobsStrings.files
    - typings.storybookAddonKnobs.storybookAddonKnobsStrings.options
  */
  trait KnobType extends js.Object
  
  @js.native
  object default extends js.Object {
    
    var array: TypeofArrayType = js.native
    
    var boolean: FunctionComponentBooleanT = js.native
    
    var button: FunctionComponentButtonTy = js.native
    
    var color: TypeofColorType = js.native
    
    var date: TypeofDateType = js.native
    
    var files: FunctionComponentFilesTyp = js.native
    
    var number: TypeofNumberType = js.native
    
    var `object`: TypeofObjectType = js.native
    
    var options: FunctionComponentOptionsT = js.native
    
    var radios: TypeofRadiosType = js.native
    
    var select: FunctionComponentSelectTy = js.native
    
    var text: TypeofTextType = js.native
  }
  
  type KnobControlType = ComponentType[_] with Deserialize
}
